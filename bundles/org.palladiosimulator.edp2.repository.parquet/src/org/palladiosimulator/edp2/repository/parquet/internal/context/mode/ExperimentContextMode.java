package org.palladiosimulator.edp2.repository.parquet.internal.context.mode;

import java.util.Map;
import java.util.Objects;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;

public abstract class ExperimentContextMode {

    protected ExperimentContext context;

    protected ExperimentContextMode(final ExperimentContext context) {
        this.context = Objects.requireNonNull(context);
    }

    public abstract <V, Q extends Quantity> void open(final ParquetMeasurementsDao<V, Q> dao);
    public abstract void close();
    public void flush() {};
    public abstract <V, Q extends Quantity> MeasurementsList<V, Q> getBackgroundList(final ParquetMeasurementsDao<V, Q> dao);
    public abstract <V, Q extends Quantity> Map<String, String> getMetaData(final ParquetMeasurementsDao<V, Q> dao);

}
