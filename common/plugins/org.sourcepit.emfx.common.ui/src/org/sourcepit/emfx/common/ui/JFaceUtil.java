
package org.sourcepit.emfx.common.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

public final class JFaceUtil
{
   private JFaceUtil()
   {
      super();
   }

   @SuppressWarnings("unchecked")
   public static <T> List<T> getElements(ISelection selection, Class<T> type)
   {
      List<T> eObjects = new ArrayList<T>();
      for (Object selected : getStructuredSelection(selection).toList())
      {
         if (type.isAssignableFrom(selected.getClass()))
         {
            eObjects.add((T) selected);
         }
      }
      return eObjects;
   }

   public static IStructuredSelection getStructuredSelection(final ISelection selection)
   {
      if (selection instanceof IStructuredSelection)
      {
         return (IStructuredSelection) selection;
      }
      return StructuredSelection.EMPTY;
   }
}
