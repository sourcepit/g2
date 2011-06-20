
package org.sourcepit.emfx.importer.ecore.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.importer.ImporterPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class ModelURIPage extends AbstractModelURIPage
{

   protected Button loadButton;

   protected String[] filterExtensions;

   protected List<String> fileExtensions = new ArrayList<String>();

   protected EPackageModelConverter converter;

   public ModelURIPage(EPackageModelConverter converter, String pageName)
   {
      super(pageName);
      fileExtensions.add("ecore");

      this.converter = converter;
   }

   @Override
   public void dispose()
   {
      if (loadButton != null)
      {
         loadButton.removeListener(SWT.Selection, this);
         loadButton = null;
      }
      super.dispose();
   }

   @Override
   protected String getURITextInitialValue()
   {
      // TODO bernd return initial uri
      return "";
   }

   @Override
   protected void addControl(Composite parent)
   {
      addDetailControl(parent);
      adjustLoadButton();
   }

   protected void addDetailControl(Composite parent)
   {
      // Subclasses may override
   }

   @Override
   protected void addURIControl(Composite parent)
   {
      loadButton = new Button(parent, SWT.PUSH);
      loadButton.setText(ImporterPlugin.INSTANCE.getString("_UI_Load_label"));
      loadButton.setLayoutData(new GridData(GridData.END));
      loadButton.addListener(SWT.Selection, this);
   }

   protected void createGenModelNameControl(Composite parent)
   {
      Label genModelNameLabel = new Label(parent, SWT.LEFT);
      genModelNameLabel.setText(ImporterPlugin.INSTANCE.getString("_UI_GeneratorModelName_label"));
   }

   @Override
   protected void doHandleEvent(Event event)
   {
      if (event.type == SWT.Selection && event.widget == loadButton)
      {
         refreshModel();
         getContainer().updateButtons();
      }
      else
      {
         super.doHandleEvent(event);
      }
   }

   @Override
   protected void uriTextModified(String text)
   {
      super.uriTextModified(text);
      // TODO bernd ???
      // getModelImporter().setModelLocation(null);
      // getModelImporter().clearEPackagesCollections();
      // converter.setModelLocation(null);
      adjustLoadButton();
   }

   protected void adjustLoadButton()
   {
      if (loadButton != null)
      {
         String text = uriText.getText();
         loadButton.setEnabled(text != null && text.trim().length() > 0);
      }
   }

   @Override
   protected String getURITextLabel()
   {
      return supportMultipleURIs() ? ImporterPlugin.INSTANCE.getString("_UI_ModelURIs_label") : ImporterPlugin.INSTANCE
         .getString("_UI_ModelURI_label");
   }

   protected String getSelectModelLabel()
   {
      return ImporterPlugin.INSTANCE.getString("_UI_SelectModel_label");
   }

   @Override
   protected boolean supportMultipleURIs()
   {
      return true;
   }

   protected String[] getFilterExtensions()
   {
      if (filterExtensions == null)
      {
         // List<String> fileExtensions = getModelImporter()
         // .getFileExtensions();

         // TODO bernd must be configurable
         // List<String> fileExtensions = new ArrayList<String>();
         // fileExtensions.add("ecore");

         if (fileExtensions.isEmpty())
         {
            filterExtensions = new String[] {"*.*"};
         }
         else if (fileExtensions.size() == 1)
         {
            filterExtensions = new String[] {"*." + fileExtensions.get(0)};
         }
         else
         {
            StringBuffer allFilterExtensions = new StringBuffer();
            String[] extensions = new String[fileExtensions.size() + 1];
            for (int i = 1, lenght = extensions.length; i < lenght; i++)
            {
               extensions[i] = "*." + fileExtensions.get(i - 1);
               allFilterExtensions.append(";").append(extensions[i]);
            }
            allFilterExtensions.deleteCharAt(0);
            extensions[0] = allFilterExtensions.toString();
            filterExtensions = extensions;
         }
      }
      return filterExtensions;
   }

   protected boolean isValidWorkspaceResource(IResource resource)
   {
      if (resource.getType() == IResource.FILE)
      {
         String[] filterExtensions = getFilterExtensions();
         if (filterExtensions.length > 0)
         {
            for (int i = 0; i < filterExtensions.length; i++)
            {
               if (filterExtensions[i].endsWith(".*")
                  || filterExtensions[i].endsWith("." + resource.getFileExtension()))
               {
                  return true;
               }
            }
         }

      }
      return false;
   }

   @Override
   protected boolean browseFileSystem()
   {
      FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN | (supportMultipleURIs() ? SWT.MULTI : SWT.SINGLE));
      fileDialog.setFilterExtensions(getFilterExtensions());
      // TODO bernd
      // URI modelURI = getModelImporter().getFirstModelLocationURI(true);
      // if (modelURI != null) {
      // fileDialog.setFileName(modelURI.toFileString());
      // }

      if (fileDialog.open() != null && fileDialog.getFileNames().length > 0)
      {
         String[] fileNames = fileDialog.getFileNames();
         StringBuffer text = new StringBuffer();
         for (int i = 0; i < fileNames.length; ++i)
         {
            String filePath = fileDialog.getFilterPath() + File.separator + fileNames[i];
            text.append(URI.createFileURI(filePath).toString());
            text.append(" ");
         }
         setURIText(text.toString());
         refreshModel();
         return true;
      }
      return false;
   }

   @Override
   protected boolean browseWorkspace()
   {
      ViewerFilter extensionFilter = null;
      if (!fileExtensions.isEmpty())
      {
         extensionFilter = new ViewerFilter()
         {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element)
            {
               return !(element instanceof IFile) || fileExtensions.contains(((IFile) element).getFileExtension());
            }
         };
      }

      IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, supportMultipleURIs(), null,
         extensionFilter == null ? null : Collections.singletonList(extensionFilter));
      if (files.length > 0)
      {
         StringBuffer text = new StringBuffer();
         for (int i = 0; i < files.length; ++i)
         {
            if (isValidWorkspaceResource(files[i]))
            {
               text.append(URI.createPlatformResourceURI(files[i].getFullPath().toString(), true));
               text.append("  ");
            }
         }
         setURIText(text.toString());
         refreshModel();
         return true;
      }
      return false;
   }

   protected void refreshModel()
   {
      WorkspaceModifyOperation initializeOperation = new WorkspaceModifyOperation()
      {
         @Override
         protected void execute(IProgressMonitor progressMonitor) throws CoreException
         {
            Diagnostic errorDiagnostic = null;
            setErrorMessage(null);
            setMessage(null);

            Monitor monitor = BasicMonitor.toMonitor(progressMonitor);
            try
            {
               refreshModel(monitor);
            }
            catch (Exception exception)
            {
               ImporterPlugin.INSTANCE.log(exception);
               errorDiagnostic = ConverterUtil.createErrorDiagnostic(exception, true);
            }
            finally
            {
               monitor.done();
            }

            if (errorDiagnostic != null)
            {
               handleDiagnostic(errorDiagnostic, errorDiagnostic.getMessage(),
                  ImporterPlugin.INSTANCE.getString("_UI_LoadProblem_title"),
                  ImporterPlugin.INSTANCE.getString("_UI_ProblemsEncounteredProcessing_message"));
            }
         }
      };

      // getModelImporter().setModelLocation(uriText.getText());
      // converter.setModelLocation(uriText.getText());

      try
      {
         getContainer().run(false, false, initializeOperation);
      }
      catch (Exception exception)
      {
         ImporterPlugin.INSTANCE.log(exception);
      }

      if (isPageComplete())
      {
         setPageComplete(true);
      }
      else
      {
         setPageComplete(false);
         uriText.selectAll();
         uriText.setFocus();
      }
   }

   @Override
   public boolean isPageComplete()
   {
      // TODO bernd
      return true;
      // return super.isPageComplete()
      // && !getModelImporter().getEPackages().isEmpty()
      // && !getModelImporter().getModelLocationURIs().isEmpty();
   }

   protected void refreshModel(Monitor monitor) throws Exception
   {
      // TODO bernd
      Diagnostic diagnostic = null;
      try
      {
         // diagnostic = getModelImporter().computeEPackages(monitor);
         // getModelImporter().adjustEPackages(monitor);

         diagnostic = converter.computeRootEObjects(monitor);
         converter.convert();

      }
      catch (WrappedException wrappedException)
      {
         if (wrappedException.exception() instanceof FileNotFoundException)
         {
            setMessage(null);
            setErrorMessage(ImporterPlugin.INSTANCE.getString("_UI_SpecifyAValidModel_message"));
            return;
         }
         else
         {
            throw wrappedException.exception();
         }
      }

      // Diagnostic nameDiagnostic =
      // getModelImporter().checkGenModelFileName();
      Diagnostic nameDiagnostic = checkGenModelFileName();
      if (nameDiagnostic.getSeverity() != Diagnostic.OK)
      {
         if (diagnostic.getSeverity() == Diagnostic.OK)
         {
            diagnostic = nameDiagnostic;
         }
         else
         {
            diagnostic = ConverterUtil.mergeDiagnostic(diagnostic, nameDiagnostic);
         }
      }

      handleDiagnostic(diagnostic);
   }

   protected Diagnostic checkGenModelFileName()
   {
      // TODO bernd
      return Diagnostic.OK_INSTANCE;
   }

   protected String getDefaultGenModelFileName()
   {
      // TODO bernd
      // return getModelImporter().computeDefaultGenModelFileName();
      return "MyGenModel";
   }
}
