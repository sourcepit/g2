
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import com.swtdesigner.SWTResourceManager;

public class TestPage extends WizardPage
{
   private DerivationInputComposite derivationInputComposite;

   /**
    * Create the wizard.
    */
   public TestPage()
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

      Composite composite = Factory.createComposite(container);
      composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));

      derivationInputComposite = Factory.createDerivationInputComposite(composite);
   }

   public DerivationInputComposite getDerivationInputComposite()
   {
      return derivationInputComposite;
   }
}
