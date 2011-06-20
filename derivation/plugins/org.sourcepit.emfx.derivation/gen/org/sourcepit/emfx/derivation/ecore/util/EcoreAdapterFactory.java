/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;
import org.sourcepit.emfx.derivation.ReconcilerConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage
 * @generated
 */
public class EcoreAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static EcorePackage modelPackage;

   /**
    * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = EcorePackage.eINSTANCE;
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
   protected EcoreSwitch<Adapter> modelSwitch = new EcoreSwitch<Adapter>()
   {
      @Override
      public Adapter caseEcoreDerivatorConfiguration(EcoreDerivatorConfiguration object)
      {
         return createEcoreDerivatorConfigurationAdapter();
      }

      @Override
      public Adapter caseEcoreReconcilerConfiguration(EcoreReconcilerConfiguration object)
      {
         return createEcoreReconcilerConfigurationAdapter();
      }

      @Override
      public Adapter caseDerivatorConfiguration(DerivatorConfiguration object)
      {
         return createDerivatorConfigurationAdapter();
      }

      @Override
      public Adapter caseReconcilerConfiguration(ReconcilerConfiguration object)
      {
         return createReconcilerConfigurationAdapter();
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
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration <em>Derivator Configuration</em>}'. <!--
    * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
    * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration
    * @generated
    */
   public Adapter createEcoreDerivatorConfigurationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration <em>Reconciler Configuration</em>}'. <!--
    * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
    * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration
    * @generated
    */
   public Adapter createEcoreReconcilerConfigurationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.emfx.derivation.DerivatorConfiguration
    * <em>Derivator Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
    * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
    * end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.derivation.DerivatorConfiguration
    * @generated
    */
   public Adapter createDerivatorConfigurationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * <em>Reconciler Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
    * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
    * end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.emfx.derivation.ReconcilerConfiguration
    * @generated
    */
   public Adapter createReconcilerConfigurationAdapter()
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

} // EcoreAdapterFactory
