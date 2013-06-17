/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Derivator Configuration</b></em>'. <!--
 * end-user-doc -->
 * 
 * 
 * @see org.sourcepit.emfx.derivation.DerivationPackage#getDerivatorConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DerivatorConfiguration extends EObject
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model kind="operation" required="true"
    * @generated
    */
   String getDerivatorId();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model kind="operation" required="true"
    * @generated
    */
   Object getOrigin();

} // DerivatorConfiguration
