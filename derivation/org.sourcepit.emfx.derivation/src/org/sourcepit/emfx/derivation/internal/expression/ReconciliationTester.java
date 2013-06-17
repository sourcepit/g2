
package org.sourcepit.emfx.derivation.internal.expression;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.derivation.ReconciliationHandler;

public class ReconciliationTester extends PropertyTester
{

   private static final String IS_RECONCILABLE = "isReconcilable";

   public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
   {
      if (IS_RECONCILABLE.equals(property) && receiver instanceof EObject)
      {
         return ReconciliationHandler.INSTANCE.isReconcilable((EObject) receiver);
      }
      return false;
   }

}
