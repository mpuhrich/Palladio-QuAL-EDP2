package org.palladiosimulator.edp2.repository.parquet.internal.context;

import java.util.Map;

import javax.measure.quantity.Quantity;

import org.apache.hadoop.fs.Path;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextMode;

/**
 * Implements a state design pattern to handle write and read mode.
 */
public class ExperimentContext {

    private ExperimentContextMode mode;
    private Path pathToParquetFile;

    public void open() {
        mode.open();
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

    public Path getPath() {
        return pathToParquetFile;
    }

    public void setPath(Path pathToParquetFile) {
        this.pathToParquetFile = pathToParquetFile;
    }

    public Map<String, String> getMetaData() {
        return mode.getMetaData();
    }

    public <V, Q extends Quantity> MeasurementsList<V, Q> getBackgroundList(final ParquetMeasurementsDao<V, Q> dao) {
        return mode.getBackgroundList(dao);
    }

}
