
package org.sourcepit.emfx.codegen.ecore.genmodel2.generator;

import java.util.List;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.sourcepit.emfx.codegen.ecore.CodeGen2EcorePlugin;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;

public abstract class BaseGeneratorGeneratorAdapter extends AbstractGeneratorAdapter
{
   protected static final String GENERATOR_TEMPLATES_PACKAGE_NAME = "org.sourcepit.emfx.codegen.ecore.templates.generator";
   protected static final String GENERATOR_UI_TEMPLATES_PACKAGE_NAME = GENERATOR_TEMPLATES_PACKAGE_NAME + ".ui";
   /**
    * The project type constant representing a generator project. This is the string
    * "org.eclipse.emf.codegen.ecore.genmodel.generator.ModelProject".
    */
   public static final String GENERATOR_PROJECT_TYPE = "org.sourcepit.emfx.ecore.genmodel.generator.GeneratorProject";

   public BaseGeneratorGeneratorAdapter(GeneratorAdapterFactory adapterFactory)
   {
      super(adapterFactory);
   }

   @Override
   public boolean canGenerate(Object object, Object projectType)
   {
      if (GENERATOR_PROJECT_TYPE.equals(projectType))
      {
         return canGenerateGenerator(object);
      }
      return false;
   }

   protected boolean canGenerateGenerator(Object object)
   {
      return ((GenBase2) object).canGenerateGenerator();
   }

   @Override
   protected void addBaseTemplatePathEntries(List<String> templatePath)
   {
      templatePath.add(CodeGenEcorePlugin.INSTANCE.getBaseURL().toString() + "templates");
      templatePath.add(CodeGen2EcorePlugin.INSTANCE.getBaseURL().toString() + "templates");
      super.addBaseTemplatePathEntries(templatePath);
   }

   @Override
   protected void addClasspathEntries(JETEmitter jetEmitter) throws JETException
   {
      jetEmitter.addVariable("EMF_CODEGEN", "org.eclipse.emf.codegen");
      jetEmitter.addVariable("EMF_CODEGEN_ECORE", "org.eclipse.emf.codegen.ecore");
      jetEmitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
      jetEmitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");

      jetEmitter.addVariable("EMF_EXT_ECORE", "org.sourcepit.emfx.codegen.ecore");
      super.addClasspathEntries(jetEmitter);
   }

   /**
    * Creates the import manager and stores it on the <code>GenModel2</code>, for use its in computing names.
    */
   @Override
   protected void createImportManager(String packageName, String className)
   {
      super.createImportManager(packageName, className);
      updateImportManager();
   }

   /**
    * Clears the import manager and removes it from the <code>GenModel2</code>.
    */
   @Override
   protected void clearImportManager()
   {
      super.clearImportManager();
      updateImportManager();
   }

   private void updateImportManager()
   {
      if (generatingObject != null)
      {
         ((GenBase) generatingObject).getGenModel().setImportManager(importManager);
      }
   }

   @Override
   protected void setLineDelimiter(String lineDelimiter)
   {
      super.setLineDelimiter(lineDelimiter);
      if (generatingObject != null)
      {
         ((GenBase) generatingObject).getGenModel().setLineDelimiter(lineDelimiter);
      }
   }
}
