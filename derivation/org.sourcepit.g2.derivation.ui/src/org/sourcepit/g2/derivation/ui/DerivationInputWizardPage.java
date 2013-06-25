/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.navigator.ResourceComparator;

public class DerivationInputWizardPage extends WizardPage
{
   private final IStructuredSelection selection;

   /**
    * Create the wizard.
    */
   public DerivationInputWizardPage(IStructuredSelection selection)
   {
      super(DerivationInputWizardPage.class.getSimpleName());
      setTitle("Package Selection");
      setDescription("Specify for which packages you want to create derivatives and which to re-use from already derived models");

      this.selection = selection;
   }

   /**
    * Create contents of the wizard.
    * 
    * @param parent
    */
   public void createControl(Composite parent)
   {
      final Composite container = new Composite(parent, SWT.NULL);

      setControl(container);
      container.setLayout(new FillLayout(SWT.HORIZONTAL));

      final SashForm sashForm = new SashForm(container, SWT.VERTICAL);
      sashForm.setData("name", "sashForm");

      final Group grpRoot = new Group(sashForm, SWT.NONE);
      grpRoot.setText("Root Packages");
      grpRoot.setData("name", "grpRoot");
      grpRoot.setLayout(new GridLayout(2, false));

      final Label lblNewLabel = new Label(grpRoot, SWT.WRAP);
      lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblNewLabel.setData("name", "lblNewLabel");
      lblNewLabel.setText("For which packages do you want to create derivatives?");

      final TableViewer tableViewer = new TableViewer(grpRoot, SWT.BORDER | SWT.FULL_SELECTION);
      Table table = tableViewer.getTable();
      table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
      table.setData("name", "table");

      final Button btnAddRootPackage = new Button(grpRoot, SWT.NONE);
      btnAddRootPackage.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            onAddRootPackage();
         }
      });
      btnAddRootPackage.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAddRootPackage.setData("name", "btnAddRootPackage");
      btnAddRootPackage.setText("Add...");

      final Group grpReusedDerivatives = new Group(sashForm, SWT.NONE);
      grpReusedDerivatives.setText("Re-used derivatives");
      grpReusedDerivatives.setData("name", "grpReusedDerivatives");
      grpReusedDerivatives.setLayout(new GridLayout(2, false));

      final Label lblWhichPackagesDo = new Label(grpReusedDerivatives, SWT.WRAP);
      lblWhichPackagesDo.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblWhichPackagesDo.setData("name", "lblWhichPackagesDo");
      lblWhichPackagesDo.setText("Which packages do you want to re-use from already derived models?");

      final TreeViewer treeViewer = new TreeViewer(grpReusedDerivatives, SWT.BORDER);
      final Tree tree = treeViewer.getTree();
      tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
      tree.setData("name", "tree");

      final Button btnAddDerivative = new Button(grpReusedDerivatives, SWT.NONE);
      btnAddDerivative.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            onAddDerivative();
         }
      });
      btnAddDerivative.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAddDerivative.setData("name", "btnAddDerivative");
      btnAddDerivative.setText("Add...");
      sashForm.setWeights(new int[] { 3, 2 });

   }

   public List<URI> getInputPackages()
   {
      return null;
   }

   public List<URI> getReusedPackages()
   {
      return null;
   }

   private void onAddRootPackage()
   {
      String title = "Tile";
      String emptyListMesage = "EmptyListMessage";
      ISelectionStatusValidator validator = new ISelectionStatusValidator()
      {
         public IStatus validate(Object[] selection)
         {
            return Status.OK_STATUS;
         };
      };

      final List<IResource> resources = openWorkspaceSelectionDialog(getShell(), title, emptyListMesage, selection,
         validator);
      
      
   }

   private void onAddDerivative()
   {
   }

   private static List<IResource> openWorkspaceSelectionDialog(Shell shell, String title, String emptyListMesage,
      IStructuredSelection selection, ISelectionStatusValidator validator)
   {
      final ElementTreeSelectionDialog selectionDialog = newWorkspaceSelectionDialog(shell, title, emptyListMesage,
         selection, validator);

      if (Window.OK == selectionDialog.open())
      {
         final Object[] result = selectionDialog.getResult();
         final List<IResource> resources = new ArrayList<IResource>(result.length);
         for (Object object : result)
         {
            resources.add(extractResource(object));
         }
         return resources;
      }
      return new ArrayList<IResource>(4);
   }

   private static ElementTreeSelectionDialog newWorkspaceSelectionDialog(Shell shell, String title,
      String emptyListMesage, IStructuredSelection selection, ISelectionStatusValidator validator)
   {
      final ElementTreeSelectionDialog selectionDialog = new ElementTreeSelectionDialog(shell,
         new WorkbenchLabelProvider(), new WorkbenchContentProvider());
      selectionDialog.setComparator(new ResourceComparator(ResourceComparator.NAME));
      selectionDialog.setHelpAvailable(false);

      selectionDialog.setTitle(title);
      selectionDialog.setEmptyListMessage(emptyListMesage);

      selectionDialog.setValidator(validator);

      selectionDialog.setInitialElementSelections(extractResources(selection));
      selectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

      return selectionDialog;
   }

   private static List<IResource> extractResources(final IStructuredSelection selection)
   {
      final List<IResource> selectedResources = new ArrayList<IResource>();
      final Iterator<?> it = selection.iterator();
      while (it.hasNext())
      {
         final IResource selectedResource = extractResource(it.next());
         if (selectedResource != null)
         {
            selectedResources.add(selectedResource);
         }
      }
      return selectedResources;
   }

   private static IResource extractResource(Object object)
   {
      if (object instanceof IResource)
      {
         return (IResource) object;
      }
      else if (object instanceof IAdaptable)
      {
         return (IResource) ((IAdaptable) object).getAdapter(IResource.class);
      }
      else
      {
         return null;
      }
   }
}
