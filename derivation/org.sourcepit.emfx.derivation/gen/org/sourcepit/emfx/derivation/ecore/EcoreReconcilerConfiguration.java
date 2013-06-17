/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore;

import org.sourcepit.emfx.derivation.ReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Reconciler Configuration</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration#getReconcilerId <em>Reconciler Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreReconcilerConfiguration()
 * @model
 * @generated
 */
public interface EcoreReconcilerConfiguration extends ReconcilerConfiguration
{
   /**
    * Returns the value of the '<em><b>Reconciler Id</b></em>' attribute. The default value is
    * <code>"org.sourcepit.emfx.derivation.ecore.GenericReconciler"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Reconciler Id</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Reconciler Id</em>' attribute.
    * @see #setReconcilerId(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreReconcilerConfiguration_ReconcilerId()
    * @model default="org.sourcepit.emfx.derivation.ecore.GenericReconciler" required="true"
    * @generated
    */
   String getReconcilerId();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration#getReconcilerId
    * <em>Reconciler Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Reconciler Id</em>' attribute.
    * @see #getReconcilerId()
    * @generated
    */
   void setReconcilerId(String value);

} // EcoreReconcilerConfiguration
