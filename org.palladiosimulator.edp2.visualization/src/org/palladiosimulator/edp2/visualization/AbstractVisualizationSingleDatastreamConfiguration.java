package org.palladiosimulator.edp2.visualization;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.configurable.reflective.ConfigurationProperty;
import org.palladiosimulator.edp2.datastream.configurable.reflective.ReflectivePropertyConfigurable;

public abstract class AbstractVisualizationSingleDatastreamConfiguration
extends ReflectivePropertyConfigurable {

    /**
     * Keys used for persistence of properties.
     */
    public static final String INPUT_NAME_KEY = "inputName";

    /**
     * A display name for this {@link AbstractVisualizationSingleDatastreamInput}.
     */
    @ConfigurationProperty(description="Input Display Name")
    private String inputName;

    public String getInputName() {
        return inputName;
    }

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String, Object>();
        result.put(INPUT_NAME_KEY, "Anonymous Input");
        return result;
    }

}
