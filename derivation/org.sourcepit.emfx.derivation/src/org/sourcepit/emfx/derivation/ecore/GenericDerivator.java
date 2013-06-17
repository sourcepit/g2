
package org.sourcepit.emfx.derivation.ecore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;
import org.sourcepit.emfx.derivation.IDerivator;
import org.sourcepit.emfx.derivation.ecore.impl.EcoreDerivatorConfigurationImpl;

public class GenericDerivator implements IDerivator
{

   protected final static String ID = EcoreDerivatorConfigurationImpl.DERIVATOR_ID;

   protected Copier copier = new DerivationStrategy();

   protected EClass baseEClass;

   private final class DerivationStrategy extends Copier
   {
      private static final long serialVersionUID = 1L;

      public DerivationStrategy()
      {
         useOriginalReferences = false;
      }

      @Override
      public <T> Collection<T> copyAll(Collection<? extends T> eObjects)
      {
         Collection<T> result = new ArrayList<T>(eObjects.size());
         for (Object object : eObjects)
         {
            @SuppressWarnings("unchecked")
            T t = (T) copy((EObject) object);
            if (t != null)
            {
               result.add(t);
            }
         }
         return result;
      }

      @Override
      public EObject copy(EObject eObject)
      {
         if (filter(eObject))
         {
            return null;
         }
         return super.copy(eObject);

      }

      @Override
      protected EObject createCopy(EObject eObject)
      {

         EObject copyEObject = super.createCopy(eObject);

         // use original data types if we don't derive our own data types
         if (eObject instanceof EAttribute && !configuration.isDeriveEDataTypes())
         {
            EAttribute eAttribute = (EAttribute) eObject;
            EClassifier eType = eAttribute.getEType();
            if (eType instanceof EDataType)
            {
               ((EAttribute) copyEObject).setEType(eType);
            }
         }

         // if (eObject instanceof EStructuralFeature) {
         // EStructuralFeature eStructuralFeature = (EStructuralFeature)
         // eObject;
         // EClassifier eType = eStructuralFeature.getEType();
         // if (eType != null &&
         // !eType.getEPackage().equals(eStructuralFeature.getEContainingClass().getEPackage()))
         // {
         // System.out.println("panic");
         //
         // // EClassifier foreignEType = findForeignEType(eType);
         //
         // }
         // }

         if (eObject instanceof EClassifier && copyEObject instanceof EClass)
         {
            EClass copyEClass = (EClass) copyEObject;
            if (!copyEClass.isAbstract() && !copyEClass.isInterface())
            {
               if (configuration.isCreateOriginEReferences())
               {
                  getOriginEReference(copyEClass, (EClassifier) eObject, true);
               }
            }
         }
         return copyEObject;
      }

      // TODO rule layer?
      protected EReference getOriginEReference(EClass derivative, EClassifier origin, boolean createOnDemand)
      {
         final String eReferenceName = getOriginEReferenceName(derivative, origin);
         EReference eReference = (EReference) derivative.getEStructuralFeature(eReferenceName);
         if (eReference == null && createOnDemand)
         {
            eReference = EcoreFactory.eINSTANCE.createEReference();
            eReference.setName(eReferenceName);
            eReference.setEType(origin instanceof EDataType ? origin.eClass() : origin);
            eReference.setLowerBound(1);
            derivative.getEStructuralFeatures().add(eReference);
         }
         return eReference;
      }

      // TODO rule layer?
      protected String getOriginEReferenceName(EClass derivative, EClassifier origin)
      {
         return configuration.getOriginEReferenceName(origin.getName());
      }

      @Override
      protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject)
      {
         if (eObject instanceof EDataType && configuration.isEDataTypesAsEClass())
         {
            // nothing else then name makes sence
            if (!EcorePackage.eINSTANCE.getENamedElement_Name().equals(eAttribute))
            {
               return;
            }
         }

         if (EcorePackage.eINSTANCE.getENamedElement_Name().equals(eAttribute))
         {
            final String targetName;
            if (eObject instanceof EPackage)
            {
               targetName = configuration.getEPackageName();
            }
            else if (eObject instanceof EClassifier)
            {
               targetName = configuration.getEClassifierName((String) eObject.eGet(eAttribute));
            }
            else if (eObject instanceof EStructuralFeature)
            {
               targetName = configuration.getEStructuralFeatureName((String) eObject.eGet(eAttribute));
            }
            else
            {
               targetName = (String) eObject.eGet(eAttribute);
            }
            copyEObject.eSet(getTarget(eAttribute), targetName);
         }
         else if (EcorePackage.eINSTANCE.getEPackage_NsPrefix().equals(eAttribute))
         {
            copyEObject.eSet(getTarget(eAttribute), configuration.getEPackageNsPrefix());
         }
         else if (EcorePackage.eINSTANCE.getEPackage_NsURI().equals(eAttribute))
         {
            copyEObject.eSet(getTarget(eAttribute), configuration.getEPackageNsURI());
         }
         else
         {
            super.copyAttribute(eAttribute, eObject, copyEObject);
         }
      }

      @Override
      protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject)
      {
         if (configuration.getExcludeEReferences().contains(eReference))
         {
            return;
         }
         if (eObject instanceof EDataType && configuration.isEDataTypesAsEClass())
         {
            return;
         }
         super.copyContainment(eReference, eObject, copyEObject);
      }

      @Override
      protected void copyReference(EReference eReference, EObject eObject, EObject derivative)
      {
         if (configuration.getExcludeEReferences().contains(eReference))
         {
            return;
         }

         if (EcorePackage.eINSTANCE.getETypedElement_EType().equals(eReference))
         {
            EClassifier eType = (EClassifier) eObject.eGet(EcorePackage.eINSTANCE.getETypedElement_EType());
            if (eType != null && !eType.getEPackage().equals(eReference.getEContainingClass().getEPackage()))
            {
               EClassifier foreignEType = findForeignEClassifier(eType);
               derivative.eSet(eReference, foreignEType);
            }
         }

         super.copyReference(eReference, eObject, derivative);
      }

      protected EClassifier findForeignEClassifier(EClassifier eClassifier)
      {

         EPackage foreignEPackage = eClassifier.getEPackage();

         EList<EPackage> usedPackages = configuration.getUsedEPackages();
         for (EPackage usedEPackage : usedPackages)
         {
            EcoreDerivatorConfiguration usedForeignConfiguration = EcoreDerivatorUtil
               .findEcoreDerivatorConfiguration(usedEPackage);
            if (usedForeignConfiguration != null && foreignEPackage.equals(usedForeignConfiguration.getOrigin()))
            {
               String foreignName = usedForeignConfiguration.getEClassifierName(eClassifier.getName());
               return usedEPackage.getEClassifier(foreignName);
            }
         }

         // // try to detect other derived model
         // EcoreDerivatorConfiguration foreignConfiguration =
         // findEcoreReconcilerConfiguration(foreignEPackage);
         // if (foreignConfiguration != null) {
         // String foreignName =
         // foreignConfiguration.getEClassifierName(eClassifier.getName());
         // return foreignEPackage.getEClassifier(foreignName);
         // }

         return null;
      }

      @Override
      protected EClass getTarget(EClass eClass)
      {
         if (configuration.isEDataTypesAsEClass() && EcorePackage.eINSTANCE.getEDataType().isSuperTypeOf(eClass))
         {
            return EcorePackage.eINSTANCE.getEClass();
         }
         return super.getTarget(eClass);
      }

      @Override
      public EObject get(Object key)
      {
         if (key instanceof EClassifier)
         {

         }
         return super.get(key);
      }

      protected boolean filter(EObject eObject)
      {
         if (eObject instanceof EAttribute)
         {
            return !configuration.isDeriveEAttributes();
         }
         if (eObject instanceof EDataType)
         {
            return !configuration.isDeriveEDataTypes();
         }
         if (eObject instanceof EReference)
         {
            EReference eReference = (EReference) eObject;
            if (eReference.isContainment())
            {
               if (configuration.isDeriveContainmentEReferences())
               {
                  // EClass eContainingClass =
                  // eReference.getEContainingClass();
                  // if
                  // (!eContainingClass.getEPackage().equals(eReference.getEType().getEPackage()))
                  // {
                  // return false;
                  // }
                  return false;
               }
               else
               {
                  return true;
               }
            }
            else
            {
               return !configuration.isDeriveEReferences();
            }
         }
         return false;
      }

   }

   protected EClass getGenBaseEClass(EPackage derivedEPackage, boolean createOnDemand)
   {
      if (baseEClass == null && createOnDemand)
      {
         baseEClass = createBaseType(derivedEPackage);
      }
      return baseEClass;
   }

   protected EClass createBaseType(EPackage derivedEPackage)
   {
      EClass genBaseClass = EcoreFactory.eINSTANCE.createEClass();
      genBaseClass.setAbstract(true);
      genBaseClass.setName(configuration.getEClassifierName(configuration.getBaseTypeName()));
      genBaseClass.getESuperTypes().add(EcorePackage.Literals.EMODEL_ELEMENT);
      derivedEPackage.getEClassifiers().add(genBaseClass);
      return genBaseClass;
   }

   protected void adjustESuperTypes(EClass derivedEClass)
   {
      if (derivedEClass.getESuperTypes().isEmpty() && configuration.isCreateBaseType())
      {
         derivedEClass.getESuperTypes().add(getGenBaseEClass(derivedEClass.getEPackage(), true));
      }
   }

   protected EPackage origin;

   protected EPackage derivative;

   protected EcoreDerivatorConfiguration configuration;

   public void initialize(DerivatorConfiguration configuration)
   {
      copier.clear();
      baseEClass = null;
      origin = null;
      derivative = null;

      this.configuration = (EcoreDerivatorConfiguration) configuration;
      origin = this.configuration.getOrigin();
   }

   public void derive()
   {
      derivative = (EPackage) copier.copy(origin);

      if (configuration.isCreateRootType())
      {
         createRootType(derivative);
      }

      copier.copyReferences();

      for (Iterator<EObject> iterator = derivative.eAllContents(); iterator.hasNext();)
      {
         EObject eObject = iterator.next();
         if (eObject instanceof EClass)
         {
            adjustESuperTypes((EClass) eObject);
         }
      }
   }

   protected void createRootType(EPackage ePackage)
   {
      EClass targetRootType = null;
      String eReferenceName = null;

      EClass originRootType = configuration.getOriginRootType();
      if (originRootType != null)
      {
         eReferenceName = configuration.getEStructuralFeatureName(originRootType.getName() + "s");
         targetRootType = (EClass) copier.get(originRootType);
      }

      if (targetRootType == null)
      {
         eReferenceName = configuration.getEStructuralFeatureName("Roots");
         if (configuration.isCreateBaseType())
         {
            targetRootType = getGenBaseEClass(ePackage, true);
         }
         else
         {
            targetRootType = EcorePackage.eINSTANCE.getEClass();
         }
      }

      EReference eReference = EcoreFactory.eINSTANCE.createEReference();
      eReference.setName(eReferenceName);
      eReference.setEType(targetRootType);
      eReference.setLowerBound(0);
      eReference.setUpperBound(-1);
      eReference.setContainment(true);

      EClass genModelClass = EcoreFactory.eINSTANCE.createEClass();
      genModelClass.setName(configuration.getEClassifierName(configuration.getRootTypeName()));
      genModelClass.getEStructuralFeatures().add(eReference);
      if (configuration.isCreateBaseType())
      {
         genModelClass.getESuperTypes().add(getGenBaseEClass(ePackage, true));
      }

      ePackage.getEClassifiers().add(genModelClass);
   }

   public EObject getDerivative()
   {
      return derivative;
   }
}
