
package org.sourcepit.emfx.derivation.ui.internal.wizard;

import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUtil.ShellFinder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.sourcepit.emfx.common.ui.ExtendedLoadResourceDialog;
import org.sourcepit.emfx.common.ui.SWTUtil;
import org.sourcepit.emfx.common.ui.SWTUtil.ReducingAsyncRunner;
import org.sourcepit.emfx.derivation.ui.internal.messages.Messages;
import org.sourcepit.emfx.ecore.util.DiagnosticUtil;
import org.sourcepit.emfx.ecore.util.ResourceUtil;
import org.sourcepit.emfx.ecore.util.ResourceUtil.IResourceChecker;

public abstract class DerivationInputComposite extends Composite
{
   private enum Section {
      INPUT, REUSED
   }

   private final CheckboxTableViewer inputEPackagesViewer;
   private final CheckboxTreeViewer reusedEPackagesViewer;

   private final Set<URI> inputEPackageURIs = new LinkedHashSet<URI>();
   private final Set<URI> reusedEPackageURIs = new LinkedHashSet<URI>();

   private Set<URI> shadowedInputEPackageURIs = new HashSet<URI>();

   private final ReducingAsyncRunner changedEventRunner;

   /**
    * Create the composite.
    * 
    * @param parent
    * @param style
    */
   public DerivationInputComposite(Composite parent, int style)
   {
      super(parent, style);

      GridLayout gridLayout = new GridLayout(1, false);
      gridLayout.marginWidth = 0;
      gridLayout.marginHeight = 0;
      setLayout(gridLayout);

      final SashForm sashForm = new SashForm(this, SWT.VERTICAL);
      sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      Group grpInputEpackages = new Group(sashForm, SWT.NONE);
      grpInputEpackages.setText(Messages.DerivationInputComposite_grpInputEpackages_text);
      grpInputEpackages.setData("name", "grpInputEpackages");
      grpInputEpackages.setLayout(new GridLayout(2, false));

      Label lblAddAndSelect = new Label(grpInputEpackages, SWT.WRAP);
      lblAddAndSelect.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblAddAndSelect.setData("name", "lblAddAndSelect");
      lblAddAndSelect.setText(Messages.DerivationInputComposite_lblAddAndSelect_text);
      inputEPackagesViewer = CheckboxTableViewer.newCheckList(grpInputEpackages, SWT.BORDER);
      inputEPackagesViewer.addCheckStateListener(new ICheckStateListener()
      {
         public void checkStateChanged(CheckStateChangedEvent event)
         {
            onElementCheckStateChanged(Section.INPUT, event.getElement(), event.getChecked());
         }
      });
      final Table table = inputEPackagesViewer.getTable();
      table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      final Button btnAdd_1 = new Button(grpInputEpackages, SWT.NONE);
      btnAdd_1.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            final ExtendedLoadResourceDialog dialog = new ExtendedLoadResourceDialog(((Control) e.widget).getShell(),
               null);
            if (dialog.open() == Window.OK)
            {
               onAddResources(Section.INPUT, dialog.getURIs(), true);
            }
         }
      });
      btnAdd_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAdd_1.setText(Messages.DerivationInputComposite_btnAdd_1_text);

      Group grpReferencedDerivatives = new Group(sashForm, SWT.NONE);
      grpReferencedDerivatives.setText(Messages.DerivationInputComposite_grpReferencedDerivatives_text);
      grpReferencedDerivatives.setData("name", "grpReferencedDerivatives");
      grpReferencedDerivatives.setLayout(new GridLayout(2, false));

      Label lblAddDerivates = new Label(grpReferencedDerivatives, SWT.WRAP);
      lblAddDerivates.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblAddDerivates.setData("name", "lblAddDerivates");
      lblAddDerivates.setText(Messages.DerivationInputComposite_lblAddDerivates_text);

      reusedEPackagesViewer = new CheckboxTreeViewer(grpReferencedDerivatives, SWT.BORDER | SWT.FULL_SELECTION);
      reusedEPackagesViewer.addCheckStateListener(new ICheckStateListener()
      {
         public void checkStateChanged(CheckStateChangedEvent event)
         {
            onElementCheckStateChanged(Section.REUSED, event.getElement(), event.getChecked());
         }
      });
      Tree tree = reusedEPackagesViewer.getTree();
      tree.setHeaderVisible(true);
      tree.setLinesVisible(true);
      tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      final TreeColumn trclmnDerivative = new TreeColumn(tree, SWT.NONE);
      trclmnDerivative.setWidth(260);
      trclmnDerivative.setText(Messages.DerivationInputComposite_trclmnDerivative_text);

      final TreeColumn trclmnOrigin = new TreeColumn(tree, SWT.NONE);
      trclmnOrigin.setWidth(140);
      trclmnOrigin.setText(Messages.DerivationInputComposite_trclmnOrigin_text);

      final Button btnAdd = new Button(grpReferencedDerivatives, SWT.NONE);
      btnAdd.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            final ExtendedLoadResourceDialog dialog = new ExtendedLoadResourceDialog(((Control) e.widget).getShell(),
               null);
            if (dialog.open() == Window.OK)
            {
               onAddResources(Section.REUSED, dialog.getURIs(), true);
            }
         }
      });
      btnAdd.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAdd.setText(Messages.DerivationInputComposite_btnAdd_text);

      final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
         ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
      adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

      inputEPackagesViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
      {
         @Override
         public Object[] getElements(Object object)
         {
            final List<Object> children = new ArrayList<Object>();
            final Object[] elements = super.getElements(object);
            for (Object element : elements)
            {
               Collections.addAll(children, getChildren(element));
            }
            return children.toArray(new Object[children.size()]);
         }

         @Override
         public boolean hasChildren(Object object)
         {
            if (object instanceof Resource)
            {
               final Object[] children = getChildren(object);
               return children != null && children.length > 0;
            }
            if (object instanceof EPackage)
            {
               return false;
            }
            return super.hasChildren(object);
         }

         public Object[] getChildren(Object object)
         {
            if (object instanceof Resource)
            {
               final List<Object> filtered = new ArrayList<Object>();
               final Object[] children = super.getChildren(object);
               if (children != null)
               {
                  for (Object child : children)
                  {
                     if (child instanceof EPackage && !shadowedInputEPackageURIs.contains(resolveURI(child)))
                     {
                        filtered.add(child);
                     }
                  }
               }
               return filtered.toArray();
            }
            if (object instanceof EPackage)
            {
               return new Object[0];
            }
            return super.getChildren(object);
         }
      });
      inputEPackagesViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory)
      {
         @Override
         public String getColumnText(Object object, int columnIndex)
         {
            return columnIndex == 0 ? getText(object) : "";
         }

         @Override
         public Image getColumnImage(Object object, int columnIndex)
         {
            return columnIndex == 0 ? getImage(object) : null;
         }
      });

      reusedEPackagesViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
      {
         @Override
         public Object[] getElements(Object object)
         {
            final List<Object> filtered = new ArrayList<Object>();
            final Object[] elements = super.getElements(object);
            if (elements != null)
            {
               for (Object element : elements)
               {
                  if (element instanceof Resource && hasChildren(element))
                  {
                     filtered.add(element);
                  }
               }
            }
            return filtered.toArray();
         }

         @Override
         public boolean hasChildren(Object object)
         {
            if (object instanceof Resource)
            {
               final Object[] children = getChildren(object);
               return children != null && children.length > 0;
            }
            if (object instanceof EPackage)
            {
               return false;
            }
            return super.hasChildren(object);
         }

         public Object[] getChildren(Object object)
         {
            if (object instanceof Resource)
            {
               final List<Object> filtered = new ArrayList<Object>();
               final Object[] children = super.getChildren(object);
               if (children != null)
               {
                  for (Object child : children)
                  {
                     if (child instanceof EPackage && findOrigin((EPackage) child) != null)
                     {
                        filtered.add(child);
                     }
                  }
               }
               return filtered.toArray();
            }
            if (object instanceof EPackage)
            {
               return new Object[0];
            }
            return super.getChildren(object);
         }
      });
      reusedEPackagesViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory)
      {
         @Override
         public String getColumnText(Object object, int columnIndex)
         {
            if (columnIndex == 1)
            {
               EPackage origin = null;
               if (object instanceof EPackage)
               {
                  origin = findOrigin((EPackage) object);
               }
               return origin == null ? null : getText(origin);
            }
            return super.getColumnText(object, columnIndex);
         }

         @Override
         public Image getColumnImage(Object object, int columnIndex)
         {
            if (columnIndex == 1)
            {
               EPackage origin = null;
               if (object instanceof EPackage)
               {
                  origin = findOrigin((EPackage) object);
               }
               return origin == null ? null : getImage(origin);
            }
            return super.getColumnImage(object, columnIndex);
         }
      });
      inputEPackagesViewer.setCheckStateProvider(new ICheckStateProvider()
      {
         public boolean isGrayed(Object element)
         {
            return false;
         }

         public boolean isChecked(Object element)
         {
            final URI ePackageURI = resolveURI(element);
            return ePackageURI != null && inputEPackageURIs.contains(ePackageURI);
         }
      });

      reusedEPackagesViewer.setCheckStateProvider(new AbstractCheckStateProvider(reusedEPackagesViewer)
      {
         public boolean isChecked(Object element)
         {
            final URI uri = resolveURI(element);
            if (uri != null)
            {
               for (URI reused : reusedEPackageURIs)
               {
                  if (reused.toString().startsWith(uri.toString()))
                  {
                     return true;
                  }
               }
            }
            return false;
         }
      });
      sashForm.setWeights(new int[] {189, 108});

      changedEventRunner = new ReducingAsyncRunner(this, new Runnable()
      {
         public void run()
         {
            onDerivationInputChanged();
         }
      });
   }

   @Override
   protected void checkSubclass()
   {
      // Disable the check that prevents subclassing of SWT components
   }

   public void setInput(Collection<URI> resourceURIs)
   {
      inputEPackagesViewer.setInput(newResourceSet());
      reusedEPackagesViewer.setInput(newResourceSet());

      if (!inputEPackageURIs.isEmpty())
      {
         final LinkedHashSet<URI> copy = new LinkedHashSet<URI>(inputEPackageURIs);
         inputEPackageURIs.clear();
         onEPackageURIsUnchecked(Section.INPUT, copy);
      }

      onAddResources(Section.INPUT, resourceURIs, true);
   }

   private void onAddResources(final Section section, Collection<URI> resourceURIs, boolean expand)
   {
      final ResourceSet resourceSet = getResourceSet(section);

      final Diagnostic diagnostic = ResourceUtil.demandLoadResources(resourceSet, resourceURIs, new IResourceChecker()
      {
         public void check(Resource resource) throws DiagnosticException
         {
            checkContents(section, resource);
         }
      });

      if (diagnostic.getSeverity() == Diagnostic.ERROR)
      {
         DiagnosticDialog.openProblem((Shell) ShellFinder.getActiveShell(), "Error", null, diagnostic);
         return;
      }

      final Collection<Object> affectedElements = new LinkedHashSet<Object>();
      final Collection<URI> ePackageURIs = new LinkedHashSet<URI>();
      for (URI resourceURI : resourceURIs)
      {
         final Resource resource = resourceSet.getResource(resourceURI, false);
         if (resource != null)
         {
            EcoreUtil.resolveAll(resource);

            affectedElements.add(resource);
            affectedElements.addAll(resource.getContents());

            for (EObject ePackage : resource.getContents())
            {
               final URI ePackageURI = resolveURI(ePackage);
               if (getEPackageURIs(section).add(ePackageURI))
               {
                  ePackageURIs.add(ePackageURI);
               }
            }
         }
      }

      if (expand)
      {
         expandElements(section, affectedElements);
      }
      updateElements(section, affectedElements);

      onEPackageURIsChecked(section, ePackageURIs);
   }

   private void onElementCheckStateChanged(Section section, final Object element, final boolean checked)
   {
      final URI uri = resolveURI(element);
      if (checked)
      {
         if (element instanceof EPackage)
         {
            if (getEPackageURIs(section).add(uri))
            {
               onEPackageURIsChecked(section, Collections.singleton(uri));
            }
         }
         else if (element instanceof Resource)
         {
            onAddResources(section, Collections.singleton(uri), false);
         }
      }
      else
      {
         final Collection<URI> ePackageURIs = new LinkedHashSet<URI>();
         for (Iterator<URI> it = getEPackageURIs(section).iterator(); it.hasNext();)
         {
            final URI ePackageURI = it.next();
            if (ePackageURI.toString().startsWith(uri.toString()))
            {
               it.remove();
               ePackageURIs.add(ePackageURI);
            }
         }
         if (!ePackageURIs.isEmpty())
         {
            onEPackageURIsUnchecked(section, ePackageURIs);
         }
      }
   }

   private void onEPackageURIsChecked(Section section, Collection<URI> ePackageURIs)
   {
      if (section == Section.REUSED)
      {
         final Set<URI> inputEPackageURIs = computeReferencedInputEPackageURIs(ePackageURIs);
         if (!inputEPackageURIs.isEmpty())
         {
            shadowInputEPackges(inputEPackageURIs);
         }
      }

      switch (section)
      {
         case INPUT :
            onInputEPackageURIsAdded(ePackageURIs);
            break;
         case REUSED :
            onReusedEPackageURIsAdded(ePackageURIs);
            break;
         default :
            throw new IllegalSelectorException();
      }

      changedEventRunner.asyncExec();
   }

   private void onEPackageURIsUnchecked(Section section, Collection<URI> ePackageURIs)
   {
      if (section == Section.REUSED)
      {
         final Set<URI> inputEPackageURIs = computeReferencedInputEPackageURIs(ePackageURIs);
         if (!inputEPackageURIs.isEmpty())
         {
            revealInputEPackges(inputEPackageURIs);
         }
      }

      switch (section)
      {
         case INPUT :
            onInputEPackageURIsRemoved(ePackageURIs);
            break;
         case REUSED :
            onReusedEPackageURIsRemoved(ePackageURIs);
            break;
         default :
            throw new IllegalSelectorException();
      }

      changedEventRunner.asyncExec();
   }

   private Set<URI> computeReferencedInputEPackageURIs(Collection<URI> ePackageURIs)
   {
      final Set<URI> shadowedInputEpackages = new LinkedHashSet<URI>();
      for (URI ePackageURI : ePackageURIs)
      {
         final EPackage reusedEPackage = (EPackage) getResourceSet(Section.REUSED).getEObject(ePackageURI, false);
         final URI originURI = resolveURI(findOrigin(reusedEPackage));
         if (getResourceSet(Section.INPUT).getEObject(originURI, false) != null)
         {
            shadowedInputEpackages.add(originURI);
         }
      }
      return shadowedInputEpackages;
   }

   private void shadowInputEPackges(Set<URI> ePackageURIs)
   {
      for (URI ePackageURI : ePackageURIs)
      {
         if (inputEPackageURIs.contains(ePackageURI))
         {
            // we have to fake the uncheck event, because of SWT doesn't fire one on a manual check state change
            EObject element = getResourceSet(Section.INPUT).getEObject(ePackageURI, false);
            onElementCheckStateChanged(Section.INPUT, element, false);
         }
      }
      shadowedInputEPackageURIs.addAll(ePackageURIs);
      refreshViewer(inputEPackagesViewer);
   }

   private void revealInputEPackges(Set<URI> ePackageURIs)
   {
      shadowedInputEPackageURIs.removeAll(ePackageURIs);
      refreshViewer(inputEPackagesViewer);
   }

   private void checkContents(Section section, Resource resource) throws DiagnosticException
   {
      for (EObject eObject : resource.getContents())
      {
         if (eObject instanceof EPackage)
         {
            final EPackage ePackage = (EPackage) eObject;
            if (section == Section.REUSED && findOrigin(ePackage) == null)
            {
               throw DiagnosticUtil.newDiagnosticException(NLS.bind("The package ''{0}'' is not a derivative.",
                  ePackage.getName()));
            }
         }
         else
         {
            throw DiagnosticUtil.newDiagnosticException(NLS.bind(
               "The resource ''{0}'' contains illegal content. Only EPackages are allowed.", resource.getURI()
                  .lastSegment()));
         }
      }
   }

   private ColumnViewer getViewer(Section section)
   {
      switch (section)
      {
         case INPUT :
            return inputEPackagesViewer;
         case REUSED :
            return reusedEPackagesViewer;
         default :
            throw new IllegalArgumentException();
      }
   }

   private ResourceSet getResourceSet(Section section)
   {
      return (ResourceSet) getViewer(section).getInput();
   }

   private Set<URI> getEPackageURIs(Section section)
   {
      switch (section)
      {
         case INPUT :
            return inputEPackageURIs;
         case REUSED :
            return reusedEPackageURIs;
         default :
            throw new IllegalArgumentException();
      }
   }

   private URI resolveURI(Object object)
   {
      if (object instanceof EObject)
      {
         return EcoreUtil.getURI((EObject) object);
      }
      if (object instanceof Resource)
      {
         return ((Resource) object).getURI();
      }
      return null;
   }

   private void expandElements(final Section section, final Collection<Object> affectedElements)
   {
      final Runnable runnable = new Runnable()
      {
         public void run()
         {
            final ColumnViewer viewer = getViewer(section);
            if (viewer instanceof AbstractTreeViewer)
            {
               for (Object element : affectedElements)
               {
                  final AbstractTreeViewer treeViewer = (AbstractTreeViewer) viewer;
                  treeViewer.expandToLevel(createTreePath(treeViewer, element), 1);
               }
            }
         }
      };
      SWTUtil.asyncExec(this, runnable);
   }

   private void refreshViewer(final Viewer viewer)
   {
      SWTUtil.asyncExec(viewer.getControl(), new Runnable()
      {
         public void run()
         {
            viewer.refresh();
         }
      });
   }

   private void updateElements(final Section section, final Collection<Object> elements)
   {
      if (!elements.isEmpty())
      {
         SWTUtil.asyncExec(this, new Runnable()
         {
            public void run()
            {
               getViewer(section).update(elements.toArray(), null);
            }
         });
      }
   }

   private Object createTreePath(AbstractTreeViewer viewer, Object element)
   {
      final ITreeContentProvider cp = (ITreeContentProvider) viewer.getContentProvider();
      final LinkedList<Object> path = new LinkedList<Object>();

      Object parent = element;
      while (parent != null)
      {
         path.addFirst(element);
         parent = cp.getParent(parent);
      }

      return new TreePath(path.toArray());
   }

   protected abstract void onInputEPackageURIsAdded(Collection<URI> ePackageURIs);

   protected abstract void onInputEPackageURIsRemoved(Collection<URI> ePackageURIs);

   protected abstract void onReusedEPackageURIsAdded(Collection<URI> ePackageURIs);

   protected abstract void onReusedEPackageURIsRemoved(Collection<URI> ePackageURIs);

   protected abstract void onDerivationInputChanged();

   protected abstract ResourceSet newResourceSet();

   protected abstract EPackage findOrigin(EPackage ePackage);
}
