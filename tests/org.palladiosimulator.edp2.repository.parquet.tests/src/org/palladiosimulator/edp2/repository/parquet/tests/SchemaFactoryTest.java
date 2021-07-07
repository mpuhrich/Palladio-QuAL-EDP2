package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaFactory;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;

class SchemaFactoryTest {

    MetricDescription createTestMetricDescription(final String id, final CaptureType captureType) {
        final var metricDescription = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescription.setId(id);
        metricDescription.setCaptureType(captureType);
        return metricDescription;
    }

    MeasurementSpecification createTestMeasurementSpecification(final MetricDescription metricDescription) {
        final var measurementSpecification = MonitorRepositoryFactory.eINSTANCE.createMeasurementSpecification();
        measurementSpecification.setMetricDescription(metricDescription);
        return measurementSpecification;
    }

    MeasuringPoint createTestMeasuringPoint(final String stringRepresentation) {
        final var measuringPoint = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        measuringPoint.setMeasuringPoint(stringRepresentation);
        return measuringPoint;
    }

    Monitor createTestMonitor(final Collection<MeasurementSpecification> measurementSpecifications, final MeasuringPoint measuringPoint) {
        final var monitor = MonitorRepositoryFactory.eINSTANCE.createMonitor();
        monitor.getMeasurementSpecifications().addAll(measurementSpecifications);
        monitor.setMeasuringPoint(measuringPoint);
        return monitor;
    }

    MonitorRepository createTestMonitorRepository() {
        return MonitorRepositoryFactory.eINSTANCE.createMonitorRepository();
    }

    @Test
    void testCreateSchemaWithTwoMeasurementSpecifications() {
        final var monitorRepository = createTestMonitorRepository();
        final var monitors = monitorRepository.getMonitors();

        final var metricDescriptionOne = createTestMetricDescription("metricDescriptionOne", CaptureType.INTEGER_NUMBER);
        final var measurementSpecificationOne = createTestMeasurementSpecification(metricDescriptionOne);
        final var metricDescriptionTwo = createTestMetricDescription("metricDescriptionTwo", CaptureType.REAL_NUMBER);
        final var measurementSpecificationTwo = createTestMeasurementSpecification(metricDescriptionTwo);

        final var measuringPoint = createTestMeasuringPoint("measuringPoint");
        final var measurementSpecifications = List.of(measurementSpecificationOne, measurementSpecificationTwo);
        final var monitor = createTestMonitor(measurementSpecifications, measuringPoint);
        monitors.add(monitor);

        final var schemaFactory = new SchemaFactory();
        final var schema = schemaFactory.createSchemaFromMonitorRepository(monitorRepository);

        final String expected = "{\"type\":\"record\",\"name\":\"EDP2\",\"namespace\":\"org.palladiosimulator.edp2\",\"fields\":["
                + "{\"name\":\"PointInTime\",\"type\":\"double\"},"
                + "{\"name\":\"Col_measuringPointmetricDescriptionOne\",\"type\":[\"null\",\"long\"],\"default\":null},"
                + "{\"name\":\"Col_measuringPointmetricDescriptionTwo\",\"type\":[\"null\",\"double\"],\"default\":null}]}";

        assertEquals(expected, schema.toString());
    }

    @Test
    void testCreateSchemaWithMultipleMonitors() {
        final var monitorRepository = createTestMonitorRepository();
        final var monitors = monitorRepository.getMonitors();

        final var metricDescriptionOne = createTestMetricDescription("metricDescriptionOne", CaptureType.IDENTIFIER);
        final var measurementSpecificationOne = createTestMeasurementSpecification(metricDescriptionOne);
        final var measuringPointOne = createTestMeasuringPoint("measuringPointOne");
        final var monitorOne = createTestMonitor(List.of(measurementSpecificationOne), measuringPointOne);
        monitors.add(monitorOne);

        final var metricDescriptionTwo = createTestMetricDescription("metricDescriptionTwo", CaptureType.INTEGER_NUMBER);
        final var measurementSpecificationTwo = createTestMeasurementSpecification(metricDescriptionTwo);
        final var measuringPointTwo = createTestMeasuringPoint("measuringPointTwo");
        final var monitorTwo = createTestMonitor(List.of(measurementSpecificationTwo), measuringPointTwo);
        monitors.add(monitorTwo);

        final var metricDescriptionThree = createTestMetricDescription("metricDescriptionThree", CaptureType.REAL_NUMBER);
        final var measurementSpecificationThree = createTestMeasurementSpecification(metricDescriptionThree);
        final var measuringPointThree = createTestMeasuringPoint("measuringPointThree");
        final var monitorThree = createTestMonitor(List.of(measurementSpecificationThree), measuringPointThree);
        monitors.add(monitorThree);

        final var schemaFactory = new SchemaFactory();
        final var schema = schemaFactory.createSchemaFromMonitorRepository(monitorRepository);

        final String expected = "{\"type\":\"record\",\"name\":\"EDP2\",\"namespace\":\"org.palladiosimulator.edp2\",\"fields\":["
                + "{\"name\":\"PointInTime\",\"type\":\"double\"},"
                + "{\"name\":\"Col_measuringPointOnemetricDescriptionOne\",\"type\":[\"null\",\"long\"],\"default\":null},"
                + "{\"name\":\"Col_measuringPointTwometricDescriptionTwo\",\"type\":[\"null\",\"long\"],\"default\":null},"
                + "{\"name\":\"Col_measuringPointThreemetricDescriptionThree\",\"type\":[\"null\",\"double\"],\"default\":null}]}";

        assertEquals(expected, schema.toString());
    }

}
