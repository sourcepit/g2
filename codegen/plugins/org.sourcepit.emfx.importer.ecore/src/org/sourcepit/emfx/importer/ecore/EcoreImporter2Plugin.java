/**
 * <copyright>
 * 
 * Copyright (c) 2002-2006 IBM Corporation and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM - Initial API and implementation
 * 
 * </copyright>
 * 
 * $Id: EcoreImporter2Plugin.java,v 1.5 2006/12/28 06:53:55 marcelop Exp $
 */

package org.sourcepit.emfx.importer.ecore;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.importer.ImporterPlugin;

/**
 * The <b>Plugin</b> for the EMF.CodeGen.Ecore.Ecore library.
 * 
 * @since 2.1.0
 */
public final class EcoreImporter2Plugin extends EMFPlugin
{
   /**
    * The id of the plugin.
    */
   public static final String ID = "org.sourcepit.emfx.importer.ecore";

   /**
    * The singleton instance of the plugin.
    */
   public static final EcoreImporter2Plugin INSTANCE = new EcoreImporter2Plugin();

   /**
    * The one instance of this class.
    */
   private static Implementation plugin;

   /**
    * Creates the singleton instance.
    */
   private EcoreImporter2Plugin()
   {
      super(new ResourceLocator[] {ImporterPlugin.INSTANCE});
   }

   /*
    * Javadoc copied from base class.
    */
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
