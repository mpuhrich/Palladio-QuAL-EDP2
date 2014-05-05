package org.palladiosimulator.edp2.visualization;

import java.util.Collections;
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
     * Keys used for persistence of properties.
     */
    public static final String INPUT_NAME_KEY = "inputName";

    /**
     * The properties of this {@link AbstractVisualizationSingleDatastreamInput}, which are persisted
     * and displayed in the 'Display'-Tab of the Properties-View.
     */
    protected final Map<String, Object> properties;

    /**
     * The {@link AbstractVisualizationSingleDatastreamInput}'s or rather {@link IDataSink}'s
     * predecessor.
     */
    private IDataSource source;

    /**
     * A display name for this {@link AbstractVisualizationSingleDatastreamInput}.
     */
    private String inputName;

    private AbstractVisualizationInput<? extends AbstractVisualizationSingleDatastreamInput> parentInput;

    public AbstractVisualizationSingleDatastreamInput() {
        this(null);
    }

    public AbstractVisualizationSingleDatastreamInput(final IDataSource source) {
        super();
        properties = new HashMap<String, Object>();
        if (source != null) {
            setDataSource(source);
        }
    }

    @Override
    public IDataSource getDataSource() {
        return source;
    }

    private void setDataSource(final IDataSource source) {
        this.source = source;
        properties.put(INPUT_NAME_KEY, getInputName());
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

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.IVisualisationInput#getInputName()
     */
    @Override
    public String getInputName() {
        if (inputName == null) {
            return getDefaultName();
        }
        return inputName;
    }

    public final Map<String,Object> getProperties(){
        return Collections.unmodifiableMap(this.properties);
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
