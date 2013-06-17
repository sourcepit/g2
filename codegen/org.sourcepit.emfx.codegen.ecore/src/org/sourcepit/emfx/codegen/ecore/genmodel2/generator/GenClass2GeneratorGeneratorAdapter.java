
package org.sourcepit.emfx.codegen.ecore.genmodel2.generator;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;

public class GenClass2GeneratorGeneratorAdapter extends BaseGeneratorGeneratorAdapter
{

   protected static final int CLASS_GENERATOR_ADAPTER_ID = 0;

   protected static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {new JETEmitterDescriptor(
      "generator/ClassGeneratorAdapter.javajet",
      "org.sourcepit.emfx.codegen.ecore.templates.generator.ClassGeneratorAdapter")};

   public GenClass2GeneratorGeneratorAdapter(GeneratorAdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   protected JETEmitterDescriptor[] getJETEmitterDescriptors()
   {
      return JET_EMITTER_DESCRIPTORS;
   }

   @Override
   public Object getCanGenerateParent(Object object, Object projectType)
   {
      return ((GenClass) object).getGenPackage();
   }

   @Override
   protected Diagnostic doGenerate(Object object, Object projectType, Monitor monitor) throws Exception
   {
      GenClass2 genClass = (GenClass2) object;

      monitor.beginTask("", 2);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingPackage_message",
         new Object[] {genClass.getGeneratorAdapterClassName()});
      monitor.subTask(message);

      GenModel2 genModel = genClass.getGenModel();
      String codeGenDirectory = genModel.getGeneratorDirectory();
      ensureProjectExists(codeGenDirectory, genClass, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
         genModel.isUpdateClasspath(), createMonitor(monitor, 1));

      generateClassGeneratorAdapter(genClass, createMonitor(monitor, 1));

      monitor.done();
      return Diagnostic.OK_INSTANCE;
   }

   protected void generateClassGeneratorAdapter(GenClass2 genClass, Monitor monitor)
   {
      monitor.beginTask("", 1);
      message = CodeGenEcorePlugin.INSTANCE.getString("_UI_GeneratingPackage_message",
         new Object[] {genClass.getGeneratorAdapterClassName()});
      monitor.subTask(message);

      GenModel2 genModel = genClass.getGenModel();
      GenPackage2 genPackage = genClass.getGenPackage();
      String codeGenDirectory = genModel.getGeneratorDirectory();
      generateJava(codeGenDirectory, genPackage.getGeneratorPackageName(), genClass.getGeneratorAdapterClassName(),
         getJETEmitter(getJETEmitterDescriptors(), CLASS_GENERATOR_ADAPTER_ID), null, createMonitor(monitor, 1));
      monitor.done();
   }

}
