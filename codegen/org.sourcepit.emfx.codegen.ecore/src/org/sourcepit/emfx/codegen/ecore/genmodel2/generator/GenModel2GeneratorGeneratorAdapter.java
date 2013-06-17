
package org.sourcepit.emfx.codegen.ecore.genmodel2.generator;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimePlatform;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;

public class GenModel2GeneratorGeneratorAdapter extends BaseGeneratorGeneratorAdapter
{

   protected static final int GENERATOR_PLUGIN_CLASS_ID = 0;
   protected static final int GENERATOR_MANIFEST_MF_ID = 1;
   protected static final int GENERATOR_PLUGIN_XML_ID = 2;
   protected static final int GENERATOR_PLUGIN_PROPERTIES_ID = 3;
   protected static final int GENERATOR_BUILD_PROPERTIES_ID = 4;

   protected static final int GENERATOR_UI_PLUGIN_CLASS_ID = 5;
   protected static final int GENERATOR_UI_MANIFEST_MF_ID = 6;
   protected static final int GENERATOR_UI_PLUGIN_XML_ID = 7;
   protected static final int GENERATOR_UI_PLUGIN_PROPERTIES_ID = 8;
   protected static final int GENERATOR_UI_BUILD_PROPERTIES_ID = 9;

   private static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {
      new JETEmitterDescriptor("generator/Plugin.javajet", GENERATOR_TEMPLATES_PACKAGE_NAME + ".Plugin"),
      new JETEmitterDescriptor("generator/manifest.mfjet", GENERATOR_TEMPLATES_PACKAGE_NAME + ".ManifestMF"),
      new JETEmitterDescriptor("generator/plugin.xmljet", GENERATOR_TEMPLATES_PACKAGE_NAME + ".PluginXML"),
      new JETEmitterDescriptor("generator/plugin.propertiesjet", GENERATOR_TEMPLATES_PACKAGE_NAME + ".PluginProperties"),
      new JETEmitterDescriptor("generator/build.propertiesjet", GENERATOR_TEMPLATES_PACKAGE_NAME + ".BuildProperties"),
      new JETEmitterDescriptor("generatorui/Plugin.javajet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME + ".Plugin"),
      new JETEmitterDescriptor("generatorui/manifest.mfjet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME + ".ManifestMF"),
      new JETEmitterDescriptor("generatorui/plugin.xmljet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME + ".PluginXML"),
      new JETEmitterDescriptor("generatorui/plugin.propertiesjet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME
         + ".PluginProperties"),
      new JETEmitterDescriptor("generatorui/build.propertiesjet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME
         + ".BuildProperties")};

   /**
    * Returns the set of <code>JETEmitterDescriptor</code>s used by the adapter. The contents of the returned array
    * should never be changed. Rather, subclasses may override this method to return a different array altogether.
    */
   protected JETEmitterDescriptor[] getJETEmitterDescriptors()
   {
      return JET_EMITTER_DESCRIPTORS;
   }

   public GenModel2GeneratorGeneratorAdapter(GeneratorAdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   @Override
   public Collection<?> getGenerateChildren(Object object, Object projectType)
   {
      return new ArrayList<GenPackage>(((GenModel) object).getGenPackages());
   }

   @Override
   protected Diagnostic doGenerate(Object object, Object projectType, Monitor monitor) throws Exception
   {
      monitor.beginTask("", 20);
      GenModel2 genModel = (GenModel2) object;
      doGenerate(genModel, createMonitor(monitor, 10));
      doGenerateUI(genModel, createMonitor(monitor, 10));
      monitor.done();
      return Diagnostic.OK_INSTANCE;
   }

   protected void doGenerate(GenModel2 genModel, Monitor monitor)
   {
      monitor.beginTask("", 6);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPackages_message");
      monitor.subTask(message);

      ensureProjectExists(genModel.getGeneratorDirectory(), genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
         genModel.isUpdateClasspath(), createMonitor(monitor, 1));

      generateGeneratorPluginClass(genModel, monitor);
      generateGeneratorPluginProperties(genModel, monitor);
      generateGeneratorBuildProperties(genModel, monitor);
      generateGeneratorManifest(genModel, monitor);

      monitor.done();
   }

   protected void doGenerateUI(GenModel2 genModel, Monitor monitor)
   {
      monitor.beginTask("", 6);

      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPackages_message");
      monitor.subTask(message);

      ensureProjectExists(genModel.getGeneratorUIDirectory(), genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
         genModel.isUpdateClasspath(), createMonitor(monitor, 1));

      generateGeneratorUIPluginClass(genModel, monitor);
      generateGeneratorUIPluginProperties(genModel, monitor);
      generateGeneratorUIBuildProperties(genModel, monitor);
      generateGeneratorUIManifest(genModel, monitor);

      monitor.done();
   }

   protected void generateGeneratorPluginClass(GenModel2 genModel, Monitor monitor)
   {
      if (!genModel.sameGeneratorEditorProject())
      {
         message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingJavaClass_message",
            new Object[] {genModel.getQualifiedEditPluginClassName()});
         monitor.subTask(message);
         generateJava(genModel.getGeneratorPluginDirectory(), genModel.getGeneratorPluginPackageName(),
            genModel.getGeneratorPluginClassName(),
            getJETEmitter(getJETEmitterDescriptors(), GENERATOR_PLUGIN_CLASS_ID), null, createMonitor(monitor, 1));
      }
      else
      {
         monitor.worked(1);
      }
   }

   protected void generateGeneratorUIPluginClass(GenModel2 genModel, Monitor monitor)
   {
      if (!genModel.sameGeneratorEditorProject())
      {
         message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingJavaClass_message",
            new Object[] {genModel.getQualifiedEditPluginClassName()});
         monitor.subTask(message);
         generateJava(genModel.getGeneratorUIPluginDirectory(), genModel.getGeneratorUIPluginPackageName(),
            genModel.getGeneratorUIPluginClassName(),
            getJETEmitter(getJETEmitterDescriptors(), GENERATOR_UI_PLUGIN_CLASS_ID), null, createMonitor(monitor, 1));
      }
      else
      {
         monitor.worked(1);
      }
   }

   protected void generateGeneratorManifest(GenModel2 genModel, Monitor monitor)
   {
      if (!genModel.sameGeneratorEditorProject())
      {
         if (genModel.isBundleManifest())
         {
            message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditManifestMF_message");
            monitor.subTask(message);

            // Do allow an existing MANIFEST.MF to be overwritten, since it
            // may have been created as part of an empty EMF project.
            // Use the existence of a plugin.xml as a guard against
            // overwriting in a project that has already been generated.
            //
            generateText(genModel.getGeneratorProjectDirectory() + "/META-INF/MANIFEST.MF",
               getJETEmitter(getJETEmitterDescriptors(), GENERATOR_MANIFEST_MF_ID), null, genModel.isUpdateClasspath()
                  && !exists(toURI(genModel.getGeneratorProjectDirectory()).appendSegment("plugin.xml")),
               MANIFEST_ENCODING, createMonitor(monitor, 1));
         }
         else
         {
            monitor.worked(1);
         }

         if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT)
         {
            message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPluginXML_message");
            monitor.subTask(message);
            generateText(genModel.getGeneratorProjectDirectory() + "/plugin.xml",
               getJETEmitter(getJETEmitterDescriptors(), GENERATOR_PLUGIN_XML_ID), null, false, MANIFEST_ENCODING,
               createMonitor(monitor, 1));
         }
         else
         {
            monitor.worked(1);
         }
      }
      else
      {
         monitor.worked(2);
      }
   }

   protected void generateGeneratorUIManifest(GenModel2 genModel, Monitor monitor)
   {
      if (!genModel.sameGeneratorUIEditorProject())
      {
         if (genModel.isBundleManifest())
         {
            message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditManifestMF_message");
            monitor.subTask(message);

            // Do allow an existing MANIFEST.MF to be overwritten, since it
            // may have been created as part of an empty EMF project.
            // Use the existence of a plugin.xml as a guard against
            // overwriting in a project that has already been generated.
            //
            generateText(
               genModel.getGeneratorUIProjectDirectory() + "/META-INF/MANIFEST.MF",
               getJETEmitter(getJETEmitterDescriptors(), GENERATOR_UI_MANIFEST_MF_ID),
               null,
               genModel.isUpdateClasspath()
                  && !exists(toURI(genModel.getGeneratorUIProjectDirectory()).appendSegment("plugin.xml")),
               MANIFEST_ENCODING, createMonitor(monitor, 1));
         }
         else
         {
            monitor.worked(1);
         }

         if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT)
         {
            message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPluginXML_message");
            monitor.subTask(message);
            generateText(genModel.getGeneratorUIProjectDirectory() + "/plugin.xml",
               getJETEmitter(getJETEmitterDescriptors(), GENERATOR_UI_PLUGIN_XML_ID), null, false, MANIFEST_ENCODING,
               createMonitor(monitor, 1));
         }
         else
         {
            monitor.worked(1);
         }
      }
      else
      {
         monitor.worked(2);
      }
   }

   protected void generateGeneratorPluginProperties(GenModel2 genModel, Monitor monitor)
   {
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPluginProperties_message");
      monitor.subTask(message);
      generateProperties(genModel.getGeneratorProjectDirectory() + "/plugin.properties",
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_PLUGIN_PROPERTIES_ID), null, createMonitor(monitor, 1));
   }

   protected void generateGeneratorUIPluginProperties(GenModel2 genModel, Monitor monitor)
   {
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditPluginProperties_message");
      monitor.subTask(message);
      generateProperties(genModel.getGeneratorUIProjectDirectory() + "/plugin.properties",
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_UI_PLUGIN_PROPERTIES_ID), null, createMonitor(monitor, 1));
   }

   protected void generateGeneratorBuildProperties(GenModel2 genModel, Monitor monitor)
   {
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditBuildProperties_message");
      monitor.subTask(message);

      // Do allow an existing build.properties to be overwritten, since it may
      // have been created as part of an empty EMF project.
      // Use the existence of a plugin.xml as a guard against overwriting in a
      // project that has already been generated.
      //
      generateText(genModel.getGeneratorProjectDirectory() + "/build.properties",
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_BUILD_PROPERTIES_ID), null, genModel.isUpdateClasspath()
            && !exists(toURI(genModel.getGeneratorProjectDirectory()).appendSegment("plugin.xml")),
         PROPERTIES_ENCODING, createMonitor(monitor, 1));
   }

   protected void generateGeneratorUIBuildProperties(GenModel2 genModel, Monitor monitor)
   {
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingEditBuildProperties_message");
      monitor.subTask(message);

      // Do allow an existing build.properties to be overwritten, since it may
      // have been created as part of an empty EMF project.
      // Use the existence of a plugin.xml as a guard against overwriting in a
      // project that has already been generated.
      //
      generateText(
         genModel.getGeneratorUIProjectDirectory() + "/build.properties",
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_UI_BUILD_PROPERTIES_ID),
         null,
         genModel.isUpdateClasspath()
            && !exists(toURI(genModel.getGeneratorUIProjectDirectory()).appendSegment("plugin.xml")),
         PROPERTIES_ENCODING, createMonitor(monitor, 1));
   }
}
