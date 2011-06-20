/**
 * <copyright>
 * 
 * Copyright (c) 2002-2007 IBM Corporation and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM - Initial API and implementation
 * 
 * </copyright>
 * 
 * $Id: DerivationPlugin.java,v 1.14 2009/10/20 09:50:21 emerks Exp $
 */

package org.sourcepit.emfx.derivation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

public final class DerivationPlugin extends EMFPlugin
{
   /**
    * The singleton instance of the plugin.
    */
   public static final DerivationPlugin INSTANCE = new DerivationPlugin();

   /** Plug-in id. */
   public static final String ID = "org.sourcepit.emfx.derivation";

   /**
    * The one instance of this class.
    */
   private static Implementation plugin;

   /**
    * Creates the singleton instance.
    */
   private DerivationPlugin()
   {
      super(new ResourceLocator[] {});
   }

   @Override
   public ResourceLocator getPluginResourceLocator()
   {
      return plugin;
   }

   /**
    * Returns the singleton instance of the Eclipse plugin.
    * 
    * @return the singleton instance.
    */
   public static Implementation getPlugin()
   {
      return plugin;
   }

   /**
    * The actual implementation of the Eclipse <b>Plugin</b>.
    */
   public static class Implementation extends EclipsePlugin
   {
      /**
       * Creates an instance.
       */
      public Implementation()
      {
         super();

         // Remember the static instance.
         //
         plugin = this;
      }
   }
}
