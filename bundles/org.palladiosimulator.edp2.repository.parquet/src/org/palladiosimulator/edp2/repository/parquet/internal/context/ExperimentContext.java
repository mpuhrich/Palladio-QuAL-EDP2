package org.palladiosimulator.edp2.repository.parquet.internal.context;

import java.util.Map;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextMode;

/**
 * Implements a state design pattern to handle write and read mode.
 */
public class ExperimentContext {

    private ExperimentContextMode mode;
    private String basePath;
    private String experimentId;

    public <V, Q extends Quantity> void open(final ParquetMeasurementsDao<V, Q> dao) {
        mode.open(dao);
    }

    /**
     * Finalize write mode and switch to read mode.
     */
    public void flush() {
        mode.flush();
    }

    public void close() {
        mode.close();
    }

    public ExperimentContextMode getMode() {
        return mode;
    }

    public void setMode(ExperimentContextMode mode) {
        this.mode = mode;
    }

    public <V, Q extends Quantity> Map<String, String> getMetaData(final ParquetMeasurementsDao<V, Q> dao) {
        return mode.getMetaData(dao);
    }

    public <V, Q extends Quantity> MeasurementsList<V, Q> getBackgroundList(final ParquetMeasurementsDao<V, Q> dao) {
        return mode.getBackgroundList(dao);
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

}
