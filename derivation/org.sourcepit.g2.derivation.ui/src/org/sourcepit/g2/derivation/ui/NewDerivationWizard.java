/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation.ui;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewDerivationWizard extends Wizard implements INewWizard, IPageChangedListener
{

   private WizardNewFileCreationPage filePage;
   private DerivationInputWizardPage inputPage;

   public NewDerivationWizard()
   {
      setWindowTitle("New Wizard");
   }

   @Override
   public void init(IWorkbench workbench, IStructuredSelection selection)
   {
      filePage = new WizardNewFileCreationPage(WizardNewFileCreationPage.class.getName(), StructuredSelection.EMPTY);
      filePage.setTitle("Ecore Model Derivative");
      filePage.setDescription("Create the Ecore model derivative");
      filePage.setFileExtension("ecore");

      inputPage = new DerivationInputWizardPage(selection);
   }

   @Override
   public void addPages()
   {
      addPage(filePage);
      addPage(inputPage);
   }

   @Override
   public boolean performFinish()
   {
      return false;
   }

   @Override
   public void pageChanged(PageChangedEvent event)
   {
   }

}
