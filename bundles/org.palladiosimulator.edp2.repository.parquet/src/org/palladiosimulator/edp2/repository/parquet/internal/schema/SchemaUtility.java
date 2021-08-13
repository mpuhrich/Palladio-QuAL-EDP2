package org.palladiosimulator.edp2.repository.parquet.internal.schema;

import java.util.Collection;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.SchemaBuilder;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.metricspec.BaseMetricDescription;

public class SchemaUtility {

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

    public static String getFieldNameForTimeData() {
        return ParquetRepositoryConstants.PARQUET_TIME_FIELD_NAME;
    }

    public static String getFieldNameForValueData(final MeasuringPoint measuringPoint,
            final BaseMetricDescription baseMetricDescription) {
        final var sb = new StringBuilder();
        sb.append("Col_");
        sb.append(measuringPoint.getStringRepresentation().replaceAll("[^\\w]", "_"));
        sb.append(baseMetricDescription.getId().replaceAll("[^\\w]", "_"));
        return sb.toString();
    }

    public static Schema getFieldTypeForTimeData() {
        return SchemaBuilder.builder().doubleType();
    }

    public static Schema getFieldTypeForValueData(final BaseMetricDescription baseMetricDescription) {
        switch (baseMetricDescription.getCaptureType()) {
        case IDENTIFIER:
            return SchemaBuilder.unionOf().nullType().and().longType().endUnion();
        case INTEGER_NUMBER:
            return SchemaBuilder.unionOf().nullType().and().longType().endUnion();
        case REAL_NUMBER:
            return SchemaBuilder.unionOf().nullType().and().doubleType().endUnion();
        default:
            var msg = "CaptureType " + baseMetricDescription.getCaptureType() + " is not supported by parquet repository.";
            throw new IllegalArgumentException(msg);
        }
    }

    public static Type getTypeFromSchema(final Schema schema) {
        if (schema.isUnion()) {
            return schema.getTypes().get(1).getType();
        }
        return schema.getType();
    }

}
