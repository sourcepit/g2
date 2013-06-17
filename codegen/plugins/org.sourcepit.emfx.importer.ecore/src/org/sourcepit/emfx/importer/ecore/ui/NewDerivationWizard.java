
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.wizard.Wizard;

public class NewDerivationWizard extends Wizard implements IPageChangedListener
{
   public NewDerivationWizard()
   {
      setWindowTitle("New Wizard");
   }

   @Override
   public void addPages()
   {
      DerivationInputWizardPage page = new DerivationInputWizardPage();
      addPage(page);
   }

   @Override
   public boolean performFinish()
   {
      return false;
   }

   public void pageChanged(PageChangedEvent event)
   {
   }
}
