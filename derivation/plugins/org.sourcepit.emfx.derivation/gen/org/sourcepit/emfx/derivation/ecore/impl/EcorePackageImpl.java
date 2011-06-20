/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.emfx.derivation.DerivationPackage;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreFactory;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;
import org.sourcepit.emfx.derivation.impl.DerivationPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass ecoreDerivatorConfigurationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass ecoreReconcilerConfigurationEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private EcorePackageImpl()
   {
      super(eNS_URI, EcoreFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>
    * This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed. Clients should not
    * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static EcorePackage init()
   {
      if (isInited)
         return (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

      // Obtain or create and register package
      EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new EcorePackageImpl());

      isInited = true;

      // Initialize simple dependencies
      org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      DerivationPackageImpl theDerivationPackage = (DerivationPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(DerivationPackage.eNS_URI) instanceof DerivationPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(DerivationPackage.eNS_URI) : DerivationPackage.eINSTANCE);

      // Create package meta-data objects
      theEcorePackage.createPackageContents();
      theDerivationPackage.createPackageContents();

      // Initialize created meta-data
      theEcorePackage.initializePackageContents();
      theDerivationPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theEcorePackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
      return theEcorePackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEcoreDerivatorConfiguration()
   {
      return ecoreDerivatorConfigurationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_DerivatorId()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEcoreDerivatorConfiguration_Origin()
   {
      return (EReference) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEcoreDerivatorConfiguration_OriginRootType()
   {
      return (EReference) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EClassifierNamePrefix()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EStructuralFeatureNamePrefix()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_CreateOriginEReferences()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EPackageName()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EPackageNsPrefix()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EPackageNsURI()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_CreateBaseType()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_CreateRootType()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_RootTypeName()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(11);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_BaseTypeName()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(12);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_OriginEReferenceNamePrefix()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(13);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEcoreDerivatorConfiguration_ExcludeEReferences()
   {
      return (EReference) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(14);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_DeriveEDataTypes()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(15);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_DeriveEAttributes()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(16);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_DeriveContainmentEReferences()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(17);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_DeriveEReferences()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(18);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreDerivatorConfiguration_EDataTypesAsEClass()
   {
      return (EAttribute) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(19);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEcoreDerivatorConfiguration_UsedEPackages()
   {
      return (EReference) ecoreDerivatorConfigurationEClass.getEStructuralFeatures().get(20);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEcoreReconcilerConfiguration()
   {
      return ecoreReconcilerConfigurationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEcoreReconcilerConfiguration_ReconcilerId()
   {
      return (EAttribute) ecoreReconcilerConfigurationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreFactory getEcoreFactory()
   {
      return (EcoreFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its
    * first. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      ecoreDerivatorConfigurationEClass = createEClass(ECORE_DERIVATOR_CONFIGURATION);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID);
      createEReference(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__ORIGIN);
      createEReference(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX);
      createEAttribute(ecoreDerivatorConfigurationEClass,
         ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX);
      createEReference(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES);
      createEAttribute(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS);
      createEReference(ecoreDerivatorConfigurationEClass, ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES);

      ecoreReconcilerConfigurationEClass = createEClass(ECORE_RECONCILER_CONFIGURATION);
      createEAttribute(ecoreReconcilerConfigurationEClass, ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
    * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      DerivationPackage theDerivationPackage = (DerivationPackage) EPackage.Registry.INSTANCE
         .getEPackage(DerivationPackage.eNS_URI);
      org.eclipse.emf.ecore.EcorePackage theEcorePackage_1 = (org.eclipse.emf.ecore.EcorePackage) EPackage.Registry.INSTANCE
         .getEPackage(org.eclipse.emf.ecore.EcorePackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      ecoreDerivatorConfigurationEClass.getESuperTypes().add(theDerivationPackage.getDerivatorConfiguration());
      ecoreReconcilerConfigurationEClass.getESuperTypes().add(theDerivationPackage.getReconcilerConfiguration());

      // Initialize classes and features; add operations and parameters
      initEClass(ecoreDerivatorConfigurationEClass, EcoreDerivatorConfiguration.class, "EcoreDerivatorConfiguration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEcoreDerivatorConfiguration_DerivatorId(), ecorePackage.getEString(), "derivatorId",
         "org.sourcepit.emfx.derivation.ecore.GenericDerivator", 1, 1, EcoreDerivatorConfiguration.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEcoreDerivatorConfiguration_Origin(), theEcorePackage_1.getEPackage(), null, "origin", null, 1,
         1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEcoreDerivatorConfiguration_OriginRootType(), theEcorePackage_1.getEClass(), null,
         "originRootType", null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EClassifierNamePrefix(), ecorePackage.getEString(),
         "eClassifierNamePrefix", null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EStructuralFeatureNamePrefix(), ecorePackage.getEString(),
         "eStructuralFeatureNamePrefix", null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_CreateOriginEReferences(), ecorePackage.getEBoolean(),
         "createOriginEReferences", null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EPackageName(), ecorePackage.getEString(), "ePackageName", null, 0,
         1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EPackageNsPrefix(), ecorePackage.getEString(), "ePackageNsPrefix",
         null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EPackageNsURI(), ecorePackage.getEString(), "ePackageNsURI", null,
         0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_CreateBaseType(), ecorePackage.getEBoolean(), "createBaseType",
         null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_CreateRootType(), ecorePackage.getEBoolean(), "createRootType",
         null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_RootTypeName(), ecorePackage.getEString(), "rootTypeName", "Model",
         0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_BaseTypeName(), ecorePackage.getEString(), "baseTypeName", "Base",
         0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_OriginEReferenceNamePrefix(), ecorePackage.getEString(),
         "originEReferenceNamePrefix", "origin", 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEcoreDerivatorConfiguration_ExcludeEReferences(), theEcorePackage_1.getEReference(), null,
         "excludeEReferences", null, 0, -1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_DeriveEDataTypes(), ecorePackage.getEBoolean(), "deriveEDataTypes",
         "true", 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_DeriveEAttributes(), ecorePackage.getEBoolean(),
         "deriveEAttributes", "true", 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_DeriveContainmentEReferences(), ecorePackage.getEBoolean(),
         "deriveContainmentEReferences", "true", 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_DeriveEReferences(), ecorePackage.getEBoolean(),
         "deriveEReferences", "true", 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEcoreDerivatorConfiguration_EDataTypesAsEClass(), ecorePackage.getEBoolean(),
         "eDataTypesAsEClass", null, 0, 1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEcoreDerivatorConfiguration_UsedEPackages(), theEcorePackage_1.getEPackage(), null,
         "usedEPackages", null, 0, -1, EcoreDerivatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      EOperation op = addEOperation(ecoreDerivatorConfigurationEClass, ecorePackage.getEString(), "getEClassifierName",
         0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "originalName", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(ecoreDerivatorConfigurationEClass, ecorePackage.getEString(), "getEStructuralFeatureName", 0,
         1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "originalName", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(ecoreDerivatorConfigurationEClass, ecorePackage.getEString(), "getOriginEReferenceName", 0, 1,
         IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "originalName", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(ecoreReconcilerConfigurationEClass, EcoreReconcilerConfiguration.class,
         "EcoreReconcilerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEcoreReconcilerConfiguration_ReconcilerId(), theEcorePackage_1.getEString(), "reconcilerId",
         "org.sourcepit.emfx.derivation.ecore.GenericReconciler", 1, 1, EcoreReconcilerConfiguration.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
   }

} // EcorePackageImpl
