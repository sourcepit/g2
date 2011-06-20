
package org.sourcepit.emfx.derivation;


public interface IDerivatorFactory
{

   boolean canCreate(String derivatorId);

   IDerivator createDerivator(String derivatorId);
}
