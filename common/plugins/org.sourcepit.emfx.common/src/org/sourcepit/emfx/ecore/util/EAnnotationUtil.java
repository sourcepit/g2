
package org.sourcepit.emfx.ecore.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

public final class EAnnotationUtil
{

   private EAnnotationUtil()
   {
      super();
   }

   public static EAnnotation getEAnnotation(EModelElement element, String source, boolean createOnDemand)
   {
      EAnnotation reconcilable = element.getEAnnotation(source);
      if (reconcilable == null && createOnDemand)
      {
         reconcilable = EcoreFactory.eINSTANCE.createEAnnotation();
         reconcilable.setSource(source);
         element.getEAnnotations().add(reconcilable);
      }
      return reconcilable;
   }

   @SuppressWarnings("unchecked")
   public static <T> T findContent(EAnnotation eAnnotation, Class<T> type)
   {
      EList<EObject> contents = eAnnotation.getContents();
      for (EObject eObject : contents)
      {
         if (type.isAssignableFrom(eObject.getClass()))
         {
            return (T) eObject;
         }
      }
      return null;
   }
}
