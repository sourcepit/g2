/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class GenModel2PackageImpl extends EPackageImpl implements GenModel2Package
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass genModel2EClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass genBase2EClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass genClass2EClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass genPackage2EClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#eNS_URI
    * @see #init()
    * @generated
    */
   private GenModel2PackageImpl()
   {
      super(eNS_URI, GenModel2Factory.eINSTANCE);
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
    * This method is used to initialize {@link GenModel2Package#eINSTANCE} when that field is accessed. Clients should
    * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static GenModel2Package init()
   {
      if (isInited)
         return (GenModel2Package) EPackage.Registry.INSTANCE.getEPackage(GenModel2Package.eNS_URI);

      // Obtain or create and register package
      GenModel2PackageImpl theGenModel2Package = (GenModel2PackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenModel2PackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new GenModel2PackageImpl());

      isInited = true;

      // Initialize simple dependencies
      GenModelPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theGenModel2Package.createPackageContents();

      // Initialize created meta-data
      theGenModel2Package.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theGenModel2Package.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(GenModel2Package.eNS_URI, theGenModel2Package);
      return theGenModel2Package;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getGenModel2()
   {
      return genModel2EClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorDirectory()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorPluginClass()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorPluginID()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorPluginVariables()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorUIDirectory()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorUIPluginClass()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorUIPluginID()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorUIPluginVariables()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenModel2_GeneratorProjectTypes()
   {
      return (EAttribute) genModel2EClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getGenBase2()
   {
      return genBase2EClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenBase2_GenerateGenerator()
   {
      return (EAttribute) genBase2EClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getGenClass2()
   {
      return genClass2EClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getGenPackage2()
   {
      return genPackage2EClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenPackage2_GeneratorPackageSuffix()
   {
      return (EAttribute) genPackage2EClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getGenPackage2_GeneratorUIPackageSuffix()
   {
      return (EAttribute) genPackage2EClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2Factory getGenModel2Factory()
   {
      return (GenModel2Factory) getEFactoryInstance();
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
      genModel2EClass = createEClass(GEN_MODEL2);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_DIRECTORY);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_PLUGIN_CLASS);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_PLUGIN_ID);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_UI_DIRECTORY);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_UI_PLUGIN_ID);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES);
      createEAttribute(genModel2EClass, GEN_MODEL2__GENERATOR_PROJECT_TYPES);

      genBase2EClass = createEClass(GEN_BASE2);
      createEAttribute(genBase2EClass, GEN_BASE2__GENERATE_GENERATOR);

      genClass2EClass = createEClass(GEN_CLASS2);

      genPackage2EClass = createEClass(GEN_PACKAGE2);
      createEAttribute(genPackage2EClass, GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX);
      createEAttribute(genPackage2EClass, GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX);
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
      GenModelPackage theGenModelPackage = (GenModelPackage) EPackage.Registry.INSTANCE
         .getEPackage(GenModelPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      genModel2EClass.getESuperTypes().add(theGenModelPackage.getGenModel());
      genModel2EClass.getESuperTypes().add(this.getGenBase2());
      genBase2EClass.getESuperTypes().add(theGenModelPackage.getGenBase());
      genClass2EClass.getESuperTypes().add(theGenModelPackage.getGenClass());
      genClass2EClass.getESuperTypes().add(this.getGenBase2());
      genPackage2EClass.getESuperTypes().add(theGenModelPackage.getGenPackage());
      genPackage2EClass.getESuperTypes().add(this.getGenBase2());

      // Initialize classes and features; add operations and parameters
      initEClass(genModel2EClass, GenModel2.class, "GenModel2", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getGenModel2_GeneratorDirectory(), ecorePackage.getEString(), "generatorDirectory", null, 0, 1,
         GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorPluginClass(), ecorePackage.getEString(), "generatorPluginClass", null, 0,
         1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorPluginID(), ecorePackage.getEString(), "generatorPluginID", null, 0, 1,
         GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorPluginVariables(), ecorePackage.getEString(), "generatorPluginVariables",
         null, 0, -1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorUIDirectory(), ecorePackage.getEString(), "generatorUIDirectory", null, 0,
         1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorUIPluginClass(), ecorePackage.getEString(), "generatorUIPluginClass", null,
         0, 1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorUIPluginID(), ecorePackage.getEString(), "generatorUIPluginID", null, 0, 1,
         GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorUIPluginVariables(), ecorePackage.getEString(),
         "generatorUIPluginVariables", null, 0, -1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getGenModel2_GeneratorProjectTypes(), ecorePackage.getEString(), "generatorProjectTypes", null, 0,
         -1, GenModel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(genBase2EClass, GenBase2.class, "GenBase2", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getGenBase2_GenerateGenerator(), ecorePackage.getEBoolean(), "generateGenerator", null, 0, 1,
         GenBase2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);

      initEClass(genClass2EClass, GenClass2.class, "GenClass2", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(genPackage2EClass, GenPackage2.class, "GenPackage2", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getGenPackage2_GeneratorPackageSuffix(), ecorePackage.getEString(), "generatorPackageSuffix",
         "generator", 0, 1, GenPackage2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getGenPackage2_GeneratorUIPackageSuffix(), ecorePackage.getEString(), "generatorUIPackageSuffix",
         "generator.ui", 0, 1, GenPackage2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} // GenModel2PackageImpl
