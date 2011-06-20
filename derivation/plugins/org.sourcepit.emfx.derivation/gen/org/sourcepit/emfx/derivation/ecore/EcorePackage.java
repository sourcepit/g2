/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.sourcepit.emfx.derivation.DerivationPackage;

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
 * @see org.sourcepit.emfx.derivation.ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "ecore";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/emfx/derivation/ecore/1.0";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "ecore";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   EcorePackage eINSTANCE = org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl
    * <em>Derivator Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl
    * @see org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl#getEcoreDerivatorConfiguration()
    * @generated
    */
   int ECORE_DERIVATOR_CONFIGURATION = 0;

   /**
    * The feature id for the '<em><b>Derivator Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ORIGIN = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Origin Root Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>EClassifier Name Prefix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>EStructural Feature Name Prefix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Create Origin EReferences</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>EPackage Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>EPackage Ns Prefix</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 7;

   /**
    * The feature id for the '<em><b>EPackage Ns URI</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 8;

   /**
    * The feature id for the '<em><b>Create Base Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 9;

   /**
    * The feature id for the '<em><b>Create Root Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 10;

   /**
    * The feature id for the '<em><b>Root Type Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 11;

   /**
    * The feature id for the '<em><b>Base Type Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 12;

   /**
    * The feature id for the '<em><b>Origin EReference Name Prefix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 13;

   /**
    * The feature id for the '<em><b>Exclude EReferences</b></em>' reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 14;

   /**
    * The feature id for the '<em><b>Derive EData Types</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 15;

   /**
    * The feature id for the '<em><b>Derive EAttributes</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 16;

   /**
    * The feature id for the '<em><b>Derive Containment EReferences</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 17;

   /**
    * The feature id for the '<em><b>Derive EReferences</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 18;

   /**
    * The feature id for the '<em><b>EData Types As EClass</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 19;

   /**
    * The feature id for the '<em><b>Used EPackages</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 20;

   /**
    * The number of structural features of the '<em>Derivator Configuration</em>' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_DERIVATOR_CONFIGURATION_FEATURE_COUNT = DerivationPackage.DERIVATOR_CONFIGURATION_FEATURE_COUNT + 21;

   /**
    * The meta object id for the '{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl
    * <em>Reconciler Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl
    * @see org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl#getEcoreReconcilerConfiguration()
    * @generated
    */
   int ECORE_RECONCILER_CONFIGURATION = 1;

   /**
    * The feature id for the '<em><b>Reconciler Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID = DerivationPackage.RECONCILER_CONFIGURATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Reconciler Configuration</em>' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECORE_RECONCILER_CONFIGURATION_FEATURE_COUNT = DerivationPackage.RECONCILER_CONFIGURATION_FEATURE_COUNT + 1;

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration
    * <em>Derivator Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Derivator Configuration</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration
    * @generated
    */
   EClass getEcoreDerivatorConfiguration();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getDerivatorId <em>Derivator Id</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Derivator Id</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getDerivatorId()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_DerivatorId();

   /**
    * Returns the meta object for the reference '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOrigin <em>Origin</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Origin</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOrigin()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EReference getEcoreDerivatorConfiguration_Origin();

   /**
    * Returns the meta object for the reference '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginRootType
    * <em>Origin Root Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Origin Root Type</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginRootType()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EReference getEcoreDerivatorConfiguration_OriginRootType();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix
    * <em>EClassifier Name Prefix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EClassifier Name Prefix</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EClassifierNamePrefix();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix
    * <em>EStructural Feature Name Prefix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EStructural Feature Name Prefix</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EStructuralFeatureNamePrefix();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateOriginEReferences
    * <em>Create Origin EReferences</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Create Origin EReferences</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateOriginEReferences()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_CreateOriginEReferences();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName <em>EPackage Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EPackage Name</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EPackageName();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix
    * <em>EPackage Ns Prefix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EPackage Ns Prefix</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EPackageNsPrefix();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI <em>EPackage Ns URI</em>}
    * '. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EPackage Ns URI</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EPackageNsURI();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateBaseType <em>Create Base Type</em>}
    * '. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Create Base Type</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateBaseType()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_CreateBaseType();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateRootType <em>Create Root Type</em>}
    * '. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Create Root Type</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateRootType()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_CreateRootType();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName <em>Root Type Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Root Type Name</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_RootTypeName();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName <em>Base Type Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Base Type Name</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_BaseTypeName();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix
    * <em>Origin EReference Name Prefix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Origin EReference Name Prefix</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_OriginEReferenceNamePrefix();

   /**
    * Returns the meta object for the reference list '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getExcludeEReferences
    * <em>Exclude EReferences</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Exclude EReferences</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getExcludeEReferences()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EReference getEcoreDerivatorConfiguration_ExcludeEReferences();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEDataTypes
    * <em>Derive EData Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Derive EData Types</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEDataTypes()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_DeriveEDataTypes();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEAttributes
    * <em>Derive EAttributes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Derive EAttributes</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEAttributes()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_DeriveEAttributes();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveContainmentEReferences
    * <em>Derive Containment EReferences</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Derive Containment EReferences</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveContainmentEReferences()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_DeriveContainmentEReferences();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEReferences
    * <em>Derive EReferences</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Derive EReferences</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEReferences()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_DeriveEReferences();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isEDataTypesAsEClass
    * <em>EData Types As EClass</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>EData Types As EClass</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isEDataTypesAsEClass()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EAttribute getEcoreDerivatorConfiguration_EDataTypesAsEClass();

   /**
    * Returns the meta object for the reference list '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getUsedEPackages <em>Used EPackages</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Used EPackages</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getUsedEPackages()
    * @see #getEcoreDerivatorConfiguration()
    * @generated
    */
   EReference getEcoreDerivatorConfiguration_UsedEPackages();

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration
    * <em>Reconciler Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Reconciler Configuration</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration
    * @generated
    */
   EClass getEcoreReconcilerConfiguration();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration#getReconcilerId <em>Reconciler Id</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Reconciler Id</em>'.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration#getReconcilerId()
    * @see #getEcoreReconcilerConfiguration()
    * @generated
    */
   EAttribute getEcoreReconcilerConfiguration_ReconcilerId();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   EcoreFactory getEcoreFactory();

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
       * The meta object literal for the '
       * {@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl
       * <em>Derivator Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl
       * @see org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl#getEcoreDerivatorConfiguration()
       * @generated
       */
      EClass ECORE_DERIVATOR_CONFIGURATION = eINSTANCE.getEcoreDerivatorConfiguration();

      /**
       * The meta object literal for the '<em><b>Derivator Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID = eINSTANCE.getEcoreDerivatorConfiguration_DerivatorId();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' reference feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EReference ECORE_DERIVATOR_CONFIGURATION__ORIGIN = eINSTANCE.getEcoreDerivatorConfiguration_Origin();

      /**
       * The meta object literal for the '<em><b>Origin Root Type</b></em>' reference feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE = eINSTANCE
         .getEcoreDerivatorConfiguration_OriginRootType();

      /**
       * The meta object literal for the '<em><b>EClassifier Name Prefix</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX = eINSTANCE
         .getEcoreDerivatorConfiguration_EClassifierNamePrefix();

      /**
       * The meta object literal for the '<em><b>EStructural Feature Name Prefix</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX = eINSTANCE
         .getEcoreDerivatorConfiguration_EStructuralFeatureNamePrefix();

      /**
       * The meta object literal for the '<em><b>Create Origin EReferences</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES = eINSTANCE
         .getEcoreDerivatorConfiguration_CreateOriginEReferences();

      /**
       * The meta object literal for the '<em><b>EPackage Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME = eINSTANCE.getEcoreDerivatorConfiguration_EPackageName();

      /**
       * The meta object literal for the '<em><b>EPackage Ns Prefix</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX = eINSTANCE
         .getEcoreDerivatorConfiguration_EPackageNsPrefix();

      /**
       * The meta object literal for the '<em><b>EPackage Ns URI</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI = eINSTANCE
         .getEcoreDerivatorConfiguration_EPackageNsURI();

      /**
       * The meta object literal for the '<em><b>Create Base Type</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE = eINSTANCE
         .getEcoreDerivatorConfiguration_CreateBaseType();

      /**
       * The meta object literal for the '<em><b>Create Root Type</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE = eINSTANCE
         .getEcoreDerivatorConfiguration_CreateRootType();

      /**
       * The meta object literal for the '<em><b>Root Type Name</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME = eINSTANCE
         .getEcoreDerivatorConfiguration_RootTypeName();

      /**
       * The meta object literal for the '<em><b>Base Type Name</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME = eINSTANCE
         .getEcoreDerivatorConfiguration_BaseTypeName();

      /**
       * The meta object literal for the '<em><b>Origin EReference Name Prefix</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX = eINSTANCE
         .getEcoreDerivatorConfiguration_OriginEReferenceNamePrefix();

      /**
       * The meta object literal for the '<em><b>Exclude EReferences</b></em>' reference list feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES = eINSTANCE
         .getEcoreDerivatorConfiguration_ExcludeEReferences();

      /**
       * The meta object literal for the '<em><b>Derive EData Types</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES = eINSTANCE
         .getEcoreDerivatorConfiguration_DeriveEDataTypes();

      /**
       * The meta object literal for the '<em><b>Derive EAttributes</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES = eINSTANCE
         .getEcoreDerivatorConfiguration_DeriveEAttributes();

      /**
       * The meta object literal for the '<em><b>Derive Containment EReferences</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES = eINSTANCE
         .getEcoreDerivatorConfiguration_DeriveContainmentEReferences();

      /**
       * The meta object literal for the '<em><b>Derive EReferences</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES = eINSTANCE
         .getEcoreDerivatorConfiguration_DeriveEReferences();

      /**
       * The meta object literal for the '<em><b>EData Types As EClass</b></em>' attribute feature. <!-- begin-user-doc
       * --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS = eINSTANCE
         .getEcoreDerivatorConfiguration_EDataTypesAsEClass();

      /**
       * The meta object literal for the '<em><b>Used EPackages</b></em>' reference list feature. <!-- begin-user-doc
       * --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES = eINSTANCE
         .getEcoreDerivatorConfiguration_UsedEPackages();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl
       * <em>Reconciler Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl
       * @see org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl#getEcoreReconcilerConfiguration()
       * @generated
       */
      EClass ECORE_RECONCILER_CONFIGURATION = eINSTANCE.getEcoreReconcilerConfiguration();

      /**
       * The meta object literal for the '<em><b>Reconciler Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID = eINSTANCE
         .getEcoreReconcilerConfiguration_ReconcilerId();

   }

} // EcorePackage
