
package org.sourcepit.emfx.derivation.ecore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.match.metamodel.Match2Elements;
import org.eclipse.emf.compare.match.metamodel.MatchElement;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.sourcepit.emfx.derivation.DerivationHandler;
import org.sourcepit.emfx.derivation.DerivatorConfiguration;
import org.sourcepit.emfx.derivation.IReconciler;
import org.sourcepit.emfx.derivation.ecore.impl.EcoreReconcilerConfigurationImpl;
import org.sourcepit.emfx.ecore.util.EAnnotationUtil;

public class GenericReconciler implements IReconciler
{

   public static final String ID = EcoreReconcilerConfigurationImpl.RECONCILER_ID;

   public String getId()
   {
      return ID;
   }

   public boolean canReconcile(EObject eObject)
   {
      return isResponsibleFor(eObject);
   }

   public boolean isResponsibleFor(EObject reconcilable)
   {
      if (reconcilable instanceof EModelElement)
      {
         EcoreReconcilerConfiguration configuration = getReconcilerConfiguration((EModelElement) reconcilable, false);
         if (configuration != null)
         {
            return getId().equals(configuration.getReconcilerId());
         }
      }
      return false;
   }

   public void reconcile(EObject target)
   {
      createDelegate().reconcile((EPackage) target, getReconcilerConfiguration((EModelElement) target, true));
   }

   protected EcoreReconcilerConfiguration getReconcilerConfiguration(EModelElement element, boolean createOnDemand)
   {
      EAnnotation eAnnotation = getrReconsilableEAnnotation(element, createOnDemand);
      if (eAnnotation != null)
      {
         EcoreReconcilerConfiguration configuration = EAnnotationUtil.findContent(eAnnotation,
            EcoreReconcilerConfiguration.class);
         if (configuration == null && createOnDemand)
         {
            configuration = org.sourcepit.emfx.derivation.ecore.EcoreFactory.eINSTANCE
               .createEcoreReconcilerConfiguration();
            eAnnotation.getContents().add(configuration);
         }
         return configuration;
      }
      return null;
   }

   protected EAnnotation getrReconsilableEAnnotation(EModelElement element, boolean createOnDemand)
   {
      return EAnnotationUtil.getEAnnotation(element, "reconcilable", createOnDemand);
   }

   protected Delegate createDelegate()
   {
      return new Delegate();
   }

   public static class Delegate
   {

      protected Copier sourceToTargetCopier;

      public void reconcile(EPackage reconcilable, EcoreReconcilerConfiguration configuration)
      {
         final DerivatorConfiguration derivatorConfiguration = getDerivatorConfiguration(reconcilable);
         if (derivatorConfiguration == null)
         {
            throw new IllegalArgumentException("No derivator configuration found for " + reconcilable);
         }

         final EObject derivative = DerivationHandler.INSTANCE.derive(derivatorConfiguration);

         sourceToTargetCopier = new Copier()
         {
            protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject)
            {
               eUnset(copyEObject, eReference);
               super.copyReference(eReference, eObject, copyEObject);
            }
         };

         createMapping(reconcilable, derivative);

         reconcile(reconcilable, derivative);
         sourceToTargetCopier.copyReferences();
      }

      protected DerivatorConfiguration getDerivatorConfiguration(EPackage ePackage)
      {
         EAnnotation derived = EAnnotationUtil.getEAnnotation(ePackage, "derived", false);
         if (derived != null)
         {
            return EAnnotationUtil.findContent(derived, DerivatorConfiguration.class);
         }
         return null;
      }

      protected void createMapping(EObject target, EObject source)
      {
         final MatchModel match;
         try
         {
            match = MatchService.doContentMatch(target, source, Collections.<String, Object> emptyMap());
         }
         catch (InterruptedException e)
         {
            throw new IllegalStateException(e);
         }
         fillTargetToSourceMap(sourceToTargetCopier, match.getMatchedElements(), false);
      }

      protected void reconcile(EObject target, EObject source)
      {
         reconcileAttributes(target, source);
         reconcileContainments(target, source);
      }

      protected void reconcileContainments(EObject target, EObject source)
      {
         EList<EReference> eAllContainments = source.eClass().getEAllContainments();
         for (EReference eContainmentReference : eAllContainments)
         {

            Object targetEContent = target.eGet(eContainmentReference);
            Object sourceEContent = source.eGet(eContainmentReference);

            if (sourceEContent != null)
            {

               if (sourceEContent instanceof List<?>)
               {

                  List<EObject> newContents = new ArrayList<EObject>();

                  for (EObject sourceEObject : (List<EObject>) sourceEContent)
                  {
                     EObject targetEObject = findTargetElement(sourceEObject);
                     if (targetEObject == null)
                     {
                        newContents.add(copySourceElement(sourceEObject));
                     }
                     else
                     {
                        newContents.add(targetEObject);
                        reconcile(targetEObject, sourceEObject);
                     }
                  }

                  for (EObject targetEObject : (List<EObject>) targetEContent)
                  {
                     EObject sourceEObject = findSourceElement(targetEObject);
                     if (sourceEObject == null && isKeepTargetElement(eContainmentReference, targetEObject))
                     {
                        newContents.add(targetEObject);
                     }
                  }

                  List<EObject> targetEContents = (List<EObject>) target.eGet(eContainmentReference);
                  if (!targetEContents.equals(newContents))
                  {
                     eSet(target, eContainmentReference, newContents);
                  }

               }
               else if (sourceEContent instanceof EObject)
               {
                  EObject sourceEObject = (EObject) sourceEContent;
                  EObject targetEObject = findTargetElement(sourceEObject);
                  if (targetEObject == null)
                  {
                     eSet(target, eContainmentReference, copySourceElement(sourceEObject));
                  }
                  else
                  {
                     reconcile(targetEObject, sourceEObject);
                  }
               }
               else
               {
                  throw new UnsupportedOperationException();
               }
            }
         }
      }

      protected void reconcileAttributes(EObject target, EObject source)
      {
         EList<EAttribute> eAllAttributes = source.eClass().getEAllAttributes();
         for (EAttribute eAttribute : eAllAttributes)
         {
            reconcileAttribute(eAttribute, target, source);
         }
      }

      protected void reconcileAttribute(EAttribute eAttribute, EObject target, EObject source)
      {
         if (eAttribute.isChangeable())
         {
            if (!isKeepTargetAttribute(eAttribute, target, source))
            {
               boolean isSourceSet = source.eIsSet(eAttribute);
               if (isSourceSet)
               {
                  eSet(target, eAttribute, source.eGet(eAttribute));
               }
               else if (target.eIsSet(eAttribute))
               {
                  eUnset(target, eAttribute);
               }
            }
         }
      }

      protected void eSet(EObject owner, EStructuralFeature eStructuralFeature, Object value)
      {
         owner.eSet(eStructuralFeature, value);
      }

      protected void eUnset(EObject owner, EStructuralFeature eStructuralFeature)
      {
         owner.eUnset(eStructuralFeature);
      }

      protected boolean isKeepTargetAttribute(EAttribute eAttribute, EObject target, EObject source)
      {
         return false;
      }

      protected boolean isKeepTargetElement(EReference eContainmentReference, EObject targetEObject)
      {
         return DerivationHandler.INSTANCE.isMarkedAsDerived(targetEObject);
      }

      protected EObject findTargetElement(EObject sourceEObject)
      {
         return sourceToTargetCopier.get(sourceEObject);
      }

      protected EObject findSourceElement(EObject targetEObject)
      {
         for (Entry<EObject, EObject> entry : sourceToTargetCopier.entrySet())
         {
            if (targetEObject.equals(entry.getValue()))
            {
               return entry.getKey();
            }
         }
         return null;
      }

      protected EObject copySourceElement(EObject sourceEObject)
      {
         return sourceToTargetCopier.copy(sourceEObject);
      }

      private void fillTargetToSourceMap(Map<EObject, EObject> mapping, EList<MatchElement> matchedElements,
         boolean leftToRight)
      {
         for (MatchElement matchElement : matchedElements)
         {
            if (matchElement instanceof Match2Elements)
            {
               Match2Elements match2Elements = (Match2Elements) matchElement;
               EObject left = match2Elements.getLeftElement();
               EObject right = match2Elements.getRightElement();
               if (left != null && right != null)
               {
                  if (leftToRight)
                  {
                     mapping.put(left, right);
                  }
                  else
                  {
                     mapping.put(right, left);
                  }
               }
            }
            fillTargetToSourceMap(mapping, matchElement.getSubMatchElements(), leftToRight);
         }
      }
   }
}
