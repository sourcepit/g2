
package org.sourcepit.emfx.importer.ecore;

import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2Factory;

public class EcoreImporter2 extends EcoreImporter
{
   @Override
   public String getID()
   {
      return "org.sourcepit.emfx.importer.ecore";
   }

   @Override
   public GenModel2 getGenModel()
   {
      if (genModel == null)
      {
         genModel = getOriginalGenModel() == null
            ? GenModel2Factory.eINSTANCE.createGenModel2()
            : getOriginalGenModel().createGenModel();
         genModel.setImporterID(getID());
      }
      return (GenModel2) genModel;
   }

   @Override
   public GenModel2 getOriginalGenModel()
   {
      return (GenModel2) super.getOriginalGenModel();
   }
}
