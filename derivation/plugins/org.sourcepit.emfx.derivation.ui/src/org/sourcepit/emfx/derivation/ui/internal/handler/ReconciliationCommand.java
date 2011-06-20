
package org.sourcepit.emfx.derivation.ui.internal.handler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.sourcepit.emfx.derivation.ReconciliationHandler;

public class ReconciliationCommand extends ChangeCommand
{

   protected EObject eObject;

   public ReconciliationCommand(EObject eObject)
   {
      super(eObject);
      this.eObject = eObject;
   }

   @Override
   protected void doExecute()
   {
      ReconciliationHandler.INSTANCE.reconcile(eObject);
   }

   @Override
   protected boolean prepare()
   {
      return super.prepare() && ReconciliationHandler.INSTANCE.isReconcilable(eObject);
   }

}
