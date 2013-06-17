
package org.sourcepit.emfx.importer.ecore.ui;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewGeneratorModelWizard extends Wizard implements INewWizard, IPageChangedListener
{

   private IStructuredSelection selection;
   private NewConfigFileWizardPage newFileWizardPage;
   private IWorkbench workbench;

   private EPackageModelConverter converter;

   public NewGeneratorModelWizard()
   {
      setWindowTitle("New Config File");
   }

   public void init(IWorkbench workbench, IStructuredSelection selection)
   {
      this.workbench = workbench;
      this.selection = selection;

      converter = new EPackageModelConverter();
      converter.setRootType(EcorePackage.Literals.EPACKAGE);
   }

   @Override
   public void setContainer(IWizardContainer wizardContainer)
   {
      super.setContainer(wizardContainer);
      if (wizardContainer instanceof WizardDialog)
      {
         ((WizardDialog) wizardContainer).addPageChangedListener(this);
      }
   }

   @Override
   public void dispose()
   {
      if (getContainer() instanceof WizardDialog)
      {
         ((WizardDialog) getContainer()).removePageChangedListener(this);
      }
      super.dispose();
   }

   @Override
   public void addPages()
   {

      newFileWizardPage = new NewConfigFileWizardPage(selection);
      addPage(newFileWizardPage);

      // ModelURIPage uriPage = new ModelURIPage(converter, "My Model URI Page");
      // addPage(uriPage);

      AbstractWizardPage ePackageSelectionPage = new EPackageSelectionPage(converter, "Package Selection");
      addPage(ePackageSelectionPage);

   }

   @Override
   public boolean performFinish()
   {
      converter.convert();

      final ResourceSet resourceSet = converter.getResourceSet();

      List<EObject> converted = converter.getConverted();

      IFile file = newFileWizardPage.createNewFile();
      if (file != null)
      {
         URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

         Resource resource = resourceSet.createResource(uri);

         resource.getContents().clear();
         resource.getContents().addAll(converted);

         try
         {
            resource.save(null);
         }
         catch (IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         return true;
      }
      else
         return false;
   }

   public void pageChanged(PageChangedEvent event)
   {
      for (IWizardPage page : getPages())
      {
         if (page instanceof IPageChangedListener)
         {
            ((IPageChangedListener) page).pageChanged(event);
         }
      }
   }
}