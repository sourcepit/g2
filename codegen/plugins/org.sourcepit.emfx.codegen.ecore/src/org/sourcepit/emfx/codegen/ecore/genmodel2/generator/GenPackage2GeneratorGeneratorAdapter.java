/*
 * Copyright (c) Tim Baumgartner, 2009
 */

package org.sourcepit.emfx.codegen.ecore.genmodel2.generator;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

public class GenPackage2GeneratorGeneratorAdapter extends BaseGeneratorGeneratorAdapter
{
   protected static final int GENERATOR_ADAPTER_FACTORY_ID = 0;
   protected static final int BASE_GENERATOR_ADAPTER_ID = 1;
   protected static final int GENERATOR_HANDLER_ADAPTER_ID = 2;

   protected static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {
      new JETEmitterDescriptor("generator/GeneratorAdapterFactory.javajet", GENERATOR_TEMPLATES_PACKAGE_NAME
         + ".GeneratorAdapterFactory"),
      new JETEmitterDescriptor("generator/BaseGeneratorAdapter.javajet", GENERATOR_TEMPLATES_PACKAGE_NAME
         + ".BaseGeneratorAdapter"),
      new JETEmitterDescriptor("generatorui/GeneratorHandler.javajet", GENERATOR_UI_TEMPLATES_PACKAGE_NAME
         + ".GeneratorHandler")};

   protected static final int GENERATE_ICON_ID = 0;

   private static final String[] INPUT_PATH_NAMES = {"generatorui/Generate.gif"};

   public GenPackage2GeneratorGeneratorAdapter(GeneratorAdapterFactory generatorAdapterFactory)
   {
      super(generatorAdapterFactory);
   }

   protected JETEmitterDescriptor[] getJETEmitterDescriptors()
   {
      return JET_EMITTER_DESCRIPTORS;
   }

   @Override
   public Object getCanGenerateParent(Object object, Object projectType)
   {
      return ((GenPackage) object).getGenModel();
   }

   @Override
   public Collection<?> getGenerateChildren(Object object, Object projectType)
   {
      return new ArrayList<GenClass>(((GenPackage) object).getGenClasses());
   }

   @Override
   protected Diagnostic doGenerate(Object object, Object projectType, Monitor monitor) throws Exception
   {
      GenPackage2 genPackage = (GenPackage2) object;

      monitor.beginTask("", 4);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingPackage_message",
         new Object[] {genPackage.getBasicPackageName()});
      monitor.subTask(message);

      GenModel2 genModel = genPackage.getGenModel();
      String codeGenDirectory = genModel.getGeneratorDirectory();
      ensureProjectExists(codeGenDirectory, genPackage, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
         genModel.isUpdateClasspath(), createMonitor(monitor, 1));
      generateGeneratorAdapterFactory(genPackage, createMonitor(monitor, 1));
      generateBaseGeneratorAdapter(genPackage, createMonitor(monitor, 1));
      generateGenerateAction(genPackage, createMonitor(monitor, 1));

      monitor.done();
      return Diagnostic.OK_INSTANCE;
   }

   protected void generateGeneratorAdapterFactory(GenPackage2 genPackage, Monitor monitor)
   {
      monitor.beginTask("", 1);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingPackage_message",
         new Object[] {genPackage.getBasicPackageName()});
      monitor.subTask(message);

      GenModel2 genModel = genPackage.getGenModel();
      String codeGenDirectory = genModel.getGeneratorDirectory();
      generateJava(codeGenDirectory, genPackage.getGeneratorPackageName(),
         genPackage.getGeneratorAdapterFactoryClassName(),
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_ADAPTER_FACTORY_ID), null, createMonitor(monitor, 1));
      monitor.done();
   }

   protected void generateBaseGeneratorAdapter(GenPackage2 genPackage, Monitor monitor)
   {
      monitor.beginTask("", 1);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingPackage_message",
         new Object[] {genPackage.getBasicPackageName()});
      monitor.subTask(message);

      GenModel2 genModel = genPackage.getGenModel();
      String codeGenDirectory = genModel.getGeneratorDirectory();
      generateJava(codeGenDirectory, genPackage.getGeneratorPackageName(),
         genPackage.getGeneratorAdapterBaseClassName(),
         getJETEmitter(getJETEmitterDescriptors(), BASE_GENERATOR_ADAPTER_ID), null, createMonitor(monitor, 1));
      monitor.done();
   }

   protected void generateGenerateAction(GenPackage2 genPackage, Monitor monitor)
   {
      monitor.beginTask("", 20);

      GenModel2 genModel = genPackage.getGenModel();
      String codeGenUIDirectory = genModel.getGeneratorUIDirectory();

      generateJava(codeGenUIDirectory, genPackage.getGeneratorHandlerPackageName(),
         genPackage.getGeneratorHandlerClassName(),
         getJETEmitter(getJETEmitterDescriptors(), GENERATOR_HANDLER_ADAPTER_ID), null, createMonitor(monitor, 10));

      generateGIF(genPackage.getGenerateIconFullPath(), getGIFEmitter(INPUT_PATH_NAMES, GENERATE_ICON_ID),
         genPackage.getPrefix(), null, false, createMonitor(monitor, 10));
      monitor.done();
   }
}
