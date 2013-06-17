
package org.sourcepit.emfx.codegen.ecore.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenBase2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.generator.BaseGeneratorGeneratorAdapter;

public class GenerateGeneratorHandler extends AbstractGeneratorHandler
{

   @Override
   protected boolean isGeneratorInput(Object selected)
   {
      return selected instanceof GenBase2;
   }

   protected List<Object> getProjectTypes(ExecutionEvent event, List<Object> generatorInput)
   {
      List<Object> projectTypes = new ArrayList<Object>();
      projectTypes.add(BaseGeneratorGeneratorAdapter.GENERATOR_PROJECT_TYPE);
      return projectTypes;
   }
}
