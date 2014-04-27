package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;

public abstract class PropertyConfigurable
extends AbstractObservable<IPropertyListener>
implements IPropertyConfigurable {

    private final Map<String,Object> properties = new HashMap<String, Object>();
    private final String[] keys;

    public PropertyConfigurable() {
        super();
        this.keys = getKeys();
    }

    public PropertyConfigurable(final Map<String,Object> newProperties) {
        this();
        setProperties(newProperties);
    }

    @Override
    public abstract String[] getKeys();

    @Override
    public Map<String, Object> getProperties() {
        return Collections.unmodifiableMap(properties);
    }

    @Override
    public void setProperties(final Map<String, Object> newProperties) {
        for (final String key : keys) {
            if (!newProperties.containsKey(key)) {
                throw new IllegalArgumentException("New properties miss expected key "+key);
            }
        }
        for (final String key : keys) {
            final Object oldValue = properties.get(key);
            final Object newValue = newProperties.get(key);
            if (!oldValue.equals(newValue)) {
                properties.put(key, newProperties.get(key));
                this.getEventDispatcher().propertyChanged(key, oldValue, newValue);
            }
        }
    }
}
