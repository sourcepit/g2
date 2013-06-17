/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.derivation.ecore.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcorePackage;
import org.sourcepit.emfx.derivation.ui.DerivationUIPlugin;

/**
 * This is the item provider adapter for a {@link org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcoreDerivatorConfigurationItemProvider extends ItemProviderAdapter
   implements
      IEditingDomainItemProvider,
      IStructuredItemContentProvider,
      ITreeItemContentProvider,
      IItemLabelProvider,
      IItemPropertySource
{
   /**
    * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EcoreDerivatorConfigurationItemProvider(AdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   /**
    * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
   {
      if (itemPropertyDescriptors == null)
      {
         super.getPropertyDescriptors(object);

         addDerivatorIdPropertyDescriptor(object);
         addOriginPropertyDescriptor(object);
         addOriginRootTypePropertyDescriptor(object);
         addEClassifierNamePrefixPropertyDescriptor(object);
         addEStructuralFeatureNamePrefixPropertyDescriptor(object);
         addCreateOriginEReferencesPropertyDescriptor(object);
         addEPackageNamePropertyDescriptor(object);
         addEPackageNsPrefixPropertyDescriptor(object);
         addEPackageNsURIPropertyDescriptor(object);
         addCreateBaseTypePropertyDescriptor(object);
         addCreateRootTypePropertyDescriptor(object);
         addRootTypeNamePropertyDescriptor(object);
         addBaseTypeNamePropertyDescriptor(object);
         addOriginEReferenceNamePrefixPropertyDescriptor(object);
         addExcludeEReferencesPropertyDescriptor(object);
         addDeriveEDataTypesPropertyDescriptor(object);
         addDeriveEAttributesPropertyDescriptor(object);
         addDeriveContainmentEReferencesPropertyDescriptor(object);
         addDeriveEReferencesPropertyDescriptor(object);
         addEDataTypesAsEClassPropertyDescriptor(object);
         addUsedEPackagesPropertyDescriptor(object);
      }
      return itemPropertyDescriptors;
   }

   /**
    * This adds a property descriptor for the Derivator Id feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addDerivatorIdPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_derivatorId_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_derivatorId_feature",
            "_UI_EcoreDerivatorConfiguration_type"), EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID,
         true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Origin feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addOriginPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_origin_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_origin_feature",
            "_UI_EcoreDerivatorConfiguration_type"), EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ORIGIN, true,
         false, true, null, getString("_UI_OriginPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Origin Root Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addOriginRootTypePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_originRootType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_originRootType_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_ROOT_TYPE, true, false, true, null,
         getString("_UI_OriginPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EClassifier Name Prefix feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addEClassifierNamePrefixPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_eClassifierNamePrefix_feature"),
         getString("_UI_PropertyDescriptor_description",
            "_UI_EcoreDerivatorConfiguration_eClassifierNamePrefix_feature", "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EStructural Feature Name Prefix feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addEStructuralFeatureNamePrefixPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_eStructuralFeatureNamePrefix_feature"),
         getString("_UI_PropertyDescriptor_description",
            "_UI_EcoreDerivatorConfiguration_eStructuralFeatureNamePrefix_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Create Origin EReferences feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addCreateOriginEReferencesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_createOriginEReferences_feature"),
         getString("_UI_PropertyDescriptor_description",
            "_UI_EcoreDerivatorConfiguration_createOriginEReferences_feature", "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EPackage Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addEPackageNamePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_ePackageName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_ePackageName_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EPackagePropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EPackage Ns Prefix feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addEPackageNsPrefixPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_ePackageNsPrefix_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_ePackageNsPrefix_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EPackagePropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EPackage Ns URI feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addEPackageNsURIPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_ePackageNsURI_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_ePackageNsURI_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EPackagePropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Create Base Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addCreateBaseTypePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_createBaseType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_createBaseType_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Create Root Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addCreateRootTypePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_createRootType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_createRootType_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Root Type Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addRootTypeNamePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_rootTypeName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_rootTypeName_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Base Type Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addBaseTypeNamePropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_baseTypeName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_baseTypeName_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Origin EReference Name Prefix feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addOriginEReferenceNamePrefixPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_originEReferenceNamePrefix_feature"),
         getString("_UI_PropertyDescriptor_description",
            "_UI_EcoreDerivatorConfiguration_originEReferenceNamePrefix_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Exclude EReferences feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addExcludeEReferencesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_excludeEReferences_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_excludeEReferences_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__EXCLUDE_EREFERENCES, true, false, true, null,
         getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Derive EData Types feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addDeriveEDataTypesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_deriveEDataTypes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_deriveEDataTypes_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Derive EAttributes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addDeriveEAttributesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_deriveEAttributes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_deriveEAttributes_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Derive Containment EReferences feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addDeriveContainmentEReferencesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_deriveContainmentEReferences_feature"),
         getString("_UI_PropertyDescriptor_description",
            "_UI_EcoreDerivatorConfiguration_deriveContainmentEReferences_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Derive EReferences feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addDeriveEReferencesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_deriveEReferences_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_deriveEReferences_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the EData Types As EClass feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addEDataTypesAsEClassPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_eDataTypesAsEClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_eDataTypesAsEClass_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS, true, false, false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_EClassifiersPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Used EPackages feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addUsedEPackagesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EcoreDerivatorConfiguration_usedEPackages_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EcoreDerivatorConfiguration_usedEPackages_feature",
            "_UI_EcoreDerivatorConfiguration_type"),
         EcorePackage.Literals.ECORE_DERIVATOR_CONFIGURATION__USED_EPACKAGES, true, false, true, null,
         getString("_UI_AllPropertyCategory"), null));
   }

   /**
    * This returns EcoreDerivatorConfiguration.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object getImage(Object object)
   {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/EcoreDerivatorConfiguration"));
   }

   /**
    * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String getText(Object object)
   {
      String label = ((EcoreDerivatorConfiguration) object).getEPackageName();
      return label == null || label.length() == 0
         ? getString("_UI_EcoreDerivatorConfiguration_type")
         : getString("_UI_EcoreDerivatorConfiguration_type") + " " + label;
   }

   /**
    * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
    * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   @Override
   public void notifyChanged(Notification notification)
   {
      updateChildren(notification);

      switch (notification.getFeatureID(EcoreDerivatorConfiguration.class))
      {
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVATOR_ID :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ECLASSIFIER_NAME_PREFIX :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ESTRUCTURAL_FEATURE_NAME_PREFIX :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ORIGIN_EREFERENCES :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NAME :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_PREFIX :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EPACKAGE_NS_URI :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_BASE_TYPE :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__CREATE_ROOT_TYPE :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ROOT_TYPE_NAME :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__BASE_TYPE_NAME :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__ORIGIN_EREFERENCE_NAME_PREFIX :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EDATA_TYPES :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EATTRIBUTES :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_CONTAINMENT_EREFERENCES :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__DERIVE_EREFERENCES :
         case EcorePackage.ECORE_DERIVATOR_CONFIGURATION__EDATA_TYPES_AS_ECLASS :
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
      }
      super.notifyChanged(notification);
   }

   /**
    * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
    * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
   {
      super.collectNewChildDescriptors(newChildDescriptors, object);
   }

   /**
    * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public ResourceLocator getResourceLocator()
   {
      return DerivationUIPlugin.INSTANCE;
   }

}
