
package org.sourcepit.emfx.derivation.ui.internal.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;

public abstract class AbstractCheckStateProvider implements ICheckStateProvider, ICheckStateListener
{
   private ITreeContentProvider treeContentProvider;

   private StructuredViewer viewer;

   public AbstractCheckStateProvider(StructuredViewer viewer)
   {
      if (!(viewer instanceof ICheckable))
      {
         throw new IllegalArgumentException("Viewer must be instanceof ICheckable.");
      }
      this.viewer = viewer;

      final IContentProvider cp = viewer.getContentProvider();
      if (cp instanceof ITreeContentProvider)
      {
         treeContentProvider = (ITreeContentProvider) cp;
      }

      ((ICheckable) viewer).addCheckStateListener(this);
   }

   public boolean isGrayed(Object element)
   {
      if (treeContentProvider != null)
      {
         boolean allChecked = true;
         boolean allUnchecked = true;
         final Object[] children = treeContentProvider.getChildren(element);
         if (children == null)
         {
            return false;
         }

         for (Object object : children)
         {
            if (isChecked(object))
            {
               allUnchecked = false;
            }
            else
            {
               allChecked = false;
            }
         }

         if (allUnchecked)
         {
            for (Object object : children)
            {
               if (isGrayed(object))
               {
                  return true;
               }
            }
         }

         if (allChecked)
         {
            return false;
         }
         else
         {
            return true;
         }

      }
      return false;
   }

   public void checkStateChanged(CheckStateChangedEvent event)
   {
      final Object element = event.getElement();
      checkChildren(element, event.getChecked());
      updateParents(element);
   }

   protected void updateParents(final Object element)
   {
      if (treeContentProvider != null)
      {
         final List<Object> parents = new ArrayList<Object>();
         Object parent = treeContentProvider.getParent(element);
         while (parent != null)
         {
            parents.add(parent);
            parent = treeContentProvider.getParent(parent);
         }
         update(parents);
      }
   }

   protected void checkChildren(Object element, boolean state)
   {
      if (viewer instanceof CheckboxTreeViewer)
      {
         ((CheckboxTreeViewer) viewer).setSubtreeChecked(element, state);
      }
   }

   protected void update(final List<Object> elements)
   {
      viewer.getControl().getDisplay().asyncExec(new Runnable()
      {
         public void run()
         {
            if (!viewer.getControl().isDisposed())
            {
               viewer.update(elements.toArray(), null);
            }
         }
      });
   }
}
