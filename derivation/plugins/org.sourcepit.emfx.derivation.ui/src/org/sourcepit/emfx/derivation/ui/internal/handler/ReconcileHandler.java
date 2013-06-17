
package org.sourcepit.emfx.derivation.ui.internal.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.sourcepit.emfx.common.ui.JFaceUtil;
import org.sourcepit.emfx.derivation.ReconciliationHandler;

public class ReconcileHandler extends AbstractHandler
{

   public Object execute(ExecutionEvent event) throws ExecutionException
   {

      final EditingDomain domain = getEditingDomain(event);
      if (domain != null)
      {
         final List<EObject> elements = JFaceUtil.getElements(HandlerUtil.getCurrentSelectionChecked(event),
            EObject.class);
         if (!elements.isEmpty())
         {
            reconcile(domain, elements);
         }
      }
      return null;
   }

   protected EditingDomain getEditingDomain(ExecutionEvent event)
   {
      IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
      if (activePart instanceof IEditingDomainProvider)
      {
         return ((IEditingDomainProvider) activePart).getEditingDomain();
      }
      return null;
   }

   protected void reconcile(final EditingDomain domain, final List<EObject> elements)
   {
      final CompoundCommand ccmd = new CompoundCommand();
      for (final EObject eObject : elements)
      {
         if (ReconciliationHandler.INSTANCE.isReconcilable(eObject))
         {
            ccmd.append(new ReconciliationCommand(eObject));
         }
      }
      if (ccmd.canExecute())
      {
         domain.getCommandStack().execute(ccmd);
      }
   }
}
