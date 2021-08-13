package org.palladiosimulator.edp2.repository.parquet.dao;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.palladiosimulator.edp2.dao.MeasurementsDaoRegistry;
import org.palladiosimulator.edp2.dao.impl.MeasurementsDaoFactoryImpl;
import org.palladiosimulator.edp2.dao.impl.MeasurementsDaoRegistryImpl;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContextRegistry;
import org.palladiosimulator.edp2.repository.parquet.internal.dao.DataSeriesToDaoFactorySwitch;
import org.palladiosimulator.edp2.repository.parquet.internal.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

public class ParquetMeasurementsDaoFactory extends MeasurementsDaoFactoryImpl {

    private static final String POINT_IN_TIME_DATASERIES_IDENTIFIER = "Point in Time";

    /**
     * Registry to store completely constructed MeasurementsDaos.
     */
    private MeasurementsDaoRegistry publicDaoRegistry;

    /**
     * Registry to store partly constructed MeasurementsDaos.
     */
    private ConcurrentMap<String, ParquetMeasurementsDao<?, ?>> privateDaoRegistry;

    private ParquetRepository parquetRepository;
    private DataSeriesToDaoFactorySwitch factorySwitch;
    private ExperimentContextRegistry experimentContextRegistry;

    public ParquetMeasurementsDaoFactory() {
        this.publicDaoRegistry = new MeasurementsDaoRegistryImpl();
        this.privateDaoRegistry = new ConcurrentHashMap<String, ParquetMeasurementsDao<?,?>>();
        this.factorySwitch = new DataSeriesToDaoFactorySwitch(new MeasurementsDaoFactory());
    }

    @Override
    @SuppressWarnings("unchecked")
    public <Q extends Quantity> ParquetMeasurementsDao<Double, Q> createDoubleMeasurementsDao(String uuid) {
        return (ParquetMeasurementsDao<Double, Q>) createMeasurementsDao(uuid);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <Q extends Quantity> ParquetMeasurementsDao<Double, Q> createDoubleMeasurementsDao(String uuid, Unit<Q> storageUnit) {
        final var dao = (ParquetMeasurementsDao<Double, Q>) createMeasurementsDao(uuid);
        dao.setUnit(storageUnit);
        return dao;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <Q extends Quantity> ParquetMeasurementsDao<Long, Q> createLongMeasurementsDao(String uuid) {
        return (ParquetMeasurementsDao<Long, Q>) createMeasurementsDao(uuid);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <Q extends Quantity> ParquetMeasurementsDao<Long, Q> createLongMeasurementsDao(String uuid, Unit<Q> storageUnit) {
        final var dao = (ParquetMeasurementsDao<Long, Q>) createMeasurementsDao(uuid);
        dao.setUnit(storageUnit);
        return dao;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ParquetMeasurementsDao<Identifier, Dimensionless> createNominalMeasurementsDao(String uuid,
            TextualBaseMetricDescription metric) {
        return (ParquetMeasurementsDao<Identifier, Dimensionless>) createMeasurementsDao(uuid);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ParquetMeasurementsDao<Identifier, Dimensionless> createNominalMeasurementsDao(String uuid,
            TextualBaseMetricDescription metric, Unit<Dimensionless> one) {
        final var dao = (ParquetMeasurementsDao<Identifier, Dimensionless>) createMeasurementsDao(uuid);
        dao.setUnit(one);
        return dao;
    }

    @Override
    public MeasurementsDaoRegistry getDaoRegistry() {
        return publicDaoRegistry;
    }

    public void setParquetRepository(ParquetRepository parquetRepository) {
        this.parquetRepository = parquetRepository;
    }

    private ParquetMeasurementsDao<?, ?> createMeasurementsDao(final String uuid) {
        if (publicDaoRegistry.isRegistered(uuid)) {
            return (ParquetMeasurementsDao<?, ?>) publicDaoRegistry.getMeasurementsDao(uuid);
        }
        if (!privateDaoRegistry.containsKey(uuid)) {
            final var rawMeasurements = getRawMeasurementsFromDataSeriesValuesUuid(uuid);
            createMeasurementsDaosFromRawMeasurements(rawMeasurements);
        }
        final var dao = privateDaoRegistry.remove(uuid);
        publicDaoRegistry.register(dao, uuid);
        return dao;
    }

    private void createMeasurementsDaosFromRawMeasurements(RawMeasurements rawMeasurements) {
        if (rawMeasurements.getDataSeries().size() != 2) {
            throw new IllegalArgumentException("DataSeries must only have two entries!");
        }
        final var daoTuple = new ParquetMeasurementsDaoTuple();
        for (var dataSeries : rawMeasurements.getDataSeries()) {
            var dao = factorySwitch.doSwitch(dataSeries);
            dao.setDaoTuple(daoTuple);
            final var experimentRunId = getExperimentRunId(rawMeasurements);
            final var experimentContext = getExperimentContext(experimentRunId);
            dao.setExperimentContext(experimentContext);
            if (isTimeDao(dataSeries)) {
                daoTuple.setTimeDao(dao);
                dao.setFieldName(SchemaUtility.getFieldNameForTimeData());
                dao.setFieldType(SchemaUtility.getFieldTypeForTimeData());
            } else {
                daoTuple.setValueDao(dao);
                final var measuringPoint = getMeasuringPoint(rawMeasurements);
                final var baseMetricDescription = getBaseMetricDescription(dataSeries);
                dao.setFieldName(SchemaUtility.getFieldNameForValueData(measuringPoint, baseMetricDescription));
                dao.setFieldType(SchemaUtility.getFieldTypeForValueData(baseMetricDescription));
            }
            privateDaoRegistry.put(dataSeries.getValuesUuid(), dao);
        }
    }

    private RawMeasurements getRawMeasurementsFromDataSeriesValuesUuid(final String uuid) {
        Stream<DataSeries> dataSeriesStream = parquetRepository.getExperimentGroups().stream()
                .flatMap(group -> group.getExperimentSettings().stream())
                .flatMap(setting -> setting.getExperimentRuns().stream())
                .flatMap(run -> run.getMeasurement().stream())
                .flatMap(m -> m.getMeasurementRanges().stream())
                .flatMap(mr -> mr.getRawMeasurements().getDataSeries().stream());
        return dataSeriesStream.filter(ds -> ds.getValuesUuid().equals(uuid))
                .findFirst().get().getRawMeasurements();
    }

    private boolean isTimeDao(final DataSeries dataSeries) {
        final var baseMetricDescription = getBaseMetricDescription(dataSeries);
        return baseMetricDescription.getName().equals(POINT_IN_TIME_DATASERIES_IDENTIFIER) ? true : false;
    }

    private BaseMetricDescription getBaseMetricDescription(final DataSeries dataSeries) {
        final var metricDescription = getMetricDescription(dataSeries);
        final var baseMetricDescriptions = MetricDescriptionUtility.toBaseMetricDescriptions(metricDescription);
        final var index = getDataSeriesIndex(dataSeries);
        return baseMetricDescriptions[index];
    }

    private MetricDescription getMetricDescription(final DataSeries dataSeries) {
        return dataSeries.getRawMeasurements()
            .getMeasurementRange()
            .getMeasurement()
            .getMeasuringType()
            .getMetric();
    }

    private int getDataSeriesIndex(final DataSeries dataSeries) {
        return dataSeries.getRawMeasurements()
            .getDataSeries()
            .indexOf(dataSeries);
    }

    private MeasuringPoint getMeasuringPoint(final RawMeasurements rawMeasurements) {
        return rawMeasurements.getMeasurementRange()
            .getMeasurement()
            .getMeasuringType()
            .getMeasuringPoint();
    }

    public void setExperimentContextRegistry(ExperimentContextRegistry registry) {
        experimentContextRegistry = registry;
    }

    private String getExperimentRunId(final RawMeasurements rawMeasurements) {
        return rawMeasurements.getMeasurementRange()
            .getMeasurement()
            .getRun()
            .getId();
    }

    private ExperimentContext getExperimentContext(final String experimentRunId) {
        var context = experimentContextRegistry.getByExperimentId(experimentRunId);
        if (context == null) {
            final var conf = new HashMap<String, Object>();
            conf.put(ParquetRepositoryConstants.CONFIG_MAP_KEY_EXPERIMENT_RUN_ID, experimentRunId);
            parquetRepository.initializeExperimentRun(conf);
            context = experimentContextRegistry.getByExperimentId(experimentRunId);
        }
        return context;
    }

}
