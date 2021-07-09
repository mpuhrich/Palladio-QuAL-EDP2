package org.palladiosimulator.edp2.repository.parquet.internal.dao;

import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.metricspec.Identifier;

public class MeasurementsDaoFactory {

    public <Q extends Quantity> ParquetMeasurementsDao<Double, Q> createDoubleMeasurementsDao() {
        return new ParquetMeasurementsDao<Double, Q>();
    }

    public <Q extends Quantity> ParquetMeasurementsDao<Long, Q> createLongMeasurementsDao() {
        return new ParquetMeasurementsDao<Long, Q>();
    }

    public ParquetMeasurementsDao<Identifier, Dimensionless> createNominalMeasurementsDao() {
        return new ParquetMeasurementsDao<Identifier, Dimensionless>();
    }

}
