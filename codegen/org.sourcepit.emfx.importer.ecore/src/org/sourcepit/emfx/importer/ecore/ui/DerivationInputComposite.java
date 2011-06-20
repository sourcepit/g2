
package org.sourcepit.emfx.importer.ecore.ui;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;

public class DerivationInputComposite extends Composite
{
   private TableViewer rootEPackagesViewer;
   private CheckboxTreeViewer usedDerivativeEPackagesViewer;

   /**
    * Create the composite.
    * 
    * @param parent
    * @param style
    */
   public DerivationInputComposite(Composite parent, int style)
   {
      super(parent, style);
      GridLayout gridLayout = new GridLayout(1, false);
      gridLayout.marginWidth = 0;
      gridLayout.marginHeight = 0;
      setLayout(gridLayout);

      final SashForm sashForm = new SashForm(this, SWT.VERTICAL);
      sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      Group grpInputEpackages = new Group(sashForm, SWT.NONE);
      grpInputEpackages.setText("Root packages");
      grpInputEpackages.setData("name", "grpInputEpackages");
      grpInputEpackages.setLayout(new GridLayout(2, false));

      Label lblAddAndSelect = new Label(grpInputEpackages, SWT.WRAP);
      lblAddAndSelect.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblAddAndSelect.setData("name", "lblAddAndSelect");
      lblAddAndSelect.setText("Add and check the packages you want to create derivatives for.");

      rootEPackagesViewer = new TableViewer(grpInputEpackages, SWT.BORDER | SWT.FULL_SELECTION);
      Table table = rootEPackagesViewer.getTable();
      table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
      table.setData("name", "table");
      table.setHeaderVisible(true);

      TableViewerColumn tableViewerColumn = new TableViewerColumn(rootEPackagesViewer, SWT.NONE);
      TableColumn tblclmnPackages = tableViewerColumn.getColumn();
      tblclmnPackages.setWidth(197);
      tblclmnPackages.setText("Packages");

      TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(rootEPackagesViewer, SWT.NONE);
      TableColumn tblclmnAction = tableViewerColumn_1.getColumn();
      tblclmnAction.setWidth(124);
      tblclmnAction.setText("Action");

      final Button btnAdd_1 = new Button(grpInputEpackages, SWT.NONE);
      btnAdd_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAdd_1.setText("Add...");

      Group grpReferencedDerivatives = new Group(sashForm, SWT.NONE);
      grpReferencedDerivatives.setText("Referenced derivatives");
      grpReferencedDerivatives.setData("name", "grpReferencedDerivatives");
      grpReferencedDerivatives.setLayout(new GridLayout(2, false));

      Label lblAddDerivates = new Label(grpReferencedDerivatives, SWT.WRAP);
      lblAddDerivates.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
      lblAddDerivates.setData("name", "lblAddDerivates");
      lblAddDerivates.setText("Add existing derivatives of the packages above that should be reused.");

      usedDerivativeEPackagesViewer = new CheckboxTreeViewer(grpReferencedDerivatives, SWT.BORDER);
      Tree tree = usedDerivativeEPackagesViewer.getTree();
      tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      final Button btnAdd = new Button(grpReferencedDerivatives, SWT.NONE);
      btnAdd.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
      btnAdd.setText("Add...");
      sashForm.setWeights(new int[] {180, 133});

   }

   @Override
   protected void checkSubclass()
   {
      // Disable the check that prevents subclassing of SWT components
   }

   public TableViewer getRootEPackagesViewer()
   {
      return rootEPackagesViewer;
   }

   public CheckboxTreeViewer getUsedDerivativeEPackagesViewer()
   {
      return usedDerivativeEPackagesViewer;
   }
}
