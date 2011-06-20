
package org.sourcepit.emfx.derivation.internal.ecore;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class DerivationInput
{
   private ResourceSet resourceSet;
   private List<EPackage> inputEPackages;
   private Map<EPackage, List<EPackage>> inputToRequiredEPackages;
   private Map<EPackage, List<EPackage>> originToReusedDerivatives;

   public ResourceSet getResourceSet()
   {
      return resourceSet;
   }

   public void setResourceSet(ResourceSet resourceSet)
   {
      this.resourceSet = resourceSet;
   }

   public List<EPackage> getInputEPackages()
   {
      return inputEPackages;
   }

   public void setInputEPackages(List<EPackage> inputEPackages)
   {
      this.inputEPackages = inputEPackages;
   }

   public Map<EPackage, List<EPackage>> getInputToRequiredEPackages()
   {
      return inputToRequiredEPackages;
   }

   public void setInputToRequiredEPackages(Map<EPackage, List<EPackage>> inputToRequiredEPackages)
   {
      this.inputToRequiredEPackages = inputToRequiredEPackages;
   }

   public Map<EPackage, List<EPackage>> getOriginToReusedDerivatives()
   {
      return originToReusedDerivatives;
   }

   public void setOriginToReusedDerivatives(Map<EPackage, List<EPackage>> originToReusedDerivatives)
   {
      this.originToReusedDerivatives = originToReusedDerivatives;
   }
}