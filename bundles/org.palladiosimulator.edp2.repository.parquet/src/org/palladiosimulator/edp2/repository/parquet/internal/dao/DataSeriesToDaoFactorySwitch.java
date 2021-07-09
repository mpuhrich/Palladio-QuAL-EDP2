package org.palladiosimulator.edp2.repository.parquet.internal.dao;

import java.util.Objects;

import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.metricspec.Identifier;

public class DataSeriesToDaoFactorySwitch extends ExperimentDataSwitch<ParquetMeasurementsDao<?, ?>> {

    private MeasurementsDaoFactory daoFactory;

    public DataSeriesToDaoFactorySwitch(MeasurementsDaoFactory daoFactory) {
        this.daoFactory = Objects.requireNonNull(daoFactory);
    }

    @Override
    public <Q extends Quantity> ParquetMeasurementsDao<Double, Q> caseDoubleBinaryMeasurements(DoubleBinaryMeasurements<Q> object) {
        return daoFactory.createDoubleMeasurementsDao();
    }

    @Override
    public ParquetMeasurementsDao<Long, ?> caseLongBinaryMeasurements(LongBinaryMeasurements object) {
        return daoFactory.createLongMeasurementsDao();
    }

    @Override
    public ParquetMeasurementsDao<Identifier, Dimensionless> caseIdentifierBasedMeasurements(IdentifierBasedMeasurements object) {
        return daoFactory.createNominalMeasurementsDao();
    }

}
