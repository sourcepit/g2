
package org.sourcepit.emfx.derivation.ecore;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.sourcepit.emfx.ecore.util.EAnnotationUtil;

public final class EcoreDerivatorUtil
{
   private EcoreDerivatorUtil()
   {
      super();
   }

   public static EcoreDerivatorConfiguration findEcoreDerivatorConfiguration(EPackage derivedEPackage)
   {
      EAnnotation derived = EAnnotationUtil.getEAnnotation(derivedEPackage, "derived", false);
      if (derived != null)
      {
         return EAnnotationUtil.findContent(derived, EcoreDerivatorConfiguration.class);
      }
      return null;
   }

   public static EPackage findOriginEPackage(EPackage derivedEPackage)
   {
      final EcoreDerivatorConfiguration derivatorConfiguration = findEcoreDerivatorConfiguration(derivedEPackage);
      if (derivatorConfiguration != null)
      {
         return derivatorConfiguration.getOrigin();
      }
      return null;
   }
}
