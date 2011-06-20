/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Reconciler Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl#getReconcilerId <em>Reconciler
 * Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EcoreReconcilerConfigurationImpl extends EObjectImpl implements EcoreReconcilerConfiguration
{
   /**
    * The default value of the '{@link #getReconcilerId() <em>Reconciler Id</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getReconcilerId()
    * @generated
    * @ordered
    */
   protected static final String RECONCILER_ID_EDEFAULT = "org.sourcepit.emfx.derivation.ecore.GenericReconciler";

   public static final String RECONCILER_ID = RECONCILER_ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getReconcilerId() <em>Reconciler Id</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getReconcilerId()
    * @generated
    * @ordered
    */
   protected String reconcilerId = RECONCILER_ID_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected EcoreReconcilerConfigurationImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return EcorePackage.Literals.ECORE_RECONCILER_CONFIGURATION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getReconcilerId()
   {
      return reconcilerId;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setReconcilerId(String newReconcilerId)
   {
      String oldReconcilerId = reconcilerId;
      reconcilerId = newReconcilerId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID, oldReconcilerId, reconcilerId));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID :
            return getReconcilerId();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID :
            setReconcilerId((String) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID :
            setReconcilerId(RECONCILER_ID_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION__RECONCILER_ID :
            return RECONCILER_ID_EDEFAULT == null ? reconcilerId != null : !RECONCILER_ID_EDEFAULT.equals(reconcilerId);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (reconcilerId: ");
      result.append(reconcilerId);
      result.append(')');
      return result.toString();
   }

} // EcoreReconcilerConfigurationImpl
