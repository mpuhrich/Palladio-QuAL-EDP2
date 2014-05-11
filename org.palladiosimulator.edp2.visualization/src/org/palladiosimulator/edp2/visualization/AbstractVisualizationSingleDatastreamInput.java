package org.palladiosimulator.edp2.visualization;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;

/**
 * Interface used to describe elements that are managed by an
 * {@link AbstractVisualizationInput}. It is important to note that the actual
 * input to an {@link IVisualization} is the {@link AbstractVisualizationInput}
 * and not implementations of this interface.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class AbstractVisualizationSingleDatastreamInput
extends AbstractInput
implements IVisualisationSingleDatastreamInput {

    /**
     * The {@link AbstractVisualizationSingleDatastreamInput}'s or rather {@link IDataSink}'s
     * predecessor.
     */
    private IDataSource source;

    private AbstractVisualizationInput<? extends AbstractVisualizationSingleDatastreamInput> parentInput;

    public AbstractVisualizationSingleDatastreamInput() {
        this(null);
    }

    public AbstractVisualizationSingleDatastreamInput(final IDataSource source) {
        super();
        if (source != null) {
            setDataSource(source);
        }
    }

    @Override
    public IDataSource getDataSource() {
        return source;
    }

    public void setDataSource(final IDataSource source) {
        this.source = source;
        final Map<String,Object> properties = new HashMap<String,Object>(getConfiguration().getProperties());
        properties.put(AbstractVisualizationSingleDatastreamConfiguration.INPUT_NAME_KEY, getDefaultName());
        getConfiguration().setProperties(properties);
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.IVisualisationInput#getDefaultName()
     */
    private String getDefaultName() {
        if (getDataSource() != null) {
            return source.getMetricDesciption().getName();
            // TODO: Should be ...  .getMeasuredObject();
        } else {
            return "noSourceSet";
        }
    }

    <T extends AbstractVisualizationSingleDatastreamInput> void setParentInput(final AbstractVisualizationInput<T> parent) {
        this.parentInput = parent;
    }

    boolean hasParent() {
        return parentInput != null;
    }

    @SuppressWarnings("unchecked")
    <T extends AbstractVisualizationSingleDatastreamInput> AbstractVisualizationInput<T> getParent() {
        if (parentInput == null) {
            throw new IllegalStateException(
                    "No Handle set for this JFreeChartEditorInput!");
        }
        return (AbstractVisualizationInput<T>) parentInput;
    }

}
