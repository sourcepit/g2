/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import static com.google.common.base.Preconditions.checkArgument;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class ResourceStatus extends Status
{
   private final URI uri;

   private final Diagnostic diagnostic;

   public ResourceStatus(URI uri, int severity, String pluginId, String message)
   {
      this(uri, severity, pluginId, message, null);
   }

   public ResourceStatus(URI uri, int severity, String pluginId, String message, Throwable exception)
   {
      this(uri, severity, pluginId, 0, message, exception, null);
   }

   public ResourceStatus(URI uri, int severity, String pluginId, int code, String message, Throwable exception,
      Diagnostic diagnostic)
   {
      super(severity, pluginId, code, message, exception);
      checkArgument(uri != null);
      this.uri = uri;
      this.diagnostic = diagnostic;
   }

   public URI getUri()
   {
      return uri;
   }

   public Diagnostic getDiagnostic()
   {
      return diagnostic;
   }

   public static ResourceStatus toResourceStatus(URI uri, int severity, String pluginId, Diagnostic diagnostic)
   {
      final Throwable t;

      if (diagnostic instanceof WrappedException)
      {
         t = ((WrappedException) diagnostic).exception();
      }
      else if (diagnostic instanceof Throwable)
      {
         t = (Throwable) diagnostic;
      }
      else
      {
         t = null;
      }

      return new ResourceStatus(uri, severity, pluginId, 0, diagnostic.getMessage(), t, diagnostic);
   }
}
