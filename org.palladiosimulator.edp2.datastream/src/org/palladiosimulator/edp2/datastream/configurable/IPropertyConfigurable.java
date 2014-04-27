package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Map;

public interface IPropertyConfigurable {
    public String[] getKeys();
    public Map<String,Object> getProperties();
    public void setProperties(Map<String,Object> properties);
}
