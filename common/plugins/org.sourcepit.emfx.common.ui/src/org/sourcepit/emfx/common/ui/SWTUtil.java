/*******************************************************************************
 * Copyright (c) 2011 Bernd and others. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Bernd - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.sourcepit.emfx.common.ui;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.swt.widgets.Widget;

/**
 * @author Bernd
 */
public final class SWTUtil
{
   private SWTUtil()
   {
      super();
   }

   public static void asyncExec(final Widget context, final Runnable runnable)
   {
      if (!context.isDisposed())
      {
         context.getDisplay().asyncExec(new Runnable()
         {
            public void run()
            {
               if (!context.isDisposed())
               {
                  runnable.run();
               }
            }
         });
      }
   }

   public static class ReducingAsyncRunner
   {
      protected final AtomicInteger validationMutex = new AtomicInteger();

      protected final Widget context;

      protected Runnable runnable;

      public ReducingAsyncRunner(Widget context)
      {
         this(context, null);
      }

      public ReducingAsyncRunner(Widget context, Runnable runnable)
      {
         this.context = context;
         this.runnable = runnable;
      }

      public void asyncExec()
      {
         asyncExec(runnable);
      }

      public void asyncExec(final Runnable runnable)
      {
         synchronized (validationMutex)
         {
            final int startIdx = validationMutex.incrementAndGet();
            SWTUtil.asyncExec(context, new Runnable()
            {
               public void run()
               {
                  synchronized (validationMutex)
                  {
                     int currentIdx = validationMutex.get();
                     if (currentIdx > startIdx)
                     {
                        // skip runnable, there is another waiting in the UI queue
                        return;
                     }
                     validationMutex.set(0);
                  }
                  runnable.run();
               }
            });
         }
      }
   }
}
