
package org.sourcepit.emfx.derivation.ui.internal.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
   private static final String BUNDLE_NAME = "org.sourcepit.emfx.derivation.ui.internal.messages.messages"; //$NON-NLS-1$
   public static String DerivationInputComposite_grpInputEpackages_text;
   public static String DerivationInputComposite_lblAddAndSelect_text;
   public static String DerivationInputComposite_btnAdd_1_text;
   public static String DerivationInputComposite_grpReferencedDerivatives_text;
   public static String DerivationInputComposite_lblAddDerivates_text;
   public static String DerivationInputComposite_btnAdd_text;
   public static String DerivationInputComposite_trclmnDerivative_text;
   public static String DerivationInputComposite_trclmnOrigin_text;

   // //////////////////////////////////////////////////////////////////////////
   //
   // Constructor
   //
   // //////////////////////////////////////////////////////////////////////////
   private Messages()
   {
      // do not instantiate
   }

   // //////////////////////////////////////////////////////////////////////////
   //
   // Class initialization
   //
   // //////////////////////////////////////////////////////////////////////////
   static
   {
      // load message values from bundle file
      NLS.initializeMessages(BUNDLE_NAME, Messages.class);
   }
}
