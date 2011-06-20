/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.emfx.derivation.DerivationFactory;
import org.sourcepit.emfx.derivation.DerivationPackage;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;
import org.sourcepit.emfx.derivation.ReconcilerConfiguration;
import org.sourcepit.emfx.derivation.ecore.impl.EcorePackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DerivationPackageImpl extends EPackageImpl implements DerivationPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass derivatorConfigurationEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass reconcilerConfigurationEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.emfx.derivation.DerivationPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private DerivationPackageImpl()
   {
      super(eNS_URI, DerivationFactory.eINSTANCE);
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
    * This method is used to initialize {@link DerivationPackage#eINSTANCE} when that field is accessed. Clients should
    * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static DerivationPackage init()
   {
      if (isInited)
         return (DerivationPackage) EPackage.Registry.INSTANCE.getEPackage(DerivationPackage.eNS_URI);

      // Obtain or create and register package
      DerivationPackageImpl theDerivationPackage = (DerivationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DerivationPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new DerivationPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      EcorePackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      EcorePackageImpl theEcorePackage_1 = (EcorePackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(org.sourcepit.emfx.derivation.ecore.EcorePackage.eNS_URI) instanceof EcorePackageImpl
         ? EPackage.Registry.INSTANCE.getEPackage(org.sourcepit.emfx.derivation.ecore.EcorePackage.eNS_URI)
         : org.sourcepit.emfx.derivation.ecore.EcorePackage.eINSTANCE);

      // Create package meta-data objects
      theDerivationPackage.createPackageContents();
      theEcorePackage_1.createPackageContents();

      // Initialize created meta-data
      theDerivationPackage.initializePackageContents();
      theEcorePackage_1.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theDerivationPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(DerivationPackage.eNS_URI, theDerivationPackage);
      return theDerivationPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getDerivatorConfiguration()
   {
      return derivatorConfigurationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getReconcilerConfiguration()
   {
      return reconcilerConfigurationEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public DerivationFactory getDerivationFactory()
   {
      return (DerivationFactory) getEFactoryInstance();
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
      derivatorConfigurationEClass = createEClass(DERIVATOR_CONFIGURATION);

      reconcilerConfigurationEClass = createEClass(RECONCILER_CONFIGURATION);
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
      org.sourcepit.emfx.derivation.ecore.EcorePackage theEcorePackage_1 = (org.sourcepit.emfx.derivation.ecore.EcorePackage) EPackage.Registry.INSTANCE
         .getEPackage(org.sourcepit.emfx.derivation.ecore.EcorePackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theEcorePackage_1);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes and features; add operations and parameters
      initEClass(derivatorConfigurationEClass, DerivatorConfiguration.class, "DerivatorConfiguration", IS_ABSTRACT,
         IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      addEOperation(derivatorConfigurationEClass, ecorePackage.getEString(), "getDerivatorId", 1, 1, IS_UNIQUE,
         IS_ORDERED);

      addEOperation(derivatorConfigurationEClass, ecorePackage.getEJavaObject(), "getOrigin", 1, 1, IS_UNIQUE,
         IS_ORDERED);

      initEClass(reconcilerConfigurationEClass, ReconcilerConfiguration.class, "ReconcilerConfiguration", IS_ABSTRACT,
         IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      addEOperation(reconcilerConfigurationEClass, ecorePackage.getEString(), "getReconcilerId", 1, 1, IS_UNIQUE,
         IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} // DerivationPackageImpl
