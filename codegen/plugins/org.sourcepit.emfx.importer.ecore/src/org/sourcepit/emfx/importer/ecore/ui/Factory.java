
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public final class Factory
{
   /**
    * @wbp.factory
    */
   public static DerivationInputComposite createDerivationInputComposite(Composite parent)
   {
      DerivationInputComposite derivationInputComposite = new DerivationInputComposite(parent, SWT.NONE);
      return derivationInputComposite;
   }

   /**
    * @wbp.factory
    */
   public static Composite createComposite(Composite parent)
   {
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new FillLayout(SWT.HORIZONTAL));
      return composite;
   }
}