package org.palladiosimulator.edp2.distancemetrics.ui;

import java.util.logging.Logger;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.IVisualisationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.properties.sections.InputElementContentProvider;

/**
 * A list which shows the all measurements from the selected visualization.
 * It has two columns. One for the description and one for the metric of
 * the given measurement.
 * 
 * @author Christian Schaf
 */
public class DistanceMetricViewer {
	
    private static final Logger LOGGER = Logger.getLogger(DistanceMetricViewer.class.getCanonicalName());
    
	private TableViewer tableViewer;
	
	/**
	 * Initializes the table viewer with a given composite.
	 * @param composite The Composite, the DistanceMetricViewer should be displayed on.
	 */
	public DistanceMetricViewer(Composite composite) {
        tableViewer = new TableViewer(composite);
        Table table = tableViewer.getTable();
        table.setLayoutData(new GridData(310, 140));
        table.setHeaderVisible(true);    
        table.setLinesVisible(true); 

	    
	    TableViewerColumn viewerCol = new TableViewerColumn(tableViewer, SWT.NONE);
	    final TableColumn column = viewerCol.getColumn();
	    column.setText("Description");
	    column.setWidth(100);
	    viewerCol.setLabelProvider(new ColumnLabelProvider() {
	        @Override
	        public String getText(Object element) {
	        	return ((IVisualisationSingleDatastreamInput) element).getInputName();
	        }
	      });
	    
	    TableViewerColumn viewerCol2 = new TableViewerColumn(tableViewer, SWT.NONE);
	    final TableColumn column2 = viewerCol2.getColumn();
	    column2.setText("Metric");
	    column2.setWidth(210);
	    viewerCol2.setLabelProvider(new ColumnLabelProvider() {
	        @Override
	        public String getText(Object element) {
	        	return ((IVisualisationSingleDatastreamInput) element)
	        			.getDataSource().getDataStream().getMetricDesciption().getName().toString();
	        }
	      });

	    // Set content provider to deliver the data from the EDP2 plugin
		tableViewer.setContentProvider(new InputElementContentProvider());
		// Only needed, if no content provider is set
		tableViewer.setInput(null);
	}

	/**
	 * Returns the TableViewer represented by this class.
	 * @return Returns the created TableViewer object.
	 */
	public TableViewer getViewer() {
		return this.tableViewer;
	}
	
	/**
	 * Gives you the last selected input of this DistanceMetricViewer.
	 * @return Returns the last selected AbstractVisualizationSingleDatastreamInput or null, if no instantiation is possible.
	 */
	public AbstractVisualizationSingleDatastreamInput getLastSelectedInput() {
        final IStructuredSelection selection = this.getViewer().getStructuredSelection();
        AbstractVisualizationSingleDatastreamInput lastSelectedInput;
        if (selection.getFirstElement() instanceof AbstractVisualizationSingleDatastreamInput) {
            lastSelectedInput = (AbstractVisualizationSingleDatastreamInput) selection
                .getFirstElement();
        } else {
        	/* No instantiation possible, because selection.getFirstElement()
        	* is no AbstractVisualizationSingleDatastreamInput. */
        	lastSelectedInput = null;
        	LOGGER.warning("Data source could not be selected. Selection is no AbstractVisualizationSingleDatastreamInput.");
        }
        return lastSelectedInput;
	}
	
    /**
     * Helper method, that returns the Edp2DataTupleDataSource from the
     * current selection of the DistanceMetricViewer.
     * selection should be taken from.
     * @return Returns the data source of the current selection of the passed DistanceMetricViewer.
     * Returns null, if data source could not be retrieved e.g. due to instantiation issues.
     */
    public Edp2DataTupleDataSource getDataSource() {
        AbstractVisualizationSingleDatastreamInput lastSelectedInput = this.getLastSelectedInput();

        Edp2DataTupleDataSource dataSource = null;
        if (lastSelectedInput != null) {
        	if (lastSelectedInput.getDataSource() instanceof Edp2DataTupleDataSource) {
        		dataSource = (Edp2DataTupleDataSource) lastSelectedInput.getDataSource();
            	LOGGER.info(dataSource.toString() + " data source selected");
        	} else {
            	dataSource = null;
            	LOGGER.warning("Data source could not be selected. Data source is no Edp2DataTupleDataSource.");
        	}
        } else {
        	dataSource = null;
        	LOGGER.warning("Data source could not be selected. Selection is no AbstractVisualizationSingleDatastreamInput.");
        }
    	return dataSource;
    }
}
