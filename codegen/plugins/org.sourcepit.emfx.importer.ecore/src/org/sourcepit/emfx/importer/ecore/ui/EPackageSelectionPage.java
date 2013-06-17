
package org.sourcepit.emfx.importer.ecore.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUIUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.importer.ImporterPlugin;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;

public class EPackageSelectionPage extends AbstractWizardPage
{
   private final EPackageModelConverter converter;

   private CheckboxTableViewer rootEPackagesViewer;
   private CheckboxTreeViewer usedEPackagesViewer;

   public EPackageSelectionPage(EPackageModelConverter converter, String pageName)
   {
      super(pageName);
      this.converter = converter;
   }

   public void createControl(Composite parent)
   {
      Composite partParent = new Composite(parent, SWT.NONE);
      partParent.setLayout(new GridLayout());
      setControl(partParent);

      Composite rootEPackagePartParent = new Composite(partParent, SWT.NONE);
      rootEPackagePartParent.setLayoutData(new GridData(GridData.FILL_BOTH));
      rootEPackagePartParent.setLayout(new FillLayout());
      createRootEPackagePart(rootEPackagePartParent);

      Composite usedEPackagePartParent = new Composite(partParent, SWT.NONE);
      usedEPackagePartParent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
      usedEPackagePartParent.setLayout(new FillLayout());
      createUsedEPackagePart(usedEPackagePartParent);
   }

   protected void createRootEPackagePart(Composite partParent)
   {
      Composite parent = new Composite(partParent, SWT.NONE);
      {
         GridLayout grid = new GridLayout(2, false);
         grid.marginHeight = 0;
         grid.marginWidth = 0;
         parent.setLayout(grid);
      }

      Label rootEPackagesTitle = new Label(parent, SWT.NONE);
      {
         GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
         rootEPackagesTitle.setLayoutData(gridData);
      }
      rootEPackagesTitle.setText("Derivation input:");

      Button addEPackageButton = new Button(parent, SWT.NONE);
      {
         GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
         addEPackageButton.setLayoutData(gridData);
      }
      addEPackageButton.setText("&Add...");
      addEPackageButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent event)
         {
            ExtendedLoadResourceDialog dialog = new ExtendedLoadResourceDialog(((Control) event.widget).getShell(),
               null);
            if (dialog.open() == Window.OK)
            {
               onAddRootEPackages(dialog.getURIs());
            }
         }
      });

      TableLayout tableLayout = new TableLayout();

      Table table = new Table(parent, SWT.CHECK | SWT.BORDER);
      table.setHeaderVisible(true);
      table.setLayout(tableLayout);
      {
         GridData gridData = new GridData(GridData.FILL_BOTH);
         gridData.horizontalSpan = 2;
         table.setLayoutData(gridData);
      }

      TableColumn colName = new TableColumn(table, SWT.NONE);
      colName.setText("Package");
      colName.setResizable(true);
      tableLayout.addColumnData(new ColumnWeightData(1, true));

      TableColumn colAction = new TableColumn(table, SWT.NONE);
      colAction.setText("Scope");
      colAction.setResizable(true);
      tableLayout.addColumnData(new ColumnWeightData(1, true));

      rootEPackagesViewer = new CheckboxTableViewer(table);

      ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
         ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
      adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

      rootEPackagesViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
      rootEPackagesViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory)
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
      rootEPackagesViewer.addCheckStateListener(new ICheckStateListener()
      {
         public void checkStateChanged(CheckStateChangedEvent event)
         {
            onRootEPackageCheckedStateChanged(resolveEPackageURIs(rootEPackagesViewer.getCheckedElements()));
         }
      });
   }

   protected void createUsedEPackagePart(Composite partParent)
   {
      Composite parent = new Composite(partParent, SWT.NONE);
      {
         GridLayout grid = new GridLayout(2, false);
         grid.marginHeight = 0;
         grid.marginWidth = 0;
         parent.setLayout(grid);
      }

      Label usedEPackagesTitle = new Label(parent, SWT.NONE);
      {
         GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
         usedEPackagesTitle.setLayoutData(gridData);
      }
      usedEPackagesTitle.setText("Referenced packages:");

      Button addUsedEPackageButton = new Button(parent, SWT.NONE);
      {
         GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
         addUsedEPackageButton.setLayoutData(gridData);
      }
      addUsedEPackageButton.setText("&Add...");
      addUsedEPackageButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent event)
         {
            ExtendedLoadResourceDialog dialog = new ExtendedLoadResourceDialog(((Control) event.widget).getShell(),
               null);
            if (dialog.open() == Window.OK)
            {
               onAddUsedEPackages(dialog.getURIs());
            }
         }
      });

      Tree tree = new Tree(parent, SWT.CHECK | SWT.BORDER);
      {
         GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
         gridData.horizontalSpan = 2;
         tree.setLayoutData(gridData);
      }
      ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
         ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
      adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

      new TreeCheckStateManager(tree);

      usedEPackagesViewer = new CheckboxTreeViewer(tree);
      usedEPackagesViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
      {
         @Override
         public boolean hasChildren(Object object)
         {
            if (object instanceof EPackage)
            {
               return false;
            }
            return super.hasChildren(object);
         }

         public Object[] getChildren(Object object)
         {
            if (object instanceof EPackage)
            {
               return new Object[0];
            }
            return super.getChildren(object);
         }
      });
      usedEPackagesViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
      usedEPackagesViewer.addCheckStateListener(new ICheckStateListener()
      {
         public void checkStateChanged(CheckStateChangedEvent event)
         {
            onUsedEPackageCheckedStateChanged(resolveEPackageURIs(usedEPackagesViewer.getCheckedElements()));
         }
      });
   }

   protected List<URI> resolveEPackageURIs(Object[] checked)
   {
      List<URI> ePackageURIs = new ArrayList<URI>();
      for (Object object : checked)
      {
         if (object instanceof EPackage)
         {
            ePackageURIs.add(EcoreUtil.getURI((EPackage) object));
         }
      }
      return ePackageURIs;
   }

   @Override
   protected void onPageSelected()
   {
      rootEPackagesViewer.setInput(new ItemProvider(converter.getRootObjects()));
   }

   protected void onAddRootEPackages(List<URI> ePackageURIs)
   {
      final Set<URI> modelLocations = new LinkedHashSet<URI>(converter.getModelLocations());
      for (URI uri : ePackageURIs)
      {
         modelLocations.add(uri.trimFragment().trimQuery());
      }
      converter.setModelLocations(new ArrayList<URI>(modelLocations));

      recomputeRootEObjects();
   }

   protected void onAddUsedEPackages(List<URI> ePackageURIs)
   {
      ResourceSet resourceSet = (ResourceSet) usedEPackagesViewer.getInput();
      if (resourceSet == null)
      {
         resourceSet = new ResourceSetImpl();
      }
      final Diagnostic diagnostic = ResourceUtil.demandLoadResources(resourceSet, ePackageURIs);
      if (diagnostic.getSeverity() == Diagnostic.ERROR)
      {
         new ConverterUIUtil.DiagnosticHandler().handleDiagnostic(diagnostic);
      }
      usedEPackagesViewer.setInput(resourceSet);
   }

   protected void onRootEPackageCheckedStateChanged(List<URI> checkedEPackageURIs)
   {
      // TODO Auto-generated method stub
   }

   protected void onUsedEPackageCheckedStateChanged(List<URI> checkedEPackageURIs)
   {
      converter.setUsedEPackages(checkedEPackageURIs);
      recomputeRootEObjects();
   }

   protected void recomputeRootEObjects()
   {
      final IRunnableWithProgress runnable = new IRunnableWithProgress()
      {
         public void run(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException
         {
            final Monitor monitor = BasicMonitor.toMonitor(progressMonitor);
            converter.computeRootEObjects(monitor);
         }
      };
      try
      {
         getContainer().run(false, false, runnable);
      }
      catch (Exception e)
      {
         ImporterPlugin.INSTANCE.log(e);
      }
      rootEPackagesViewer.setInput(new ItemProvider(converter.getRootObjects()));
   }

}
