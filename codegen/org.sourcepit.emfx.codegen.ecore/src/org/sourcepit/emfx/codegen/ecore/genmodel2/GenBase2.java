/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Ext Gen Base</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2#isGenerateGenerator <em>Generate Generator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenBase2()
 * @model abstract="true"
 * @generated
 */
public interface GenBase2 extends GenBase
{
   /**
    * Returns the value of the '<em><b>Generate Generator</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generate Generator</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generate Generator</em>' attribute.
    * @see #setGenerateGenerator(boolean)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenBase2_GenerateGenerator()
    * @model
    * @generated
    */
   boolean isGenerateGenerator();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2#isGenerateGenerator
    * <em>Generate Generator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generate Generator</em>' attribute.
    * @see #isGenerateGenerator()
    * @generated
    */
   void setGenerateGenerator(boolean value);

   GenModel getGenModel();

   boolean canGenerateGenerator();

} // GenBase2
