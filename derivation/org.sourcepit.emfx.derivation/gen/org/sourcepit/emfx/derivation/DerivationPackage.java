/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.derivation.DerivationFactory
 * @model kind="package"
 * @generated
 */
public interface DerivationPackage extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "derivation";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/emfx/derivation/1.0";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "derivation";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   DerivationPackage eINSTANCE = org.sourcepit.emfx.derivation.impl.DerivationPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.emfx.derivation.DerivatorConfiguration
    * <em>Derivator Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.derivation.DerivatorConfiguration
    * @see org.sourcepit.emfx.derivation.impl.DerivationPackageImpl#getDerivatorConfiguration()
    * @generated
    */
   int DERIVATOR_CONFIGURATION = 0;

   /**
    * The number of structural features of the '<em>Derivator Configuration</em>' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DERIVATOR_CONFIGURATION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * <em>Reconciler Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * @see org.sourcepit.emfx.derivation.impl.DerivationPackageImpl#getReconcilerConfiguration()
    * @generated
    */
   int RECONCILER_CONFIGURATION = 1;

   /**
    * The number of structural features of the '<em>Reconciler Configuration</em>' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECONCILER_CONFIGURATION_FEATURE_COUNT = 0;

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.derivation.DerivatorConfiguration
    * <em>Derivator Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Derivator Configuration</em>'.
    * @see org.sourcepit.emfx.derivation.DerivatorConfiguration
    * @generated
    */
   EClass getDerivatorConfiguration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * <em>Reconciler Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Reconciler Configuration</em>'.
    * @see org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * @generated
    */
   EClass getReconcilerConfiguration();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   DerivationFactory getDerivationFactory();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.sourcepit.emfx.derivation.DerivatorConfiguration
       * <em>Derivator Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.derivation.DerivatorConfiguration
       * @see org.sourcepit.emfx.derivation.impl.DerivationPackageImpl#getDerivatorConfiguration()
       * @generated
       */
      EClass DERIVATOR_CONFIGURATION = eINSTANCE.getDerivatorConfiguration();

      /**
       * The meta object literal for the '{@link org.sourcepit.emfx.derivation.ReconcilerConfiguration
       * <em>Reconciler Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.derivation.ReconcilerConfiguration
       * @see org.sourcepit.emfx.derivation.impl.DerivationPackageImpl#getReconcilerConfiguration()
       * @generated
       */
      EClass RECONCILER_CONFIGURATION = eINSTANCE.getReconcilerConfiguration();

   }

} // DerivationPackage
