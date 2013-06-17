/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;
import org.sourcepit.emfx.derivation.ReconcilerConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage
 * @generated
 */
public class EcoreSwitch<T>
{
   /**
    * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static EcorePackage modelPackage;

   /**
    * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = EcorePackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch(EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION :
         {
            EcoreDerivatorConfiguration ecoreDerivatorConfiguration = (EcoreDerivatorConfiguration) theEObject;
            T result = caseEcoreDerivatorConfiguration(ecoreDerivatorConfiguration);
            if (result == null)
               result = caseDerivatorConfiguration(ecoreDerivatorConfiguration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case EcorePackage.ECORE_RECONCILER_CONFIGURATION :
         {
            EcoreReconcilerConfiguration ecoreReconcilerConfiguration = (EcoreReconcilerConfiguration) theEObject;
            T result = caseEcoreReconcilerConfiguration(ecoreReconcilerConfiguration);
            if (result == null)
               result = caseReconcilerConfiguration(ecoreReconcilerConfiguration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Derivator Configuration</em>'. <!--
    * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
    * end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Derivator Configuration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEcoreDerivatorConfiguration(EcoreDerivatorConfiguration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Reconciler Configuration</em>'. <!--
    * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
    * end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Reconciler Configuration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEcoreReconcilerConfiguration(EcoreReconcilerConfiguration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Derivator Configuration</em>'. <!--
    * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
    * end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Derivator Configuration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDerivatorConfiguration(DerivatorConfiguration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Reconciler Configuration</em>'. <!--
    * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
    * end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Reconciler Configuration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseReconcilerConfiguration(ReconcilerConfiguration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
    * anyway. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase(EObject object)
   {
      return null;
   }

} // EcoreSwitch
