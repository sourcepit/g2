/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.junit.Test;

import com.google.common.collect.Multimap;

public class ResourceStatusRecorderTest
{

   @Test
   public void test()
   {
      final ResourceStatusRecorder recorder = new ResourceStatusRecorder();

      final Resource res1 = new XMLResourceImpl(URI.createURI("foo:res1"));
      res1.eAdapters().add(recorder);

      final Resource res2 = new XMLResourceImpl(URI.createURI("foo:res2"));
      res2.eAdapters().add(recorder);

      res1.getErrors().add(new XMIException(""));

      final Multimap<Resource, IStatus> statusMap = recorder.getStatusMap();
      assertEquals(1, statusMap.asMap().size());

      Collection<IStatus> res1Statuses = statusMap.get(res1);
      assertEquals(1, res1Statuses.size());

      IStatus status = res1Statuses.iterator().next();
      assertEquals(IStatus.ERROR, status.getSeverity());
      assertEquals(res1.getURI(), ((ResourceStatus) status).getUri());

      res2.getWarnings().add(new XMIException(""));
      assertEquals(2, statusMap.asMap().size());
      assertEquals(1, res1Statuses.size());

      Collection<IStatus> res2Statuses = statusMap.get(res2);
      assertEquals(1, res2Statuses.size());

      status = res2Statuses.iterator().next();
      assertEquals(IStatus.WARNING, status.getSeverity());
      assertEquals(res2.getURI(), ((ResourceStatus) status).getUri());

      res1.getWarnings().add(new XMIException(""));
      assertEquals(2, statusMap.asMap().size());
      assertEquals(2, res1Statuses.size());
      assertEquals(1, res2Statuses.size());

      res1.getErrors().clear();

      assertEquals(2, statusMap.asMap().size());
      assertEquals(1, res1Statuses.size());
      assertEquals(1, res2Statuses.size());

      res1.getWarnings().clear();

      assertEquals(1, statusMap.asMap().size());
      assertEquals(0, res1Statuses.size());
      assertEquals(1, res2Statuses.size());

      res2.getWarnings().clear();

      assertEquals(0, statusMap.asMap().size());
      assertEquals(0, res1Statuses.size());
      assertEquals(0, res2Statuses.size());
   }

}
