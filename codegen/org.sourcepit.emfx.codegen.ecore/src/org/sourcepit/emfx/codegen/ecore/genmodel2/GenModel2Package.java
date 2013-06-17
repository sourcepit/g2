/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory
 * @model kind="package"
 * @generated
 */
public interface GenModel2Package extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "genmodel2";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://genmodel2/1.0";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "genmodel2";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   GenModel2Package eINSTANCE = org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl.init();

   /**
    * The meta object id for the ' {@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl
    * <em>Gen Model2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenModel2()
    * @generated
    */
   int GEN_MODEL2 = 0;

   /**
    * The feature id for the '<em><b>Gen Annotations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GEN_ANNOTATIONS = GenModelPackage.GEN_MODEL__GEN_ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Copyright Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__COPYRIGHT_TEXT = GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT;

   /**
    * The feature id for the '<em><b>Model Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MODEL_DIRECTORY = GenModelPackage.GEN_MODEL__MODEL_DIRECTORY;

   /**
    * The feature id for the '<em><b>Creation Commands</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CREATION_COMMANDS = GenModelPackage.GEN_MODEL__CREATION_COMMANDS;

   /**
    * The feature id for the '<em><b>Creation Icons</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CREATION_ICONS = GenModelPackage.GEN_MODEL__CREATION_ICONS;

   /**
    * The feature id for the '<em><b>Creation Submenus</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CREATION_SUBMENUS = GenModelPackage.GEN_MODEL__CREATION_SUBMENUS;

   /**
    * The feature id for the '<em><b>Edit Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDIT_DIRECTORY = GenModelPackage.GEN_MODEL__EDIT_DIRECTORY;

   /**
    * The feature id for the '<em><b>Editor Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDITOR_DIRECTORY = GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY;

   /**
    * The feature id for the '<em><b>Model Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MODEL_PLUGIN_ID = GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID;

   /**
    * The feature id for the '<em><b>Template Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TEMPLATE_DIRECTORY = GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY;

   /**
    * The feature id for the '<em><b>Runtime Jar</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RUNTIME_JAR = GenModelPackage.GEN_MODEL__RUNTIME_JAR;

   /**
    * The feature id for the '<em><b>Foreign Model</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FOREIGN_MODEL = GenModelPackage.GEN_MODEL__FOREIGN_MODEL;

   /**
    * The feature id for the '<em><b>Dynamic Templates</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__DYNAMIC_TEMPLATES = GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES;

   /**
    * The feature id for the '<em><b>Redirection</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__REDIRECTION = GenModelPackage.GEN_MODEL__REDIRECTION;

   /**
    * The feature id for the '<em><b>Force Overwrite</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FORCE_OVERWRITE = GenModelPackage.GEN_MODEL__FORCE_OVERWRITE;

   /**
    * The feature id for the '<em><b>Non Externalized String Tag</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__NON_EXTERNALIZED_STRING_TAG = GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG;

   /**
    * The feature id for the '<em><b>Model Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MODEL_NAME = GenModelPackage.GEN_MODEL__MODEL_NAME;

   /**
    * The feature id for the '<em><b>Model Plugin Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MODEL_PLUGIN_CLASS = GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS;

   /**
    * The feature id for the '<em><b>Edit Plugin Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDIT_PLUGIN_CLASS = GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS;

   /**
    * The feature id for the '<em><b>Editor Plugin Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDITOR_PLUGIN_CLASS = GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS;

   /**
    * The feature id for the '<em><b>Update Classpath</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__UPDATE_CLASSPATH = GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH;

   /**
    * The feature id for the '<em><b>Generate Schema</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATE_SCHEMA = GenModelPackage.GEN_MODEL__GENERATE_SCHEMA;

   /**
    * The feature id for the '<em><b>Non NLS Markers</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__NON_NLS_MARKERS = GenModelPackage.GEN_MODEL__NON_NLS_MARKERS;

   /**
    * The feature id for the '<em><b>Static Packages</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__STATIC_PACKAGES = GenModelPackage.GEN_MODEL__STATIC_PACKAGES;

   /**
    * The feature id for the '<em><b>Model Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MODEL_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES;

   /**
    * The feature id for the '<em><b>Root Extends Interface</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__ROOT_EXTENDS_INTERFACE = GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE;

   /**
    * The feature id for the '<em><b>Root Extends Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__ROOT_EXTENDS_CLASS = GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS;

   /**
    * The feature id for the '<em><b>Root Implements Interface</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__ROOT_IMPLEMENTS_INTERFACE = GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE;

   /**
    * The feature id for the '<em><b>Suppress EMF Types</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_EMF_TYPES = GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES;

   /**
    * The feature id for the '<em><b>Suppress EMF Meta Data</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_EMF_META_DATA = GenModelPackage.GEN_MODEL__SUPPRESS_EMF_META_DATA;

   /**
    * The feature id for the '<em><b>Suppress EMF Model Tags</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_EMF_MODEL_TAGS = GenModelPackage.GEN_MODEL__SUPPRESS_EMF_MODEL_TAGS;

   /**
    * The feature id for the '<em><b>Suppress Interfaces</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_INTERFACES = GenModelPackage.GEN_MODEL__SUPPRESS_INTERFACES;

   /**
    * The feature id for the '<em><b>Feature Map Wrapper Interface</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FEATURE_MAP_WRAPPER_INTERFACE = GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE;

   /**
    * The feature id for the ' <em><b>Feature Map Wrapper Internal Interface</b></em>' attribute. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE = GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE;

   /**
    * The feature id for the '<em><b>Feature Map Wrapper Class</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FEATURE_MAP_WRAPPER_CLASS = GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS;

   /**
    * The feature id for the '<em><b>Runtime Compatibility</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RUNTIME_COMPATIBILITY = GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY;

   /**
    * The feature id for the '<em><b>Rich Client Platform</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RICH_CLIENT_PLATFORM = GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM;

   /**
    * The feature id for the '<em><b>Reflective Delegation</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__REFLECTIVE_DELEGATION = GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION;

   /**
    * The feature id for the '<em><b>Code Formatting</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CODE_FORMATTING = GenModelPackage.GEN_MODEL__CODE_FORMATTING;

   /**
    * The feature id for the '<em><b>Tests Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TESTS_DIRECTORY = GenModelPackage.GEN_MODEL__TESTS_DIRECTORY;

   /**
    * The feature id for the '<em><b>Test Suite Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TEST_SUITE_CLASS = GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS;

   /**
    * The feature id for the '<em><b>Boolean Flags Field</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__BOOLEAN_FLAGS_FIELD = GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD;

   /**
    * The feature id for the '<em><b>Boolean Flags Reserved Bits</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__BOOLEAN_FLAGS_RESERVED_BITS = GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS;

   /**
    * The feature id for the '<em><b>Importer ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__IMPORTER_ID = GenModelPackage.GEN_MODEL__IMPORTER_ID;

   /**
    * The feature id for the '<em><b>Bundle Manifest</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__BUNDLE_MANIFEST = GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST;

   /**
    * The feature id for the '<em><b>Feature Delegation</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FEATURE_DELEGATION = GenModelPackage.GEN_MODEL__FEATURE_DELEGATION;

   /**
    * The feature id for the '<em><b>Containment Proxies</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CONTAINMENT_PROXIES = GenModelPackage.GEN_MODEL__CONTAINMENT_PROXIES;

   /**
    * The feature id for the '<em><b>Minimal Reflective Methods</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__MINIMAL_REFLECTIVE_METHODS = GenModelPackage.GEN_MODEL__MINIMAL_REFLECTIVE_METHODS;

   /**
    * The feature id for the '<em><b>Suppress Containment</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_CONTAINMENT = GenModelPackage.GEN_MODEL__SUPPRESS_CONTAINMENT;

   /**
    * The feature id for the '<em><b>Suppress Notification</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_NOTIFICATION = GenModelPackage.GEN_MODEL__SUPPRESS_NOTIFICATION;

   /**
    * The feature id for the '<em><b>Array Accessors</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__ARRAY_ACCESSORS = GenModelPackage.GEN_MODEL__ARRAY_ACCESSORS;

   /**
    * The feature id for the '<em><b>Suppress Unsettable</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_UNSETTABLE = GenModelPackage.GEN_MODEL__SUPPRESS_UNSETTABLE;

   /**
    * The feature id for the '<em><b>Facade Helper Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FACADE_HELPER_CLASS = GenModelPackage.GEN_MODEL__FACADE_HELPER_CLASS;

   /**
    * The feature id for the '<em><b>Compliance Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__COMPLIANCE_LEVEL = GenModelPackage.GEN_MODEL__COMPLIANCE_LEVEL;

   /**
    * The feature id for the '<em><b>Suppress Gen Model Annotations</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__SUPPRESS_GEN_MODEL_ANNOTATIONS = GenModelPackage.GEN_MODEL__SUPPRESS_GEN_MODEL_ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Copyright Fields</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__COPYRIGHT_FIELDS = GenModelPackage.GEN_MODEL__COPYRIGHT_FIELDS;

   /**
    * The feature id for the ' <em><b>Binary Compatible Reflective Methods</b></em>' attribute. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__BINARY_COMPATIBLE_REFLECTIVE_METHODS = GenModelPackage.GEN_MODEL__BINARY_COMPATIBLE_REFLECTIVE_METHODS;

   /**
    * The feature id for the '<em><b>Public Constructors</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__PUBLIC_CONSTRUCTORS = GenModelPackage.GEN_MODEL__PUBLIC_CONSTRUCTORS;

   /**
    * The feature id for the '<em><b>Template Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TEMPLATE_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL__TEMPLATE_PLUGIN_VARIABLES;

   /**
    * The feature id for the '<em><b>Provider Root Extends Class</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__PROVIDER_ROOT_EXTENDS_CLASS = GenModelPackage.GEN_MODEL__PROVIDER_ROOT_EXTENDS_CLASS;

   /**
    * The feature id for the '<em><b>Edit Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDIT_PLUGIN_ID = GenModelPackage.GEN_MODEL__EDIT_PLUGIN_ID;

   /**
    * The feature id for the '<em><b>Edit Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDIT_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL__EDIT_PLUGIN_VARIABLES;

   /**
    * The feature id for the '<em><b>Editor Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDITOR_PLUGIN_ID = GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_ID;

   /**
    * The feature id for the '<em><b>Editor Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__EDITOR_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_VARIABLES;

   /**
    * The feature id for the '<em><b>Tests Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TESTS_PLUGIN_ID = GenModelPackage.GEN_MODEL__TESTS_PLUGIN_ID;

   /**
    * The feature id for the '<em><b>Tests Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TESTS_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL__TESTS_PLUGIN_VARIABLES;

   /**
    * The feature id for the '<em><b>Optimized Has Children</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__OPTIMIZED_HAS_CHILDREN = GenModelPackage.GEN_MODEL__OPTIMIZED_HAS_CHILDREN;

   /**
    * The feature id for the '<em><b>Table Providers</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__TABLE_PROVIDERS = GenModelPackage.GEN_MODEL__TABLE_PROVIDERS;

   /**
    * The feature id for the '<em><b>Color Providers</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__COLOR_PROVIDERS = GenModelPackage.GEN_MODEL__COLOR_PROVIDERS;

   /**
    * The feature id for the '<em><b>Font Providers</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__FONT_PROVIDERS = GenModelPackage.GEN_MODEL__FONT_PROVIDERS;

   /**
    * The feature id for the '<em><b>Runtime Version</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RUNTIME_VERSION = GenModelPackage.GEN_MODEL__RUNTIME_VERSION;

   /**
    * The feature id for the '<em><b>Language</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__LANGUAGE = GenModelPackage.GEN_MODEL__LANGUAGE;

   /**
    * The feature id for the '<em><b>Packed Enums</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__PACKED_ENUMS = GenModelPackage.GEN_MODEL__PACKED_ENUMS;

   /**
    * The feature id for the '<em><b>Gen Packages</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GEN_PACKAGES = GenModelPackage.GEN_MODEL__GEN_PACKAGES;

   /**
    * The feature id for the '<em><b>Used Gen Packages</b></em>' reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__USED_GEN_PACKAGES = GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES;

   /**
    * The feature id for the '<em><b>Interface Name Pattern</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__INTERFACE_NAME_PATTERN = GenModelPackage.GEN_MODEL__INTERFACE_NAME_PATTERN;

   /**
    * The feature id for the '<em><b>Class Name Pattern</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__CLASS_NAME_PATTERN = GenModelPackage.GEN_MODEL__CLASS_NAME_PATTERN;

   /**
    * The feature id for the '<em><b>Operation Reflection</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__OPERATION_REFLECTION = GenModelPackage.GEN_MODEL__OPERATION_REFLECTION;

   /**
    * The feature id for the '<em><b>Rich Ajax Platform</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RICH_AJAX_PLATFORM = GenModelPackage.GEN_MODEL__RICH_AJAX_PLATFORM;

   /**
    * The feature id for the '<em><b>Runtime Platform</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__RUNTIME_PLATFORM = GenModelPackage.GEN_MODEL__RUNTIME_PLATFORM;

   /**
    * The feature id for the '<em><b>Generate Generator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATE_GENERATOR = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Generator Directory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_DIRECTORY = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Generator Plugin Class</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_PLUGIN_CLASS = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Generator Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_PLUGIN_ID = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Generator Plugin Variables</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Generator UI Directory</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_UI_DIRECTORY = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Generator UI Plugin Class</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Generator UI Plugin ID</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_UI_PLUGIN_ID = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 7;

   /**
    * The feature id for the '<em><b>Generator UI Plugin Variables</b></em>' attribute list. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 8;

   /**
    * The feature id for the '<em><b>Generator Project Types</b></em>' attribute list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2__GENERATOR_PROJECT_TYPES = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 9;

   /**
    * The number of structural features of the '<em>Gen Model2</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_MODEL2_FEATURE_COUNT = GenModelPackage.GEN_MODEL_FEATURE_COUNT + 10;

   /**
    * The meta object id for the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenBase2Impl
    * <em>Gen Base2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenBase2Impl
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenBase2()
    * @generated
    */
   int GEN_BASE2 = 1;

   /**
    * The feature id for the '<em><b>Gen Annotations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_BASE2__GEN_ANNOTATIONS = GenModelPackage.GEN_BASE__GEN_ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Generate Generator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_BASE2__GENERATE_GENERATOR = GenModelPackage.GEN_BASE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Gen Base2</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_BASE2_FEATURE_COUNT = GenModelPackage.GEN_BASE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the ' {@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenClass2Impl
    * <em>Gen Class2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenClass2Impl
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenClass2()
    * @generated
    */
   int GEN_CLASS2 = 2;

   /**
    * The feature id for the '<em><b>Gen Annotations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GEN_ANNOTATIONS = GenModelPackage.GEN_CLASS__GEN_ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Gen Package</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GEN_PACKAGE = GenModelPackage.GEN_CLASS__GEN_PACKAGE;

   /**
    * The feature id for the '<em><b>Gen Type Parameters</b></em>' containment reference list. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GEN_TYPE_PARAMETERS = GenModelPackage.GEN_CLASS__GEN_TYPE_PARAMETERS;

   /**
    * The feature id for the '<em><b>Provider</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__PROVIDER = GenModelPackage.GEN_CLASS__PROVIDER;

   /**
    * The feature id for the '<em><b>Image</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__IMAGE = GenModelPackage.GEN_CLASS__IMAGE;

   /**
    * The feature id for the '<em><b>Dynamic</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__DYNAMIC = GenModelPackage.GEN_CLASS__DYNAMIC;

   /**
    * The feature id for the '<em><b>Ecore Class</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__ECORE_CLASS = GenModelPackage.GEN_CLASS__ECORE_CLASS;

   /**
    * The feature id for the '<em><b>Gen Features</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GEN_FEATURES = GenModelPackage.GEN_CLASS__GEN_FEATURES;

   /**
    * The feature id for the '<em><b>Gen Operations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GEN_OPERATIONS = GenModelPackage.GEN_CLASS__GEN_OPERATIONS;

   /**
    * The feature id for the '<em><b>Label Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__LABEL_FEATURE = GenModelPackage.GEN_CLASS__LABEL_FEATURE;

   /**
    * The feature id for the '<em><b>Generate Generator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2__GENERATE_GENERATOR = GenModelPackage.GEN_CLASS_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Gen Class2</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_CLASS2_FEATURE_COUNT = GenModelPackage.GEN_CLASS_FEATURE_COUNT + 1;

   /**
    * The meta object id for the ' {@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl
    * <em>Gen Package2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenPackage2()
    * @generated
    */
   int GEN_PACKAGE2 = 3;

   /**
    * The feature id for the '<em><b>Gen Annotations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_ANNOTATIONS = GenModelPackage.GEN_PACKAGE__GEN_ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Prefix</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__PREFIX = GenModelPackage.GEN_PACKAGE__PREFIX;

   /**
    * The feature id for the '<em><b>Base Package</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__BASE_PACKAGE = GenModelPackage.GEN_PACKAGE__BASE_PACKAGE;

   /**
    * The feature id for the '<em><b>Resource</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__RESOURCE = GenModelPackage.GEN_PACKAGE__RESOURCE;

   /**
    * The feature id for the '<em><b>Disposable Provider Factory</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__DISPOSABLE_PROVIDER_FACTORY = GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY;

   /**
    * The feature id for the '<em><b>Adapter Factory</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__ADAPTER_FACTORY = GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY;

   /**
    * The feature id for the '<em><b>Load Initialization</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__LOAD_INITIALIZATION = GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION;

   /**
    * The feature id for the '<em><b>Interface Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__INTERFACE_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Meta Data Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__META_DATA_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__META_DATA_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Class Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__CLASS_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Utility Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__UTILITY_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Provider Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__PROVIDER_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Presentation Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__PRESENTATION_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Tests Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__TESTS_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX;

   /**
    * The feature id for the '<em><b>Generate Example Class</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GENERATE_EXAMPLE_CLASS = GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS;

   /**
    * The feature id for the '<em><b>Literals Interface</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__LITERALS_INTERFACE = GenModelPackage.GEN_PACKAGE__LITERALS_INTERFACE;

   /**
    * The feature id for the '<em><b>Data Type Converters</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__DATA_TYPE_CONVERTERS = GenModelPackage.GEN_PACKAGE__DATA_TYPE_CONVERTERS;

   /**
    * The feature id for the '<em><b>Multiple Editor Pages</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__MULTIPLE_EDITOR_PAGES = GenModelPackage.GEN_PACKAGE__MULTIPLE_EDITOR_PAGES;

   /**
    * The feature id for the '<em><b>Generate Model Wizard</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GENERATE_MODEL_WIZARD = GenModelPackage.GEN_PACKAGE__GENERATE_MODEL_WIZARD;

   /**
    * The feature id for the '<em><b>Extensible Provider Factory</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__EXTENSIBLE_PROVIDER_FACTORY = GenModelPackage.GEN_PACKAGE__EXTENSIBLE_PROVIDER_FACTORY;

   /**
    * The feature id for the '<em><b>Child Creation Extenders</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__CHILD_CREATION_EXTENDERS = GenModelPackage.GEN_PACKAGE__CHILD_CREATION_EXTENDERS;

   /**
    * The feature id for the '<em><b>Content Type Identifier</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__CONTENT_TYPE_IDENTIFIER = GenModelPackage.GEN_PACKAGE__CONTENT_TYPE_IDENTIFIER;

   /**
    * The feature id for the '<em><b>File Extensions</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__FILE_EXTENSIONS = GenModelPackage.GEN_PACKAGE__FILE_EXTENSIONS;

   /**
    * The feature id for the '<em><b>Ecore Package</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__ECORE_PACKAGE = GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE;

   /**
    * The feature id for the '<em><b>Gen Model</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_MODEL = GenModelPackage.GEN_PACKAGE__GEN_MODEL;

   /**
    * The feature id for the '<em><b>Gen Enums</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_ENUMS = GenModelPackage.GEN_PACKAGE__GEN_ENUMS;

   /**
    * The feature id for the '<em><b>Gen Data Types</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_DATA_TYPES = GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES;

   /**
    * The feature id for the '<em><b>Gen Classes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_CLASSES = GenModelPackage.GEN_PACKAGE__GEN_CLASSES;

   /**
    * The feature id for the '<em><b>Nested Gen Packages</b></em>' containment reference list. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__NESTED_GEN_PACKAGES = GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES;

   /**
    * The feature id for the '<em><b>Gen Classifiers</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GEN_CLASSIFIERS = GenModelPackage.GEN_PACKAGE__GEN_CLASSIFIERS;

   /**
    * The feature id for the '<em><b>Generate Generator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GENERATE_GENERATOR = GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Generator Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Generator UI Package Suffix</b></em>' attribute. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX = GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Gen Package2</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int GEN_PACKAGE2_FEATURE_COUNT = GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 3;

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2
    * <em>Gen Model2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Gen Model2</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2
    * @generated
    */
   EClass getGenModel2();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory <em>Generator Directory</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator Directory</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorDirectory()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorDirectory();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass
    * <em>Generator Plugin Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator Plugin Class</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginClass()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorPluginClass();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginID <em>Generator Plugin ID</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator Plugin ID</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginID()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorPluginID();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginVariables
    * <em>Generator Plugin Variables</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Generator Plugin Variables</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorPluginVariables()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorPluginVariables();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory
    * <em>Generator UI Directory</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator UI Directory</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIDirectory()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorUIDirectory();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass
    * <em>Generator UI Plugin Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator UI Plugin Class</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginClass()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorUIPluginClass();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginID
    * <em>Generator UI Plugin ID</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator UI Plugin ID</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginID()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorUIPluginID();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginVariables
    * <em>Generator UI Plugin Variables</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Generator UI Plugin Variables</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorUIPluginVariables()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorUIPluginVariables();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorProjectTypes
    * <em>Generator Project Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Generator Project Types</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2#getGeneratorProjectTypes()
    * @see #getGenModel2()
    * @generated
    */
   EAttribute getGenModel2_GeneratorProjectTypes();

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2 <em>Gen Base2</em>}
    * '. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Gen Base2</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2
    * @generated
    */
   EClass getGenBase2();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2#isGenerateGenerator <em>Generate Generator</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generate Generator</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2#isGenerateGenerator()
    * @see #getGenBase2()
    * @generated
    */
   EAttribute getGenBase2_GenerateGenerator();

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2
    * <em>Gen Class2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Gen Class2</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2
    * @generated
    */
   EClass getGenClass2();

   /**
    * Returns the meta object for class '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2
    * <em>Gen Package2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Gen Package2</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2
    * @generated
    */
   EClass getGenPackage2();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorPackageSuffix
    * <em>Generator Package Suffix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator Package Suffix</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorPackageSuffix()
    * @see #getGenPackage2()
    * @generated
    */
   EAttribute getGenPackage2_GeneratorPackageSuffix();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorUIPackageSuffix
    * <em>Generator UI Package Suffix</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Generator UI Package Suffix</em>'.
    * @see org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2#getGeneratorUIPackageSuffix()
    * @see #getGenPackage2()
    * @generated
    */
   EAttribute getGenPackage2_GeneratorUIPackageSuffix();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   GenModel2Factory getGenModel2Factory();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl
       * <em>Gen Model2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2Impl
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenModel2()
       * @generated
       */
      EClass GEN_MODEL2 = eINSTANCE.getGenModel2();
      /**
       * The meta object literal for the '<em><b>Generator Directory</b></em>' attribute feature. <!-- begin-user-doc
       * --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_DIRECTORY = eINSTANCE.getGenModel2_GeneratorDirectory();
      /**
       * The meta object literal for the ' <em><b>Generator Plugin Class</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_PLUGIN_CLASS = eINSTANCE.getGenModel2_GeneratorPluginClass();
      /**
       * The meta object literal for the '<em><b>Generator Plugin ID</b></em>' attribute feature. <!-- begin-user-doc
       * --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_PLUGIN_ID = eINSTANCE.getGenModel2_GeneratorPluginID();
      /**
       * The meta object literal for the '<em><b>Generator Plugin Variables</b></em>' attribute list feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_PLUGIN_VARIABLES = eINSTANCE.getGenModel2_GeneratorPluginVariables();
      /**
       * The meta object literal for the ' <em><b>Generator UI Directory</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_UI_DIRECTORY = eINSTANCE.getGenModel2_GeneratorUIDirectory();
      /**
       * The meta object literal for the ' <em><b>Generator UI Plugin Class</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_UI_PLUGIN_CLASS = eINSTANCE.getGenModel2_GeneratorUIPluginClass();
      /**
       * The meta object literal for the ' <em><b>Generator UI Plugin ID</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_UI_PLUGIN_ID = eINSTANCE.getGenModel2_GeneratorUIPluginID();
      /**
       * The meta object literal for the '<em><b>Generator UI Plugin Variables</b></em>' attribute list feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_UI_PLUGIN_VARIABLES = eINSTANCE.getGenModel2_GeneratorUIPluginVariables();
      /**
       * The meta object literal for the ' <em><b>Generator Project Types</b></em>' attribute list feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_MODEL2__GENERATOR_PROJECT_TYPES = eINSTANCE.getGenModel2_GeneratorProjectTypes();
      /**
       * The meta object literal for the ' {@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenBase2Impl
       * <em>Gen Base2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenBase2Impl
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenBase2()
       * @generated
       */
      EClass GEN_BASE2 = eINSTANCE.getGenBase2();
      /**
       * The meta object literal for the '<em><b>Generate Generator</b></em>' attribute feature. <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_BASE2__GENERATE_GENERATOR = eINSTANCE.getGenBase2_GenerateGenerator();
      /**
       * The meta object literal for the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenClass2Impl
       * <em>Gen Class2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenClass2Impl
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenClass2()
       * @generated
       */
      EClass GEN_CLASS2 = eINSTANCE.getGenClass2();
      /**
       * The meta object literal for the '{@link org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl
       * <em>Gen Package2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenPackage2Impl
       * @see org.sourcepit.emfx.codegen.ecore.genmodel2.impl.GenModel2PackageImpl#getGenPackage2()
       * @generated
       */
      EClass GEN_PACKAGE2 = eINSTANCE.getGenPackage2();
      /**
       * The meta object literal for the ' <em><b>Generator Package Suffix</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_PACKAGE2__GENERATOR_PACKAGE_SUFFIX = eINSTANCE.getGenPackage2_GeneratorPackageSuffix();
      /**
       * The meta object literal for the ' <em><b>Generator UI Package Suffix</b></em>' attribute feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute GEN_PACKAGE2__GENERATOR_UI_PACKAGE_SUFFIX = eINSTANCE.getGenPackage2_GeneratorUIPackageSuffix();

   }

} // GenModel2Package
