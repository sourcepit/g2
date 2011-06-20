
package org.sourcepit.emfx.derivation.ui.internal.wizard;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.sourcepit.emfx.common.ui.AbstractWizard;
import org.sourcepit.emfx.derivation.ecore.DerivationProcessor;
import org.sourcepit.emfx.derivation.ecore.DerivationResult;
import org.sourcepit.emfx.derivation.ui.DerivationUIPlugin;

public class NewDerivationWizard extends AbstractWizard implements INewWizard, IPageChangedListener
{
   private IStructuredSelection selection;

   private WizardNewFileCreationPage fileCreationPage;

   private DerivationInputWizardPage derivationInputPage;

   private final DerivationProcessor derivationProcessor = new DerivationProcessor();

   public NewDerivationWizard()
   {
      setWindowTitle("New Wizard");
   }

   public void init(IWorkbench workbench, IStructuredSelection selection)
   {
      this.selection = selection;
      setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(DerivationUIPlugin.INSTANCE
         .getImage("full/wizban/NewEcore")));
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
   public void addPages()
   {
      fileCreationPage = new WizardNewFileCreationPage(WizardNewFileCreationPage.class.getName(), selection);
      fileCreationPage.setTitle("Ecore Derivative");
      fileCreationPage.setDescription("Create the Ecore Derivative");
      fileCreationPage.setFileExtension("ecore");

      derivationInputPage = new DerivationInputWizardPage(DerivationInputWizardPage.class.getName(),
         derivationProcessor);

      addPage(fileCreationPage);
      addPage(derivationInputPage);
   }

   @Override
   protected void initPage(IWizardPage page)
   {
      if (page == fileCreationPage)
      {
         if (selection.getFirstElement() instanceof IFile)
         {
            final String originFileName = ((IFile) selection.getFirstElement()).getName();
            fileCreationPage.setFileName("gen" + originFileName);
         }
      }
      else if (page == derivationInputPage)
      {
         final Collection<URI> resourceURIs = new LinkedHashSet<URI>();
         for (Object object : selection.toList())
         {
            if (object instanceof IFile)
            {
               resourceURIs.add(URI.createPlatformResourceURI(((IFile) object).getFullPath().toString(), true));
            }
         }
         derivationInputPage.setInput(resourceURIs);
      }
   }

   @Override
   public boolean performFinish()
   {
      DerivationResult result = null;
      try
      {
         result = derivationProcessor.processDerivation(null);
      }
      catch (DiagnosticException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      final ResourceSet resourceSet = result.getResourceSet();
      IFile file = fileCreationPage.createNewFile();
      if (file != null)
      {
         URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

         Resource resource = resourceSet.createResource(uri);

         resource.getContents().clear();
         resource.getContents().addAll(result.getDerivatives());

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

   @Override
   public void dispose()
   {
      if (getContainer() instanceof WizardDialog)
      {
         ((WizardDialog) getContainer()).removePageChangedListener(this);
      }
      super.dispose();
   }
}
