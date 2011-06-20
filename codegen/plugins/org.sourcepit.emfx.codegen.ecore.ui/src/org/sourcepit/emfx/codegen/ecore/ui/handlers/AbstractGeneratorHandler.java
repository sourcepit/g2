
package org.sourcepit.emfx.codegen.ecore.ui.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.sourcepit.emfx.codegen.ecore.genmodel2.util.GeneratorUtil;
import org.sourcepit.emfx.codegen.ecore.ui.GenModel2UiPlugin;

public abstract class AbstractGeneratorHandler extends AbstractHandler
{

   public AbstractGeneratorHandler()
   {
      super();
   }

   @Override
   public void setEnabled(Object evaluationContext)
   {
      super.setEnabled(evaluationContext);
   }

   public Object execute(ExecutionEvent event) throws ExecutionException
   {
      final List<Object> generatorInput = getGeneratorInput(event);
      if (!generatorInput.isEmpty())
      {
         final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
         List<Object> projectTypes = getProjectTypes(event, generatorInput);
         generate(window, generatorInput, projectTypes);
      }

      return null;
   }

   protected abstract List<Object> getProjectTypes(ExecutionEvent event, List<Object> generatorInput);

   protected List<Object> getGeneratorInput(ExecutionEvent event) throws ExecutionException
   {
      final List<Object> generatorInput = new ArrayList<Object>();
      collectGeneratorInput(event, generatorInput);
      return generatorInput;
   }

   protected void collectGeneratorInput(ExecutionEvent event, final List<Object> generatorInput)
      throws ExecutionException
   {
      final ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
      if (selection instanceof IStructuredSelection)
      {
         final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
         for (Object selected : structuredSelection.toList())
         {
            if (isGeneratorInput(selected))
            {
               generatorInput.add(selected);
            }
         }
      }
   }

   protected abstract boolean isGeneratorInput(Object selected);

   protected void generate(IWorkbenchWindow window, final List<Object> generatorInput, final List<Object> projectTypes)
   {
      final ProgressMonitorDialog dialog = new ProgressMonitorDialog(window.getShell());
      try
      {
         dialog.run(false, true, new IRunnableWithProgress()
         {
            public void run(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException
            {
               generate(generatorInput, projectTypes, progressMonitor);
            }
         });
      }
      catch (InvocationTargetException e)
      {
         throw new IllegalStateException(e);
      }
      catch (InterruptedException e)
      {
         GenModel2UiPlugin.INSTANCE.log(e);
      }
   }

   protected void generate(final List<Object> generatorInput, List<Object> projectTypes,
      IProgressMonitor progressMonitor)
   {
      progressMonitor.beginTask("", generatorInput.size() * projectTypes.size() * 10);
      try
      {
         for (Object projectType : projectTypes)
         {
            for (Object input : generatorInput)
            {
               if (shouldGenerate(input, projectType))
               {
                  Generator generator = GeneratorUtil.createGenerator(input);
                  Monitor monitor = CodeGenUtil.EclipseUtil.createMonitor(progressMonitor, 10);
                  generator.generate(input, projectType, monitor);
               }
               else
               {
                  progressMonitor.worked(10);
               }
            }
         }
      }
      finally
      {
         progressMonitor.done();
      }
   }

   protected boolean shouldGenerate(Object input, Object projectType)
   {
      return true;
   }

}