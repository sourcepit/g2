/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.g2.derivation;

import static org.eclipse.emf.common.notify.Notification.ADD;
import static org.eclipse.emf.common.notify.Notification.ADD_MANY;
import static org.eclipse.emf.common.notify.Notification.REMOVE;
import static org.eclipse.emf.common.notify.Notification.REMOVE_MANY;
import static org.eclipse.emf.ecore.resource.Resource.RESOURCE__ERRORS;
import static org.eclipse.emf.ecore.resource.Resource.RESOURCE__WARNINGS;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class ResourceDiagnosticsObserver extends ResourceAdapter
{
   @Override
   @SuppressWarnings("unchecked")
   protected void notifyResourceChanged(Notification msg)
   {
      final int featureID = msg.getFeatureID(Resource.class);
      if (RESOURCE__ERRORS == featureID || RESOURCE__WARNINGS == featureID)
      {
         final int eventType = msg.getEventType();

         final Collection<Diagnostic> values;

         if (ADD == eventType)
         {
            values = Collections.singleton((Diagnostic) msg.getNewValue());
         }
         else if (ADD_MANY == eventType)
         {
            values = (Collection<Diagnostic>) msg.getNewValue();
         }
         else if (REMOVE == eventType)
         {
            values = Collections.singleton((Diagnostic) msg.getOldValue());
         }
         else if (REMOVE_MANY == eventType)
         {
            values = (Collection<Diagnostic>) msg.getOldValue();
         }
         else
         {
            throw new IllegalStateException();
         }

         switch (eventType)
         {
            case ADD :
            case ADD_MANY :
               notifyDiagnosticsAdded((Resource) msg.getNotifier(), featureID, values);
               break;
            case REMOVE :
            case REMOVE_MANY :
               notifyDiagnosticsRemoved((Resource) msg.getNotifier(), featureID, values);
               break;
            default :
               throw new IllegalStateException();
         }
      }
   }

   protected void notifyDiagnosticsAdded(Resource notifier, int featureID, Collection<Diagnostic> values)
   {
   }

   protected void notifyDiagnosticsRemoved(Resource notifier, int featureID, Collection<Diagnostic> values)
   {
   }
}