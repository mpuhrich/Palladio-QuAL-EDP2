package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.MetricSpecFactory;

class SchemaUtilityTest {

    @Test
    void testFieldNameCanOnlyStartWithAZaz_() {
        var measuringPoint = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        measuringPoint.setMeasuringPoint("1234ABC");
        var metricDescription = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescription.setId("5678DEF");

        var fieldName = SchemaUtility.getFieldNameForValueData(measuringPoint, metricDescription);
        var regex = "^[A-Za-z_]+$";
        assertTrue(fieldName.substring(0, 1).matches(regex), "Expected string matching '" + regex + "'. Got: " + fieldName);
    }

    @Test
    void testFieldNameCanOnlyContainAZaz09_() {
        String specialCharacters = "+-*/@!%&";
        var measuringPoint = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        measuringPoint.setMeasuringPoint(specialCharacters);
        var metricDescription = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescription.setId(specialCharacters);

        var fieldName = SchemaUtility.getFieldNameForValueData(measuringPoint, metricDescription);
        var regex = "^[A-Za-z0-9_]+$";
        assertTrue(fieldName.matches(regex), "Expected string matching '" + regex + "'. Got: " + fieldName);
    }

    @TestFactory
    Stream<DynamicTest> testGetFieldTypeForValueDataReturnsCorrectTypeMappings() throws Exception {
        var map = new HashMap<CaptureType, String>();
        map.put(CaptureType.IDENTIFIER, "long");
        map.put(CaptureType.INTEGER_NUMBER, "long");
        map.put(CaptureType.REAL_NUMBER, "double");

        return map.entrySet().stream().map(e -> DynamicTest.dynamicTest(e.getKey().toString(), () -> {
            assertEquals("[\"null\",\"" + e.getValue() + "\"]", getFieldTypeForValueData(e.getKey()));
        }));
    }

    private String getFieldTypeForValueData(CaptureType captureType) {
        var metricDescription = MetricSpecFactory.eINSTANCE.createNumericalBaseMetricDescription();
        metricDescription.setCaptureType(captureType);
        return SchemaUtility.getFieldTypeForValueData(metricDescription).toString();
    }

}
