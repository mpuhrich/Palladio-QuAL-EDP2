package org.palladiosimulator.edp2.repository.parquet.internal.read;

import java.io.IOException;
import java.util.Objects;

import org.apache.avro.generic.GenericRecord;
import org.apache.parquet.hadoop.ParquetReader;

/**
 * TupleReader is used to read time and value data from the parquet reader and providing the record data
 * as separate measurements to the time and value {@link DaoReader} objects.
 * It is assumed that when time/value is read, the corresponding value/time is also read or not at all.
 * TupleReader can only be used once and must otherwise be regenerated.
 */
public class TupleReader {

    private ParquetReader<GenericRecord> parquetReader;
    private boolean used = false;
    private boolean closed = false;

    private String timeFieldName;
    private Object time;
    private String valueFieldName;
    private Object value;

    public TupleReader(final ParquetReader<GenericRecord> parquetReader, final String timeFieldName, final String valueFieldName) {
        this.parquetReader = Objects.requireNonNull(parquetReader);
        this.timeFieldName = Objects.requireNonNull(timeFieldName);
        this.valueFieldName = Objects.requireNonNull(valueFieldName);
    }

    @SuppressWarnings("unchecked")
    public <V> V readTime() {
        if (Objects.isNull(time)) {
            readRecord();
        }
        final var tmp = time;
        time = null;
        return (V) tmp;
    }

    @SuppressWarnings("unchecked")
    public <V> V readValue() {
        if (Objects.isNull(value)) {
            readRecord();
        }
        final var tmp = value;
        value = null;
        return (V) tmp;
    }

    private void readRecord() {
        used = true;
        try {
            var record = parquetReader.read();
            if (Objects.nonNull(record)) {
                time = record.get(timeFieldName);
                value = record.get(valueFieldName);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isUsed() {
        return used;
    }

    public void close() {
        closed = true;
        try {
            parquetReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isClosed() {
        return closed;
    }

}
