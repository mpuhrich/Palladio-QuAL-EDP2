package org.palladiosimulator.edp2.datastream;

import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.metricentity.MetricEntity;

public abstract class AbstractDataSource extends MetricEntity implements IDataSource {

    private final PropertyConfigurable myProperties = new PropertyConfigurable() {

        @Override
        public Set<String> getKeys() {
            return AbstractDataSource.this.getKeys();
        }
    };

    public AbstractDataSource() {
        super();
    }

    public AbstractDataSource(final MetricDescription metricDescription) {
        super(metricDescription);
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#getProperties()
     */
    @Override
    public Map<String, Object> getProperties() {
        return myProperties.getProperties();
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable#setProperties(java.util.Map)
     */
    @Override
    public void setProperties(final Map<String, Object> properties) {
        myProperties.setProperties(properties);
    }

}
