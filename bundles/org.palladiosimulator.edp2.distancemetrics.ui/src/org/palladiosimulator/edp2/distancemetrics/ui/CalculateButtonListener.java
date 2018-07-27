package org.palladiosimulator.edp2.distancemetrics.ui;

import java.util.logging.Logger;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Event;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.DistanceMetricExtension;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.Activator;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.jscience.physics.amount.Amount;

/**
 * This is a listener, that controls the behavior of the calculate button depending on if R is started or not and
 * if a distance metric is selected from the drop down menu or not.
 * 
 * @author Christian Schaf
 */
public class CalculateButtonListener implements Listener {
    private static final Logger LOGGER = Logger.getLogger(CalculateButtonListener.class.getCanonicalName());

	private DistanceMetricViewer dmViewer1;
	private DistanceMetricViewer dmViewer2;
	private Button buttonCalculateDistance;
	private Combo comboDropDown;
	private DistanceMetricExtensionHandler dmeHandler;
    private Text resultText;
	
    /**
     * Initializes this listener with all necessary objects.
     * @param dmViewer1 Viewer the first measurement should be selected from.
     * @param dmViewer2 Viewer the second measurement should be selected from.
     * @param buttonCalculateDistance Button, that executes the calculation.
     * @param comboDropDown Drop down menu the distance metric should be taken from.
     * @param resultText Text field where result should be displayed.
     * @param dmeHandler Handler that keeps all DistanceMetricExtensions.
     */
	CalculateButtonListener(DistanceMetricViewer dmViewer1, DistanceMetricViewer dmViewer2, Button buttonCalculateDistance, 
			Combo comboDropDown, Text resultText, DistanceMetricExtensionHandler dmeHandler) {
		this.dmViewer1 = dmViewer1;
		this.dmViewer2 = dmViewer2;
		this.buttonCalculateDistance = buttonCalculateDistance;
		this.comboDropDown = comboDropDown;
		this.resultText = resultText;
		this.dmeHandler = dmeHandler;
	}
		
	
	@Override
    public void handleEvent(final Event event) {
        if (event.widget == buttonCalculateDistance) {
            final IStructuredSelection selection1 = (IStructuredSelection) dmViewer1.getViewer().getStructuredSelection();
            final AbstractVisualizationSingleDatastreamInput lastSelectedInput1
            = (AbstractVisualizationSingleDatastreamInput) selection1
                    .getFirstElement();
            
            final IStructuredSelection selection2 = (IStructuredSelection) dmViewer2.getViewer().getStructuredSelection();
            final AbstractVisualizationSingleDatastreamInput lastSelectedInput2
            = (AbstractVisualizationSingleDatastreamInput) selection2
                    .getFirstElement();
            
            if (lastSelectedInput1 != null && lastSelectedInput2 != null) {
                lastSelectedInput1.getDataSource();
                final Edp2DataTupleDataSource dataSource1 = (Edp2DataTupleDataSource) lastSelectedInput1.getDataSource();
                final Edp2DataTupleDataSource dataSource2 = (Edp2DataTupleDataSource) lastSelectedInput2.getDataSource();
                
        		IDataStream<TupleMeasurement> stream1 = dataSource1.getDataStream();
        		IDataStream<TupleMeasurement> stream2 = dataSource2.getDataStream();
        		
                // Choose selected algorithm from Combo
                LOGGER.info("Selected index: " + comboDropDown.getSelectionIndex());
                if (comboDropDown.getSelectionIndex() == -1) {
                	MessageDialog.openError(
                            Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                            "No distance metric algorithm selected",
                            "Please select a distance metric algorithm from the drop down menu.");
                } else {
                	final DistanceMetricExtension dme
                	= dmeHandler.getDistanceMetricExtensionList().get(comboDropDown.getSelectionIndex());
                	buttonCalculateDistance.setEnabled(false);
                	executeDM(dme, stream1, stream2);
                }
                } else {
                    MessageDialog.openError(
                            Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                            "No data series selected",
                            "Please select two data series to compare with.");
                }
        }
    }

	/**
	 * Executes the distance metric of the given distance metric extension. Also disables button
	 * during calculation and enables it afterwards.
	 * @param dme The DistaceMetricExtension of the distance metric, that should be executed.
	 * @param stream1 First measurement for distance metric calculation.
	 * @param stream2 Second measurement for distance metric calculation.
	 */
	private void executeDM(DistanceMetricExtension dme,
			IDataStream<TupleMeasurement> stream1, IDataStream<TupleMeasurement> stream2) {
        ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
            	LOGGER.info("Exception in execution of distance metric algorithm."
            			+ " The DistanceMetric Extension to execute might not work properly.");
            }

            @Override
            public void run() throws Exception {
            	Amount<?> result = dme.calculateDistance(stream1, stream2);
            	if (result != null) {
	                LOGGER.info("Calculated distance of the two selected measurements is: " + result.toString());
	            	resultText.setText(result.toString());
            	} else {
            		LOGGER.info("Calculation could not be executeed. Something went wrong here!");
            	}
            	buttonCalculateDistance.setEnabled(true);
            }
          };
          SafeRunner.run(runnable);
	}

}

