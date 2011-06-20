/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreFactory;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory
{
   /**
    * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static EcoreFactory init()
   {
      try
      {
         EcoreFactory theEcoreFactory = (EcoreFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://www.sourcepit.org/emfx/derivation/ecore/1.0");
         if (theEcoreFactory != null)
         {
            return theEcoreFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new EcoreFactoryImpl();
   }

   /**
    * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreFactoryImpl()
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
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION :
            return createEcoreDerivatorConfiguration();
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION :
            return createEcoreReconcilerConfiguration();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreDerivatorConfiguration createEcoreDerivatorConfiguration()
   {
      EcoreDerivatorConfigurationImpl ecoreDerivatorConfiguration = new EcoreDerivatorConfigurationImpl();
      return ecoreDerivatorConfiguration;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreReconcilerConfiguration createEcoreReconcilerConfiguration()
   {
      EcoreReconcilerConfigurationImpl ecoreReconcilerConfiguration = new EcoreReconcilerConfigurationImpl();
      return ecoreReconcilerConfiguration;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcorePackage getEcorePackage()
   {
      return (EcorePackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static EcorePackage getPackage()
   {
      return EcorePackage.eINSTANCE;
   }

} // EcoreFactoryImpl
