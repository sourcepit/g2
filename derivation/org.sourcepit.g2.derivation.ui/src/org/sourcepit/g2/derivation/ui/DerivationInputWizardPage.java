/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DerivationInputWizardPage extends WizardPage
{
   private Table table;

   /**
    * Create the wizard.
    */
   public DerivationInputWizardPage()
   {
      super(DerivationInputWizardPage.class.getSimpleName());
      setTitle("Package Selection");
      setDescription("Specify for which packages you want to create derivatives and which to re-use from already derived models");
   }

   /**
    * Create contents of the wizard.
    * @param parent
    */
   public void createControl(Composite parent)
   {
      Composite container = new Composite(parent, SWT.NULL);

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
      
      TableViewer tableViewer = new TableViewer(grpRoot, SWT.BORDER | SWT.FULL_SELECTION);
      table = tableViewer.getTable();
      table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
      table.setData("name", "table");
      
      final Button btnAddRootPackage = new Button(grpRoot, SWT.NONE);
      btnAddRootPackage.addSelectionListener(new SelectionAdapter() {
         @Override
         public void widgetSelected(SelectionEvent e) {
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
      
      TreeViewer treeViewer = new TreeViewer(grpReusedDerivatives, SWT.BORDER);
      final Tree tree = treeViewer.getTree();
      tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
      tree.setData("name", "tree");
      
      final Button btnAddDerivative = new Button(grpReusedDerivatives, SWT.NONE);
      btnAddDerivative.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAddDerivative.setData("name", "btnAddDerivative");
      btnAddDerivative.setText("Add...");
      sashForm.setWeights(new int[] {3, 2});

   }
}
