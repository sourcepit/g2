/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class ResourceAdapter extends EContentAdapter
{
   @Override
   protected void setTarget(Resource target)
   {
      basicSetTarget(target);
   }

   @Override
   protected void setTarget(EObject target)
   {
      throw new IllegalStateException();
   }

   @Override
   protected void unsetTarget(Resource target)
   {
      basicUnsetTarget(target);
   }

   @Override
   protected void unsetTarget(EObject target)
   {
      throw new IllegalStateException();
   }

   @Override
   protected void addAdapter(Notifier notifier)
   {
      if (notifier instanceof Resource || notifier instanceof ResourceSet)
      {
         super.addAdapter(notifier);
      }
   }

   @Override
   public void notifyChanged(Notification msg)
   {
      super.notifyChanged(msg);

      final Object notifier = msg.getNotifier();
      if (notifier instanceof Resource)
      {
         notifyResourceChanged(msg);
      }
      else if (notifier instanceof ResourceSet)
      {
         notifyResourceSetChanged(msg);
      }
   }

   protected void notifyResourceSetChanged(Notification msg)
   {
   }

   protected void notifyResourceChanged(Notification msg)
   {
   }
}