package org.palladiosimulator.edp2.repository.parquet.internal.schema;

import java.util.Collection;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.monitorrepository.MonitorRepository;

public class SchemaFactory {

    public Schema createSchemaFromMonitorRepository(final MonitorRepository monitorRepository) {
        var builder = SchemaBuilder.record(ParquetRepositoryConstants.PARQUET_RECORD_NAME)
                .namespace(ParquetRepositoryConstants.PARQUET_RECORD_NAMESPACE);
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

    public static Schema createSchemaFromParquetMeasurementsDaos(final Collection<ParquetMeasurementsDao<?, ?>> daos) {
        var builder = SchemaBuilder.record(ParquetRepositoryConstants.PARQUET_RECORD_NAME)
                .namespace(ParquetRepositoryConstants.PARQUET_RECORD_NAMESPACE);
        var fieldAssembler = builder.fields();
        fieldAssembler = fieldAssembler.name(SchemaUtility.getFieldNameForTimeData()).type().doubleType().noDefault();
        for (var dao : daos) {
            if (!dao.isTimeDao()) {
                fieldAssembler = fieldAssembler.name(dao.getFieldName()).type(dao.getFieldType()).withDefault(null);
            }
        }
        return fieldAssembler.endRecord();
    }

}
