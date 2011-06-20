/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore;

import org.eclipse.emf.ecore.EAnnotation;
import org.sourcepit.emfx.derivation.ReconcilerConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mighty Annotation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.MightyAnnotation#isRulez <em>Rulez</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.MightyAnnotation#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getMightyAnnotation()
 * @model
 * @generated
 */
public interface MightyAnnotation extends EAnnotation
{
   /**
    * Returns the value of the '<em><b>Rulez</b></em>' attribute. The default value is <code>"true"</code>. <!--
    * begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Rulez</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Rulez</em>' attribute.
    * @see #setRulez(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getMightyAnnotation_Rulez()
    * @model default="true"
    * @generated
    */
   boolean isRulez();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.MightyAnnotation#isRulez <em>Rulez</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Rulez</em>' attribute.
    * @see #isRulez()
    * @generated
    */
   void setRulez(boolean value);

   /**
    * Returns the value of the '<em><b>Config</b></em>' containment reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Config</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Config</em>' containment reference.
    * @see #setConfig(ReconcilerConfiguration)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getMightyAnnotation_Config()
    * @model containment="true"
    * @generated
    */
   ReconcilerConfiguration getConfig();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.MightyAnnotation#getConfig <em>Config</em>}'
    * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Config</em>' containment reference.
    * @see #getConfig()
    * @generated
    */
   void setConfig(ReconcilerConfiguration value);

} // MightyAnnotation
