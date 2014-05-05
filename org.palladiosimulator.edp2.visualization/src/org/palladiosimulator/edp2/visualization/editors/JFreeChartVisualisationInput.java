/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;

/**
 * Implementation of an {@link AbstractVisualizationInput} for
 * {@link JFreeChartVisualisationSingleDatastreamInput}s.
 * 
 * @author Dominik Ernst
 * 
 */
public class JFreeChartVisualisationInput<T extends Dataset>
extends AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput<T>> {

    private final Logger logger = Logger.getLogger(JFreeChartVisualisationInput.class.getCanonicalName());

    /**
     * The chart, which ultimately displays the data from this handle.
     */
    private JFreeChart chart;

    /**
     * Empty constructor.
     */
    public JFreeChartVisualisationInput() {
        super();
    }

    /**
     * Constructor with a first input.
     */
    public JFreeChartVisualisationInput(final JFreeChartVisualisationSingleDatastreamInput<T> firstInput) {
        this();
        addInput(firstInput);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#exists()
     */
    @Override
    public boolean exists() {
        return !inputs.isEmpty();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        throw new RuntimeException("Not implemented.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    @Override
    public String getName() {
        return "someName";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getPersistable()
     */
    @Override
    public IPersistableElement getPersistable() {
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getToolTipText()
     */
    @Override
    public String getToolTipText() {
        // TODO Auto-generated method stub
        return "someTT";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(final Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(final Observable o, final Object arg) {
        logger.log(Level.INFO, "update invoked");
        this.getEventDispatcher().visualisationInputChanged();
    }

    /**
     * Creates a new {@link JFreeChart}. Charts are specific for each
     * EditorInput. Typically an update of the current DataSet is recommended,
     * before the chart itself is updated.
     */
    public JFreeChart createChart() {
        chart = getInputs().get(0).getChart();
        return chart;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ISelection#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return getInputs().size() == 0;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IPersistableElement#getFactoryId()
     */
    @Override
    public String getFactoryId() {
        return JFreeChartEditorInputHandleFactory.getFactoryId();
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        // JFreeChartEditorInputHandleFactory.saveState(memento, this);
    }

    @Override
    protected PropertyConfigurable createConfiguration() {
        return new JFreeChartVisualisationConfiguration();
    }

}
