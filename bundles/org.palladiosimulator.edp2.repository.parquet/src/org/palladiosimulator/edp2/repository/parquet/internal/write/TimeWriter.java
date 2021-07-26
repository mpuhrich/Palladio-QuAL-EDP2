package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.util.Objects;

/**
 * Maps a {@link DaoWriter} to the time field of a {@link TupleWriter}.
 */
public class TimeWriter<V> implements MeasureWriter<V> {

    private TupleWriter tupleWriter;

    public TimeWriter(final TupleWriter tupleWriter) {
        this.tupleWriter = Objects.requireNonNull(tupleWriter);
    }

    @Override
    public void write(final V time) {
        tupleWriter.writeTime(time);
    }

}
