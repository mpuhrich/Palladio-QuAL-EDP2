package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;

public abstract class PropertyConfigurable
extends AbstractObservable<IPropertyListener>
implements IPropertyConfigurable {

    private final Map<String,Object> properties = new HashMap<String, Object>();
    private final Set<String> keys;

    public PropertyConfigurable() {
        super();
        this.keys = getKeys();
        properties.putAll(getDefaultConfiguration());
    }

    @Override
    public abstract Map<? extends String, ? extends Object> getDefaultConfiguration();

    public PropertyConfigurable(final Map<String,Object> newProperties) {
        this();
        setProperties(newProperties);
    }

    @Override
    public abstract Set<String> getKeys();

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
            if (!newValue.equals(oldValue)) {
                properties.put(key, newProperties.get(key));
                this.getEventDispatcher().propertyChanged(key, oldValue, newValue);
            }
        }
        this.getEventDispatcher().propertyChangeCompleted();
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(final Class adapter) {
        if (adapter.isInstance(this)) {
            return this;
        }
        return null;
    }

}
