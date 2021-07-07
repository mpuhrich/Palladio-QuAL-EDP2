package org.palladiosimulator.edp2.repository.parquet.internal.schema;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.BaseMetricDescription;

public class SchemaUtility {

    public static String getFieldNameForTimeData() {
        return "PointInTime";
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

}
