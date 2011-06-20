/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Ext Gen Model</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory <em>Generator Directory</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass <em>Generator Plugin Class
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginID <em>Generator Plugin ID</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginVariables <em>Generator Plugin
 * Variables</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory <em>Generator UI Directory
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass <em>Generator UI Plugin
 * Class</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginID <em>Generator UI Plugin ID
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginVariables <em>Generator UI Plugin
 * Variables</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorProjectTypes <em>Generator Project Types
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2()
 * @model
 * @generated
 */
public interface GenModel2 extends GenModel, GenBase2
{

   String DEFAULT_GENERATOR_SUFFIX = "generator";

   String DEFAULT_GENERATOR_UI_SUFFIX = DEFAULT_GENERATOR_SUFFIX + ".ui";

   /**
    * Returns the value of the '<em><b>Generator Directory</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Directory</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Directory</em>' attribute.
    * @see #isSetGeneratorDirectory()
    * @see #unsetGeneratorDirectory()
    * @see #setGeneratorDirectory(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorDirectory()
    * @model unsettable="true"
    * @generated
    */
   String getGeneratorDirectory();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory
    * <em>Generator Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator Directory</em>' attribute.
    * @see #isSetGeneratorDirectory()
    * @see #unsetGeneratorDirectory()
    * @see #getGeneratorDirectory()
    * @generated
    */
   void setGeneratorDirectory(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory
    * <em>Generator Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetGeneratorDirectory()
    * @see #getGeneratorDirectory()
    * @see #setGeneratorDirectory(String)
    * @generated
    */
   void unsetGeneratorDirectory();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory <em>Generator Directory</em>}'
    * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Generator Directory</em>' attribute is set.
    * @see #unsetGeneratorDirectory()
    * @see #getGeneratorDirectory()
    * @see #setGeneratorDirectory(String)
    * @generated
    */
   boolean isSetGeneratorDirectory();

   /**
    * Returns the value of the '<em><b>Generator Plugin Class</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Plugin Class</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Plugin Class</em>' attribute.
    * @see #isSetGeneratorPluginClass()
    * @see #unsetGeneratorPluginClass()
    * @see #setGeneratorPluginClass(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorPluginClass()
    * @model unsettable="true"
    * @generated
    */
   String getGeneratorPluginClass();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass
    * <em>Generator Plugin Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator Plugin Class</em>' attribute.
    * @see #isSetGeneratorPluginClass()
    * @see #unsetGeneratorPluginClass()
    * @see #getGeneratorPluginClass()
    * @generated
    */
   void setGeneratorPluginClass(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass
    * <em>Generator Plugin Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetGeneratorPluginClass()
    * @see #getGeneratorPluginClass()
    * @see #setGeneratorPluginClass(String)
    * @generated
    */
   void unsetGeneratorPluginClass();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass
    * <em>Generator Plugin Class</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Generator Plugin Class</em>' attribute is set.
    * @see #unsetGeneratorPluginClass()
    * @see #getGeneratorPluginClass()
    * @see #setGeneratorPluginClass(String)
    * @generated
    */
   boolean isSetGeneratorPluginClass();

   /**
    * Returns the value of the '<em><b>Generator Plugin ID</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Plugin ID</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Plugin ID</em>' attribute.
    * @see #setGeneratorPluginID(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorPluginID()
    * @model
    * @generated
    */
   String getGeneratorPluginID();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginID
    * <em>Generator Plugin ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator Plugin ID</em>' attribute.
    * @see #getGeneratorPluginID()
    * @generated
    */
   void setGeneratorPluginID(String value);

   /**
    * Returns the value of the '<em><b>Generator Plugin Variables</b></em>' attribute list. The list contents are of
    * type {@link java.lang.String}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Plugin Variables</em>' attribute list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Plugin Variables</em>' attribute list.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorPluginVariables()
    * @model
    * @generated
    */
   EList<String> getGeneratorPluginVariables();

   /**
    * Returns the value of the '<em><b>Generator UI Directory</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator UI Directory</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator UI Directory</em>' attribute.
    * @see #isSetGeneratorUIDirectory()
    * @see #unsetGeneratorUIDirectory()
    * @see #setGeneratorUIDirectory(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorUIDirectory()
    * @model unsettable="true"
    * @generated
    */
   String getGeneratorUIDirectory();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory
    * <em>Generator UI Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator UI Directory</em>' attribute.
    * @see #isSetGeneratorUIDirectory()
    * @see #unsetGeneratorUIDirectory()
    * @see #getGeneratorUIDirectory()
    * @generated
    */
   void setGeneratorUIDirectory(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory
    * <em>Generator UI Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetGeneratorUIDirectory()
    * @see #getGeneratorUIDirectory()
    * @see #setGeneratorUIDirectory(String)
    * @generated
    */
   void unsetGeneratorUIDirectory();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory
    * <em>Generator UI Directory</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Generator UI Directory</em>' attribute is set.
    * @see #unsetGeneratorUIDirectory()
    * @see #getGeneratorUIDirectory()
    * @see #setGeneratorUIDirectory(String)
    * @generated
    */
   boolean isSetGeneratorUIDirectory();

   /**
    * Returns the value of the '<em><b>Generator UI Plugin Class</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator UI Plugin Class</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator UI Plugin Class</em>' attribute.
    * @see #isSetGeneratorUIPluginClass()
    * @see #unsetGeneratorUIPluginClass()
    * @see #setGeneratorUIPluginClass(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorUIPluginClass()
    * @model unsettable="true"
    * @generated
    */
   String getGeneratorUIPluginClass();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass
    * <em>Generator UI Plugin Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator UI Plugin Class</em>' attribute.
    * @see #isSetGeneratorUIPluginClass()
    * @see #unsetGeneratorUIPluginClass()
    * @see #getGeneratorUIPluginClass()
    * @generated
    */
   void setGeneratorUIPluginClass(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass
    * <em>Generator UI Plugin Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetGeneratorUIPluginClass()
    * @see #getGeneratorUIPluginClass()
    * @see #setGeneratorUIPluginClass(String)
    * @generated
    */
   void unsetGeneratorUIPluginClass();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass
    * <em>Generator UI Plugin Class</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Generator UI Plugin Class</em>' attribute is set.
    * @see #unsetGeneratorUIPluginClass()
    * @see #getGeneratorUIPluginClass()
    * @see #setGeneratorUIPluginClass(String)
    * @generated
    */
   boolean isSetGeneratorUIPluginClass();

   /**
    * Returns the value of the '<em><b>Generator UI Plugin ID</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator UI Plugin ID</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator UI Plugin ID</em>' attribute.
    * @see #setGeneratorUIPluginID(String)
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorUIPluginID()
    * @model
    * @generated
    */
   String getGeneratorUIPluginID();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginID
    * <em>Generator UI Plugin ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Generator UI Plugin ID</em>' attribute.
    * @see #getGeneratorUIPluginID()
    * @generated
    */
   void setGeneratorUIPluginID(String value);

   /**
    * Returns the value of the '<em><b>Generator UI Plugin Variables</b></em>' attribute list. The list contents are of
    * type {@link java.lang.String}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator UI Plugin Variables</em>' attribute list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator UI Plugin Variables</em>' attribute list.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorUIPluginVariables()
    * @model
    * @generated
    */
   EList<String> getGeneratorUIPluginVariables();

   /**
    * Returns the value of the '<em><b>Generator Project Types</b></em>' attribute list. The list contents are of type
    * {@link java.lang.String}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Generator Project Types</em>' attribute list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Generator Project Types</em>' attribute list.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package#getGenModel2_GeneratorProjectTypes()
    * @model
    * @generated
    */
   EList<String> getGeneratorProjectTypes();

   // custom fiels

   // common custom files
   public GenModel2 getGenModel();

   public GenModel2 createGenModel();

   public GenPackage2 createGenPackage();

   // generator
   String getGeneratorPluginDirectory();

   String getGeneratorPluginClassName();

   String getGeneratorPluginPackageName();

   String getQualifiedGeneratorPluginClassName();

   List<String> getGeneratorRequiredPlugins();

   List<String> getGeneratorResourceDelegateImportedPluginClassNames();

   List<String> getGeneratorQualifiedPackageNames();

   String getGeneratorProjectDirectory();

   List<String> getGeneratorSourceFolders();

   boolean sameGeneratorModelProject();

   boolean sameGeneratorEditProject();

   boolean sameGeneratorEditorProject();

   boolean sameGeneratorTestsProject();

   boolean hasGeneratorSupport();

   // generator UI
   String getGeneratorUIProjectDirectory();

   String getGeneratorUIPluginDirectory();

   String getGeneratorUIPluginClassName();

   String getGeneratorUIPluginPackageName();

   String getQualifiedGeneratorUIPluginClassName();

   List<String> getGeneratorUIRequiredPlugins();

   //
   // List<String> getGeneratorResourceDelegateImportedPluginClassNames();
   //
   List<String> getGeneratorUIQualifiedPackageNames();

   List<String> getGeneratorUISourceFolders();

   boolean sameGeneratorUIModelProject();

   boolean sameGeneratorUIEditProject();

   boolean sameGeneratorUIEditorProject();

   boolean sameGeneratorUITestsProject();

   boolean sameGeneratorUIGeneratorProject();

   String getGenerateCommandCategoryId();

   String getGeneratorHandlerCommandCategoryName();

   String getGeneratorHandlerCommandCategoryDescription();

   String getGeneratorProjectTypeConstantName(String projectType);

} // GenModel2
