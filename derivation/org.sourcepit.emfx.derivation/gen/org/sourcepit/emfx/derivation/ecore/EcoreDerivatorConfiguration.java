/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Derivator Configuration</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getDerivatorId <em>Derivator Id</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOrigin <em>Origin</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginRootType <em>Origin Root Type
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix <em>EClassifier
 * Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix <em>
 * EStructural Feature Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateOriginEReferences <em>Create
 * Origin EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName <em>EPackage Name</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix <em>EPackage Ns Prefix
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI <em>EPackage Ns URI</em>}
 * </li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateBaseType <em>Create Base Type
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateRootType <em>Create Root Type
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName <em>Root Type Name</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName <em>Base Type Name</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix <em>Origin
 * EReference Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getExcludeEReferences <em>Exclude
 * EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEDataTypes <em>Derive EData Types
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEAttributes <em>Derive EAttributes
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveContainmentEReferences <em>Derive
 * Containment EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEReferences <em>Derive EReferences
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isEDataTypesAsEClass <em>EData Types As
 * EClass</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getUsedEPackages <em>Used EPackages</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration()
 * @model
 * @generated
 */
public interface EcoreDerivatorConfiguration extends DerivatorConfiguration
{
   /**
    * Returns the value of the '<em><b>Derivator Id</b></em>' attribute. The default value is
    * <code>"org.sourcepit.emfx.derivation.ecore.GenericDerivator"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Derivator Id</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Derivator Id</em>' attribute.
    * @see #setDerivatorId(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_DerivatorId()
    * @model default="org.sourcepit.emfx.derivation.ecore.GenericDerivator" required="true"
    * @generated
    */
   String getDerivatorId();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getDerivatorId
    * <em>Derivator Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Derivator Id</em>' attribute.
    * @see #getDerivatorId()
    * @generated
    */
   void setDerivatorId(String value);

   /**
    * Returns the value of the '<em><b>Origin</b></em>' reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Origin</em>' reference isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Origin</em>' reference.
    * @see #setOrigin(EPackage)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_Origin()
    * @model required="true"
    * @generated
    */
   EPackage getOrigin();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOrigin
    * <em>Origin</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Origin</em>' reference.
    * @see #getOrigin()
    * @generated
    */
   void setOrigin(EPackage value);

   /**
    * Returns the value of the '<em><b>Origin Root Type</b></em>' reference. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Origin Root Type</em>' reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Origin Root Type</em>' reference.
    * @see #setOriginRootType(EClass)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_OriginRootType()
    * @model
    * @generated
    */
   EClass getOriginRootType();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginRootType
    * <em>Origin Root Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Origin Root Type</em>' reference.
    * @see #getOriginRootType()
    * @generated
    */
   void setOriginRootType(EClass value);

   /**
    * Returns the value of the '<em><b>EClassifier Name Prefix</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EClassifier Name Prefix</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EClassifier Name Prefix</em>' attribute.
    * @see #isSetEClassifierNamePrefix()
    * @see #unsetEClassifierNamePrefix()
    * @see #setEClassifierNamePrefix(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EClassifierNamePrefix()
    * @model unsettable="true"
    * @generated
    */
   String getEClassifierNamePrefix();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix
    * <em>EClassifier Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EClassifier Name Prefix</em>' attribute.
    * @see #isSetEClassifierNamePrefix()
    * @see #unsetEClassifierNamePrefix()
    * @see #getEClassifierNamePrefix()
    * @generated
    */
   void setEClassifierNamePrefix(String value);

   /**
    * Unsets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix
    * <em>EClassifier Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetEClassifierNamePrefix()
    * @see #getEClassifierNamePrefix()
    * @see #setEClassifierNamePrefix(String)
    * @generated
    */
   void unsetEClassifierNamePrefix();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEClassifierNamePrefix
    * <em>EClassifier Name Prefix</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>EClassifier Name Prefix</em>' attribute is set.
    * @see #unsetEClassifierNamePrefix()
    * @see #getEClassifierNamePrefix()
    * @see #setEClassifierNamePrefix(String)
    * @generated
    */
   boolean isSetEClassifierNamePrefix();

   /**
    * Returns the value of the '<em><b>EStructural Feature Name Prefix</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EStructural Feature Name Prefix</em>' attribute isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EStructural Feature Name Prefix</em>' attribute.
    * @see #isSetEStructuralFeatureNamePrefix()
    * @see #unsetEStructuralFeatureNamePrefix()
    * @see #setEStructuralFeatureNamePrefix(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EStructuralFeatureNamePrefix()
    * @model unsettable="true"
    * @generated
    */
   String getEStructuralFeatureNamePrefix();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix
    * <em>EStructural Feature Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EStructural Feature Name Prefix</em>' attribute.
    * @see #isSetEStructuralFeatureNamePrefix()
    * @see #unsetEStructuralFeatureNamePrefix()
    * @see #getEStructuralFeatureNamePrefix()
    * @generated
    */
   void setEStructuralFeatureNamePrefix(String value);

   /**
    * Unsets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix
    * <em>EStructural Feature Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetEStructuralFeatureNamePrefix()
    * @see #getEStructuralFeatureNamePrefix()
    * @see #setEStructuralFeatureNamePrefix(String)
    * @generated
    */
   void unsetEStructuralFeatureNamePrefix();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEStructuralFeatureNamePrefix
    * <em>EStructural Feature Name Prefix</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>EStructural Feature Name Prefix</em>' attribute is set.
    * @see #unsetEStructuralFeatureNamePrefix()
    * @see #getEStructuralFeatureNamePrefix()
    * @see #setEStructuralFeatureNamePrefix(String)
    * @generated
    */
   boolean isSetEStructuralFeatureNamePrefix();

   /**
    * Returns the value of the '<em><b>Create Origin EReferences</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Create Origin EReferences</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Create Origin EReferences</em>' attribute.
    * @see #setCreateOriginEReferences(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_CreateOriginEReferences()
    * @model
    * @generated
    */
   boolean isCreateOriginEReferences();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateOriginEReferences
    * <em>Create Origin EReferences</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Create Origin EReferences</em>' attribute.
    * @see #isCreateOriginEReferences()
    * @generated
    */
   void setCreateOriginEReferences(boolean value);

   /**
    * Returns the value of the '<em><b>EPackage Name</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EPackage Name</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EPackage Name</em>' attribute.
    * @see #isSetEPackageName()
    * @see #unsetEPackageName()
    * @see #setEPackageName(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EPackageName()
    * @model unsettable="true"
    * @generated
    */
   String getEPackageName();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName
    * <em>EPackage Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EPackage Name</em>' attribute.
    * @see #isSetEPackageName()
    * @see #unsetEPackageName()
    * @see #getEPackageName()
    * @generated
    */
   void setEPackageName(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName
    * <em>EPackage Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetEPackageName()
    * @see #getEPackageName()
    * @see #setEPackageName(String)
    * @generated
    */
   void unsetEPackageName();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageName <em>EPackage Name</em>}'
    * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>EPackage Name</em>' attribute is set.
    * @see #unsetEPackageName()
    * @see #getEPackageName()
    * @see #setEPackageName(String)
    * @generated
    */
   boolean isSetEPackageName();

   /**
    * Returns the value of the '<em><b>EPackage Ns Prefix</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EPackage Ns Prefix</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EPackage Ns Prefix</em>' attribute.
    * @see #isSetEPackageNsPrefix()
    * @see #unsetEPackageNsPrefix()
    * @see #setEPackageNsPrefix(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EPackageNsPrefix()
    * @model unsettable="true"
    * @generated
    */
   String getEPackageNsPrefix();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix
    * <em>EPackage Ns Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EPackage Ns Prefix</em>' attribute.
    * @see #isSetEPackageNsPrefix()
    * @see #unsetEPackageNsPrefix()
    * @see #getEPackageNsPrefix()
    * @generated
    */
   void setEPackageNsPrefix(String value);

   /**
    * Unsets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix
    * <em>EPackage Ns Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetEPackageNsPrefix()
    * @see #getEPackageNsPrefix()
    * @see #setEPackageNsPrefix(String)
    * @generated
    */
   void unsetEPackageNsPrefix();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsPrefix
    * <em>EPackage Ns Prefix</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>EPackage Ns Prefix</em>' attribute is set.
    * @see #unsetEPackageNsPrefix()
    * @see #getEPackageNsPrefix()
    * @see #setEPackageNsPrefix(String)
    * @generated
    */
   boolean isSetEPackageNsPrefix();

   /**
    * Returns the value of the '<em><b>EPackage Ns URI</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EPackage Ns URI</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EPackage Ns URI</em>' attribute.
    * @see #isSetEPackageNsURI()
    * @see #unsetEPackageNsURI()
    * @see #setEPackageNsURI(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EPackageNsURI()
    * @model unsettable="true"
    * @generated
    */
   String getEPackageNsURI();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI
    * <em>EPackage Ns URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EPackage Ns URI</em>' attribute.
    * @see #isSetEPackageNsURI()
    * @see #unsetEPackageNsURI()
    * @see #getEPackageNsURI()
    * @generated
    */
   void setEPackageNsURI(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI
    * <em>EPackage Ns URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetEPackageNsURI()
    * @see #getEPackageNsURI()
    * @see #setEPackageNsURI(String)
    * @generated
    */
   void unsetEPackageNsURI();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getEPackageNsURI <em>EPackage Ns URI</em>}'
    * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>EPackage Ns URI</em>' attribute is set.
    * @see #unsetEPackageNsURI()
    * @see #getEPackageNsURI()
    * @see #setEPackageNsURI(String)
    * @generated
    */
   boolean isSetEPackageNsURI();

   /**
    * Returns the value of the '<em><b>Create Base Type</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Create Base Type</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Create Base Type</em>' attribute.
    * @see #setCreateBaseType(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_CreateBaseType()
    * @model
    * @generated
    */
   boolean isCreateBaseType();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateBaseType
    * <em>Create Base Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Create Base Type</em>' attribute.
    * @see #isCreateBaseType()
    * @generated
    */
   void setCreateBaseType(boolean value);

   /**
    * Returns the value of the '<em><b>Create Root Type</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Create Root Type</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Create Root Type</em>' attribute.
    * @see #setCreateRootType(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_CreateRootType()
    * @model
    * @generated
    */
   boolean isCreateRootType();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isCreateRootType
    * <em>Create Root Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Create Root Type</em>' attribute.
    * @see #isCreateRootType()
    * @generated
    */
   void setCreateRootType(boolean value);

   /**
    * Returns the value of the '<em><b>Root Type Name</b></em>' attribute. The default value is <code>"Model"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Root Type Name</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Root Type Name</em>' attribute.
    * @see #isSetRootTypeName()
    * @see #unsetRootTypeName()
    * @see #setRootTypeName(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_RootTypeName()
    * @model default="Model" unsettable="true"
    * @generated
    */
   String getRootTypeName();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName
    * <em>Root Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Root Type Name</em>' attribute.
    * @see #isSetRootTypeName()
    * @see #unsetRootTypeName()
    * @see #getRootTypeName()
    * @generated
    */
   void setRootTypeName(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName
    * <em>Root Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetRootTypeName()
    * @see #getRootTypeName()
    * @see #setRootTypeName(String)
    * @generated
    */
   void unsetRootTypeName();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getRootTypeName <em>Root Type Name</em>}'
    * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Root Type Name</em>' attribute is set.
    * @see #unsetRootTypeName()
    * @see #getRootTypeName()
    * @see #setRootTypeName(String)
    * @generated
    */
   boolean isSetRootTypeName();

   /**
    * Returns the value of the '<em><b>Base Type Name</b></em>' attribute. The default value is <code>"Base"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Base Type Name</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Base Type Name</em>' attribute.
    * @see #isSetBaseTypeName()
    * @see #unsetBaseTypeName()
    * @see #setBaseTypeName(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_BaseTypeName()
    * @model default="Base" unsettable="true"
    * @generated
    */
   String getBaseTypeName();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName
    * <em>Base Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Base Type Name</em>' attribute.
    * @see #isSetBaseTypeName()
    * @see #unsetBaseTypeName()
    * @see #getBaseTypeName()
    * @generated
    */
   void setBaseTypeName(String value);

   /**
    * Unsets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName
    * <em>Base Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetBaseTypeName()
    * @see #getBaseTypeName()
    * @see #setBaseTypeName(String)
    * @generated
    */
   void unsetBaseTypeName();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getBaseTypeName <em>Base Type Name</em>}'
    * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Base Type Name</em>' attribute is set.
    * @see #unsetBaseTypeName()
    * @see #getBaseTypeName()
    * @see #setBaseTypeName(String)
    * @generated
    */
   boolean isSetBaseTypeName();

   /**
    * Returns the value of the '<em><b>Origin EReference Name Prefix</b></em>' attribute. The default value is
    * <code>"origin"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Origin EReference Name Prefix</em>' attribute isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Origin EReference Name Prefix</em>' attribute.
    * @see #isSetOriginEReferenceNamePrefix()
    * @see #unsetOriginEReferenceNamePrefix()
    * @see #setOriginEReferenceNamePrefix(String)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_OriginEReferenceNamePrefix()
    * @model default="origin" unsettable="true"
    * @generated
    */
   String getOriginEReferenceNamePrefix();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix
    * <em>Origin EReference Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Origin EReference Name Prefix</em>' attribute.
    * @see #isSetOriginEReferenceNamePrefix()
    * @see #unsetOriginEReferenceNamePrefix()
    * @see #getOriginEReferenceNamePrefix()
    * @generated
    */
   void setOriginEReferenceNamePrefix(String value);

   /**
    * Unsets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix
    * <em>Origin EReference Name Prefix</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isSetOriginEReferenceNamePrefix()
    * @see #getOriginEReferenceNamePrefix()
    * @see #setOriginEReferenceNamePrefix(String)
    * @generated
    */
   void unsetOriginEReferenceNamePrefix();

   /**
    * Returns whether the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#getOriginEReferenceNamePrefix
    * <em>Origin EReference Name Prefix</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return whether the value of the '<em>Origin EReference Name Prefix</em>' attribute is set.
    * @see #unsetOriginEReferenceNamePrefix()
    * @see #getOriginEReferenceNamePrefix()
    * @see #setOriginEReferenceNamePrefix(String)
    * @generated
    */
   boolean isSetOriginEReferenceNamePrefix();

   /**
    * Returns the value of the '<em><b>Exclude EReferences</b></em>' reference list. The list contents are of type
    * {@link org.eclipse.emf.ecore.EReference}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exclude EReferences</em>' reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Exclude EReferences</em>' reference list.
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_ExcludeEReferences()
    * @model
    * @generated
    */
   EList<EReference> getExcludeEReferences();

   /**
    * Returns the value of the '<em><b>Derive EData Types</b></em>' attribute. The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Derive EData Types</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Derive EData Types</em>' attribute.
    * @see #setDeriveEDataTypes(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_DeriveEDataTypes()
    * @model default="true"
    * @generated
    */
   boolean isDeriveEDataTypes();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEDataTypes
    * <em>Derive EData Types</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Derive EData Types</em>' attribute.
    * @see #isDeriveEDataTypes()
    * @generated
    */
   void setDeriveEDataTypes(boolean value);

   /**
    * Returns the value of the '<em><b>Derive EAttributes</b></em>' attribute. The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Derive EAttributes</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Derive EAttributes</em>' attribute.
    * @see #setDeriveEAttributes(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_DeriveEAttributes()
    * @model default="true"
    * @generated
    */
   boolean isDeriveEAttributes();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEAttributes
    * <em>Derive EAttributes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Derive EAttributes</em>' attribute.
    * @see #isDeriveEAttributes()
    * @generated
    */
   void setDeriveEAttributes(boolean value);

   /**
    * Returns the value of the '<em><b>Derive Containment EReferences</b></em>' attribute. The default value is
    * <code>"true"</code>. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Derive Containment EReferences</em>' attribute isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Derive Containment EReferences</em>' attribute.
    * @see #setDeriveContainmentEReferences(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_DeriveContainmentEReferences()
    * @model default="true"
    * @generated
    */
   boolean isDeriveContainmentEReferences();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveContainmentEReferences
    * <em>Derive Containment EReferences</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Derive Containment EReferences</em>' attribute.
    * @see #isDeriveContainmentEReferences()
    * @generated
    */
   void setDeriveContainmentEReferences(boolean value);

   /**
    * Returns the value of the '<em><b>Derive EReferences</b></em>' attribute. The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Derive EReferences</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Derive EReferences</em>' attribute.
    * @see #setDeriveEReferences(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_DeriveEReferences()
    * @model default="true"
    * @generated
    */
   boolean isDeriveEReferences();

   /**
    * Sets the value of the '{@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isDeriveEReferences
    * <em>Derive EReferences</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Derive EReferences</em>' attribute.
    * @see #isDeriveEReferences()
    * @generated
    */
   void setDeriveEReferences(boolean value);

   /**
    * Returns the value of the '<em><b>EData Types As EClass</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EData Types As EClass</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>EData Types As EClass</em>' attribute.
    * @see #setEDataTypesAsEClass(boolean)
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_EDataTypesAsEClass()
    * @model
    * @generated
    */
   boolean isEDataTypesAsEClass();

   /**
    * Sets the value of the '
    * {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration#isEDataTypesAsEClass
    * <em>EData Types As EClass</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>EData Types As EClass</em>' attribute.
    * @see #isEDataTypesAsEClass()
    * @generated
    */
   void setEDataTypesAsEClass(boolean value);

   /**
    * Returns the value of the '<em><b>Used EPackages</b></em>' reference list. The list contents are of type
    * {@link org.eclipse.emf.ecore.EPackage}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Used EPackages</em>' reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Used EPackages</em>' reference list.
    * @see org.sourcepit.emfx.derivation.ecore.EcorePackage#getEcoreDerivatorConfiguration_UsedEPackages()
    * @model
    * @generated
    */
   EList<EPackage> getUsedEPackages();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getEClassifierName(String originalName);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getEStructuralFeatureName(String originalName);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getOriginEReferenceName(String originalName);

} // EcoreDerivatorConfiguration
