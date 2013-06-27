/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.junit.Test;

public class ResourceUtilsTest
{

   @Test
   public void testLoadResources() throws IOException
   {
      final EcoreFactory eFactory = EcoreFactory.eINSTANCE;

      final EPackage ePackageA = createEPackage(eFactory, "PackageA");

      final EClass eClassA = createEClass(eFactory, "ClassA");
      ePackageA.getEClassifiers().add(eClassA);

      final EPackage ePackageB = createEPackage(eFactory, "ePackageB");

      final EClass eClassB = createEClass(eFactory, "ClassB");
      ePackageB.getEClassifiers().add(eClassB);

      final EReference eReference = eFactory.createEReference();
      eReference.setName("eClassA");
      eReference.setEType(eClassA);
      eClassB.getEStructuralFeatures().add(eReference);

      Resource resourceA = new XMLResourceImpl(URI.createURI("foo:A"));
      resourceA.getContents().add(ePackageA);
      Resource resourceB = new XMLResourceImpl(URI.createURI("foo:B"));
      resourceB.getContents().add(ePackageB);

      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResources().add(resourceA);
      resourceSet.getResources().add(resourceB);

      final Map<URI, byte[]> contentMap = new HashMap<URI, byte[]>();
      // contentMap.put(resourceA.getURI(), getContentAsByteArray(resourceA));
      contentMap.put(resourceB.getURI(), getContentAsByteArray(resourceB));

      resourceSet = new ResourceSetImpl();
      resourceSet.setURIConverter(new ExtensibleURIConverterImpl()
      {
         @Override
         public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException
         {
            final byte[] bytes = contentMap.get(uri);
            if (bytes != null)
            {
               return new ByteArrayInputStream(bytes);
            }
            return super.createInputStream(uri, options);
         }
      });


      final ResourceStatusRecorder statusRecorder = new ResourceStatusRecorder();
      resourceSet.eAdapters().add(statusRecorder);

      resourceSet.getResource(resourceB.getURI(), true);

      EcoreUtil.resolveAll(resourceSet);

      resourceSet.eAdapters().remove(statusRecorder);

      IStatus status = statusRecorder.getStatus();


      System.out.println(status);
   }

   private static byte[] getContentAsByteArray(Resource resource) throws IOException
   {
      final ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, null);
      return out.toByteArray();
   }

   private static EClass createEClass(final EcoreFactory eFactory, String name)
   {
      final EClass eClass = eFactory.createEClass();
      eClass.setName(name);
      return eClass;
   }

   private static EPackage createEPackage(EcoreFactory eFactory, String name)
   {
      final EPackage ePackage = eFactory.createEPackage();
      ePackage.setName(name);
      ePackage.setNsPrefix(name);
      ePackage.setNsURI(name);
      return ePackage;
   }

}
