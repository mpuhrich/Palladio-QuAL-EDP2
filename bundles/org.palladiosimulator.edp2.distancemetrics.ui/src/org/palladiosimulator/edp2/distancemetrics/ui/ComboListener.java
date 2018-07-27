package org.palladiosimulator.edp2.distancemetrics.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.DistanceMetricExtension;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.properties.PropertyAccess;
import org.palladiosimulator.edp2.visualization.Activator;

/**
 * Creates a listener for the combo drop down that contains
 * the distance metrics. It notifies the user, if no distance metric
 * has been selected and he tries to press the calculate button.
 * If a another distance metric is selected, this listener changes
 * the displayed properties to the currently selected distance
 * metric or shows none, if the distance metric doesn't have any.
 * 
 * @author Christian Schaf
 *
 */
public class ComboListener implements SelectionListener {
	
    private Combo comboDropDown;
    private DistanceMetricExtensionHandler dmeHandler;
    private Group groupProperties;
    private Composite composite;
    private TabbedPropertySheetPage aTabbedPropertySheetPage;
    private Composite currentProps = null;
    private Text descriptionText;
    
    /**
     * 
     * @param comboDropDown Drop down menu the distance metric should be taken from.
     * @param dmeHandler Handler that keeps all DistanceMetricExtensions.
     * @param composite Composite, which should be the parent of properties Group. 
     * @param aTabbedPropertySheetPage For horizontal scroll bar refresh needed.
     * @param descriptionText Text field, where description of selected distance metric should be displayed.
     */
	ComboListener(Combo comboDropDown, DistanceMetricExtensionHandler dmeHandler, 
			Composite composite, TabbedPropertySheetPage aTabbedPropertySheetPage, Text descriptionText) {
		this.comboDropDown = comboDropDown;
		this.dmeHandler = dmeHandler;
		this.composite = composite;
		this.aTabbedPropertySheetPage = aTabbedPropertySheetPage;
		this.descriptionText = descriptionText;
	}

	/**
	 * Takes care of displaying all information that is relevant to the currently
	 * selected distance metric.
	 */
	@Override
	public void widgetSelected(SelectionEvent event) {
		/* Error handling if no distance metric is selected and displaying or disposing
		* properties of distance metric */
        if (comboDropDown.getSelectionIndex() == -1) {
        	MessageDialog.openError(
                    Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                    "No distance metric algorithm selected",
                    "Please select a distance metric algorithm from the drop down menu.");
        } else {
        	final DistanceMetricExtension dme = dmeHandler
        			.getDistanceMetricExtensionList().get(comboDropDown.getSelectionIndex());
    		if (groupProperties != null) {
			groupProperties.dispose();
		}
        	if (dme instanceof PropertyAccess) {
        		createProperties((PropertyAccess) dme);
        	}
            aTabbedPropertySheetPage.resizeScrolledComposite();
        }
        
        // Set description text
		final DistanceMetricExtension dme
		= dmeHandler.getDistanceMetricExtensionList().get(comboDropDown.getSelectionIndex());
		descriptionText.setText(dme.getDistanceMetricDescription());
	}
	
    /**
     * Creates the properties for a distance metric extension which
     * has a properties widget.
     * @param pa The distance metric extension, which the properties
     * widget should be taken from.
     */
	private void createProperties(PropertyAccess pa) {
        groupProperties = new Group(this.composite, SWT.HORIZONTAL);
        groupProperties.setText("Properties");
        groupProperties.setLayout(new GridLayout(1, false));
		if (currentProps != null) {
			currentProps.dispose();
		}
        currentProps = (ScrolledComposite) pa.getPropertiesWidget(groupProperties, SWT.NONE);
        this.composite.layout();
        this.composite.update();
        this.composite.redraw();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
