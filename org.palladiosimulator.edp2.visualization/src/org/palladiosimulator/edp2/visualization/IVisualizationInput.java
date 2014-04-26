package org.palladiosimulator.edp2.visualization;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;

/**
 * Interface used to describe elements that are managed by an
 * {@link IVisualizationInputHandle}. It is important to note that the actual
 * input to an {@link IVisualization} is the {@link IVisualizationInputHandle}
 * and not implementations of this interface.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class IVisualizationInput {

    /**
     * Keys used for persistence of properties.
     */
    public static final String INPUT_NAME_KEY = "inputName";

    /**
     * The properties of this {@link IVisualizationInput}, which are persisted
     * and displayed in the 'Display'-Tab of the Properties-View.
     */
    protected final Map<String, Object> properties;

    /**
     * The {@link IVisualizationInput}'s or rather {@link IDataSink}'s
     * predecessor.
     */
    private IDataSource source;

    /**
     * A display name for this {@link IVisualizationInput}.
     */
    private String inputName;


    public IVisualizationInput(final IDataSource source) {
        super();
        properties = new HashMap<String, Object>();
        if (source != null) {
            setSource(source);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.visualization.IDataSink#getSource()
     */
    public IDataSource getSource() {
        return source;
    }

    /**
     * Method which handles the retrieval of the experiment data and wraps them
     * or transforms them in a way they can be displayed by the corresponding
     * {@link AbstractEditor} for this {@link IVisualizationInput}.
     */
    public abstract void updateInputData();

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IDataSink#setSource(de.uka.ipd.sdq.
     * edp2.visualization.IDataSource)
     */
    public void setSource(final IDataSource source) {
        this.source = source;
        properties.put(INPUT_NAME_KEY, getInputName());
        updateInputData();
    }

    /**
     * Returns a default String-representation, which describes this
     * {@link IVisualizationInput}. Further processing of this label is done by
     * {@link IVisualizationInputHandle}s, which support multiple inputs.
     * 
     * @return
     */
    public String getDefaultName() {
        if (getSource() != null) {
            return source.getMetricDesciption().getName();
            // TODO: Should be ...  .getMeasuredObject();
        } else {
            return "noSourceSet";
        }
    }

    public String getInputName() {
        if (inputName == null) {
            return getDefaultName();
        }
        return inputName;
    }

    public void setInputName(final String inputName) {
        this.inputName = inputName;
    }

    public Map<String,Object> getProperties(){
        return Collections.unmodifiableMap(this.properties);
    }

}
