
package org.sourcepit.emfx.importer.ecore.ui;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.sourcepit.emfx.importer.ecore.EcoreImporter2Plugin;

public final class ResourceUtil
{

   public static Diagnostic demandLoadResources(final ResourceSet resourceSet, Collection<URI> uris)
   {
      final BasicDiagnostic diagnosticChain = new BasicDiagnostic("org.sourcepit.emfx.importer.ecore", 0,
         "Resource Loading failed.", null);
      for (URI uri : uris)
      {
         try
         {
            getResource(resourceSet, uri);
         }
         catch (DiagnosticException e)
         {
            diagnosticChain.add(e.getDiagnostic());
         }
      }
      return diagnosticChain;
   }

   public static Resource getResource(ResourceSet resourceSet, URI uri) throws DiagnosticException
   {
      try
      {
         return resourceSet.getResource(uri.trimFragment().trimQuery(), true);
      }
      catch (Exception e)
      {
         throw new DiagnosticException(BasicDiagnostic.toDiagnostic(e));
      }
      finally
      {
         final Resource resource = resourceSet.getResource(uri, false);
         if (resource != null)
         {
            final Diagnostic diagnostic = EcoreUtil.computeDiagnostic(resource, false);
            if (diagnostic.getSeverity() == Diagnostic.ERROR)
            {
               BasicDiagnostic resourceDiagnostic = new BasicDiagnostic(EcoreImporter2Plugin.ID, 0, NLS.bind(
                  "Problems occurred while loading resource. ({0})", uri.toString()), null);
               resourceDiagnostic.addAll(diagnostic);
               resourceSet.getResources().remove(resource);
               throw new DiagnosticException(resourceDiagnostic);
            }
         }
      }
   }
}
