
package org.sourcepit.emfx.common.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class ExtendedLoadResourceDialog extends LoadResourceDialog
{
   protected Set<EPackage> registeredPackages = new LinkedHashSet<EPackage>();

   public ExtendedLoadResourceDialog(Shell parent, EditingDomain domain)
   {
      super(parent, domain);
   }

   @Override
   protected boolean processResource(Resource resource)
   {
      // Put all static package in the package registry.
      //
      ResourceSet resourceSet = domain.getResourceSet();
      if (!resourceSet.getResources().contains(resource))
      {
         Registry packageRegistry = resourceSet.getPackageRegistry();
         for (EPackage ePackage : getAllPackages(resource))
         {
            packageRegistry.put(ePackage.getNsURI(), ePackage);
            registeredPackages.add(ePackage);
         }
      }
      return true;
   }

   public Set<EPackage> getRegisteredPackages()
   {
      return registeredPackages;
   }

   protected Collection<EPackage> getAllPackages(Resource resource)
   {
      List<EPackage> result = new ArrayList<EPackage>();
      for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(resource.getContents())
      {
         private static final long serialVersionUID = 1L;

         @Override
         protected Iterator<? extends EObject> getEObjectChildren(EObject eObject)
         {
            return eObject instanceof EPackage ? ((EPackage) eObject).getESubpackages().iterator() : Collections
               .<EObject> emptyList().iterator();
         }
      }; j.hasNext();)
      {
         Object content = j.next();
         if (content instanceof EPackage)
         {
            result.add((EPackage) content);
         }
      }
      return result;
   }

   @Override
   protected Control createDialogArea(Composite parent)
   {
      Composite composite = (Composite) super.createDialogArea(parent);
      Composite buttonComposite = (Composite) composite.getChildren()[0];
      Button browseRegisteredPackagesButton = new Button(buttonComposite, SWT.PUSH);
      browseRegisteredPackagesButton.setText("Browse &Registered Packages...");
      prepareBrowseRegisteredPackagesButton(browseRegisteredPackagesButton);
      {
         FormData data = new FormData();
         Control[] children = buttonComposite.getChildren();
         data.left = new FormAttachment(0, 0);
         data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
         browseRegisteredPackagesButton.setLayoutData(data);
      }
      return composite;
   }

   protected void prepareBrowseRegisteredPackagesButton(Button browseRegisteredPackagesButton)
   {
      browseRegisteredPackagesButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent event)
         {
            RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(getShell());
            registeredPackageDialog.open();
            Object[] result = registeredPackageDialog.getResult();
            if (result != null)
            {
               List<?> nsURIs = Arrays.asList(result);
               if (registeredPackageDialog.isDevelopmentTimeVersion())
               {
                  ResourceSet resourceSet = new ResourceSetImpl();
                  resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
                  StringBuffer uris = new StringBuffer();
                  Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin
                     .getEPackageNsURIToGenModelLocationMap();
                  for (int i = 0, length = result.length; i < length; i++)
                  {
                     URI location = ePackageNsURItoGenModelLocationMap.get(result[i]);
                     Resource resource = resourceSet.getResource(location, true);
                     EcoreUtil.resolveAll(resource);
                  }
                  for (Resource resource : resourceSet.getResources())
                  {
                     for (EPackage ePackage : getAllPackages(resource))
                     {
                        if (nsURIs.contains(ePackage.getNsURI()))
                        {
                           uris.append(resource.getURI());
                           uris.append("  ");
                           break;
                        }
                     }
                  }
                  uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
               }
               else
               {
                  StringBuffer uris = new StringBuffer();
                  for (int i = 0, length = result.length; i < length; i++)
                  {
                     uris.append(result[i]);
                     uris.append("  ");
                  }
                  uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
               }
            }
         }
      });
   }
}