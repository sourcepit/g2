
package org.sourcepit.emfx.derivation.ecore;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.sourcepit.emfx.derivation.DerivationHandler;
import org.sourcepit.emfx.derivation.IDerivator;
import org.sourcepit.emfx.derivation.ReconciliationHandler;
import org.sourcepit.emfx.derivation.internal.ecore.DerivationInput;
import org.sourcepit.emfx.derivation.internal.ecore.DerivationInputFactory;
import org.sourcepit.emfx.ecore.util.EAnnotationUtil;

public class DerivationProcessor
{
   protected final List<URI> inputEPackageURIs = new UniqueEList<URI>();

   protected final List<URI> usedDerivativesURIs = new UniqueEList<URI>();

   public List<URI> getInputEPackageURIs()
   {
      return inputEPackageURIs;
   }

   public List<URI> getUsedDerivativesURIs()
   {
      return usedDerivativesURIs;
   }

   public ResourceSet newResourceSet()
   {
      return new ResourceSetImpl();
   }

   public EcoreDerivatorConfiguration findDerivatorConfiguration(EPackage ePackage)
   {
      return EcoreDerivatorUtil.findEcoreDerivatorConfiguration(ePackage);
   }

   public EPackage findOrigin(EPackage ePackage)
   {
      return EcoreDerivatorUtil.findOriginEPackage(ePackage);
   }

   public Diagnostic validateInput(IProgressMonitor monitor)
   {
      try
      {
         computeDerivationInput(monitor);
      }
      catch (DiagnosticException e)
      {
         return e.getDiagnostic();
      }
      return Diagnostic.OK_INSTANCE;
   }

   public DerivationResult processDerivation(IProgressMonitor monitor) throws DiagnosticException
   {
      return processDerivation(computeDerivationInput(monitor), monitor);
   }

   protected DerivationInput computeDerivationInput(IProgressMonitor monitor) throws DiagnosticException
   {
      return new DerivationInputFactory().createDerivationInput(newResourceSet(), inputEPackageURIs,
         usedDerivativesURIs, monitor);
   }

   protected DerivationResult processDerivation(DerivationInput input, IProgressMonitor monitor)
   {
      final List<EPackage> ePackages = input.getInputEPackages();
      final Map<EPackage, List<EPackage>> inputToRequiredEPackages = input.getInputToRequiredEPackages();
      final Map<EPackage, List<EPackage>> originToUsedDerivatives = input.getOriginToReusedDerivatives();

      final Map<EPackage, EPackage> ePackageToDummyDerivative = new LinkedHashMap<EPackage, EPackage>();
      for (EPackage ePackage : ePackages)
      {
         // create and use dummy derivatives to get rid of cyclic dependencies between input ePackages
         EPackage dummyDerivative = EcoreFactory.eINSTANCE.createEPackage();
         EcoreDerivatorConfiguration dummyConfiguration = createDerivationConfiguration(ePackage);
         dummyDerivative.setName(dummyConfiguration.getEPackageName());
         dummyDerivative.setNsURI(dummyConfiguration.getEPackageNsURI());
         dummyDerivative.setNsPrefix(dummyConfiguration.getEPackageNsPrefix());
         EAnnotationUtil.getEAnnotation(dummyDerivative, IDerivator.ANNOTATION_DERIVED, true).getContents()
            .add(dummyConfiguration);

         ePackageToDummyDerivative.put(ePackage, dummyDerivative);
      }


      final Map<EPackage, EPackage> ePackageToDerivative = new LinkedHashMap<EPackage, EPackage>();
      for (EPackage ePackage : ePackages)
      {
         final EcoreDerivatorConfiguration configuration = createDerivationConfiguration(ePackage);
         for (EPackage requiredEPackage : inputToRequiredEPackages.get(ePackage))
         {
            EPackage derivative = ePackageToDummyDerivative.get(requiredEPackage);
            if (derivative != null)
            {
               configuration.getUsedEPackages().add(derivative);
            }
            else
            {
               derivative = originToUsedDerivatives.get(requiredEPackage).get(0);
               if (derivative != null)
               {
                  configuration.getUsedEPackages().add(derivative);
               }
               else
               {
                  throw new IllegalStateException("Cannot find derivative for a required package.");
               }
            }
         }


         EPackage derivative = (EPackage) DerivationHandler.INSTANCE.derive(configuration);

         final org.sourcepit.emfx.derivation.ecore.EcoreFactory factory = org.sourcepit.emfx.derivation.ecore.EcoreFactory.eINSTANCE;
         EcoreReconcilerConfiguration reconcilerConfiguration = factory.createEcoreReconcilerConfiguration();
         EAnnotationUtil.getEAnnotation((EModelElement) derivative, "reconcilable", true).getContents()
            .add(reconcilerConfiguration);
         ReconciliationHandler.INSTANCE.reconcile(derivative);

         ePackageToDerivative.put(ePackage, derivative);
      }

      for (EPackage derivative : ePackageToDerivative.values())
      {
         final EcoreDerivatorConfiguration configuration = EcoreDerivatorUtil
            .findEcoreDerivatorConfiguration(derivative);
         for (Entry<EPackage, EPackage> entry : ePackageToDummyDerivative.entrySet())
         {
            final EPackage dummyDerivative = entry.getValue();
            int idx = configuration.getUsedEPackages().indexOf(dummyDerivative);
            if (idx > -1)
            {
               final EPackage origin = entry.getKey();
               configuration.getUsedEPackages().remove(idx);
               configuration.getUsedEPackages().add(idx, ePackageToDerivative.get(origin));
            }
         }
      }
      return new DerivationResult(input.getResourceSet(), new UniqueEList<EPackage>(ePackageToDerivative.values()));
   }

   protected EcoreDerivatorConfiguration createDerivationConfiguration(EPackage ePackage)
   {
      final org.sourcepit.emfx.derivation.ecore.EcoreFactory factory = org.sourcepit.emfx.derivation.ecore.EcoreFactory.eINSTANCE;
      EcoreDerivatorConfiguration derivatorConfiguration = factory.createEcoreDerivatorConfiguration();
      derivatorConfiguration.setOrigin(ePackage);
      derivatorConfiguration.setEClassifierNamePrefix("Gen");
      derivatorConfiguration.setCreateBaseType(true);
      derivatorConfiguration.setCreateRootType(true);
      derivatorConfiguration.setCreateOriginEReferences(true);
      derivatorConfiguration.setDeriveContainmentEReferences(true);
      derivatorConfiguration.setDeriveEAttributes(false);
      derivatorConfiguration.setDeriveEDataTypes(true);
      derivatorConfiguration.setEDataTypesAsEClass(true);
      derivatorConfiguration.setDeriveEReferences(false);
      return derivatorConfiguration;
   }
}
