
package org.sourcepit.emfx.derivation;

import org.eclipse.emf.ecore.EObject;

public interface IReconciler
{

   String getId();

   boolean isResponsibleFor(EObject reconcilable);

   boolean canReconcile(EObject eObject);

   void reconcile(EObject eObject);
}
