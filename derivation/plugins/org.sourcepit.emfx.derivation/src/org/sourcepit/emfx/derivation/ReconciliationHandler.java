
package org.sourcepit.emfx.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.derivation.ecore.GenericReconciler;

public final class ReconciliationHandler
{

   public static final ReconciliationHandler INSTANCE = new ReconciliationHandler();

   private List<IReconciler> reconcilers = new ArrayList<IReconciler>();

   private ReconciliationHandler()
   {
      reconcilers.add(new GenericReconciler());
   }

   public boolean isReconcilable(EObject eObject)
   {
      for (IReconciler reconciler : reconcilers)
      {
         if (reconciler.canReconcile(eObject))
         {
            return true;
         }
      }
      return false;
   }

   public void reconcile(EObject eObject)
   {
      IReconciler reconciler = getResponsibleReconciler(eObject);
      if (reconciler == null)
      {
         reconciler = getSomeReconciler(eObject);
         if (reconciler == null)
         {
            throw new IllegalStateException("Cannot find reconciler for " + eObject);
         }
      }
      reconciler.reconcile(eObject);
   }

   private IReconciler getResponsibleReconciler(EObject eObject)
   {
      for (IReconciler reconciler : reconcilers)
      {
         if (reconciler.isResponsibleFor(eObject))
         {
            return reconciler;
         }
      }
      return null;
   }

   private IReconciler getSomeReconciler(EObject eObject)
   {
      for (IReconciler reconciler : reconcilers)
      {
         if (reconciler.canReconcile(eObject))
         {
            return reconciler;
         }
      }
      return null;
   }
}
