/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Derivator Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getDerivatorId <em>Derivator Id
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getOrigin <em>Origin</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getOriginRootType <em>Origin Root
 * Type</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getEClassifierNamePrefix <em>
 * EClassifier Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getEStructuralFeatureNamePrefix
 * <em>EStructural Feature Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isCreateOriginEReferences <em>
 * Create Origin EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getEPackageName <em>EPackage Name
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getEPackageNsPrefix <em>EPackage
 * Ns Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getEPackageNsURI <em>EPackage Ns
 * URI</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isCreateBaseType <em>Create Base
 * Type</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isCreateRootType <em>Create Root
 * Type</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getRootTypeName <em>Root Type
 * Name</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getBaseTypeName <em>Base Type
 * Name</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getOriginEReferenceNamePrefix
 * <em>Origin EReference Name Prefix</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getExcludeEReferences <em>Exclude
 * EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isDeriveEDataTypes <em>Derive
 * EData Types</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isDeriveEAttributes <em>Derive
 * EAttributes</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isDeriveContainmentEReferences
 * <em>Derive Containment EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isDeriveEReferences <em>Derive
 * EReferences</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#isEDataTypesAsEClass <em>EData
 * Types As EClass</em>}</li>
 * <li>{@link org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl#getUsedEPackages <em>Used
 * EPackages</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EcoreDerivatorConfigurationImpl extends EObjectImpl implements EcoreDerivatorConfiguration
{
   /**
    * The default value of the '{@link #getDerivatorId() <em>Derivator Id</em>}' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @see #getDerivatorId()
    * @generated
    * @ordered
    */
   protected static final String DERIVATOR_ID_EDEFAULT = "org.sourcepit.emfx.derivation.ecore.GenericDerivator";

   public static final String DERIVATOR_ID = DERIVATOR_ID_EDEFAULT;
   /**
    * The cached value of the '{@link #getDerivatorId() <em>Derivator Id</em>}' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @see #getDerivatorId()
    * @generated
    * @ordered
    */
   protected String derivatorId = DERIVATOR_ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @see #getOrigin()
    * @generated
    * @ordered
    */
   protected EPackage origin;

   /**
    * The cached value of the '{@link #getOriginRootType() <em>Origin Root Type</em>}' reference. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #getOriginRootType()
    * @generated
    * @ordered
    */
   protected EClass originRootType;

   /**
    * The default value of the '{@link #getEClassifierNamePrefix() <em>EClassifier Name Prefix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEClassifierNamePrefix()
    * @generated
    * @ordered
    */
   protected static final String ECLASSIFIER_NAME_PREFIX_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getEClassifierNamePrefix() <em>EClassifier Name Prefix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEClassifierNamePrefix()
    * @generated
    * @ordered
    */
   protected String eClassifierNamePrefix = ECLASSIFIER_NAME_PREFIX_EDEFAULT;

   /**
    * This is true if the EClassifier Name Prefix attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean eClassifierNamePrefixESet;

   /**
    * The default value of the '{@link #getEStructuralFeatureNamePrefix() <em>EStructural Feature Name Prefix</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEStructuralFeatureNamePrefix()
    * @generated
    * @ordered
    */
   protected static final String ESTRUCTURAL_FEATURE_NAME_PREFIX_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getEStructuralFeatureNamePrefix() <em>EStructural Feature Name Prefix</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEStructuralFeatureNamePrefix()
    * @generated
    * @ordered
    */
   protected String eStructuralFeatureNamePrefix = ESTRUCTURAL_FEATURE_NAME_PREFIX_EDEFAULT;

   /**
    * This is true if the EStructural Feature Name Prefix attribute has been set. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean eStructuralFeatureNamePrefixESet;

   /**
    * The default value of the '{@link #isCreateOriginEReferences() <em>Create Origin EReferences</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isCreateOriginEReferences()
    * @generated
    * @ordered
    */
   protected static final boolean CREATE_ORIGIN_EREFERENCES_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isCreateOriginEReferences() <em>Create Origin EReferences</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isCreateOriginEReferences()
    * @generated
    * @ordered
    */
   protected boolean createOriginEReferences = CREATE_ORIGIN_EREFERENCES_EDEFAULT;

   /**
    * The default value of the '{@link #getEPackageName() <em>EPackage Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEPackageName()
    * @generated
    * @ordered
    */
   protected static final String EPACKAGE_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getEPackageName() <em>EPackage Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEPackageName()
    * @generated
    * @ordered
    */
   protected String ePackageName = EPACKAGE_NAME_EDEFAULT;

   /**
    * This is true if the EPackage Name attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean ePackageNameESet;

   /**
    * The default value of the '{@link #getEPackageNsPrefix() <em>EPackage Ns Prefix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEPackageNsPrefix()
    * @generated
    * @ordered
    */
   protected static final String EPACKAGE_NS_PREFIX_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getEPackageNsPrefix() <em>EPackage Ns Prefix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getEPackageNsPrefix()
    * @generated
    * @ordered
    */
   protected String ePackageNsPrefix = EPACKAGE_NS_PREFIX_EDEFAULT;

   /**
    * This is true if the EPackage Ns Prefix attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean ePackageNsPrefixESet;

   /**
    * The default value of the '{@link #getEPackageNsURI() <em>EPackage Ns URI</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEPackageNsURI()
    * @generated
    * @ordered
    */
   protected static final String EPACKAGE_NS_URI_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getEPackageNsURI() <em>EPackage Ns URI</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEPackageNsURI()
    * @generated
    * @ordered
    */
   protected String ePackageNsURI = EPACKAGE_NS_URI_EDEFAULT;

   /**
    * This is true if the EPackage Ns URI attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean ePackageNsURIESet;

   /**
    * The default value of the '{@link #isCreateBaseType() <em>Create Base Type</em>}' attribute. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #isCreateBaseType()
    * @generated
    * @ordered
    */
   protected static final boolean CREATE_BASE_TYPE_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isCreateBaseType() <em>Create Base Type</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isCreateBaseType()
    * @generated
    * @ordered
    */
   protected boolean createBaseType = CREATE_BASE_TYPE_EDEFAULT;

   /**
    * The default value of the '{@link #isCreateRootType() <em>Create Root Type</em>}' attribute. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #isCreateRootType()
    * @generated
    * @ordered
    */
   protected static final boolean CREATE_ROOT_TYPE_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isCreateRootType() <em>Create Root Type</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isCreateRootType()
    * @generated
    * @ordered
    */
   protected boolean createRootType = CREATE_ROOT_TYPE_EDEFAULT;

   /**
    * The default value of the '{@link #getRootTypeName() <em>Root Type Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getRootTypeName()
    * @generated
    * @ordered
    */
   protected static final String ROOT_TYPE_NAME_EDEFAULT = "Model";

   /**
    * The cached value of the '{@link #getRootTypeName() <em>Root Type Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getRootTypeName()
    * @generated
    * @ordered
    */
   protected String rootTypeName = ROOT_TYPE_NAME_EDEFAULT;

   /**
    * This is true if the Root Type Name attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean rootTypeNameESet;

   /**
    * The default value of the '{@link #getBaseTypeName() <em>Base Type Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getBaseTypeName()
    * @generated
    * @ordered
    */
   protected static final String BASE_TYPE_NAME_EDEFAULT = "Base";

   /**
    * The cached value of the '{@link #getBaseTypeName() <em>Base Type Name</em>}' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getBaseTypeName()
    * @generated
    * @ordered
    */
   protected String baseTypeName = BASE_TYPE_NAME_EDEFAULT;

   /**
    * This is true if the Base Type Name attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean baseTypeNameESet;

   /**
    * The default value of the '{@link #getOriginEReferenceNamePrefix() <em>Origin EReference Name Prefix</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getOriginEReferenceNamePrefix()
    * @generated
    * @ordered
    */
   protected static final String ORIGIN_EREFERENCE_NAME_PREFIX_EDEFAULT = "origin";

   /**
    * The cached value of the '{@link #getOriginEReferenceNamePrefix() <em>Origin EReference Name Prefix</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getOriginEReferenceNamePrefix()
    * @generated
    * @ordered
    */
   protected String originEReferenceNamePrefix = ORIGIN_EREFERENCE_NAME_PREFIX_EDEFAULT;

   /**
    * This is true if the Origin EReference Name Prefix attribute has been set. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean originEReferenceNamePrefixESet;

   /**
    * The cached value of the '{@link #getExcludeEReferences() <em>Exclude EReferences</em>}' reference list. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getExcludeEReferences()
    * @generated
    * @ordered
    */
   protected EList<EReference> excludeEReferences;

   /**
    * The default value of the '{@link #isDeriveEDataTypes() <em>Derive EData Types</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEDataTypes()
    * @generated
    * @ordered
    */
   protected static final boolean DERIVE_EDATA_TYPES_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isDeriveEDataTypes() <em>Derive EData Types</em>}' attribute. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEDataTypes()
    * @generated
    * @ordered
    */
   protected boolean deriveEDataTypes = DERIVE_EDATA_TYPES_EDEFAULT;

   /**
    * The default value of the '{@link #isDeriveEAttributes() <em>Derive EAttributes</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEAttributes()
    * @generated
    * @ordered
    */
   protected static final boolean DERIVE_EATTRIBUTES_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isDeriveEAttributes() <em>Derive EAttributes</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEAttributes()
    * @generated
    * @ordered
    */
   protected boolean deriveEAttributes = DERIVE_EATTRIBUTES_EDEFAULT;

   /**
    * The default value of the '{@link #isDeriveContainmentEReferences() <em>Derive Containment EReferences</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveContainmentEReferences()
    * @generated
    * @ordered
    */
   protected static final boolean DERIVE_CONTAINMENT_EREFERENCES_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isDeriveContainmentEReferences() <em>Derive Containment EReferences</em>}'
    * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveContainmentEReferences()
    * @generated
    * @ordered
    */
   protected boolean deriveContainmentEReferences = DERIVE_CONTAINMENT_EREFERENCES_EDEFAULT;

   /**
    * The default value of the '{@link #isDeriveEReferences() <em>Derive EReferences</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEReferences()
    * @generated
    * @ordered
    */
   protected static final boolean DERIVE_EREFERENCES_EDEFAULT = true;

   /**
    * The cached value of the '{@link #isDeriveEReferences() <em>Derive EReferences</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isDeriveEReferences()
    * @generated
    * @ordered
    */
   protected boolean deriveEReferences = DERIVE_EREFERENCES_EDEFAULT;

   /**
    * The default value of the '{@link #isEDataTypesAsEClass() <em>EData Types As EClass</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isEDataTypesAsEClass()
    * @generated
    * @ordered
    */
   protected static final boolean EDATA_TYPES_AS_ECLASS_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isEDataTypesAsEClass() <em>EData Types As EClass</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isEDataTypesAsEClass()
    * @generated
    * @ordered
    */
   protected boolean eDataTypesAsEClass = EDATA_TYPES_AS_ECLASS_EDEFAULT;

   /**
    * The cached value of the '{@link #getUsedEPackages() <em>Used EPackages</em>}' reference list. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #getUsedEPackages()
    * @generated
    * @ordered
    */
   protected EList<EPackage> usedEPackages;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected EcoreDerivatorConfigurationImpl()
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
      return EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getDerivatorId()
   {
      return derivatorId;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDerivatorId(String newDerivatorId)
   {
      String oldDerivatorId = derivatorId;
      derivatorId = newDerivatorId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID, oldDerivatorId, derivatorId));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EPackage getOrigin()
   {
      if (origin != null && origin.eIsProxy())
      {
         InternalEObject oldOrigin = (InternalEObject) origin;
         origin = (EPackage) eResolveProxy(oldOrigin);
         if (origin != oldOrigin)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN, oldOrigin, origin));
         }
      }
      return origin;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EPackage basicGetOrigin()
   {
      return origin;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOrigin(EPackage newOrigin)
   {
      EPackage oldOrigin = origin;
      origin = newOrigin;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN,
            oldOrigin, origin));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getOriginRootType()
   {
      if (originRootType != null && originRootType.eIsProxy())
      {
         InternalEObject oldOriginRootType = (InternalEObject) originRootType;
         originRootType = (EClass) eResolveProxy(oldOriginRootType);
         if (originRootType != oldOriginRootType)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE, oldOriginRootType, originRootType));
         }
      }
      return originRootType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass basicGetOriginRootType()
   {
      return originRootType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOriginRootType(EClass newOriginRootType)
   {
      EClass oldOriginRootType = originRootType;
      originRootType = newOriginRootType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE, oldOriginRootType, originRootType));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getEClassifierNamePrefix()
   {
      return eClassifierNamePrefix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEClassifierNamePrefix(String newEClassifierNamePrefix)
   {
      String oldEClassifierNamePrefix = eClassifierNamePrefix;
      eClassifierNamePrefix = newEClassifierNamePrefix;
      boolean oldEClassifierNamePrefixESet = eClassifierNamePrefixESet;
      eClassifierNamePrefixESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX, oldEClassifierNamePrefix,
            eClassifierNamePrefix, !oldEClassifierNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetEClassifierNamePrefix()
   {
      String oldEClassifierNamePrefix = eClassifierNamePrefix;
      boolean oldEClassifierNamePrefixESet = eClassifierNamePrefixESet;
      eClassifierNamePrefix = ECLASSIFIER_NAME_PREFIX_EDEFAULT;
      eClassifierNamePrefixESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX, oldEClassifierNamePrefix,
            ECLASSIFIER_NAME_PREFIX_EDEFAULT, oldEClassifierNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetEClassifierNamePrefix()
   {
      return eClassifierNamePrefixESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEStructuralFeatureNamePrefix()
   {
      if (isSetEStructuralFeatureNamePrefix())
      {
         return getEStructuralFeatureNamePrefixGen();
      }
      String prefix = getEClassifierNamePrefix();
      if (prefix == null)
      {
         return prefix;
      }
      return firstToLowerOrUpper(prefix, true);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getEStructuralFeatureNamePrefixGen()
   {
      return eStructuralFeatureNamePrefix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEStructuralFeatureNamePrefix(String newEStructuralFeatureNamePrefix)
   {
      String oldEStructuralFeatureNamePrefix = eStructuralFeatureNamePrefix;
      eStructuralFeatureNamePrefix = newEStructuralFeatureNamePrefix;
      boolean oldEStructuralFeatureNamePrefixESet = eStructuralFeatureNamePrefixESet;
      eStructuralFeatureNamePrefixESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX,
            oldEStructuralFeatureNamePrefix, eStructuralFeatureNamePrefix, !oldEStructuralFeatureNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetEStructuralFeatureNamePrefix()
   {
      String oldEStructuralFeatureNamePrefix = eStructuralFeatureNamePrefix;
      boolean oldEStructuralFeatureNamePrefixESet = eStructuralFeatureNamePrefixESet;
      eStructuralFeatureNamePrefix = ESTRUCTURAL_FEATURE_NAME_PREFIX_EDEFAULT;
      eStructuralFeatureNamePrefixESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX,
            oldEStructuralFeatureNamePrefix, ESTRUCTURAL_FEATURE_NAME_PREFIX_EDEFAULT,
            oldEStructuralFeatureNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetEStructuralFeatureNamePrefix()
   {
      return eStructuralFeatureNamePrefixESet;
   }

   protected String firstToLowerOrUpper(String string, boolean lower)
   {
      StringBuilder sb = new StringBuilder();
      if (string.length() > 0)
      {
         char ch = string.charAt(0);
         if (lower)
         {
            sb.append(Character.toLowerCase(ch));
         }
         else
         {
            sb.append(Character.toUpperCase(ch));
         }
      }
      if (string.length() > 1)
      {
         sb.append(string.substring(1));
      }
      return sb.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isCreateOriginEReferences()
   {
      return createOriginEReferences;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setCreateOriginEReferences(boolean newCreateOriginEReferences)
   {
      boolean oldCreateOriginEReferences = createOriginEReferences;
      createOriginEReferences = newCreateOriginEReferences;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES, oldCreateOriginEReferences,
            createOriginEReferences));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEPackageName()
   {
      if (isSetEPackageName())
      {
         return getEPackageNameGen();
      }

      EPackage originEPackage = getOrigin();
      if (originEPackage == null)
      {
         return getEPackageNameGen();
      }

      String originName = originEPackage.getName();
      if (originName == null)
      {
         return getEPackageNameGen();
      }

      return getEClassifierName(originName).toLowerCase();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getEPackageNameGen()
   {
      return ePackageName;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEPackageName(String newEPackageName)
   {
      String oldEPackageName = ePackageName;
      ePackageName = newEPackageName;
      boolean oldEPackageNameESet = ePackageNameESet;
      ePackageNameESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME, oldEPackageName, ePackageName,
            !oldEPackageNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetEPackageName()
   {
      String oldEPackageName = ePackageName;
      boolean oldEPackageNameESet = ePackageNameESet;
      ePackageName = EPACKAGE_NAME_EDEFAULT;
      ePackageNameESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME, oldEPackageName, EPACKAGE_NAME_EDEFAULT,
            oldEPackageNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetEPackageName()
   {
      return ePackageNameESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEPackageNsPrefix()
   {
      if (isSetEPackageNsPrefix())
      {
         return getEPackageNsPrefixGen();
      }

      EPackage originEPackage = getOrigin();
      if (originEPackage == null)
      {
         return getEPackageNsPrefixGen();
      }

      String originNsPrefix = originEPackage.getNsPrefix();
      if (originNsPrefix == null)
      {
         return getEPackageNsPrefixGen();
      }

      return getEClassifierName(originNsPrefix).toLowerCase();
   }

   protected boolean isFirstLower(String string)
   {
      return string.length() > 0 && Character.isLowerCase(string.charAt(0));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getEPackageNsPrefixGen()
   {
      return ePackageNsPrefix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEPackageNsPrefix(String newEPackageNsPrefix)
   {
      String oldEPackageNsPrefix = ePackageNsPrefix;
      ePackageNsPrefix = newEPackageNsPrefix;
      boolean oldEPackageNsPrefixESet = ePackageNsPrefixESet;
      ePackageNsPrefixESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX, oldEPackageNsPrefix, ePackageNsPrefix,
            !oldEPackageNsPrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetEPackageNsPrefix()
   {
      String oldEPackageNsPrefix = ePackageNsPrefix;
      boolean oldEPackageNsPrefixESet = ePackageNsPrefixESet;
      ePackageNsPrefix = EPACKAGE_NS_PREFIX_EDEFAULT;
      ePackageNsPrefixESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX, oldEPackageNsPrefix,
            EPACKAGE_NS_PREFIX_EDEFAULT, oldEPackageNsPrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetEPackageNsPrefix()
   {
      return ePackageNsPrefixESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEPackageNsURI()
   {
      if (isSetEPackageNsURI())
      {
         return getEPackageNsURIGen();
      }

      EPackage originEPackage = getOrigin();
      if (originEPackage == null)
      {
         return getEPackageNsURIGen();
      }

      String originURI = originEPackage.getNsURI();
      if (originURI == null)
      {
         return getEPackageNsURIGen();
      }

      String ePackageName = getEPackageName();
      if (ePackageName == null)
      {
         return getEPackageNsURIGen();
      }

      StringBuilder sb = new StringBuilder();
      sb.append(originURI);
      if (!originURI.endsWith("/"))
      {
         sb.append("/");
      }
      sb.append(ePackageName);
      return sb.toString();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getEPackageNsURIGen()
   {
      return ePackageNsURI;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEPackageNsURI(String newEPackageNsURI)
   {
      String oldEPackageNsURI = ePackageNsURI;
      ePackageNsURI = newEPackageNsURI;
      boolean oldEPackageNsURIESet = ePackageNsURIESet;
      ePackageNsURIESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI, oldEPackageNsURI, ePackageNsURI,
            !oldEPackageNsURIESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetEPackageNsURI()
   {
      String oldEPackageNsURI = ePackageNsURI;
      boolean oldEPackageNsURIESet = ePackageNsURIESet;
      ePackageNsURI = EPACKAGE_NS_URI_EDEFAULT;
      ePackageNsURIESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI, oldEPackageNsURI, EPACKAGE_NS_URI_EDEFAULT,
            oldEPackageNsURIESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetEPackageNsURI()
   {
      return ePackageNsURIESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isCreateBaseType()
   {
      return createBaseType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setCreateBaseType(boolean newCreateBaseType)
   {
      boolean oldCreateBaseType = createBaseType;
      createBaseType = newCreateBaseType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE, oldCreateBaseType, createBaseType));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isCreateRootType()
   {
      return createRootType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setCreateRootType(boolean newCreateRootType)
   {
      boolean oldCreateRootType = createRootType;
      createRootType = newCreateRootType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE, oldCreateRootType, createRootType));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getRootTypeName()
   {
      return rootTypeName;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setRootTypeName(String newRootTypeName)
   {
      String oldRootTypeName = rootTypeName;
      rootTypeName = newRootTypeName;
      boolean oldRootTypeNameESet = rootTypeNameESet;
      rootTypeNameESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME, oldRootTypeName, rootTypeName,
            !oldRootTypeNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetRootTypeName()
   {
      String oldRootTypeName = rootTypeName;
      boolean oldRootTypeNameESet = rootTypeNameESet;
      rootTypeName = ROOT_TYPE_NAME_EDEFAULT;
      rootTypeNameESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME, oldRootTypeName, ROOT_TYPE_NAME_EDEFAULT,
            oldRootTypeNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetRootTypeName()
   {
      return rootTypeNameESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getBaseTypeName()
   {
      return baseTypeName;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBaseTypeName(String newBaseTypeName)
   {
      String oldBaseTypeName = baseTypeName;
      baseTypeName = newBaseTypeName;
      boolean oldBaseTypeNameESet = baseTypeNameESet;
      baseTypeNameESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME, oldBaseTypeName, baseTypeName,
            !oldBaseTypeNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetBaseTypeName()
   {
      String oldBaseTypeName = baseTypeName;
      boolean oldBaseTypeNameESet = baseTypeNameESet;
      baseTypeName = BASE_TYPE_NAME_EDEFAULT;
      baseTypeNameESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME, oldBaseTypeName, BASE_TYPE_NAME_EDEFAULT,
            oldBaseTypeNameESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetBaseTypeName()
   {
      return baseTypeNameESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getOriginEReferenceNamePrefix()
   {
      return originEReferenceNamePrefix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOriginEReferenceNamePrefix(String newOriginEReferenceNamePrefix)
   {
      String oldOriginEReferenceNamePrefix = originEReferenceNamePrefix;
      originEReferenceNamePrefix = newOriginEReferenceNamePrefix;
      boolean oldOriginEReferenceNamePrefixESet = originEReferenceNamePrefixESet;
      originEReferenceNamePrefixESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX, oldOriginEReferenceNamePrefix,
            originEReferenceNamePrefix, !oldOriginEReferenceNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetOriginEReferenceNamePrefix()
   {
      String oldOriginEReferenceNamePrefix = originEReferenceNamePrefix;
      boolean oldOriginEReferenceNamePrefixESet = originEReferenceNamePrefixESet;
      originEReferenceNamePrefix = ORIGIN_EREFERENCE_NAME_PREFIX_EDEFAULT;
      originEReferenceNamePrefixESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX, oldOriginEReferenceNamePrefix,
            ORIGIN_EREFERENCE_NAME_PREFIX_EDEFAULT, oldOriginEReferenceNamePrefixESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetOriginEReferenceNamePrefix()
   {
      return originEReferenceNamePrefixESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EReference> getExcludeEReferences()
   {
      if (excludeEReferences == null)
      {
         excludeEReferences = new EObjectResolvingEList<EReference>(EReference.class, this,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES);
      }
      return excludeEReferences;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isDeriveEDataTypes()
   {
      return deriveEDataTypes;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDeriveEDataTypes(boolean newDeriveEDataTypes)
   {
      boolean oldDeriveEDataTypes = deriveEDataTypes;
      deriveEDataTypes = newDeriveEDataTypes;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES, oldDeriveEDataTypes, deriveEDataTypes));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isDeriveEAttributes()
   {
      return deriveEAttributes;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDeriveEAttributes(boolean newDeriveEAttributes)
   {
      boolean oldDeriveEAttributes = deriveEAttributes;
      deriveEAttributes = newDeriveEAttributes;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES, oldDeriveEAttributes, deriveEAttributes));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isDeriveContainmentEReferences()
   {
      return deriveContainmentEReferences;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDeriveContainmentEReferences(boolean newDeriveContainmentEReferences)
   {
      boolean oldDeriveContainmentEReferences = deriveContainmentEReferences;
      deriveContainmentEReferences = newDeriveContainmentEReferences;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES,
            oldDeriveContainmentEReferences, deriveContainmentEReferences));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isDeriveEReferences()
   {
      return deriveEReferences;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDeriveEReferences(boolean newDeriveEReferences)
   {
      boolean oldDeriveEReferences = deriveEReferences;
      deriveEReferences = newDeriveEReferences;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES, oldDeriveEReferences, deriveEReferences));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isEDataTypesAsEClass()
   {
      return eDataTypesAsEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setEDataTypesAsEClass(boolean newEDataTypesAsEClass)
   {
      boolean oldEDataTypesAsEClass = eDataTypesAsEClass;
      eDataTypesAsEClass = newEDataTypesAsEClass;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS, oldEDataTypesAsEClass,
            eDataTypesAsEClass));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EPackage> getUsedEPackages()
   {
      if (usedEPackages == null)
      {
         usedEPackages = new EObjectResolvingEList<EPackage>(EPackage.class, this,
            EcorePackage.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES);
      }
      return usedEPackages;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEClassifierName(String originalName)
   {
      if (originalName == null)
      {
         return null;
      }
      final String prefix = getEClassifierNamePrefix();
      if (prefix == null || prefix.length() == 0)
      {
         return originalName;
      }
      return prefix + firstToLowerOrUpper(originalName, false);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getEStructuralFeatureName(String originalName)
   {
      return getEStructuralFeatureName(getEStructuralFeatureNamePrefix(), originalName);
   }

   protected String getEStructuralFeatureName(final String prefix, String originalName)
   {
      if (originalName == null)
      {
         return null;
      }
      if (prefix == null || prefix.length() == 0)
      {
         return originalName;
      }
      return prefix + firstToLowerOrUpper(originalName, false);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getOriginEReferenceName(String originalName)
   {
      return getEStructuralFeatureName(getOriginEReferenceNamePrefix(), originalName);
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
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID :
            return getDerivatorId();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN :
            if (resolve)
               return getOrigin();
            return basicGetOrigin();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE :
            if (resolve)
               return getOriginRootType();
            return basicGetOriginRootType();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX :
            return getEClassifierNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX :
            return getEStructuralFeatureNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES :
            return isCreateOriginEReferences();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME :
            return getEPackageName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX :
            return getEPackageNsPrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI :
            return getEPackageNsURI();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE :
            return isCreateBaseType();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE :
            return isCreateRootType();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME :
            return getRootTypeName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME :
            return getBaseTypeName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX :
            return getOriginEReferenceNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES :
            return getExcludeEReferences();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES :
            return isDeriveEDataTypes();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES :
            return isDeriveEAttributes();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES :
            return isDeriveContainmentEReferences();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES :
            return isDeriveEReferences();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS :
            return isEDataTypesAsEClass();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES :
            return getUsedEPackages();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID :
            setDerivatorId((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN :
            setOrigin((EPackage) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE :
            setOriginRootType((EClass) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX :
            setEClassifierNamePrefix((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX :
            setEStructuralFeatureNamePrefix((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES :
            setCreateOriginEReferences((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME :
            setEPackageName((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX :
            setEPackageNsPrefix((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI :
            setEPackageNsURI((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE :
            setCreateBaseType((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE :
            setCreateRootType((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME :
            setRootTypeName((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME :
            setBaseTypeName((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX :
            setOriginEReferenceNamePrefix((String) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES :
            getExcludeEReferences().clear();
            getExcludeEReferences().addAll((Collection<? extends EReference>) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES :
            setDeriveEDataTypes((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES :
            setDeriveEAttributes((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES :
            setDeriveContainmentEReferences((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES :
            setDeriveEReferences((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS :
            setEDataTypesAsEClass((Boolean) newValue);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES :
            getUsedEPackages().clear();
            getUsedEPackages().addAll((Collection<? extends EPackage>) newValue);
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
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID :
            setDerivatorId(DERIVATOR_ID_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN :
            setOrigin((EPackage) null);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE :
            setOriginRootType((EClass) null);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX :
            unsetEClassifierNamePrefix();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX :
            unsetEStructuralFeatureNamePrefix();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES :
            setCreateOriginEReferences(CREATE_ORIGIN_EREFERENCES_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME :
            unsetEPackageName();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX :
            unsetEPackageNsPrefix();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI :
            unsetEPackageNsURI();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE :
            setCreateBaseType(CREATE_BASE_TYPE_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE :
            setCreateRootType(CREATE_ROOT_TYPE_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME :
            unsetRootTypeName();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME :
            unsetBaseTypeName();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX :
            unsetOriginEReferenceNamePrefix();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES :
            getExcludeEReferences().clear();
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES :
            setDeriveEDataTypes(DERIVE_EDATA_TYPES_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES :
            setDeriveEAttributes(DERIVE_EATTRIBUTES_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES :
            setDeriveContainmentEReferences(DERIVE_CONTAINMENT_EREFERENCES_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES :
            setDeriveEReferences(DERIVE_EREFERENCES_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS :
            setEDataTypesAsEClass(EDATA_TYPES_AS_ECLASS_EDEFAULT);
            return;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES :
            getUsedEPackages().clear();
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
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID :
            return DERIVATOR_ID_EDEFAULT == null ? derivatorId != null : !DERIVATOR_ID_EDEFAULT.equals(derivatorId);
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN :
            return origin != null;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE :
            return originRootType != null;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX :
            return isSetEClassifierNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX :
            return isSetEStructuralFeatureNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES :
            return createOriginEReferences != CREATE_ORIGIN_EREFERENCES_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME :
            return isSetEPackageName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX :
            return isSetEPackageNsPrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI :
            return isSetEPackageNsURI();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE :
            return createBaseType != CREATE_BASE_TYPE_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE :
            return createRootType != CREATE_ROOT_TYPE_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME :
            return isSetRootTypeName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME :
            return isSetBaseTypeName();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX :
            return isSetOriginEReferenceNamePrefix();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES :
            return excludeEReferences != null && !excludeEReferences.isEmpty();
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES :
            return deriveEDataTypes != DERIVE_EDATA_TYPES_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES :
            return deriveEAttributes != DERIVE_EATTRIBUTES_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES :
            return deriveContainmentEReferences != DERIVE_CONTAINMENT_EREFERENCES_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES :
            return deriveEReferences != DERIVE_EREFERENCES_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS :
            return eDataTypesAsEClass != EDATA_TYPES_AS_ECLASS_EDEFAULT;
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES :
            return usedEPackages != null && !usedEPackages.isEmpty();
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
      result.append(" (derivatorId: ");
      result.append(derivatorId);
      result.append(", eClassifierNamePrefix: ");
      if (eClassifierNamePrefixESet)
         result.append(eClassifierNamePrefix);
      else
         result.append("<unset>");
      result.append(", eStructuralFeatureNamePrefix: ");
      if (eStructuralFeatureNamePrefixESet)
         result.append(eStructuralFeatureNamePrefix);
      else
         result.append("<unset>");
      result.append(", createOriginEReferences: ");
      result.append(createOriginEReferences);
      result.append(", ePackageName: ");
      if (ePackageNameESet)
         result.append(ePackageName);
      else
         result.append("<unset>");
      result.append(", ePackageNsPrefix: ");
      if (ePackageNsPrefixESet)
         result.append(ePackageNsPrefix);
      else
         result.append("<unset>");
      result.append(", ePackageNsURI: ");
      if (ePackageNsURIESet)
         result.append(ePackageNsURI);
      else
         result.append("<unset>");
      result.append(", createBaseType: ");
      result.append(createBaseType);
      result.append(", createRootType: ");
      result.append(createRootType);
      result.append(", rootTypeName: ");
      if (rootTypeNameESet)
         result.append(rootTypeName);
      else
         result.append("<unset>");
      result.append(", baseTypeName: ");
      if (baseTypeNameESet)
         result.append(baseTypeName);
      else
         result.append("<unset>");
      result.append(", originEReferenceNamePrefix: ");
      if (originEReferenceNamePrefixESet)
         result.append(originEReferenceNamePrefix);
      else
         result.append("<unset>");
      result.append(", deriveEDataTypes: ");
      result.append(deriveEDataTypes);
      result.append(", deriveEAttributes: ");
      result.append(deriveEAttributes);
      result.append(", deriveContainmentEReferences: ");
      result.append(deriveContainmentEReferences);
      result.append(", deriveEReferences: ");
      result.append(deriveEReferences);
      result.append(", eDataTypesAsEClass: ");
      result.append(eDataTypesAsEClass);
      result.append(')');
      return result.toString();
   }

} // EcoreDerivatorConfigurationImpl
