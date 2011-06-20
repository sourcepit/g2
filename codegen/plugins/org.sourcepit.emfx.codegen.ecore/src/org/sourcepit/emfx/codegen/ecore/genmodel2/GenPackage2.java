/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Ext Gen Package</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorPackageSuffix <em>Generator Package
 * Suffix</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorUIPackageSuffix <em>Generator UI
 * Package Suffix</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenPackage2()
 * @model
 * @generated
 */
public interface GenPackage2 extends GenPackage, GenBase2
{
   /**
    * Returns the value of the '<em><b>Generator Package Suffix</b></em>' attribute. The default value is
    * <code>"generator"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Package Suffix</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Package Suffix</em>' attribute.
    * @see #setGeneratorPackageSuffix(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenPackage2_GeneratorPackageSuffix()
    * @model default="generator"
    * @generated
    */
   String getGeneratorPackageSuffix();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorPackageSuffix
    * <em>Generator Package Suffix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator Package Suffix</em>' attribute.
    * @see #getGeneratorPackageSuffix()
    * @generated
    */
   void setGeneratorPackageSuffix(String value);

   /**
    * Returns the value of the '<em><b>Generator UI Package Suffix</b></em>' attribute. The default value is
    * <code>"generator.ui"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator UI Package Suffix</em>' attribute isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator UI Package Suffix</em>' attribute.
    * @see #setGeneratorUIPackageSuffix(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenPackage2_GeneratorUIPackageSuffix()
    * @model default="generator.ui"
    * @generated
    */
   String getGeneratorUIPackageSuffix();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorUIPackageSuffix
    * <em>Generator UI Package Suffix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator UI Package Suffix</em>' attribute.
    * @see #getGeneratorUIPackageSuffix()
    * @generated
    */
   void setGeneratorUIPackageSuffix(String value);

   GenModel2 getGenModel();

   String getGeneratorPackageName();

   String getGeneratorUIPackageName();

   String getGeneratorAdapterFactoryClassName();

   String getQualifiedGeneratorAdapterBaseClassName();

   String getGeneratorAdapterBaseClassName();

   String getQualifiedGeneratorAdapterFactoryClassName();

   String getGenerateIconRelativePath();

   String getGenerateIconFullPath();

   String getGeneratorHandlerPackageName();

   String getGeneratorHandlerClassName();

   String getQualifiedGeneratorHandlerClassName();

   String getGenerateCommandId();

   String getGeneratableModelElementsExpressionId();

   String getGenerateProjectTypesCommandParameterId();

   String getQuallifiedGenerateProjectTypeId(String projectType);
} // GenPackage2
