package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.io.IOException;
import java.util.Objects;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.parquet.hadoop.ParquetWriter;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;

/**
 * Collects data from multiple {@link TupleWriter} to construct a {@link GenericRecord} that is written to the {@link ParquetWriter}.
 * Tuples with the same point in time value are merged into one row. Multiple rows can have the same point in time value.
 * <p>
 * A row is complete if:
 * <li>The point in time value was increased.</li>
 * <li>A field is already set.</li>
 */
public class RowWriter {

    private ParquetWriter<GenericRecord> parquetWriter;
    private GenericRecordBuilder recordBuilder;
    private Schema schema;

    public RowWriter(final ParquetWriter<GenericRecord> parquetWriter, final Schema schema) {
        this.parquetWriter = Objects.requireNonNull(parquetWriter);
        this.schema = Objects.requireNonNull(schema);
        this.recordBuilder = new GenericRecordBuilder(schema);
    }

    public void write(final String fieldName, final Object object) {
        if (checkIfTimeIsAlreadySet(fieldName, object)) {
            return;
        }
        if (recordBuilder.has(fieldName)) {
            final var time = recordBuilder.get(SchemaUtility.getFieldNameForTimeData());
            flush();
            recordBuilder.set(SchemaUtility.getFieldNameForTimeData(), time);
        }
        recordBuilder.set(fieldName, object);
    }

    public void flush() {
        if (recordBuilder.has(SchemaUtility.getFieldNameForTimeData())) {
            var record = recordBuilder.build();
            try {
                parquetWriter.write(record);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            recordBuilder = new GenericRecordBuilder(schema);
        }
    }

    private boolean checkIfTimeIsAlreadySet(final String fieldName, final Object object) {
        if (!fieldName.equals(SchemaUtility.getFieldNameForTimeData())) {
            return false;
        }
        if (!recordBuilder.has(fieldName)) {
            return false;
        }
        if (!recordBuilder.get(fieldName).equals(object)) {
            return false;
        }
        return true;
    }

}
