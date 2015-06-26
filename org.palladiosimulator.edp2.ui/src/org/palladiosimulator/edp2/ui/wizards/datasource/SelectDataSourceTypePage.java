/**
 *
 */
package org.palladiosimulator.edp2.ui.wizards.datasource;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Allows to select the type of a data source. All known (and selectable) data sources are available
 * as constants.
 *
 * @author groenda, Sebastian Lehrig
 *
 */
public class SelectDataSourceTypePage extends WizardPage {

    public static final String IN_MEMORY_DATA_SOURCE = "In-Memory data source";
    public static final String FILE_DATA_SOURCE = "File data source";

    /** Contains the representation of the current selection. */
    private String selection;

    public SelectDataSourceTypePage() {
        super("wizardPage");

        setTitle("Select Type of Data Source");
        setDescription("Please select the type of the data source you want to open.");
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        final Composite container = new Composite(parent, SWT.NULL);
        setControl(container);

        final Label label = new Label(container, SWT.NONE);
        label.setText("Type of data source: ");
        label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

        final Combo selectedDataTypeCombo = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY);
        selectedDataTypeCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetDefaultSelected(final SelectionEvent e) {
                widgetSelected(e);
            }

            @Override
            public void widgetSelected(final SelectionEvent e) {
                SelectDataSourceTypePage.this.selection = selectedDataTypeCombo.getText();
                setPageComplete(true);
            }
        });
        populateComboBox(selectedDataTypeCombo);

        // The additional spacing (default is 5,5) is for the decorations
        GridLayoutFactory.swtDefaults().numColumns(2).spacing(10, 5).generateLayout(container);
    }

    /**
     * Populates the combo box with all selectable data source types.
     *
     * @param selectedDataType
     *            Combo box to be populated.
     */
    private void populateComboBox(final Combo selectedDataType) {
        selectedDataType.add(IN_MEMORY_DATA_SOURCE);
        selectedDataType.select(0);
        selectedDataType.add(FILE_DATA_SOURCE);
        this.selection = IN_MEMORY_DATA_SOURCE;
    }

    /**
     * Get the current selected data type. Returns an empty string if no data source type is
     * selected.
     *
     * @return The string representing the selection.
     */
    public String getSelection() {
        return this.selection;
    }

}
