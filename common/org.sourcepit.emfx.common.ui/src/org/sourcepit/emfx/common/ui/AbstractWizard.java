/*******************************************************************************
 * Copyright (c) 2011 Bernd and others. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Bernd - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.sourcepit.emfx.common.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

/**
 * @author Bernd
 */
public abstract class AbstractWizard extends Wizard implements IPageChangedListener
{
   private Set<IWizardPage> initializedPages = new HashSet<IWizardPage>();

   public void pageChanged(PageChangedEvent event)
   {
      final IWizardPage page = (IWizardPage) event.getSelectedPage();
      final boolean isFirstVisit = initializedPages.add(page);
      if (isFirstVisit)
      {
         initPage(page);
      }
   }

   protected abstract void initPage(IWizardPage page);
}
