/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory
{
   /**
    * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   EcoreFactory eINSTANCE = org.sourcepit.emfx.derivation.ecore.impl.EcoreFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Derivator Configuration</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Derivator Configuration</em>'.
    * @generated
    */
   EcoreDerivatorConfiguration createEcoreDerivatorConfiguration();

   /**
    * Returns a new object of class '<em>Reconciler Configuration</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Reconciler Configuration</em>'.
    * @generated
    */
   EcoreReconcilerConfiguration createEcoreReconcilerConfiguration();

   /**
    * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   EcorePackage getEcorePackage();

} // EcoreFactory
