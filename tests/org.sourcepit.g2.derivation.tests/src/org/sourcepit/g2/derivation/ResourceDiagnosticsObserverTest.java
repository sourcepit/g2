/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.junit.Test;

public class ResourceDiagnosticsObserverTest
{

   @Test
   public void testDiagnosticsAddedAndRemoved()
   {
      final DiagnosticsRecorder recorder = new DiagnosticsRecorder();
   
      final Resource resource = new XMLResourceImpl();
      resource.eAdapters().add(recorder);
   
      recorder.clear();
      resource.getErrors().add(new XMIException(""));
   
      assertEquals(1, recorder.getAddedErrors().size());
      assertEquals(0, recorder.getAddedWarnings().size());
      assertEquals(0, recorder.getRemovedErrors().size());
      assertEquals(0, recorder.getRemovedWarnings().size());
   
      recorder.clear();
      resource.getWarnings().add(new XMIException(""));
   
      assertEquals(0, recorder.getAddedErrors().size());
      assertEquals(1, recorder.getAddedWarnings().size());
      assertEquals(0, recorder.getRemovedErrors().size());
      assertEquals(0, recorder.getRemovedWarnings().size());
   
      recorder.clear();
      resource.getErrors().addAll(Arrays.asList(new XMIException(""), new XMIException("")));
   
      assertEquals(2, recorder.getAddedErrors().size());
      assertEquals(0, recorder.getAddedWarnings().size());
      assertEquals(0, recorder.getRemovedErrors().size());
      assertEquals(0, recorder.getRemovedWarnings().size());
   
      recorder.clear();
      resource.getErrors().clear();
   
      assertEquals(0, recorder.getAddedErrors().size());
      assertEquals(0, recorder.getAddedWarnings().size());
      assertEquals(3, recorder.getRemovedErrors().size());
      assertEquals(0, recorder.getRemovedWarnings().size());
   
      recorder.clear();
      resource.getWarnings().remove(0);
   
      assertEquals(0, recorder.getAddedErrors().size());
      assertEquals(0, recorder.getAddedWarnings().size());
      assertEquals(0, recorder.getRemovedErrors().size());
      assertEquals(1, recorder.getRemovedWarnings().size());
   }

   private class DiagnosticsRecorder extends ResourceDiagnosticsObserver
   {
      private final List<Diagnostic> addedErrors = new ArrayList<Diagnostic>();
      private final List<Diagnostic> addedWarnings = new ArrayList<Diagnostic>();
      private final List<Diagnostic> removedErrors = new ArrayList<Diagnostic>();
      private final List<Diagnostic> removedWarnings = new ArrayList<Diagnostic>();

      @Override
      protected void notifyDiagnosticsAdded(Resource notifier, int featureID, Collection<Diagnostic> values)
      {
         switch (featureID)
         {
            case Resource.RESOURCE__ERRORS :
               addedErrors.addAll(values);
               break;
            case Resource.RESOURCE__WARNINGS :
               addedWarnings.addAll(values);
               break;
            default :
               throw new IllegalStateException();
         }
      }

      @Override
      protected void notifyDiagnosticsRemoved(Resource notifier, int featureID, Collection<Diagnostic> values)
      {
         switch (featureID)
         {
            case Resource.RESOURCE__ERRORS :
               removedErrors.addAll(values);
               break;
            case Resource.RESOURCE__WARNINGS :
               removedWarnings.addAll(values);
               break;
            default :
               throw new IllegalStateException();
         }
      }

      public List<Diagnostic> getAddedErrors()
      {
         return addedErrors;
      }

      public List<Diagnostic> getAddedWarnings()
      {
         return addedWarnings;
      }

      public List<Diagnostic> getRemovedErrors()
      {
         return removedErrors;
      }

      public List<Diagnostic> getRemovedWarnings()
      {
         return removedWarnings;
      }

      public void clear()
      {
         addedErrors.clear();
         addedWarnings.clear();
         removedErrors.clear();
         removedWarnings.clear();
      }
   }

}
