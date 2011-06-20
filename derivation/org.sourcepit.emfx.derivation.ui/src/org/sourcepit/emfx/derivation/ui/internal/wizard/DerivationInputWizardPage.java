
package org.sourcepit.emfx.derivation.ui.internal.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.sourcepit.emfx.common.ui.SWTUtil;
import org.sourcepit.emfx.derivation.ecore.DerivationProcessor;
import org.sourcepit.emfx.derivation.ui.DerivationUIPlugin;

public class DerivationInputWizardPage extends WizardPage
{
   private DerivationInputComposite derivationInputComposite;

   private final DerivationProcessor derivationProcessor;

   /**
    * Create the wizard.
    */
   public DerivationInputWizardPage(String name, DerivationProcessor derivationProcessor)
   {
      super(name);
      this.derivationProcessor = derivationProcessor;
      setTitle("Wizard Page title");
      setDescription("Wizard Page description");
   }

   /**
    * Create the wizard.
    * 
    * @wbp.parser.constructor
    */
   public DerivationInputWizardPage()
   {
      this("wizardPage", new DerivationProcessor());
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

      derivationInputComposite = new DerivationInputComposite(container, SWT.NONE)
      {
         protected void onInputEPackageURIsAdded(Collection<URI> ePackageURIs)
         {
            derivationProcessor.getInputEPackageURIs().addAll(ePackageURIs);
         }

         protected void onInputEPackageURIsRemoved(Collection<URI> ePackageURIs)
         {
            derivationProcessor.getInputEPackageURIs().removeAll(ePackageURIs);
         }

         protected void onReusedEPackageURIsAdded(Collection<URI> ePackageURIs)
         {
            derivationProcessor.getUsedDerivativesURIs().addAll(ePackageURIs);
         }

         protected void onReusedEPackageURIsRemoved(Collection<URI> ePackageURIs)
         {
            derivationProcessor.getUsedDerivativesURIs().removeAll(ePackageURIs);
         }

         protected void onDerivationInputChanged()
         {
            try
            {
               getContainer().run(false, false, new IRunnableWithProgress()
               {
                  public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
                  {
                     validatePage(monitor);
                  }
               });
            }
            catch (InvocationTargetException e)
            {
               DerivationUIPlugin.INSTANCE.log(e);
            }
            catch (InterruptedException e)
            {
               DerivationUIPlugin.INSTANCE.log(e);
            }
         }

         @Override
         protected ResourceSet newResourceSet()
         {
            return derivationProcessor.newResourceSet();
         }

         @Override
         protected EPackage findOrigin(EPackage ePackage)
         {
            return derivationProcessor.findOrigin(ePackage);
         };
      };
   }

   protected void validatePage(IProgressMonitor progressMonitor)
   {
      final Diagnostic diagnostic = derivationProcessor.validateInput(progressMonitor);
      final int severity = diagnostic.getSeverity();
      switch (severity)
      {
         case Diagnostic.WARNING :
            setMessage(diagnostic.getMessage(), IMessageProvider.WARNING);
         case Diagnostic.ERROR :
            setErrorMessage(diagnostic.getMessage());
            break;
         case Diagnostic.OK :
            setErrorMessage(null);
            break;
         default :
            break;
      }
      SWTUtil.asyncExec(getControl(), new Runnable()
      {
         public void run()
         {
            setPageComplete(severity != Diagnostic.ERROR);
         }
      });
   }

   public void setInput(Collection<URI> resourceURIs)
   {
      derivationInputComposite.setInput(resourceURIs);
   }
}
