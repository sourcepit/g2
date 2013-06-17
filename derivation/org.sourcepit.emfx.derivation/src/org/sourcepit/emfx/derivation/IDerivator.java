
package org.sourcepit.emfx.derivation;

import org.eclipse.emf.ecore.EObject;

public interface IDerivator
{

   String ANNOTATION_DERIVED = "derived";

   void initialize(DerivatorConfiguration configuration);

   void derive();

   EObject getDerivative();
}