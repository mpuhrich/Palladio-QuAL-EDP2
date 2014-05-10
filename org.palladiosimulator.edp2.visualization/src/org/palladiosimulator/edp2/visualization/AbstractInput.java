package org.palladiosimulator.edp2.visualization;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyListener;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public abstract class AbstractInput
extends AbstractObservable<IVisualisationInputListener> {

    private final PropertyConfigurable myProperties = createConfiguration();

    public AbstractInput() {
        super();
        myProperties.addObserver(new IPropertyListener() {

            @Override
            public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
            }

            @Override
            public void propertyChangeCompleted() {
                getEventDispatcher().visualisationInputChanged(false);
            }
        });
    }

    protected abstract PropertyConfigurable createConfiguration();

    @SuppressWarnings("unchecked")
    public <G extends IPropertyConfigurable> G getConfiguration() {
        return (G) myProperties;
    }
}