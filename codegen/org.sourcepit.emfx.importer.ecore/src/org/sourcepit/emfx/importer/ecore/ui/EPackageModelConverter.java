
package org.sourcepit.emfx.importer.ecore.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ecore.EcoreImporterPlugin;
import org.sourcepit.emfx.derivation.DerivationHandler;
import org.sourcepit.emfx.derivation.ReconciliationHandler;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorConfiguration;
import org.sourcepit.emfx.derivation.ecore.EcoreDerivatorUtil;
import org.sourcepit.emfx.derivation.ecore.EcoreReconcilerConfiguration;
import org.sourcepit.emfx.ecore.util.EAnnotationUtil;

public class EPackageModelConverter
{

   protected List<EObject> rootObjects = new ArrayList<EObject>();

   // protected String modelLocation;
   //
   // protected List<URI> modelLocationURIs;

   protected EClass rootType = EcorePackage.Literals.EPACKAGE;

   protected ResourceSet resourceSet;

   public EClass getRootType()
   {
      return rootType;
   }

   public void setRootType(EClass rootType)
   {
      this.rootType = rootType;
   }

   // public void setModelLocation(String modelLocation) {
   // clearState();
   // this.modelLocation = modelLocation;
   // }
   //
   // public String getModelLocation() {
   // return modelLocation;
   // }
   //
   // protected List<URI> getModelLocationURIs() {
   // if (getModelLocation() == null) {
   // return Collections.emptyList();
   // } else if (modelLocationURIs == null) {
   // modelLocationURIs = new ArrayList<URI>();
   // for (StringTokenizer stringTokenizer = new StringTokenizer(getModelLocation()); stringTokenizer.hasMoreTokens();)
   // {
   // String uri = stringTokenizer.nextToken();
   // modelLocationURIs.add(URI.createURI(uri));
   // }
   // }
   // return modelLocationURIs;
   // }

   public Diagnostic computeRootEObjects(Monitor monitor)
   {
      clearState();

      List<URI> locationURIs = getModelLocations();
      if (locationURIs.isEmpty())
      {
         Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, EcoreImporterPlugin.getPlugin().getBundle()
            .getSymbolicName(), 0, EcoreImporterPlugin.INSTANCE.getString("_UI_SpecifyAValidCoreModel_message"), null);
         return diagnostic;
      }

      final Set<URI> allURIs = new HashSet<URI>();
      for (URI uri : locationURIs)
      {
         allURIs.add(uri.trimFragment().trimQuery());
      }
      for (URI uri : usedEPackageURIs)
      {
         allURIs.add(uri.trimFragment().trimQuery());
      }

      monitor.beginTask("", 2);
      monitor.subTask(EcoreImporterPlugin.INSTANCE.getString("_UI_Loading_message", new Object[] {allURIs}));

      resourceSet = createResourceSet();

      final BasicDiagnostic diagnosticChain = new BasicDiagnostic(ConverterPlugin.ID,
         ConverterUtil.ACTION_MESSAGE_NONE,
         EcoreImporterPlugin.INSTANCE.getString("_UI_ErrorsWereDetectedEcore_message"), null);

      Diagnostic result = ResourceUtil.demandLoadResources(resourceSet, locationURIs);
      if (result.getSeverity() != Diagnostic.OK)
      {
         diagnosticChain.add(result);
      }
      EcoreUtil.resolveAll(resourceSet);

      for (Resource resource : resourceSet.getResources())
      {
         rootObjects.addAll(EcoreUtil.<EObject> getObjectsByType(resource.getContents(), rootType));
      }

      result = ResourceUtil.demandLoadResources(resourceSet, usedEPackageURIs);
      if (result.getSeverity() != Diagnostic.OK)
      {
         diagnosticChain.add(result);
      }
      EcoreUtil.resolveAll(resourceSet);

      rootObjects.removeAll(getReferencedOriginEPackages());

      for (EObject eObject : rootObjects)
      {
         Diagnostician.INSTANCE.validate(eObject, diagnosticChain);
      }

      return diagnosticChain;
   }

   protected Collection<EPackage> getReferencedOriginEPackages()
   {
      final Set<EPackage> originEPackages = new HashSet<EPackage>();
      for (URI uri : getUsedEPackageURIs())
      {
         final EPackage ePackage = (EPackage) resourceSet.getEObject(uri, false);
         if (ePackage != null)
         {
            final EPackage originEPackage = EcoreDerivatorUtil.findOriginEPackage(ePackage);
            if (originEPackage != null)
            {
               originEPackages.add(originEPackage);
            }
         }
      }
      return originEPackages;
   }

   public List<EObject> getRootObjects()
   {
      return rootObjects;
   }

   protected void clearState()
   {
      // modelLocationURIs = null;
      rootObjects.clear();
      converted = null;
   }

   protected ResourceSet createResourceSet()
   {
      return ConverterUtil.createResourceSet();
   }

   protected List<EObject> converted;

   public void convert()
   {
      if (converted != null || rootObjects == null || rootObjects.isEmpty())
      {
         return;
      }
      doConvert();
   }

   public List<EObject> getConverted()
   {
      return converted;
   }

   public ResourceSet getResourceSet()
   {
      return resourceSet;
   }

   protected void doConvert()
   {

      final org.sourcepit.emfx.derivation.ecore.EcoreFactory factory = org.sourcepit.emfx.derivation.ecore.EcoreFactory.eINSTANCE;

      converted = new ArrayList<EObject>();

      for (EObject eObject : rootObjects)
      {

         EPackage ePackage = (EPackage) eObject;

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

         EObject derivative = DerivationHandler.INSTANCE.derive(derivatorConfiguration);
         // EAnnotationUtil.getEAnnotation((EModelElement) derivative,
         // "derived", true).getContents().add(derivatorConfiguration);

         EcoreReconcilerConfiguration reconcilerConfiguration = factory.createEcoreReconcilerConfiguration();
         EAnnotationUtil.getEAnnotation((EModelElement) derivative, "reconcilable", true).getContents()
            .add(reconcilerConfiguration);

         ReconciliationHandler.INSTANCE.reconcile(derivative);

         converted.add(derivative);
      }
   }

   private List<URI> usedEPackageURIs = Collections.emptyList();

   public void setUsedEPackages(List<URI> usedEPackageURIs)
   {
      this.usedEPackageURIs = getSafeList(usedEPackageURIs);
   }

   public List<URI> getUsedEPackageURIs()
   {
      return usedEPackageURIs;
   }

   protected <T> List<T> getSafeList(List<T> list)
   {
      if (list == null)
      {
         return Collections.emptyList();
      }
      return list;
   }

   private List<URI> modelLocations = Collections.emptyList();

   public void setModelLocations(List<URI> modelLocations)
   {
      this.modelLocations = getSafeList(modelLocations);
   }

   public List<URI> getModelLocations()
   {
      return modelLocations;
   }
}
