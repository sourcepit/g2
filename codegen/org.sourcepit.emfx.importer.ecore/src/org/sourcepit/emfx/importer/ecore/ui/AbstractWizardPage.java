
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;

public abstract class AbstractWizardPage extends WizardPage implements IPageChangedListener
{

   private boolean pageSelected = false;

   public AbstractWizardPage(String pageName)
   {
      super(pageName);
   }

   public AbstractWizardPage(String pageName, String title, ImageDescriptor titleImage)
   {
      super(pageName, title, titleImage);
   }

   public void pageChanged(PageChangedEvent event)
   {
      final boolean newSelected = event.getSelectedPage() == this;
      if (newSelected)
      {
         if (!pageSelected)
         {
            pageSelected = true;
            onPageSelected();
         }
      }
      else
      {
         if (pageSelected)
         {
            pageSelected = false;
            onPageUnselected();
         }
      }
   }

   protected void onPageSelected()
   {

   }

   protected void onPageUnselected()
   {

   }

}