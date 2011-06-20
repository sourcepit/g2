/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.impl;

import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Ext Gen Package</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl#isGenerateGenerator <em>Generate Generator
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl#getGeneratorPackageSuffix <em>Generator
 * Package Suffix</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl#getGeneratorUIPackageSuffix <em>Generator
 * UI Package Suffix</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GenPackage2Impl extends GenPackageImpl implements GenPackage2
{
   /**
    * The default value of the '{@link #isGenerateGenerator() <em>Generate Generator</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isGenerateGenerator()
    * @generated
    * @ordered
    */
   protected static final boolean GENERATE_GENERATOR_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isGenerateGenerator() <em>Generate Generator</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #isGenerateGenerator()
    * @generated
    * @ordered
    */
   protected boolean generateGenerator = GENERATE_GENERATOR_EDEFAULT;

   /**
    * The default value of the '{@link #getGeneratorPackageSuffix() <em>Generator Package Suffix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPackageSuffix()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_PACKAGE_SUFFIX_EDEFAULT = "generator";

   /**
    * The cached value of the '{@link #getGeneratorPackageSuffix() <em>Generator Package Suffix</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPackageSuffix()
    * @generated
    * @ordered
    */
   protected String generatorPackageSuffix = GENERATOR_PACKAGE_SUFFIX_EDEFAULT;

   /**
    * The default value of the '{@link #getGeneratorUIPackageSuffix() <em>Generator UI Package Suffix</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPackageSuffix()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_UI_PACKAGE_SUFFIX_EDEFAULT = "generator.ui";

   /**
    * The cached value of the '{@link #getGeneratorUIPackageSuffix() <em>Generator UI Package Suffix</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPackageSuffix()
    * @generated
    * @ordered
    */
   protected String generatorUIPackageSuffix = GENERATOR_UI_PACKAGE_SUFFIX_EDEFAULT;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected GenPackage2Impl()
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
      return GenModel2Package.Literals.GEN_PACKAGE2;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isGenerateGenerator()
   {
      return generateGenerator;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGenerateGenerator(boolean newGenerateGenerator)
   {
      boolean oldGenerateGenerator = generateGenerator;
      generateGenerator = newGenerateGenerator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR,
            oldGenerateGenerator, generateGenerator));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getGeneratorPackageSuffix()
   {
      return generatorPackageSuffix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorPackageSuffix(String newGeneratorPackageSuffix)
   {
      String oldGeneratorPackageSuffix = generatorPackageSuffix;
      generatorPackageSuffix = newGeneratorPackageSuffix;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX,
            oldGeneratorPackageSuffix, generatorPackageSuffix));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getGeneratorUIPackageSuffix()
   {
      return generatorUIPackageSuffix;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorUIPackageSuffix(String newGeneratorUIPackageSuffix)
   {
      String oldGeneratorUIPackageSuffix = generatorUIPackageSuffix;
      generatorUIPackageSuffix = newGeneratorUIPackageSuffix;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            GenModel2Package.GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX, oldGeneratorUIPackageSuffix,
            generatorUIPackageSuffix));
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
         case GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR :
            return isGenerateGenerator();
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX :
            return getGeneratorPackageSuffix();
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX :
            return getGeneratorUIPackageSuffix();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR :
            setGenerateGenerator((Boolean) newValue);
            return;
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX :
            setGeneratorPackageSuffix((String) newValue);
            return;
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX :
            setGeneratorUIPackageSuffix((String) newValue);
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
         case GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR :
            setGenerateGenerator(GENERATE_GENERATOR_EDEFAULT);
            return;
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX :
            setGeneratorPackageSuffix(GENERATOR_PACKAGE_SUFFIX_EDEFAULT);
            return;
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX :
            setGeneratorUIPackageSuffix(GENERATOR_UI_PACKAGE_SUFFIX_EDEFAULT);
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
         case GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR :
            return generateGenerator != GENERATE_GENERATOR_EDEFAULT;
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX :
            return GENERATOR_PACKAGE_SUFFIX_EDEFAULT == null
               ? generatorPackageSuffix != null
               : !GENERATOR_PACKAGE_SUFFIX_EDEFAULT.equals(generatorPackageSuffix);
         case GenModel2Package.GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX :
            return GENERATOR_UI_PACKAGE_SUFFIX_EDEFAULT == null
               ? generatorUIPackageSuffix != null
               : !GENERATOR_UI_PACKAGE_SUFFIX_EDEFAULT.equals(generatorUIPackageSuffix);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == GenBase2.class)
      {
         switch (derivedFeatureID)
         {
            case GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR :
               return GenModel2Package.GEN_BASE2__GENERATE_GENERATOR;
            default :
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == GenBase2.class)
      {
         switch (baseFeatureID)
         {
            case GenModel2Package.GEN_BASE2__GENERATE_GENERATOR :
               return GenModel2Package.GEN_PACKAGE2__GENERATE_GENERATOR;
            default :
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (generateGenerator: ");
      result.append(generateGenerator);
      result.append(", generatorPackageSuffix: ");
      result.append(generatorPackageSuffix);
      result.append(", generatorUIPackageSuffix: ");
      result.append(generatorUIPackageSuffix);
      result.append(')');
      return result.toString();
   }

   @Override
   public GenModel2 getGenModel()
   {
      return (GenModel2) super.getGenModel();
   }

   public boolean canGenerateGenerator()
   {
      return GenBase2Impl.canGenerateGenerator(getGenModel(), hasModelContribution());
   }

   public String getGeneratorPackageName()
   {
      return getQualifiedPackageName(getGeneratorPackageSuffix());
   }

   public String getGeneratorUIPackageName()
   {
      return getQualifiedPackageName(getGeneratorUIPackageSuffix());
   }

   public String getGeneratorHandlerPackageName()
   {
      return getGeneratorUIPackageName();
   }

   public String getGeneratorAdapterFactoryClassName()
   {
      return getPrefix() + "GeneratorAdapterFactory";
   }

   public String getQualifiedGeneratorAdapterBaseClassName()
   {
      return getGeneratorPackageName() + "." + getGeneratorAdapterBaseClassName();
   }

   public String getGeneratorAdapterBaseClassName()
   {
      return getPrefix() + "BaseGeneratorAdapter";
   }

   public String getGeneratorHandlerClassName()
   {
      return getPrefix() + "GeneratorHandler";
   }

   public String getQualifiedGeneratorHandlerClassName()
   {
      return getGeneratorHandlerPackageName() + "." + getGeneratorHandlerClassName();
   }

   public String getQualifiedGeneratorAdapterFactoryClassName()
   {
      return getGeneratorPackageName() + "." + getGeneratorAdapterFactoryClassName();
   }

   public String getGenerateIconFullPath()
   {
      return getGenModel().getGeneratorUIProjectDirectory() + getGenerateIconRelativePath();
   }

   public String getGenerateIconRelativePath()
   {
      return "/icons/full/obj16/" + getPrefix() + "Generate.gif";
   }

   public String getGenerateCommandId()
   {
      return getGenModel().getGeneratorUIPluginID() + ".commands." + getPrefix() + "GenerateCommandID";
   }

   public String getGenerateProjectTypesCommandParameterId()
   {
      return getGenModel().getGeneratorUIPluginID() + ".commands." + getPrefix() + "ProjectTypesParameterID";
   }

   public String getGeneratableModelElementsExpressionId()
   {
      return getGeneratorPackageName() + ".expressions.definitions.generatableModelElements";
   }

   public String getQuallifiedGenerateProjectTypeId(String projectType)
   {
      return getGenModel().getGeneratorPluginID() + "." + projectType + "ProjectTypeID";
   }

} // GenPackage2Impl
