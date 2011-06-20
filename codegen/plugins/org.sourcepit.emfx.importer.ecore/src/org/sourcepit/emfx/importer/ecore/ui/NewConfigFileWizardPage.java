
package org.sourcepit.emfx.importer.ecore.ui;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewConfigFileWizardPage extends WizardNewFileCreationPage
{

   public NewConfigFileWizardPage(IStructuredSelection selection)
   {
      super("NewConfigFileWizardPage", selection);
      setTitle("Config File");
      setDescription("Creates a new Config File");
      setFileExtension("ecore");
   }

   @Override
   protected InputStream getInitialContents()
   {
      return null;
   }
}