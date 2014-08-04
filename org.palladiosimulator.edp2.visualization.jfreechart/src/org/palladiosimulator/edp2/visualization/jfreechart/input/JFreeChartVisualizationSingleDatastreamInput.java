package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamConfiguration;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.jfreechart.editor.JFreeChartEditor;

/**
 * Basic implementation of an {@link AbstractVisualizationSingleDatastreamInput} for the
 * {@link JFreeChartEditor}. Responsible for common properties of any subclass of
 * {@link JFreeChartVisualizationSingleDatastreamInput}.
 * 
 * @author Dominik Ernst
 * 
 */
public class JFreeChartVisualizationSingleDatastreamInput extends AbstractVisualizationSingleDatastreamInput implements
        ISelection, IPersistableElement {

    public JFreeChartVisualizationSingleDatastreamInput() {
        this(null);
    }

    public JFreeChartVisualizationSingleDatastreamInput(final IDataSource source) {
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
        return new JFreeChartVisualizationSingleDatastreamConfiguration();
    }

    @Override
    public String getFactoryId() {
        return JFreeChartVisualizationSingleDatastreamInputFactory.FACTORY_ID;
    }

    @Override
    public void saveState(final IMemento memento) {
        JFreeChartVisualizationSingleDatastreamInputFactory.saveState(memento, this);
    }

    @Override
    public String getInputName() {
        return ((AbstractVisualizationSingleDatastreamConfiguration) getConfiguration()).getInputName();
    }

    @Override
    protected Set<String> getPropertyKeysTriggeringUpdate() {
        return new HashSet<String>(Arrays.asList(JFreeChartVisualizationSingleDatastreamConfiguration.INPUT_NAME_KEY));
    }

}
