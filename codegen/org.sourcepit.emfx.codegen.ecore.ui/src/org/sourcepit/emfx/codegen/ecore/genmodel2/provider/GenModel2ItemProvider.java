/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;

/**
 * This is the item provider adapter for a {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GenModel2ItemProvider extends GenModelItemProvider
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
   public GenModel2ItemProvider(AdapterFactory adapterFactory)
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

         addGenerateGeneratorPropertyDescriptor(object);
         addGeneratorDirectoryPropertyDescriptor(object);
         addGeneratorPluginClassPropertyDescriptor(object);
         addGeneratorPluginIDPropertyDescriptor(object);
         addGeneratorPluginVariablesPropertyDescriptor(object);
         addGeneratorUIDirectoryPropertyDescriptor(object);
         addGeneratorUIPluginClassPropertyDescriptor(object);
         addGeneratorUIPluginIDPropertyDescriptor(object);
         addGeneratorUIPluginVariablesPropertyDescriptor(object);
         addGeneratorProjectTypesPropertyDescriptor(object);
      }
      return itemPropertyDescriptors;
   }

   /**
    * This adds a property descriptor for the Generate Generator feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addGenerateGeneratorPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors
         .add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_GenBase2_generateGenerator_feature"),
            getString("_UI_PropertyDescriptor_description", "_UI_GenBase2_generateGenerator_feature",
               "_UI_GenBase2_type"), GenModel2Package.Literals.GEN_BASE2__GENERATE_GENERATOR, true, false, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator Directory feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addGeneratorDirectoryPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorDirectory_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorDirectory_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_DIRECTORY, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator Plugin Class feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addGeneratorPluginClassPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorPluginClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorPluginClass_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_PLUGIN_CLASS, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator Plugin ID feature. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected void addGeneratorPluginIDPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorPluginID_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorPluginID_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_PLUGIN_ID, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator Plugin Variables feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addGeneratorPluginVariablesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorPluginVariables_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorPluginVariables_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES, true, false,
         false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator UI Directory feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addGeneratorUIDirectoryPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorUIDirectory_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorUIDirectory_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_UI_DIRECTORY, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorUIPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator UI Plugin Class feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addGeneratorUIPluginClassPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorUIPluginClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorUIPluginClass_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorUIPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator UI Plugin ID feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addGeneratorUIPluginIDPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorUIPluginID_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorUIPluginID_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorUIPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator UI Plugin Variables feature. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    */
   protected void addGeneratorUIPluginVariablesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorUIPluginVariables_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorUIPluginVariables_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES, true, false,
         false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorUIPropertyCategory"), null));
   }

   /**
    * This adds a property descriptor for the Generator Project Types feature. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    */
   protected void addGeneratorProjectTypesPropertyDescriptor(Object object)
   {
      itemPropertyDescriptors.add(createItemPropertyDescriptor(
         ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel2_generatorProjectTypes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GenModel2_generatorProjectTypes_feature",
            "_UI_GenModel2_type"), GenModel2Package.Literals.GEN_MODEL2__GENERATOR_PROJECT_TYPES, true, false, false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_GeneratorPropertyCategory"), null));
   }

   /**
    * This returns GenModel2.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   @Override
   public Object getImage(Object object)
   {
      return super.getImage(object);
   }

   /**
    * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   @Override
   public String getText(Object object)
   {
      return super.getText(object);
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

      switch (notification.getFeatureID(GenModel2.class))
      {
         case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
         case GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY :
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS :
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID :
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES :
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY :
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS :
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID :
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES :
         case GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES :
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

      newChildDescriptors.add(createChildParameter(GenModelPackage.Literals.GEN_MODEL__GEN_PACKAGES,
         GenModel2Factory.eINSTANCE.createGenPackage2()));

      newChildDescriptors.add(createChildParameter(GenModelPackage.Literals.GEN_MODEL__USED_GEN_PACKAGES,
         GenModel2Factory.eINSTANCE.createGenPackage2()));
   }

   /**
    * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
   {
      Object childFeature = feature;
      Object childObject = child;

      boolean qualify = childFeature == GenModelPackage.Literals.GEN_MODEL__GEN_PACKAGES
         || childFeature == GenModelPackage.Literals.GEN_MODEL__USED_GEN_PACKAGES;

      if (qualify)
      {
         return getString("_UI_CreateChild_text2", new Object[] {getTypeText(childObject),
            getFeatureText(childFeature), getTypeText(owner)});
      }
      return super.getCreateChildText(owner, feature, child, selection);
   }

   /**
    * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public ResourceLocator getResourceLocator()
   {
      return ((IChildCreationExtender) adapterFactory).getResourceLocator();
   }

}
