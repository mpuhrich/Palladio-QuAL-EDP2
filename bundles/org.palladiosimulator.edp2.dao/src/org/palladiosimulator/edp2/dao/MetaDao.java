package org.palladiosimulator.edp2.dao;

import java.util.Map;

/**
 * Interface for the access to any meta data in EDP2.
 * 
 * @author groenda
 */
public interface MetaDao extends Edp2Dao {

    /**
     * Returns the factory for measurement DAOs in order to get access to the measurements.
     * 
     * @return The measurements DAO factory.
     */
    public MeasurementsDaoFactory getMeasurementsDaoFactory();

    /**
     * Called to initialize the repository after a new experiment run has been created.
     */
    public default void initializeExperimentRun(final Map<String, Object> configuration) {}

}
