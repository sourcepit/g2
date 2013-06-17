/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.impl;

import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Ext Gen Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenClass2Impl#isGenerateGenerator <em>Generate Generator
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GenClass2Impl extends GenClassImpl implements GenClass2
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected GenClass2Impl()
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
      return GenModel2Package.Literals.GEN_CLASS2;
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
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR,
            oldGenerateGenerator, generateGenerator));
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
         case GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR :
            return isGenerateGenerator();
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
         case GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR :
            setGenerateGenerator((Boolean) newValue);
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
         case GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR :
            setGenerateGenerator(GENERATE_GENERATOR_EDEFAULT);
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
         case GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR :
            return generateGenerator != GENERATE_GENERATOR_EDEFAULT;
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
            case GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR :
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
               return GenModel2Package.GEN_CLASS2__GENERATE_GENERATOR;
            default :
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   public boolean canGenerateGenerator()
   {
      return isGenerateGenerator();
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
      result.append(')');
      return result.toString();
   }

   @Override
   public GenModel2 getGenModel()
   {
      return (GenModel2) super.getGenModel();
   }

   @Override
   public GenPackage2 getGenPackage()
   {
      return (GenPackage2) super.getGenPackage();
   }

   public String getGeneratorAdapterField()
   {
      return uncapName(getGeneratorAdapterClassName());
   }

   public String getGeneratorAdapterClassName()
   {
      return getInterfaceName() + "GeneratorAdapter";
   }

} // GenClass2Impl
