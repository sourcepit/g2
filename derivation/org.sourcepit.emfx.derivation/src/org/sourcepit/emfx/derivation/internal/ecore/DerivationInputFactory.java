/*******************************************************************************
 * Copyright (c) 2011 Bernd and others. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Bernd - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.sourcepit.emfx.derivation.internal.ecore;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorUtil;
import org.sourcepit.emfx.ecore.util.DiagnosticUtil;
import org.sourcepit.emfx.ecore.util.ResourceUtil;

/**
 * @author Bernd
 */
public class DerivationInputFactory
{
   public DerivationInput createDerivationInput(ResourceSet resourceSet, List<URI> inputEPackageURIs,
      List<URI> reusedDerivativesURIs, IProgressMonitor monitor) throws DiagnosticException
   {
      loadResources(resourceSet, inputEPackageURIs, reusedDerivativesURIs, monitor);
      final List<EPackage> reusedDerivatives = getEPackages(resourceSet, reusedDerivativesURIs);
      final List<EPackage> inputEPackages = getEPackages(resourceSet, inputEPackageURIs);
      final DerivationInput input = createDerivationInput(inputEPackages, reusedDerivatives);
      input.setResourceSet(resourceSet);
      return input;
   }

   protected DerivationInput createDerivationInput(List<EPackage> inputEPackages, List<EPackage> reusedDerivatives)
      throws DiagnosticException
   {
      final Map<EPackage, List<EPackage>> originToUsedDerivatives = new HashMap<EPackage, List<EPackage>>();
      for (EPackage ePackage : reusedDerivatives)
      {
         final EcoreDerivatorConfiguration foreignConfiguration = EcoreDerivatorUtil
            .findEcoreDerivatorConfiguration(ePackage);
         if (foreignConfiguration != null && foreignConfiguration.getOrigin() != null)
         {
            List<EPackage> used = originToUsedDerivatives.get(foreignConfiguration.getOrigin());
            if (used == null)
            {
               used = new UniqueEList<EPackage>();
               originToUsedDerivatives.put(foreignConfiguration.getOrigin(), used);
            }
            used.add(ePackage);
         }
      }

      if (inputEPackages.isEmpty())
      {
         throw DiagnosticUtil.newDiagnosticException("At least one input package is required.");
      }

      final Map<EPackage, List<EPackage>> inputToRequiredEPackages = computeRequiredPackages(inputEPackages,
         originToUsedDerivatives.keySet());

      final DerivationInput input = new DerivationInput();
      input.setInputEPackages(inputEPackages);
      input.setInputToRequiredEPackages(inputToRequiredEPackages);
      input.setOriginToReusedDerivatives(originToUsedDerivatives);
      return input;
   }

   protected ResourceSet loadResources(ResourceSet resourceSet, List<URI> inputEPackageURIs,
      List<URI> reusedDerivativesURIs, IProgressMonitor monitor) throws DiagnosticException
   {
      DiagnosticUtil.assertNoError(ResourceUtil.demandLoadResources(resourceSet, inputEPackageURIs));
      DiagnosticUtil.assertNoError(ResourceUtil.demandLoadResources(resourceSet, reusedDerivativesURIs));
      EcoreUtil.resolveAll(resourceSet);
      return resourceSet;
   }


   protected List<EPackage> getEPackages(final ResourceSet resourceSet, Collection<URI> ePackageURIs)
      throws DiagnosticException
   {
      final List<EPackage> ePackages = new UniqueEList<EPackage>();
      for (URI ePackageURI : ePackageURIs)
      {
         RuntimeException rx = null;
         EPackage ePackage = null;
         try
         {
            ePackage = (EPackage) resourceSet.getEObject(ePackageURI, false);
         }
         catch (RuntimeException e)
         {
            rx = e;
         }
         if (ePackage == null)
         {
            final String source = ePackageURI == null ? "null" : ePackageURI.toString();
            throw DiagnosticUtil.newDiagnosticException(NLS.bind("URI {0} doesn't point to an ePackage.", source),
               new Object[] {source, rx});
         }
         else
         {
            ePackages.add(ePackage);
         }
      }
      return ePackages;
   }

   protected Map<EPackage, List<EPackage>> computeRequiredPackages(final Collection<EPackage> ePackages,
      Collection<EPackage> usedEPackages) throws DiagnosticException
   {
      final Map<EPackage, List<EPackage>> inputToRequiredEPackages = new HashMap<EPackage, List<EPackage>>();
      for (EPackage ePackage : ePackages)
      {
         final List<EPackage> requiredEPackages = computeRequiredPackages(ePackage);
         requiredEPackages.remove(EcorePackage.Literals.ECLASS.getEPackage());

         for (EPackage requiredEPackage : requiredEPackages)
         {
            if (!ePackages.contains(requiredEPackage) && !usedEPackages.contains(requiredEPackage))
            {
               throw DiagnosticUtil.newDiagnosticException(
                  NLS.bind("The package ''{0}'' is used by one of the selected packages.", requiredEPackage.getName()),
                  new Object[] {EcoreUtil.getURI(requiredEPackage).toString()});
            }
         }
         inputToRequiredEPackages.put(ePackage, requiredEPackages);
      }
      return inputToRequiredEPackages;
   }

   protected static List<EPackage> computeRequiredPackages(EPackage ePackage)
   {
      List<EPackage> referencedEPackages = new UniqueEList<EPackage>();
      for (Iterator<EObject> j = ePackage.eAllContents(); j.hasNext();)
      {
         EObject eObject = j.next();
         for (Object o : eObject.eCrossReferences())
         {
            if (o instanceof EClassifier)
            {
               EClassifier eClassifier = (EClassifier) o;
               referencedEPackages.add(eClassifier.getEPackage());
            }
         }
      }

      referencedEPackages.remove(ePackage);
      for (Iterator<EPackage> i = referencedEPackages.iterator(); i.hasNext();)
      {
         EPackage referencedEPackage = i.next();
         if (referencedEPackage.getNsURI().equals(ePackage.getNsURI()))
         {
            i.remove();
         }
      }
      return referencedEPackages.isEmpty() ? Collections.<EPackage> emptyList() : referencedEPackages;
   }
}
