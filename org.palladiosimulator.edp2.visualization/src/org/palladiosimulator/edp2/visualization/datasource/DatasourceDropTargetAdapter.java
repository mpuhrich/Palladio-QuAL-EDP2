/**
 * 
 */
package org.palladiosimulator.edp2.visualization.datasource;

import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;
import org.palladiosimulator.edp2.visualization.IVisualisationSingleDatastreamInput;

/**
 * @author Dominik Ernst
 *
 */
public class DatasourceDropTargetAdapter<T extends IVisualisationSingleDatastreamInput> extends DropTargetAdapter {

    private final IVisualisationInput<T> visualizationInput;

    public DatasourceDropTargetAdapter(final IVisualisationInput<T> iVisualisationInput) {
        this.visualizationInput = iVisualisationInput;
    }

    @Override
    public void drop(final DropTargetEvent event) {
        final IStructuredSelection selection = (IStructuredSelection) LocalSelectionTransfer.getTransfer()
                .getSelection();
        if (selection.getFirstElement() instanceof Measurement) {

            final Measurement measurement = (Measurement) selection.getFirstElement();
            final RawMeasurements rawMeasurements = measurement.getMeasurementRanges().get(0).getRawMeasurements();
            final IDataSource newSource = new Edp2DataTupleDataSource(rawMeasurements);
            final IVisualisationSingleDatastreamInput newInput = visualizationInput.createNewInput(newSource);
            visualizationInput.addInput((T) newInput);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.swt.dnd.DropTargetAdapter#dragOperationChanged(org.eclipse.swt.dnd.DropTargetEvent
     * )
     */
    @Override
    public void dragOperationChanged(final DropTargetEvent event) {
        event.detail = DND.DROP_LINK;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.dnd.DropTargetAdapter#dragEnter(org.eclipse.swt.dnd.DropTargetEvent)
     */
    @Override
    public void dragEnter(final DropTargetEvent event) {
        event.detail = DND.DROP_LINK;
    }

}
