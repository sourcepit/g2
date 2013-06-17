/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package
 * @generated
 */
public class GenModel2AdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static GenModel2Package modelPackage;

   /**
    * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2AdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = GenModel2Package.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This implementation
    * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
    * end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected GenModel2Switch<Adapter> modelSwitch = new GenModel2Switch<Adapter>()
   {
      @Override
      public Adapter caseGenModel2(GenModel2 object)
      {
         return createGenModel2Adapter();
      }

      @Override
      public Adapter caseGenBase2(GenBase2 object)
      {
         return createGenBase2Adapter();
      }

      @Override
      public Adapter caseGenClass2(GenClass2 object)
      {
         return createGenClass2Adapter();
      }

      @Override
      public Adapter caseGenPackage2(GenPackage2 object)
      {
         return createGenPackage2Adapter();
      }

      @Override
      public Adapter caseGenBase(GenBase object)
      {
         return createGenBaseAdapter();
      }

      @Override
      public Adapter caseGenModel(GenModel object)
      {
         return createGenModelAdapter();
      }

      @Override
      public Adapter caseGenClassifier(GenClassifier object)
      {
         return createGenClassifierAdapter();
      }

      @Override
      public Adapter caseGenClass(GenClass object)
      {
         return createGenClassAdapter();
      }

      @Override
      public Adapter caseGenPackage(GenPackage object)
      {
         return createGenPackageAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2
    * <em>Gen Model2</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2
    * @generated
    */
   public Adapter createGenModel2Adapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class ' {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2
    * <em>Gen Base2</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2
    * @generated
    */
   public Adapter createGenBase2Adapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2
    * <em>Gen Class2</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2
    * @generated
    */
   public Adapter createGenClass2Adapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2
    * <em>Gen Package2</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2
    * @generated
    */
   public Adapter createGenPackage2Adapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenBase
    * <em>Gen Base</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
    * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.eclipse.emf.codegen.ecore.genmodel.GenBase
    * @generated
    */
   public Adapter createGenBaseAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class ' {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel
    * <em>Gen Model</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.eclipse.emf.codegen.ecore.genmodel.GenModel
    * @generated
    */
   public Adapter createGenModelAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier
    * <em>Gen Classifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.eclipse.emf.codegen.ecore.genmodel.GenClassifier
    * @generated
    */
   public Adapter createGenClassifierAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class ' {@link org.eclipse.emf.codegen.ecore.genmodel.GenClass
    * <em>Gen Class</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.eclipse.emf.codegen.ecore.genmodel.GenClass
    * @generated
    */
   public Adapter createGenClassAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage
    * <em>Gen Package</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
    * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.eclipse.emf.codegen.ecore.genmodel.GenPackage
    * @generated
    */
   public Adapter createGenPackageAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null. <!--
    * end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter()
   {
      return null;
   }

} // GenModel2AdapterFactory
