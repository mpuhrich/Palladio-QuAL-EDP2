package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;

public interface IPropertyConfigurable extends IAdaptable {
    public Set<String> getKeys();
    public Class<?> getPropertyType(String key);
    public Map<String,Object> getProperties();
    public void setProperties(Map<String,Object> properties);
    public abstract Map<? extends String, ? extends Object> getDefaultConfiguration();
}
