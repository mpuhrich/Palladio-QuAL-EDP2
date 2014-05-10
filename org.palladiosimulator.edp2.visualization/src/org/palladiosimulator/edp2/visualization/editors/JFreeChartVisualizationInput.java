/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.AbstractDataset;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;

/**
 * Implementation of an {@link AbstractVisualizationInput} for
 * {@link JFreeChartVisualisationSingleDatastreamInput}s.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class JFreeChartVisualizationInput
extends AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput> {

    private AbstractDataset currentCachedDataset;

    /**
     * Empty constructor.
     */
    public JFreeChartVisualizationInput() {
        super();
    }

    /**
     * Constructor with a first input.
     */
    public JFreeChartVisualizationInput(final JFreeChartVisualisationSingleDatastreamInput firstInput) {
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
        return ImageDescriptor.getMissingImageDescriptor();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    @Override
    public String getName() {
        return "JFreeChart EDP2 Editor";
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
        return getName();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(final Class adapter) {
        return null;
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
        return JFreeChartVisualisationInputFactory.getFactoryId();
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        // JFreeChartEditorInputHandleFactory.saveState(memento, this);
    }

    /**
     * Creates a new {@link JFreeChart}. Charts are specific for each
     * EditorInput. Typically an update of the current DataSet is recommended,
     * before the chart itself is updated.
     */
    final JFreeChart createChart() {
        if (currentCachedDataset == null) {
            reloadDataset();
        }
        final JFreeChartVisualisationConfiguration configuration = getConfiguration();
        final Plot plot = generatePlot(configuration, currentCachedDataset);

        return new JFreeChart(
                configuration.isShowTitle() ? configuration.getTitle() : null,
                        JFreeChart.DEFAULT_TITLE_FONT, plot, configuration.isShowLegend());
    }

    void reloadDataset() {
        currentCachedDataset = generateDataset();
    }

    @Override
    protected PropertyConfigurable createConfiguration() {
        return new JFreeChartVisualisationConfiguration();
    }

    protected abstract Plot generatePlot(final PropertyConfigurable config, final AbstractDataset dataset);

    protected abstract AbstractDataset generateDataset();

}
