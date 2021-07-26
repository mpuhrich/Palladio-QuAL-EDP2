package org.palladiosimulator.edp2.repository.parquet.internal.read;

/**
 * Maps a {@link DaoReader} to a specific field of a {@link TupleReader}.
 */
public interface MeasureReader<V> {

    public V read();
    public void close();
    public boolean isUsed();

}
