
package org.sourcepit.emfx.derivation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.ecore.util.EAnnotationUtil;

public class DerivationHandler
{
   public static final DerivationHandler INSTANCE = new DerivationHandler();

   private final List<IDerivatorFactory> factories = new ArrayList<IDerivatorFactory>();

   private DerivationHandler()
   {
      if (DerivationPlugin.IS_ECLIPSE_RUNNING)
      {
         IExtensionPoint point = RegistryFactory.getRegistry().getExtensionPoint("org.sourcepit.emfx.derivation",
            "derivatorFactories");
         if (point != null)
         {
            IConfigurationElement[] elements = point.getConfigurationElements();
            for (IConfigurationElement element : elements)
            {
               try
               {
                  final IDerivatorFactory factory = (IDerivatorFactory) element.createExecutableExtension("class");
                  factories.add(factory);
               }
               catch (ClassCastException e)
               {
                  DerivationPlugin.getPlugin().log(e);
               }
               catch (CoreException e)
               {
                  DerivationPlugin.getPlugin().log(e);
               }
            }
         }
      }
   }

   public List<IDerivatorFactory> getFactories()
   {
      return factories;
   }

   public IDerivator createDerivator(String derivatorId)
   {
      for (IDerivatorFactory factory : factories)
      {
         if (factory.canCreate(derivatorId))
         {
            return factory.createDerivator(derivatorId);
         }
      }
      return null;
   }

   public EObject derive(DerivatorConfiguration configuration)
   {
      final IDerivator derivator = createDerivator(configuration.getDerivatorId());
      derivator.initialize(configuration);
      derivator.derive();
      EObject derivative = derivator.getDerivative();
      markAsDerived((EModelElement) derivative, configuration);
      return derivative;
   }

   public boolean isMarkedAsDerived(EObject eObject)
   {
      if (eObject instanceof EModelElement)
      {
         return getDerivedAnnotation((EModelElement) eObject, false) == null;
      }
      return false;
   }

   private void markAsDerived(EModelElement eModelElement, DerivatorConfiguration configuration)
   {
      getDerivedAnnotation(eModelElement, true).getContents().add(configuration);
      for (Iterator<EObject> it = eModelElement.eAllContents(); it.hasNext();)
      {
         EObject element = (EObject) it.next();
         if (element instanceof EAnnotation
            && IDerivator.ANNOTATION_DERIVED.equals(((EAnnotation) element).getSource()))
         {
            continue;
         }
         if (element instanceof EModelElement)
         {
            getDerivedAnnotation((EModelElement) element, true);
         }
      }
   }

   private EAnnotation getDerivedAnnotation(final EModelElement eModelElement, boolean createOnDemand)
   {
      return EAnnotationUtil.getEAnnotation(eModelElement, IDerivator.ANNOTATION_DERIVED, createOnDemand);
   }

}
