package org.palladiosimulator.edp2.visualization.editors;

import org.eclipse.jface.viewers.ISelection;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;

/**
 * Basic implementation of an {@link AbstractVisualizationSingleDatastreamInput} for the
 * {@link JFreeChartEditor}. Responsible for common properties of any subclass
 * of {@link JFreeChartVisualisationSingleDatastreamInput}.
 * 
 * @author Dominik Ernst
 * 
 */
public class JFreeChartVisualisationSingleDatastreamInput
extends AbstractVisualizationSingleDatastreamInput
implements ISelection {

    public JFreeChartVisualisationSingleDatastreamInput() {
        this(null);
    }

    public JFreeChartVisualisationSingleDatastreamInput(final IDataSource source) {
        super(source);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.ISelection#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return this.getDataSource() != null;
    }

    @Override
    protected PropertyConfigurable createConfiguration() {
        return new JFreeChartVisualisationSingleDatastreamConfiguration();
    }

}
