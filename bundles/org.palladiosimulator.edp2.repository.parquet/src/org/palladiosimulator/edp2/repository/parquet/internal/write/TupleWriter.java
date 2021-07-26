package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.util.Objects;

/**
 * Collects the time and value data from two {@link DaoWriter} before passing it to a {@link RowWriter}.
 * This ensures that time and value are placed in the correct row independent of the writing order.
 * It is assumed that when time/value is written, the corresponding value/time is also written.
 */
public class TupleWriter {

    private RowWriter rowWriter;

    private String timeFieldName;
    private String valueFieldName;
    private Object time;
    private Object value;

    public TupleWriter(final RowWriter rowWriter) {
        this.rowWriter = Objects.requireNonNull(rowWriter);
    }

    public <V> void writeTime(final V time) {
        this.time = time;
        flush();
    }

    public <V> void writeValue(final V value) {
        this.value = value;
        flush();
    }

    private void flush() {
        if (Objects.nonNull(time) && Objects.nonNull(value)) {
            rowWriter.write(timeFieldName, time);
            rowWriter.write(valueFieldName, value);
            time = null;
            value = null;
        }
    }

    public void setTimeFieldName(String timeFieldName) {
        this.timeFieldName = timeFieldName;
    }

    public void setValueFieldName(String valueFieldName) {
        this.valueFieldName = valueFieldName;
    }

}
