/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import static org.sourcepit.g2.derivation.ResourceStatus.toResourceStatus;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class ResourceStatusRecorder extends ResourceDiagnosticsObserver
{
   private Multimap<Resource, IStatus> statusMap = LinkedHashMultimap.create();

   public Multimap<Resource, IStatus> getStatusMap()
   {
      return statusMap;
   }

   public IStatus getStatus()
   {
      final Collection<IStatus> values = getStatusMap().values();
      if (values.isEmpty())
      {
         return Status.OK_STATUS;
      }
      if (values.size() == 1)
      {
         return values.iterator().next();
      }
      else
      {
         return new MultiStatus("org.sourcepit.g2.common", 0, values.toArray(new IStatus[values.size()]),
            "Multible probles occurred. See below for details.", null);
      }
   }

   @Override
   protected void notifyDiagnosticsAdded(Resource resource, int featureID, Collection<Diagnostic> diagnostics)
   {
      final int severity = toStatusSeverity(featureID);
      for (Diagnostic diagnostic : diagnostics)
      {
         statusMap.put(resource, toResourceStatus(resource.getURI(), severity, "org.sourcepit.g2.common", diagnostic));
      }
   }

   @Override
   protected void notifyDiagnosticsRemoved(Resource resource, int featureID, Collection<Diagnostic> diagnostics)
   {
      final Iterator<IStatus> it = statusMap.get(resource).iterator();
      while (it.hasNext())
      {
         final ResourceStatus status = (ResourceStatus) it.next();
         if (diagnostics.contains(status.getDiagnostic()))
         {
            it.remove();
         }
      }
   }

   private static int toStatusSeverity(int featureID)
   {
      switch (featureID)
      {
         case Resource.RESOURCE__ERRORS :
            return IStatus.ERROR;
         case Resource.RESOURCE__WARNINGS :
            return IStatus.WARNING;
         default :
            throw new IllegalStateException();
      }
   }
}
