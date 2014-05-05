package org.palladiosimulator.edp2.visualization.datasource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistable;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.Repository.Repository;

/**
 * Instances of this class serve as connectors between data in repositories and
 * classes implementing {@link IDataSink} or {@link AbstractTransformation}.
 * 
 * @author Dominik Ernst
 * 
 */
public class EDP2Source implements IPersistable, IAdaptable {

    /**
     * Key under which this class' name is stored in the properties.
     */
    static final String ELEMENT_KEY = "elementName";

    /**
     * Name constant, which is used to identify this class in properties.
     */
    static final String ELEMENT_NAME = "EDP2Source";

    /**
     * Key for properties, that is used to store the {@link Repository} URI.
     */
    private static final String REPOSITORY_KEY = "repositoryURI";

    /**
     * Key for properties, that is used to store the {@link RawMeasurements} UUID.
     */
    private static final String RAW_MEASUREMENTS_KEY = "rawMeasurementsUUID";

    /**
     * UUID of the {@link RawMeasurements} object, based on which this {@link EDP2Source} is created.
     */
    private String rawMeasurementsUUID;

    /**
     * URI ({@link String}) of the {@link Repository} ({@link #repository}).
     */
    private String repositoryURI;

    private Edp2DataTupleDataSource source;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        EDP2SourceFactory.saveState(memento, this);
    }

    /**
     * Returns the UUID as a String of the {@link RawMeasurements} , which were
     * selected to produce this {@link AbstractDataSource} .
     * 
     * @return The {@link ExperimentSetting} for this {@link AbstractDataSource}.
     */
    public String getRawMeasurementsUUID() {
        return rawMeasurementsUUID;
    }

    /**
     * Returns the URI (absolute path, String representation) of the
     * {@link Repository} in which the {@link RawMeasurements} of this source
     * were selected.
     * 
     * @return The URI of the attached repository {@link String} for this
     *         {@link AbstractDataSource}.
     */
    public String getRepositoryURI() {
        return repositoryURI;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.visualization.IDataSource#getProperties()
     */
    public Map<String, Object> getProperties() {
        final Map<String,Object> properties = new HashMap<String, Object>();
        properties.put(ELEMENT_KEY, ELEMENT_NAME);
        properties.put(REPOSITORY_KEY, getRepositoryURI());
        properties.put(RAW_MEASUREMENTS_KEY, getRawMeasurementsUUID());
        return Collections.unmodifiableMap(properties);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IDataSource#setProperties(java.util
     * .HashMap)
     */
    public void setProperties(final Map<String, Object> newProperties) {
        this.repositoryURI = newProperties.get(REPOSITORY_KEY).toString();
        this.rawMeasurementsUUID = newProperties.get(RAW_MEASUREMENTS_KEY).toString();
        // TODO: findRawMeasurementsByUUID(rawMeasurementsUUID);
    }

    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public Object getAdapter(final Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }

    String getElementKey() {
        return ELEMENT_KEY;
    }

    Collection<String> getPropertiesKeySet() {
        return Arrays.asList(REPOSITORY_KEY,RAW_MEASUREMENTS_KEY);
    }

}
