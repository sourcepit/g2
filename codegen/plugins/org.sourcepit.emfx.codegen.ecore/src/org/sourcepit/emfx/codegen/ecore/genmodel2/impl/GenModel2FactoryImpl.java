/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class GenModel2FactoryImpl extends EFactoryImpl implements GenModel2Factory
{
   /**
    * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static GenModel2Factory init()
   {
      try
      {
         GenModel2Factory theGenModel2Factory = (GenModel2Factory) EPackage.Registry.INSTANCE
            .getEFactory("http://genmodel2/1.0");
         if (theGenModel2Factory != null)
         {
            return theGenModel2Factory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new GenModel2FactoryImpl();
   }

   /**
    * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2FactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case GenModel2Package.GEN_MODEL2 :
            return createGenModel2();
         case GenModel2Package.GEN_CLASS2 :
            return createGenClass2();
         case GenModel2Package.GEN_PACKAGE2 :
            return createGenPackage2();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2 createGenModel2()
   {
      GenModel2Impl genModel2 = new GenModel2Impl();
      return genModel2;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenClass2 createGenClass2()
   {
      GenClass2Impl genClass2 = new GenClass2Impl();
      return genClass2;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenPackage2 createGenPackage2()
   {
      GenPackage2Impl genPackage2 = new GenPackage2Impl();
      return genPackage2;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2Package getGenModel2Package()
   {
      return (GenModel2Package) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static GenModel2Package getPackage()
   {
      return GenModel2Package.eINSTANCE;
   }

} // GenModel2FactoryImpl
