/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.derivation.DerivationPackage
 * @generated
 */
public interface DerivationFactory extends EFactory
{
   /**
    * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   DerivationFactory eINSTANCE = org.sourcepit.emfx.derivation.impl.DerivationFactoryImpl.init();

   /**
    * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   DerivationPackage getDerivationPackage();

} // DerivationFactory
