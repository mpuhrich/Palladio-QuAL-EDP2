package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.repository.parquet.ParquetFactory;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDaoFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContextRegistry;
import org.palladiosimulator.metricspec.MetricSpecFactory;

class ParquetMeasurementsDaoFactoryTest {

    @Test
    void testCreateDao() throws Exception {
        var repository = createTestRepository();
        var mmtDaoFactory = createTestFactory(repository);
        var rawMeasurement = createTestRawMeasurement();
        addRawMeasurementToRepositry(rawMeasurement, repository);

        var daoOne = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurement.getDataSeries().get(0).getValuesUuid());
        assertEquals("PointInTime", daoOne.getFieldName());

        var daoTwo = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurement.getDataSeries().get(1).getValuesUuid());
        assertNotEquals("PointInTime", daoTwo.getFieldName());
    }

    @Test
    void testCreateOneDaoAlsoCreatesTupleDao() throws Exception {
        var repository = createTestRepository();
        var mmtDaoFactory = createTestFactory(repository);
        var rawMeasurement = createTestRawMeasurement();
        addRawMeasurementToRepositry(rawMeasurement, repository);

        var dao = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurement.getDataSeries().get(0).getValuesUuid());
        assertNotNull(dao.getDaoTuple().getValueDao());
    }

    @Test
    void testCreateDaoInterleaved() throws Exception {
        var repository = createTestRepository();
        var mmtDaoFactory = createTestFactory(repository);
        var rawMeasurementOne = createTestRawMeasurement();
        var rawMeasurementTwo = createTestRawMeasurement();
        addRawMeasurementToRepositry(rawMeasurementOne, repository);
        addRawMeasurementToRepositry(rawMeasurementTwo, repository);

        var daoOneTime = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurementOne.getDataSeries().get(0).getValuesUuid());
        var daoTwoTime = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurementTwo.getDataSeries().get(0).getValuesUuid());
        var daoOneValue = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurementOne.getDataSeries().get(1).getValuesUuid());
        var daoTwoValue = mmtDaoFactory.createDoubleMeasurementsDao(rawMeasurementTwo.getDataSeries().get(1).getValuesUuid());

        assertSame(daoOneTime, daoOneValue.getDaoTuple().getTimeDao());
        assertSame(daoOneValue, daoOneTime.getDaoTuple().getValueDao());
        assertSame(daoTwoTime, daoTwoValue.getDaoTuple().getTimeDao());
        assertSame(daoTwoValue, daoTwoTime.getDaoTuple().getValueDao());
    }

    private ParquetRepository createTestRepository() {
        final var repository = ParquetFactory.eINSTANCE.createParquetRepository();
        final var experimentGroup = ExperimentDataFactory.eINSTANCE.createExperimentGroup();
        experimentGroup.setPurpose("testGroup");
        repository.getExperimentGroups().add(experimentGroup);
        final var experimentSetting = ExperimentDataFactory.eINSTANCE.createExperimentSetting();
        experimentSetting.setDescription("testSetting");
        repository.getExperimentGroups().get(0).getExperimentSettings().add(experimentSetting);
        final var experimentRun = ExperimentDataFactory.eINSTANCE.createExperimentRun();
        experimentRun.setId("testRun");
        experimentRun.setStartTime(new Date());
        repository.getExperimentGroups().get(0).getExperimentSettings().get(0).getExperimentRuns().add(experimentRun);
        var measuringPointRepository = MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
        repository.getExperimentGroups().get(0).getMeasuringPointRepositories().add(measuringPointRepository);
        return repository;
    }

    private ParquetMeasurementsDaoFactory createTestFactory(final ParquetRepository parquetRepository) {
        final var mmtDaofactory = new ParquetMeasurementsDaoFactory();
        mmtDaofactory.setParquetRepository(parquetRepository);
        final var contextRegistry =  new ExperimentContextRegistry();
        contextRegistry.register("testRun", new ExperimentContext());
        mmtDaofactory.setExperimentContextRegistry(contextRegistry);
        return mmtDaofactory;
    }

    private RawMeasurements createTestRawMeasurement() {
        final var measuringPoint = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        measuringPoint.setMeasuringPoint("testMeasuringPoint");
        final var metricDescriptionOne = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescriptionOne.setName("Point in Time");
        final var metricDescriptionTwo = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescriptionTwo.setName("value");
        final var metricSetDescription = MetricSpecFactory.eINSTANCE.createMetricSetDescription();
        metricSetDescription.getSubsumedMetrics().add(metricDescriptionOne);
        metricSetDescription.getSubsumedMetrics().add(metricDescriptionTwo);
        final var measurementType = ExperimentDataFactory.eINSTANCE.createMeasuringType(measuringPoint, metricSetDescription);
        final var measurement = ExperimentDataFactory.eINSTANCE.createMeasurement(measurementType);
        final var measurementsRange = ExperimentDataFactory.eINSTANCE.createMeasurementRange(measurement);
        final var rawMeasurements = ExperimentDataFactory.eINSTANCE.createRawMeasurements(measurementsRange);
        ExperimentDataFactory.eINSTANCE.createDoubleBinaryMeasurements(rawMeasurements, "testDataSeriesOne", null);
        ExperimentDataFactory.eINSTANCE.createDoubleBinaryMeasurements(rawMeasurements, "testDataSeriesTwo", null);
        return rawMeasurements;
    }

    private void addRawMeasurementToRepositry(final RawMeasurements rawMeasurements, final ParquetRepository parquetRepository) {
        parquetRepository.getExperimentGroups().get(0).getExperimentSettings().get(0).getExperimentRuns().get(0)
        .getMeasurement().add(rawMeasurements.getMeasurementRange().getMeasurement());
    }

}
