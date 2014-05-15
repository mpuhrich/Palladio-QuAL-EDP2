package org.palladiosimulator.edp2.visualization;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.datastream.configurable.IPropertyListener;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public abstract class AbstractVisualizationSingleDatastreamConfiguration
extends PropertyConfigurable implements IPropertyListener {

    /**
     * Keys used for persistence of properties.
     */
    public static final String INPUT_NAME_KEY = "inputName";

    /**
     * A display name for this {@link AbstractVisualizationSingleDatastreamInput}.
     */
    private String inputName;


    public AbstractVisualizationSingleDatastreamConfiguration() {
        super();
        this.addObserver(this);
    }

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String, Object>();
        result.put(INPUT_NAME_KEY, "Anonymous Input");
        return result;
    }

    @Override
    public Set<String> getKeys() {
        final Set<String> result = new HashSet<String>();
        result.add(INPUT_NAME_KEY);
        return result;
    }

    public String getInputName() {
        return inputName;
    }

    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        if (INPUT_NAME_KEY.equals(key)) {
            inputName = (String) newValue;
        }
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyListener#propertyChangeCompleted()
     */
    @Override
    public void propertyChangeCompleted() {
    }

}
