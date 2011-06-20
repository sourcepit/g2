
package org.sourcepit.emfx.derivation.ecore;

import org.sourcepit.emfx.derivation.IDerivator;
import org.sourcepit.emfx.derivation.IDerivatorFactory;

public class GenericDerivatorFactory implements IDerivatorFactory
{

   public boolean canCreate(String derivatorId)
   {
      return GenericDerivator.ID.equals(derivatorId);
   }

   public IDerivator createDerivator(String derivatorId)
   {
      return new GenericDerivator();
   }
}
