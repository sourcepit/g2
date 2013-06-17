
package org.sourcepit.emfx.codegen.ecore.genmodel2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GenModel2Test
{
   protected static final String MODEL_PATH = "/modelPath/src";
   protected static final String MODEL_ID = "modelId";
   protected GenModel2 genModel;

   @Before
   public void setUp()
   {
      genModel = GenModel2Factory.eINSTANCE.createGenModel2();
      genModel.setModelName("modelName");
      genModel.setModelDirectory(MODEL_PATH);
      assertEquals("/modelPath/src", genModel.getModelDirectory());
      assertNull(genModel.getGeneratorPluginID());
      genModel.setModelPluginID(MODEL_ID);
   }

   @Test
   public void testGenerator_Default() throws Exception
   {
      assertDefault();
   }

   @Test
   public void testGenerator_SameEditEditor() throws Exception
   {

      genModel.setEditDirectory("/modelPath.editor/src");
      assertTrue(genModel.sameEditEditorProject());
      // assure editor id is edit id
      assertEquals("modelId.edit", genModel.getEditPluginID());
      assertEquals(genModel.getEditPluginID(), genModel.getEditorPluginID());

      assertFalse(genModel.sameGeneratorModelProject());
      assertFalse(genModel.sameGeneratorEditProject());
      assertFalse(genModel.sameGeneratorEditorProject());
      assertFalse(genModel.sameGeneratorTestsProject());

      assertDefault();
   }

   protected void assertDefault()
   {
      assertFalse(genModel.sameGeneratorModelProject());
      assertFalse(genModel.sameGeneratorEditProject());
      assertFalse(genModel.sameGeneratorEditorProject());
      assertFalse(genModel.sameGeneratorTestsProject());

      // test own directory
      assertEquals("/modelPath.generator/src", genModel.getGeneratorDirectory());

      // test own id
      assertEquals(MODEL_ID + "." + GenModel2.DEFAULT_GENERATOR_SUFFIX, genModel.getGeneratorPluginID());

      assertEquals("modelNameGeneratorPlugin", genModel.getGeneratorPluginClassName());
   }
}
