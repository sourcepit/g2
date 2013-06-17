/*******************************************************************************
 * Copyright (c) 2011 Bernd and others. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Bernd - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.sourcepit.emfx.ecore.util;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;

/**
 * @author Bernd
 */
public final class DiagnosticUtil
{
   private DiagnosticUtil()
   {
      super();
   }

   public static void assertNoError(Diagnostic diagnostic) throws DiagnosticException
   {
      if (diagnostic.getSeverity() == Diagnostic.ERROR)
      {
         throw new DiagnosticException(diagnostic);
      }
   }

   public static DiagnosticException newDiagnosticException(String message)
   {
      return new DiagnosticException(new BasicDiagnostic(Diagnostic.ERROR, ICommonConstants.COMMON_PLUGIN_ID, 0,
         message, null));
   }

   public static DiagnosticException newDiagnosticException(String message, Object[] data)
   {
      return newDiagnosticException(ICommonConstants.COMMON_PLUGIN_ID, message, data);
   }

   public static DiagnosticException newDiagnosticException(String source, String message)
   {
      return newDiagnosticException(source, message, null);
   }

   public static DiagnosticException newDiagnosticException(String source, String message, Object[] data)
   {
      return new DiagnosticException(newError(source, message, data));
   }

   public static BasicDiagnostic newError(String source, String message, Object[] data)
   {
      return new BasicDiagnostic(Diagnostic.ERROR, source, 0, message, data);
   }

   public static BasicDiagnostic newDiagnostic(int sevirity, String source, String message, Object[] data)
   {
      return new BasicDiagnostic(sevirity, source, 0, message, data);
   }
}
