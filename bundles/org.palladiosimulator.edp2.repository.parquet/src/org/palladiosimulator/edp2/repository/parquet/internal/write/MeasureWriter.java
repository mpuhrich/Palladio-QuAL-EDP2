package org.palladiosimulator.edp2.repository.parquet.internal.write;

/**
 * Maps a {@link DaoWriter} to a specific field of a {@link TupleWriter}.
 */
public interface MeasureWriter<V> {

    public void write(final V measure);

    public int size();

}
