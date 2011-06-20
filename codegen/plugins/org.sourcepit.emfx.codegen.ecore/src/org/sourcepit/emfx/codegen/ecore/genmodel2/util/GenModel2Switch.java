/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.util;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package
 * @generated
 */
public class GenModel2Switch<T>
{
   /**
    * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static GenModel2Package modelPackage;

   /**
    * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public GenModel2Switch()
   {
      if (modelPackage == null)
      {
         modelPackage = GenModel2Package.eINSTANCE;
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
         case GenModel2Package.GEN_MODEL2 :
         {
            GenModel2 genModel2 = (GenModel2) theEObject;
            T result = caseGenModel2(genModel2);
            if (result == null)
               result = caseGenModel(genModel2);
            if (result == null)
               result = caseGenBase2(genModel2);
            if (result == null)
               result = caseGenBase(genModel2);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case GenModel2Package.GEN_BASE2 :
         {
            GenBase2 genBase2 = (GenBase2) theEObject;
            T result = caseGenBase2(genBase2);
            if (result == null)
               result = caseGenBase(genBase2);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case GenModel2Package.GEN_CLASS2 :
         {
            GenClass2 genClass2 = (GenClass2) theEObject;
            T result = caseGenClass2(genClass2);
            if (result == null)
               result = caseGenClass(genClass2);
            if (result == null)
               result = caseGenBase2(genClass2);
            if (result == null)
               result = caseGenClassifier(genClass2);
            if (result == null)
               result = caseGenBase(genClass2);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case GenModel2Package.GEN_PACKAGE2 :
         {
            GenPackage2 genPackage2 = (GenPackage2) theEObject;
            T result = caseGenPackage2(genPackage2);
            if (result == null)
               result = caseGenPackage(genPackage2);
            if (result == null)
               result = caseGenBase2(genPackage2);
            if (result == null)
               result = caseGenBase(genPackage2);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Model2</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Model2</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenModel2(GenModel2 object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Base2</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Base2</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenBase2(GenBase2 object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Class2</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Class2</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenClass2(GenClass2 object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Package2</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Package2</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenPackage2(GenPackage2 object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Base</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Base</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenBase(GenBase object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Model</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenModel(GenModel object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Classifier</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenClassifier(GenClassifier object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Class</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Class</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenClass(GenClass object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gen Package</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gen Package</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGenPackage(GenPackage object)
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

} // GenModel2Switch
