package org.palladiosimulator.edp2.datastream.configurable;

public interface IPropertyListener {
    public void propertyChanged(String key, Object oldValue, Object newValue);

    public void propertyChangeCompleted();
}
