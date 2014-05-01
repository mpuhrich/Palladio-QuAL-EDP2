package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Map;
import java.util.Set;

public interface IPropertyConfigurable {
    public Set<String> getKeys();
    public Map<String,Object> getProperties();
    public void setProperties(Map<String,Object> properties);
}
