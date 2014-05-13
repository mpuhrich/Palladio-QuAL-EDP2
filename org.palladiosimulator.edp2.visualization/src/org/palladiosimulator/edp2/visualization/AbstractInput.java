package org.palladiosimulator.edp2.visualization;

import java.util.Map;
import java.util.Set;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyListener;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public abstract class AbstractInput
extends AbstractObservable<IVisualisationInputListener>
implements IPropertyConfigurable {

    private final PropertyConfigurable myProperties = createConfiguration();

    public AbstractInput() {
        super();
        myProperties.addObserver(new IPropertyListener() {

            boolean requiresUpdate = false;

            @Override
            public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
                requiresUpdate |= getPropertyKeysTriggeringUpdate().contains(key);
            }

            @Override
            public void propertyChangeCompleted() {
                getEventDispatcher().visualisationInputChanged(requiresUpdate);
                requiresUpdate = false;
            }
        });
    }

    protected abstract PropertyConfigurable createConfiguration();

    @SuppressWarnings("unchecked")
    public <G extends IPropertyConfigurable> G getConfiguration() {
        return (G) myProperties;
    }

    /**
     * @return
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#getKeys()
     */
    @Override
    public Set<String> getKeys() {
        return myProperties.getKeys();
    }

    /**
     * @return
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#getProperties()
     */
    @Override
    public Map<String, Object> getProperties() {
        return myProperties.getProperties();
    }

    /**
     * @param properties
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#setProperties(java.util.Map)
     */
    @Override
    public void setProperties(final Map<String, Object> properties) {
        myProperties.setProperties(properties);
    }

    /**
     * @return
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#getDefaultConfiguration()
     */
    @Override
    public Map<? extends String, ? extends Object> getDefaultConfiguration() {
        return myProperties.getDefaultConfiguration();
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

    protected abstract Set<String> getPropertyKeysTriggeringUpdate();
}