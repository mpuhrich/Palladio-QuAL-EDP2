package org.palladiosimulator.edp2.repository.parquet.internal.read;

import java.util.Objects;

/**
 * Maps a {@link DaoReader} to the value field of a {@link TupleReader}.
 */
public class ValueReader<V> implements MeasureReader<V> {

    private TupleReader tupleReader;

    public ValueReader(final TupleReader tupleReader) {
        this.tupleReader = Objects.requireNonNull(tupleReader);
    }

    @Override
    public V read() {
        return tupleReader.readValue();
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
