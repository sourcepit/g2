/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimePlatform;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Package;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Ext Gen Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#isGenerateGenerator <em>Generate Generator
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorDirectory <em>Generator
 * Directory</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorPluginClass <em>Generator Plugin
 * Class</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorPluginID <em>Generator Plugin ID
 * </em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorPluginVariables <em>Generator
 * Plugin Variables</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorUIDirectory <em>Generator UI
 * Directory</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorUIPluginClass <em>Generator UI
 * Plugin Class</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorUIPluginID <em>Generator UI
 * Plugin ID</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorUIPluginVariables <em>Generator
 * UI Plugin Variables</em>}</li>
 * <li>{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl#getGeneratorProjectTypes <em>Generator
 * Project Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GenModel2Impl extends GenModelImpl implements GenModel2
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
    * The default value of the '{@link #getGeneratorDirectory() <em>Generator Directory</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorDirectory()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_DIRECTORY_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorDirectory() <em>Generator Directory</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorDirectory()
    * @generated
    * @ordered
    */
   protected String generatorDirectory = GENERATOR_DIRECTORY_EDEFAULT;
   /**
    * This is true if the Generator Directory attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean generatorDirectoryESet;

   /**
    * The default value of the '{@link #getGeneratorPluginClass() <em>Generator Plugin Class</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPluginClass()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_PLUGIN_CLASS_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorPluginClass() <em>Generator Plugin Class</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPluginClass()
    * @generated
    * @ordered
    */
   protected String generatorPluginClass = GENERATOR_PLUGIN_CLASS_EDEFAULT;
   /**
    * This is true if the Generator Plugin Class attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean generatorPluginClassESet;

   /**
    * The default value of the '{@link #getGeneratorPluginID() <em>Generator Plugin ID</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPluginID()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_PLUGIN_ID_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorPluginID() <em>Generator Plugin ID</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPluginID()
    * @generated
    * @ordered
    */
   protected String generatorPluginID = GENERATOR_PLUGIN_ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getGeneratorPluginVariables() <em>Generator Plugin Variables</em>}' attribute
    * list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorPluginVariables()
    * @generated
    * @ordered
    */
   protected EList<String> generatorPluginVariables;

   /**
    * The default value of the '{@link #getGeneratorUIDirectory() <em>Generator UI Directory</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIDirectory()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_UI_DIRECTORY_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorUIDirectory() <em>Generator UI Directory</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIDirectory()
    * @generated
    * @ordered
    */
   protected String generatorUIDirectory = GENERATOR_UI_DIRECTORY_EDEFAULT;
   /**
    * This is true if the Generator UI Directory attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   protected boolean generatorUIDirectoryESet;
   /**
    * The default value of the '{@link #getGeneratorUIPluginClass() <em>Generator UI Plugin Class</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPluginClass()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_UI_PLUGIN_CLASS_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorUIPluginClass() <em>Generator UI Plugin Class</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPluginClass()
    * @generated
    * @ordered
    */
   protected String generatorUIPluginClass = GENERATOR_UI_PLUGIN_CLASS_EDEFAULT;
   /**
    * This is true if the Generator UI Plugin Class attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   protected boolean generatorUIPluginClassESet;
   /**
    * The default value of the '{@link #getGeneratorUIPluginID() <em>Generator UI Plugin ID</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPluginID()
    * @generated
    * @ordered
    */
   protected static final String GENERATOR_UI_PLUGIN_ID_EDEFAULT = null;
   /**
    * The cached value of the '{@link #getGeneratorUIPluginID() <em>Generator UI Plugin ID</em>}' attribute. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPluginID()
    * @generated
    * @ordered
    */
   protected String generatorUIPluginID = GENERATOR_UI_PLUGIN_ID_EDEFAULT;
   /**
    * The cached value of the '{@link #getGeneratorUIPluginVariables() <em>Generator UI Plugin Variables</em>}'
    * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorUIPluginVariables()
    * @generated
    * @ordered
    */
   protected EList<String> generatorUIPluginVariables;

   /**
    * The cached value of the '{@link #getGeneratorProjectTypes() <em>Generator Project Types</em>}' attribute list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getGeneratorProjectTypes()
    * @generated
    * @ordered
    */
   protected EList<String> generatorProjectTypes;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected GenModel2Impl()
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
      return GenModel2Package.Literals.GEN_MODEL2;
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
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR,
            oldGenerateGenerator, generateGenerator));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorDirectory()
   {
      return getPluginDirectory(isSetGeneratorDirectory(), generatorDirectory, "." + DEFAULT_GENERATOR_SUFFIX + "/");
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorDirectory(String newGeneratorDirectory)
   {
      String oldGeneratorDirectory = generatorDirectory;
      generatorDirectory = newGeneratorDirectory;
      boolean oldGeneratorDirectoryESet = generatorDirectoryESet;
      generatorDirectoryESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY,
            oldGeneratorDirectory, generatorDirectory, !oldGeneratorDirectoryESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetGeneratorDirectory()
   {
      String oldGeneratorDirectory = generatorDirectory;
      boolean oldGeneratorDirectoryESet = generatorDirectoryESet;
      generatorDirectory = GENERATOR_DIRECTORY_EDEFAULT;
      generatorDirectoryESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET, GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY,
            oldGeneratorDirectory, GENERATOR_DIRECTORY_EDEFAULT, oldGeneratorDirectoryESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetGeneratorDirectory()
   {
      return generatorDirectoryESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorPluginClass()
   {
      if (!isSetGeneratorPluginClass())
      {
         String modelName = getModelName();
         if (!isBlank(modelName))
         {
            GenPackage2 mainGenPackage = getMainGenPackage();
            String packageName = mainGenPackage != null ? mainGenPackage.getGeneratorPackageName() : addPackageSuffix(
               getModelProject(), DEFAULT_GENERATOR_SUFFIX);
            StringBuilder result = new StringBuilder(packageName);
            return result.append(".").append(CodeGenUtil.validJavaIdentifier(modelName)).append("GeneratorPlugin")
               .toString();
         }
      }
      return generatorPluginClass;
   }

   private String addPackageSuffix(String name, String suffix)
   {
      return !isBlank(suffix) ? name + "." + suffix : name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorPluginClass(String newGeneratorPluginClass)
   {
      String oldGeneratorPluginClass = generatorPluginClass;
      generatorPluginClass = newGeneratorPluginClass;
      boolean oldGeneratorPluginClassESet = generatorPluginClassESet;
      generatorPluginClassESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS,
            oldGeneratorPluginClass, generatorPluginClass, !oldGeneratorPluginClassESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetGeneratorPluginClass()
   {
      String oldGeneratorPluginClass = generatorPluginClass;
      boolean oldGeneratorPluginClassESet = generatorPluginClassESet;
      generatorPluginClass = GENERATOR_PLUGIN_CLASS_EDEFAULT;
      generatorPluginClassESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET, GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS,
            oldGeneratorPluginClass, GENERATOR_PLUGIN_CLASS_EDEFAULT, oldGeneratorPluginClassESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetGeneratorPluginClass()
   {
      return generatorPluginClassESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorPluginID()
   {

      if (sameGeneratorTestsProject())
      {
         return getTestsPluginID();
      }

      if (sameGeneratorEditorProject())
      {
         return getEditorPluginID();
      }

      if (sameGeneratorEditProject())
      {
         return getEditPluginID();
      }

      if (sameGeneratorModelProject())
      {
         return getModelPluginID();
      }

      String result = generatorPluginID;
      if (isBlank(result))
      {
         String model = getModelPluginID();
         if (!isBlank(model))
         {
            result = model + "." + DEFAULT_GENERATOR_SUFFIX;
         }
      }
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorPluginID(String newGeneratorPluginID)
   {
      String oldGeneratorPluginID = generatorPluginID;
      generatorPluginID = newGeneratorPluginID;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID,
            oldGeneratorPluginID, generatorPluginID));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getGeneratorPluginVariables()
   {
      if (generatorPluginVariables == null)
      {
         generatorPluginVariables = new EDataTypeUniqueEList<String>(String.class, this,
            GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES);
      }
      return generatorPluginVariables;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorUIDirectory()
   {
      return getPluginDirectory(isSetGeneratorUIDirectory(), generatorUIDirectory, "." + DEFAULT_GENERATOR_UI_SUFFIX
         + "/");
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorUIDirectory(String newGeneratorUIDirectory)
   {
      String oldGeneratorUIDirectory = generatorUIDirectory;
      generatorUIDirectory = newGeneratorUIDirectory;
      boolean oldGeneratorUIDirectoryESet = generatorUIDirectoryESet;
      generatorUIDirectoryESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY,
            oldGeneratorUIDirectory, generatorUIDirectory, !oldGeneratorUIDirectoryESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetGeneratorUIDirectory()
   {
      String oldGeneratorUIDirectory = generatorUIDirectory;
      boolean oldGeneratorUIDirectoryESet = generatorUIDirectoryESet;
      generatorUIDirectory = GENERATOR_UI_DIRECTORY_EDEFAULT;
      generatorUIDirectoryESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET, GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY,
            oldGeneratorUIDirectory, GENERATOR_UI_DIRECTORY_EDEFAULT, oldGeneratorUIDirectoryESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetGeneratorUIDirectory()
   {
      return generatorUIDirectoryESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorUIPluginClass()
   {
      if (!isSetGeneratorUIPluginClass())
      {
         String modelName = getModelName();
         if (!isBlank(modelName))
         {
            GenPackage2 mainGenPackage = getMainGenPackage();
            String packageName = mainGenPackage != null
               ? mainGenPackage.getGeneratorUIPackageName()
               : addPackageSuffix(getModelProject(), DEFAULT_GENERATOR_UI_SUFFIX);
            StringBuilder result = new StringBuilder(packageName);
            return result.append(".").append(CodeGenUtil.validJavaIdentifier(modelName)).append("GeneratorUIPlugin")
               .toString();
         }
      }
      return generatorUIPluginClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorUIPluginClass(String newGeneratorUIPluginClass)
   {
      String oldGeneratorUIPluginClass = generatorUIPluginClass;
      generatorUIPluginClass = newGeneratorUIPluginClass;
      boolean oldGeneratorUIPluginClassESet = generatorUIPluginClassESet;
      generatorUIPluginClassESet = true;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS,
            oldGeneratorUIPluginClass, generatorUIPluginClass, !oldGeneratorUIPluginClassESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void unsetGeneratorUIPluginClass()
   {
      String oldGeneratorUIPluginClass = generatorUIPluginClass;
      boolean oldGeneratorUIPluginClassESet = generatorUIPluginClassESet;
      generatorUIPluginClass = GENERATOR_UI_PLUGIN_CLASS_EDEFAULT;
      generatorUIPluginClassESet = false;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.UNSET,
            GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS, oldGeneratorUIPluginClass,
            GENERATOR_UI_PLUGIN_CLASS_EDEFAULT, oldGeneratorUIPluginClassESet));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isSetGeneratorUIPluginClass()
   {
      return generatorUIPluginClassESet;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getGeneratorUIPluginID()
   {
      if (sameGeneratorUITestsProject())
      {
         return getTestsPluginID();
      }

      if (sameGeneratorUIEditorProject())
      {
         return getEditorPluginID();
      }

      if (sameGeneratorUIEditProject())
      {
         return getEditPluginID();
      }

      if (sameGeneratorUIModelProject())
      {
         return getModelPluginID();
      }

      if (sameGeneratorUIGeneratorProject())
      {
         return getGeneratorPluginID();
      }

      String result = generatorUIPluginID;
      if (isBlank(result))
      {
         String model = getModelPluginID();
         if (!isBlank(model))
         {
            result = model + "." + DEFAULT_GENERATOR_UI_SUFFIX;
         }
      }
      return result;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGeneratorUIPluginID(String newGeneratorUIPluginID)
   {
      String oldGeneratorUIPluginID = generatorUIPluginID;
      generatorUIPluginID = newGeneratorUIPluginID;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID,
            oldGeneratorUIPluginID, generatorUIPluginID));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getGeneratorUIPluginVariables()
   {
      if (generatorUIPluginVariables == null)
      {
         generatorUIPluginVariables = new EDataTypeUniqueEList<String>(String.class, this,
            GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES);
      }
      return generatorUIPluginVariables;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getGeneratorProjectTypes()
   {
      if (generatorProjectTypes == null)
      {
         generatorProjectTypes = new EDataTypeUniqueEList<String>(String.class, this,
            GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES);
      }
      return generatorProjectTypes;
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
         case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
            return isGenerateGenerator();
         case GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY :
            return getGeneratorDirectory();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS :
            return getGeneratorPluginClass();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID :
            return getGeneratorPluginID();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES :
            return getGeneratorPluginVariables();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY :
            return getGeneratorUIDirectory();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS :
            return getGeneratorUIPluginClass();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID :
            return getGeneratorUIPluginID();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES :
            return getGeneratorUIPluginVariables();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES :
            return getGeneratorProjectTypes();
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
         case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
            setGenerateGenerator((Boolean) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY :
            setGeneratorDirectory((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS :
            setGeneratorPluginClass((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID :
            setGeneratorPluginID((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES :
            getGeneratorPluginVariables().clear();
            getGeneratorPluginVariables().addAll((Collection<? extends String>) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY :
            setGeneratorUIDirectory((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS :
            setGeneratorUIPluginClass((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID :
            setGeneratorUIPluginID((String) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES :
            getGeneratorUIPluginVariables().clear();
            getGeneratorUIPluginVariables().addAll((Collection<? extends String>) newValue);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES :
            getGeneratorProjectTypes().clear();
            getGeneratorProjectTypes().addAll((Collection<? extends String>) newValue);
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
         case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
            setGenerateGenerator(GENERATE_GENERATOR_EDEFAULT);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY :
            unsetGeneratorDirectory();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS :
            unsetGeneratorPluginClass();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID :
            setGeneratorPluginID(GENERATOR_PLUGIN_ID_EDEFAULT);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES :
            getGeneratorPluginVariables().clear();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY :
            unsetGeneratorUIDirectory();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS :
            unsetGeneratorUIPluginClass();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID :
            setGeneratorUIPluginID(GENERATOR_UI_PLUGIN_ID_EDEFAULT);
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES :
            getGeneratorUIPluginVariables().clear();
            return;
         case GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES :
            getGeneratorProjectTypes().clear();
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
         case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
            return generateGenerator != GENERATE_GENERATOR_EDEFAULT;
         case GenModel2Package.GEN_MODEL2__GENERATOR_DIRECTORY :
            return isSetGeneratorDirectory();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_CLASS :
            return isSetGeneratorPluginClass();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_ID :
            return GENERATOR_PLUGIN_ID_EDEFAULT == null ? generatorPluginID != null : !GENERATOR_PLUGIN_ID_EDEFAULT
               .equals(generatorPluginID);
         case GenModel2Package.GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES :
            return generatorPluginVariables != null && !generatorPluginVariables.isEmpty();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_DIRECTORY :
            return isSetGeneratorUIDirectory();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS :
            return isSetGeneratorUIPluginClass();
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_ID :
            return GENERATOR_UI_PLUGIN_ID_EDEFAULT == null
               ? generatorUIPluginID != null
               : !GENERATOR_UI_PLUGIN_ID_EDEFAULT.equals(generatorUIPluginID);
         case GenModel2Package.GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES :
            return generatorUIPluginVariables != null && !generatorUIPluginVariables.isEmpty();
         case GenModel2Package.GEN_MODEL2__GENERATOR_PROJECT_TYPES :
            return generatorProjectTypes != null && !generatorProjectTypes.isEmpty();
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
            case GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR :
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
               return GenModel2Package.GEN_MODEL2__GENERATE_GENERATOR;
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
      result.append(", generatorDirectory: ");
      if (generatorDirectoryESet)
         result.append(generatorDirectory);
      else
         result.append("<unset>");
      result.append(", generatorPluginClass: ");
      if (generatorPluginClassESet)
         result.append(generatorPluginClass);
      else
         result.append("<unset>");
      result.append(", generatorPluginID: ");
      result.append(generatorPluginID);
      result.append(", generatorPluginVariables: ");
      result.append(generatorPluginVariables);
      result.append(", generatorUIDirectory: ");
      if (generatorUIDirectoryESet)
         result.append(generatorUIDirectory);
      else
         result.append("<unset>");
      result.append(", generatorUIPluginClass: ");
      if (generatorUIPluginClassESet)
         result.append(generatorUIPluginClass);
      else
         result.append("<unset>");
      result.append(", generatorUIPluginID: ");
      result.append(generatorUIPluginID);
      result.append(", generatorUIPluginVariables: ");
      result.append(generatorUIPluginVariables);
      result.append(", generatorProjectTypes: ");
      result.append(generatorProjectTypes);
      result.append(')');
      return result.toString();
   }

   GenPackage ecoreGenPackage;

   Map<EClassifier, GenClassifier> eClassifierToGenClassifierMap;

   Map<EPackage, GenPackage> ePackageToGenPackageMap;

   @Override
   public GenPackage findGenPackage(EPackage ePackage)
   {

      GenPackage result;
      if (ePackageToGenPackageMap == null)
      {
         ePackageToGenPackageMap = new HashMap<EPackage, GenPackage>();
         result = null;
      }
      else
      {
         result = ePackageToGenPackageMap.get(ePackage);
         if (result != null)
         {
            return result;
         }
      }

      if (ePackage == EcorePackage.eINSTANCE)
      {
         if (ecoreGenPackage == null)
         {

            if (ePackage != null)
            {
               for (Iterator<GenPackage> pIter = getAllGenPackages().iterator(); pIter.hasNext() && result == null;)
               {
                  GenPackage genPackage = pIter.next();
                  result = findGenPackageHelper(genPackage, ePackage);
               }
            }

            Copier c = new Copier()
            {
               @Override
               protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject)
               {
               }
            };

            final GenModel ecoreGenModel;
            if (result != null)
            {
               ecoreGenModel = (GenModel) c.copy(result.getGenModel());
            }
            else
            {
               ecoreGenModel = getGenModel().createGenModel();
            }

            ecoreGenModel.initialize(Collections.singleton(ePackage));
            ecoreGenModel.setMainGenModel(this);
            ecoreGenModel.setImportManager(getImportManager());
            ecoreGenModel.setLanguage("en");
            ecoreGenPackage = ecoreGenModel.getGenPackages().get(0);
            ecoreGenPackage.setPrefix("Ecore");
            ecoreGenPackage.setBasePackage("org.eclipse.emf");

            ePackageToGenPackageMap.put(ePackage, ecoreGenPackage);
         }
         return ecoreGenPackage;
      }
      return super.findGenPackage(ePackage);
   }

   public GenPackage getEcoreGenPackage()
   {
      return isMainGenModel() ? ecoreGenPackage : getMainGenModel().getEcoreGenPackage();
   }

   @Override
   public GenModel2 getGenModel()
   {
      return (GenModel2) super.getGenModel();
   }

   @Override
   protected GenPackage2 getMainGenPackage()
   {
      return (GenPackage2) super.getMainGenPackage();
   }

   @Override
   public GenModel2 createGenModel()
   {
      return GenModel2Factory.eINSTANCE.createGenModel2();
   }

   @Override
   public GenPackage2 createGenPackage()
   {
      return GenModel2Factory.eINSTANCE.createGenPackage2();
   }

   @Override
   public GenClass2 createGenClass()
   {
      return GenModel2Factory.eINSTANCE.createGenClass2();
   }

   public String getGeneratorProjectDirectory()
   {
      return getProjectPath(getGeneratorDirectory());
   }

   public boolean sameGeneratorModelProject()
   {
      return getModelProjectDirectory().equals(getGeneratorProjectDirectory());
   }

   public boolean sameGeneratorEditProject()
   {
      return getEditProjectDirectory().equals(getGeneratorProjectDirectory());
   }

   public boolean sameGeneratorEditorProject()
   {
      return getGeneratorProjectDirectory().equals(getEditorProjectDirectory());
   }

   public boolean sameGeneratorTestsProject()
   {
      return getGeneratorProjectDirectory().equals(getTestsProjectDirectory());
   }

   protected String getGeneratorPluginClassToUse()
   {
      String result = null;
      if (sameGeneratorModelProject())
      {
         result = getModelPluginClass();
      }
      if (isBlank(result) && sameGeneratorEditProject())
      {
         result = getEditPluginClass();
      }
      if (isBlank(result) && sameGeneratorEditorProject())
      {
         result = getEditorPluginClass();
      }
      if (isBlank(result) && sameGeneratorUIGeneratorProject())
      {
         result = getGeneratorUIPluginClass();
      }
      if (isBlank(result))
      {
         result = getGeneratorPluginClass();
      }
      return result;
   }

   public String getGeneratorPluginDirectory()
   {
      String result = getGeneratorDirectory();
      String plugin = null;
      if (sameGeneratorModelProject())
      {
         plugin = getModelPluginClass();
         result = getModelDirectory();
      }
      if (isBlank(plugin) && sameGeneratorEditProject())
      {
         plugin = getEditPluginClass();
         result = getEditDirectory();
      }
      if (isBlank(plugin) && sameGeneratorEditorProject())
      {
         plugin = getEditorPluginClass();
         result = getEditorDirectory();
      }
      if (isBlank(plugin))
      {
         plugin = getGeneratorPluginClass();
         result = getGeneratorDirectory();
      }
      return result;
   }

   public List<String> getGeneratorQualifiedPackageNames()
   {
      EList<String> packageNames = sameGeneratorModelProject()
         ? (EList<String>) getModelQualifiedPackageNames()
         : sameGeneratorTestsProject() ? (EList<String>) getTestsQualifiedPackageNames() : new UniqueEList<String>();

      TreeIterator<GenPackage> genPackagesIterator = new AbstractTreeIterator<GenPackage>(getGenPackages(), false)
      {
         private static final long serialVersionUID = 1L;

         @SuppressWarnings("unchecked")
         @Override
         protected Iterator<GenPackage> getChildren(Object object)
         {
            return object instanceof Collection<?>
               ? ((Collection<GenPackage>) object).iterator()
               : ((GenPackage) object).getNestedGenPackages().iterator();
         }
      };
      while (genPackagesIterator.hasNext())
      {
         GenPackage2 genPackage = (GenPackage2) genPackagesIterator.next();
         addQualifiedGeneratorPackageNames(packageNames, genPackage);
      }

      String pluginClassPackage = CodeGenUtil.getPackageName(getGeneratorPluginClassToUse());
      if (!isBlank(pluginClassPackage))
      {
         packageNames.add(pluginClassPackage);
      }

      ECollections.sort(packageNames);
      return packageNames;
   }

   protected void addQualifiedGeneratorPackageNames(List<String> packageNames, GenPackage2 genPackage)
   {
      if (!genPackage.getGenClasses().isEmpty())
      {
         packageNames.add(genPackage.getGeneratorPackageName());
      }
   }

   public String getGeneratorPluginPackageName()
   {
      return getPluginPackageName(getGeneratorPluginClassToUse(), getGeneratorPluginID());
   }

   public String getGeneratorPluginClassName()
   {
      return getPluginClassName(getGeneratorPluginClassToUse(), "GeneratorPlugin");
   }

   public String getQualifiedGeneratorPluginClassName()
   {
      return getGeneratorPluginPackageName() + "." + getGeneratorPluginClassName();
   }

   public List<String> getGeneratorResourceDelegateImportedPluginClassNames()
   {
      List<String> result = new UniqueEList<String>();
      for (GenPackage genPackage : getUsedGenPackages())
      {
         GenModel genModel = genPackage.getGenModel();
         if (genModel instanceof GenModel2)
         {
            if (((GenModel2) genModel).hasGeneratorSupport())
            {
               result.add(genModel.getImportedName(genModel.getQualifiedEditPluginClassName()));
            }
         }
      }
      return result;
   }

   public boolean hasGeneratorSupport()
   {
      return hasPluginSupport() && !isBlank(getGeneratorPluginClassToUse()) && !isBlank(getGeneratorDirectory());
   }

   public boolean canGenerateGenerator()
   {
      return canGenerate && hasGeneratorSupport();
   }

   public List<String> getGeneratorRequiredPlugins()
   {
      List<String> result = new UniqueEList<String>();

      if (getRuntimePlatform() != GenRuntimePlatform.GWT)
      {
         result
            .add(needsRuntimeCompatibility() ? "org.eclipse.core.runtime.compatibility" : "org.eclipse.core.runtime");
      }
      result.addAll(getEffectiveGeneratorPluginIDs());

      if (!sameGeneratorModelProject())
      {
         for (GenPackage genPackage : getGenPackages())
         {
            result.add(genPackage.getGenModel().getModelPluginID());
         }
      }
      else
      {
         result.addAll(getModelRequiredPlugins());
      }

      result.add("org.eclipse.emf.codegen");
      result.add("org.eclipse.emf.codegen.ecore");

      if (sameGeneratorTestsProject())
      {
         result.add("org.eclipse.emf.ecore.xmi");
         result.add("org.junit");
      }

      for (GenPackage genPackage : getUsedGenPackages())
      {
         GenModel genModel = genPackage.getGenModel();
         result.add(genModel.getModelPluginID());
         if (genModel instanceof GenModel2)
         {
            if (((GenModel2) genModel).hasGeneratorSupport())
            {
               result.add(((GenModel2) genModel).getGeneratorPluginID());
            }
         }
      }
      return result;
   }

   public List<String> getEffectiveGeneratorPluginIDs()
   {
      return getEffectivePluginIDs(getGeneratorPluginVariables());
   }

   public List<String> getGeneratorSourceFolders()
   {
      List<String> sourceFolders = new UniqueEList<String>(3);

      if (sameGeneratorModelProject())
      {
         String sourceFolder = getSourceFolder(getModelDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      {
         String sourceFolder = getSourceFolder(getGeneratorDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      if (sameGeneratorTestsProject())
      {
         String sourceFolder = getSourceFolder(getTestsDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      return sourceFolders;
   }

   // UI
   public String getGeneratorUIProjectDirectory()
   {
      return getProjectPath(getGeneratorUIDirectory());
   }

   public String getGeneratorUIPluginDirectory()
   {
      String result = getGeneratorUIDirectory();
      String plugin = null;
      if (sameGeneratorUIModelProject())
      {
         plugin = getModelPluginClass();
         result = getModelDirectory();
      }
      if (isBlank(plugin) && sameGeneratorUIEditProject())
      {
         plugin = getEditPluginClass();
         result = getEditDirectory();
      }
      if (isBlank(plugin) && sameGeneratorUIEditorProject())
      {
         plugin = getEditorPluginClass();
         result = getEditorDirectory();
      }
      if (isBlank(plugin) && sameGeneratorUIGeneratorProject())
      {
         plugin = getGeneratorPluginClass();
         result = getGeneratorDirectory();
      }
      if (isBlank(plugin))
      {
         plugin = getGeneratorUIPluginClass();
         result = getGeneratorUIDirectory();
      }
      return result;
   }

   public String getGeneratorUIPluginClassName()
   {
      return getPluginClassName(getGeneratorUIPluginClassToUse(), "GeneratorUIPlugin");
   }

   protected String getGeneratorUIPluginClassToUse()
   {
      String result = null;
      if (sameGeneratorModelProject())
      {
         result = getModelPluginClass();
      }
      if (isBlank(result) && sameGeneratorEditProject())
      {
         result = getEditPluginClass();
      }
      if (isBlank(result) && sameGeneratorEditorProject())
      {
         result = getEditorPluginClass();
      }
      if (isBlank(result) && sameGeneratorUIGeneratorProject())
      {
         result = getGeneratorUIPluginClass();
      }
      if (isBlank(result))
      {
         result = getGeneratorUIPluginClass();
      }
      return result;
   }

   public String getGeneratorUIPluginPackageName()
   {
      return getPluginPackageName(getGeneratorUIPluginClassToUse(), getGeneratorUIPluginID());
   }

   public String getQualifiedGeneratorUIPluginClassName()
   {
      return getGeneratorUIPluginPackageName() + "." + getGeneratorUIPluginClassName();
   }

   public List<String> getGeneratorUIRequiredPlugins()
   {
      List<String> result = new UniqueEList<String>();
      result.add(needsRuntimeCompatibility() ? "org.eclipse.core.runtime.compatibility" : "org.eclipse.core.runtime");
      if (!isRichClientPlatform())
      {
         result.add("org.eclipse.core.resources");
      }
      result.addAll(getEffectiveGeneratorUIPluginIDs());

      if (!sameGeneratorUIGeneratorProject())
      {
         for (GenPackage genPackage : getGenPackages())
         {
            if (genPackage instanceof GenPackage2)
            {
               GenModel2 genModel = ((GenPackage2) genPackage).getGenModel();
               if (genModel.hasEditSupport())
               {
                  result.add(genModel.getGeneratorPluginID());
               }
            }
         }
      }
      else
      {
         result.addAll(getGeneratorRequiredPlugins());
      }
      result.add("org.eclipse.emf.ecore.xmi");
      result.add("org.sourcepit.emfx.codegen.ecore.ui");
      if (isRichAjaxPlatform())
      {
         result.add("org.eclipse.core.commands");
      }
      else
      {
         result.add("org.eclipse.emf.edit.ui");
      }
      if (!isRichClientPlatform())
      {
         result.add("org.eclipse.ui.ide");
      }

      if (sameGeneratorTestsProject())
      {
         result.add("org.junit");
      }

      for (GenPackage genPackage : getUsedGenPackages())
      {
         if (genPackage instanceof GenPackage2)
         {
            GenModel2 genModel = ((GenPackage2) genPackage).getGenModel();
            if (genModel.hasGeneratorSupport())
            {
               result.add(genModel.getGeneratorPluginID());
            }
         }
      }
      return result;
   }

   public List<String> getEffectiveGeneratorUIPluginIDs()
   {
      return getEffectivePluginIDs(getGeneratorUIPluginVariables());
   }

   public List<String> getGeneratorUIQualifiedPackageNames()
   {
      final EList<String> packageNames = new UniqueEList<String>();
      if (sameGeneratorUIModelProject())
      {
         packageNames.addAll(getModelQualifiedPackageNames());
      }

      if (sameGeneratorUIEditProject())
      {
         packageNames.addAll(getEditQualifiedPackageNames());
      }

      if (sameGeneratorUIEditorProject())
      {
         packageNames.addAll(getEditorQualifiedPackageNames());
      }

      if (sameGeneratorUIGeneratorProject())
      {
         packageNames.addAll(getGeneratorQualifiedPackageNames());
      }

      if (sameGeneratorUITestsProject())
      {
         packageNames.addAll(getTestsQualifiedPackageNames());
      }

      // TreeIterator<GenPackage> genPackagesIterator = new
      // AbstractTreeIterator<GenPackage>(
      // getGenPackages(), false) {
      // private static final long serialVersionUID = 1L;
      //
      // @SuppressWarnings("unchecked")
      // @Override
      // protected Iterator<GenPackage> getChildren(Object object) {
      // return object instanceof Collection<?> ? ((Collection<GenPackage>)
      // object)
      // .iterator() : ((GenPackage) object)
      // .getNestedGenPackages().iterator();
      // }
      // };
      // while (genPackagesIterator.hasNext()) {
      // GenPackage genPackage = genPackagesIterator.next();
      // addQualifiedGeneratorUIPackageNames(packageNames, genPackage);
      // }

      String pluginClassPackage = CodeGenUtil.getPackageName(getGeneratorUIPluginClassToUse());
      if (!isBlank(pluginClassPackage))
      {
         packageNames.add(pluginClassPackage);
      }

      ECollections.sort(packageNames);
      return packageNames;
   }

   // protected void addQualifiedGeneratorUIPackageNames(
   // List<String> packageNames, GenPackage genPackage) {
   // if (genPackage instanceof GenPackage2
   // && genPackage.hasConcreteClasses()) {
   // packageNames.add(((GenPackage2) genPackage)
   // .getGeneratorUIPackageName());
   // }
   // }

   public List<String> getGeneratorUISourceFolders()
   {
      List<String> sourceFolders = new UniqueEList<String>(4);

      if (sameGeneratorUIModelProject())
      {
         String sourceFolder = getSourceFolder(getModelDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      if (sameGeneratorUIEditProject())
      {
         String sourceFolder = getSourceFolder(getEditDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      if (sameGeneratorUIEditorProject())
      {
         String sourceFolder = getSourceFolder(getEditorDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      if (sameGeneratorUIGeneratorProject())
      {
         String sourceFolder = getSourceFolder(getGeneratorDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      {
         String sourceFolder = getSourceFolder(getGeneratorUIDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      if (sameGeneratorTestsProject())
      {
         String sourceFolder = getSourceFolder(getTestsDirectory());
         if (sourceFolder != null)
         {
            sourceFolders.add(sourceFolder);
         }
      }

      return sourceFolders;
   }

   public boolean sameGeneratorUIModelProject()
   {
      return getModelProjectDirectory().equals(getGeneratorUIProjectDirectory());
   }

   public boolean sameGeneratorUIEditProject()
   {
      return getEditProjectDirectory().equals(getGeneratorUIProjectDirectory());
   }

   public boolean sameGeneratorUIEditorProject()
   {
      return getEditorProjectDirectory().equals(getGeneratorUIProjectDirectory());
   }

   public boolean sameGeneratorUITestsProject()
   {
      return getTestsProjectDirectory().equals(getGeneratorUIProjectDirectory());
   }

   public boolean sameGeneratorUIGeneratorProject()
   {
      return getGeneratorProjectDirectory().equals(getGeneratorUIProjectDirectory());
   }

   public String getGenerateCommandCategoryId()
   {
      return getGeneratorUIPluginID() + ".commands." + "GenerateCategoryID";
   }

   public String getGeneratorHandlerCommandCategoryName()
   {
      return "%_UI_EMFGenerateCategory_name";
   }

   public String getGeneratorHandlerCommandCategoryDescription()
   {
      return "%_UI_EMFGenerateCategory_description";
   }

   public String getGeneratorProjectTypeConstantName(String projectType)
   {
      return projectType.toUpperCase() + "_PROJECT_TYPE";
   }
} // GenModel2Impl
