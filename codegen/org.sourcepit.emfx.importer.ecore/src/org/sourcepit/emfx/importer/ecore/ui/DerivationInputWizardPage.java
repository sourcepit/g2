
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class DerivationInputWizardPage extends WizardPage
{
   private DataBindingContext m_bindingContext;
   private DerivationInputComposite derivationInputComposite;

   /**
    * Create the wizard.
    */
   public DerivationInputWizardPage()
   {
      super("wizardPage");
      setTitle("Wizard Page title");
      setDescription("Wizard Page description");
   }

   /**
    * Create contents of the wizard.
    * 
    * @param parent
    */
   public void createControl(Composite parent)
   {
      Composite container = new Composite(parent, SWT.NULL);
      setControl(container);
      container.setLayout(new FillLayout(SWT.HORIZONTAL));

      derivationInputComposite = new DerivationInputComposite(container, SWT.NONE);
      m_bindingContext = initDataBindings();

   }

   public DerivationInputComposite getDerivationInputComposite()
   {
      return derivationInputComposite;
   }

   protected DataBindingContext initDataBindings()
   {
      DataBindingContext bindingContext = new DataBindingContext();
      //
      return bindingContext;
   }
}
