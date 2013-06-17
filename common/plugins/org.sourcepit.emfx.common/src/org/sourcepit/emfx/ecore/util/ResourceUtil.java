
package org.sourcepit.emfx.ecore.util;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;

public final class ResourceUtil
{
   public interface IResourceChecker
   {
      void check(Resource resource) throws DiagnosticException;
   }

   public static Diagnostic demandLoadResources(final ResourceSet resourceSet, Collection<URI> uris)
   {
      return demandLoadResources(resourceSet, uris, null);
   }

   public static Diagnostic demandLoadResources(final ResourceSet resourceSet, Collection<URI> uris,
      IResourceChecker checker)
   {
      final BasicDiagnostic diagnosticChain = new BasicDiagnostic("org.sourcepit.emfx.importer.ecore", 0,
         "Resource Loading failed.", null);
      for (URI uri : uris)
      {
         try
         {
            getResource(resourceSet, uri, checker);
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
      return getResource(resourceSet, uri, null);
   }

   public static Resource getResource(ResourceSet resourceSet, URI uri, IResourceChecker checker)
      throws DiagnosticException
   {
      try
      {
         final Resource resource = resourceSet.getResource(uri.trimFragment().trimQuery(), true);
         if (checker != null)
         {
            try
            {
               checker.check(resource);
            }
            catch (DiagnosticException e)
            {
               resourceSet.getResources().remove(resource);
               throw e;
            }
         }
         return resource;
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
               BasicDiagnostic resourceDiagnostic = new BasicDiagnostic(ICommonConstants.COMMON_PLUGIN_ID, 0, NLS.bind(
                  "Problems occurred while loading resource. ({0})", uri.toString()), null);
               resourceDiagnostic.addAll(diagnostic);
               resourceSet.getResources().remove(resource);
               throw new DiagnosticException(resourceDiagnostic);
            }
         }
      }
   }
}
