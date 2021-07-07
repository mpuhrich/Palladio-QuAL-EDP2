package org.palladiosimulator.edp2.repository.parquet.internal.schema;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.monitorrepository.MonitorRepository;

public class SchemaFactory {

    public Schema createSchemaFromMonitorRepository(final MonitorRepository monitorRepository) {
        var builder = SchemaBuilder.record("EDP2").namespace("org.palladiosimulator.edp2");
        var fieldAssembler = builder.fields();
        fieldAssembler = fieldAssembler.name(SchemaUtility.getFieldNameForTimeData()).type().doubleType().noDefault();
        for (var monitor : monitorRepository.getMonitors()) {
            var measuringPoint = monitor.getMeasuringPoint();
            for (var measurementSpecification : monitor.getMeasurementSpecifications()) {
                var metricDescription = measurementSpecification.getMetricDescription();
                var baseMetricDescription = MetricDescriptionUtility.toBaseMetricDescriptions(metricDescription)[0];
                var fieldName = SchemaUtility.getFieldNameForValueData(measuringPoint, baseMetricDescription);
                var fieldType = SchemaUtility.getFieldTypeForValueData(baseMetricDescription);
                fieldAssembler = fieldAssembler.name(fieldName).type(fieldType).withDefault(null);
            }
        }
        return fieldAssembler.endRecord();
    }

}
