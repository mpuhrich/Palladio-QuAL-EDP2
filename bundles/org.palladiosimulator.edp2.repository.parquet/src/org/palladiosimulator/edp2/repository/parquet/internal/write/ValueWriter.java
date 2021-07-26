package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.util.Objects;

/**
 * Maps a {@link DaoWriter} to the value field of a {@link TupleWriter}.
 */
public class ValueWriter<V> implements MeasureWriter<V> {

    private TupleWriter tupleWriter;

    public ValueWriter(final TupleWriter tupleWriter) {
        this.tupleWriter = Objects.requireNonNull(tupleWriter);
    }

    @Override
    public void write(final V value) {
        tupleWriter.writeValue(value);
    }

}
