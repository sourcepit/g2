/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package
 * @generated
 */
public interface GenModel2Factory extends EFactory
{
   /**
    * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   GenModel2Factory eINSTANCE = org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2FactoryImpl.init();

   /**
    * Returns a new object of class '<em>Gen Model2</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Gen Model2</em>'.
    * @generated
    */
   GenModel2 createGenModel2();

   /**
    * Returns a new object of class '<em>Gen Class2</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Gen Class2</em>'.
    * @generated
    */
   GenClass2 createGenClass2();

   /**
    * Returns a new object of class '<em>Gen Package2</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Gen Package2</em>'.
    * @generated
    */
   GenPackage2 createGenPackage2();

   /**
    * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   GenModel2Package getGenModel2Package();

} // GenModel2Factory
