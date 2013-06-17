/*******************************************************************************
 * Copyright (c) 2011 Bernd and others. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Bernd - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.sourcepit.emfx.derivation.ecore;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class DerivationResult
{
   private final ResourceSet resourceSet;
   private final List<EPackage> derivatives;

   public DerivationResult(ResourceSet resourceSet, List<EPackage> derivatives)
   {
      this.resourceSet = resourceSet;
      this.derivatives = derivatives;
   }

   public ResourceSet getResourceSet()
   {
      return resourceSet;
   }

   public List<EPackage> getDerivatives()
   {
      return derivatives;
   }
}