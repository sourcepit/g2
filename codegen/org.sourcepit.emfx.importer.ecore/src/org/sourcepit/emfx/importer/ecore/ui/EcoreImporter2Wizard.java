
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.importer.ecore.ui.EcoreImporterWizard;
import org.sourcepit.emfx.importer.ecore.EcoreImporter2;

public class EcoreImporter2Wizard extends EcoreImporterWizard
{
   @Override
   protected ModelConverter createModelConverter()
   {
      return new EcoreImporter2();
   }
}
