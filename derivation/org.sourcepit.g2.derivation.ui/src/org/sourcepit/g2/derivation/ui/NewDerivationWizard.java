/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation.ui;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewDerivationWizard extends Wizard
{

   public NewDerivationWizard()
   {
      setWindowTitle("New Wizard");
   }

   @Override
   public void addPages()
   {
      WizardNewFileCreationPage fileCreationPage = new WizardNewFileCreationPage(
         WizardNewFileCreationPage.class.getName(), StructuredSelection.EMPTY);
      fileCreationPage.setTitle("Ecore Derivative");
      fileCreationPage.setDescription("Create the Ecore Derivative");
      fileCreationPage.setFileExtension("ecore");

      DerivationInputWizardPage derivationInputPage = new DerivationInputWizardPage();

      addPage(fileCreationPage);
      addPage(derivationInputPage);
   }

   @Override
   public boolean performFinish()
   {
      return false;
   }

}
