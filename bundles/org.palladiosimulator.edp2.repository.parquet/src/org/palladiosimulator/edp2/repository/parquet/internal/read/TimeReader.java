package org.palladiosimulator.edp2.repository.parquet.internal.read;

import java.util.Objects;

/**
 * Maps a {@link DaoReader} to the time field of a {@link TupleReader}.
 */
public class TimeReader<V> implements MeasureReader<V> {

    private TupleReader tupleReader;

    public TimeReader(final TupleReader tupleReader) {
        this.tupleReader = Objects.requireNonNull(tupleReader);
    }

    @Override
    public V read() {
        return tupleReader.readTime();
    }

    @Override
    public void close() {
        tupleReader.close();
    }

    @Override
    public boolean isUsed() {
        return tupleReader.isUsed();
    }

}
