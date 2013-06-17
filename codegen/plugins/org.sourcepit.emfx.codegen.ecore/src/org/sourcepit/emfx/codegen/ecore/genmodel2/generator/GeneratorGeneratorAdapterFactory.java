
package org.sourcepit.emfx.codegen.ecore.genmodel2.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenClass2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenModel2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.GenPackage2;
import org.sourcepit.emfx.codegen.ecore.genmodel2.util.GenModel2Switch;

public class GeneratorGeneratorAdapterFactory extends AbstractGeneratorAdapterFactory
{

   protected Map<Class<? extends AbstractGeneratorAdapter>, AbstractGeneratorAdapter> adapterMap = new HashMap<Class<? extends AbstractGeneratorAdapter>, AbstractGeneratorAdapter>();

   protected GenModel2Switch<Adapter> modelSwitch = new GenModel2Switch<Adapter>()
   {
      public Adapter caseGenModel2(GenModel2 object)
      {
         return getGenModel2Adapter();
      };

      public Adapter caseGenPackage2(GenPackage2 object)
      {
         return getGenPackage2Adapter();
      };

      public Adapter caseGenClass2(GenClass2 object)
      {
         return getGenClass2Adapter();
      };
   };

   @Override
   protected Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }

   protected Adapter getGenModel2Adapter()
   {
      AbstractGeneratorAdapter adapter = adapterMap.get(GenModel2GeneratorGeneratorAdapter.class);
      if (adapter == null)
      {
         adapter = new GenModel2GeneratorGeneratorAdapter(this);
         adapterMap.put(GenModel2GeneratorGeneratorAdapter.class, adapter);
      }
      return adapter;
   }

   protected Adapter getGenPackage2Adapter()
   {
      AbstractGeneratorAdapter adapter = adapterMap.get(GenPackage2GeneratorGeneratorAdapter.class);
      if (adapter == null)
      {
         adapter = new GenPackage2GeneratorGeneratorAdapter(this);
         adapterMap.put(GenPackage2GeneratorGeneratorAdapter.class, adapter);
      }
      return adapter;
   }

   protected Adapter getGenClass2Adapter()
   {
      AbstractGeneratorAdapter adapter = adapterMap.get(GenClass2GeneratorGeneratorAdapter.class);
      if (adapter == null)
      {
         adapter = new GenClass2GeneratorGeneratorAdapter(this);
         adapterMap.put(GenClass2GeneratorGeneratorAdapter.class, adapter);
      }
      return adapter;
   }

   @Override
   public void dispose()
   {
      for (AbstractGeneratorAdapter adapter : adapterMap.values())
      {
         adapter.dispose();
      }
   }
}
