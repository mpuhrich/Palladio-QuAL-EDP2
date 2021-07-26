package org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist;

import java.util.Objects;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.internal.read.DaoReader;

public class MeasurementsReadList<V, Q extends Quantity> extends MeasurementsList<V, Q> {

    private DaoReader<V, Q> daoReader;
    private int size;

    public MeasurementsReadList(final DaoReader<V, Q> daoReader, final int size) {
        this.daoReader = Objects.requireNonNull(daoReader);
        this.size = size;
    }

    @Override
    public Measure<V, Q> get(int index) {
        final var measure = daoReader.read();
        if (index == size - 1) {
            close();
        }
        return measure;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void close() {
        daoReader.close();
    }

    /**
     * Returns true if the parquet reader has been used to retieve records indicating that a new MeasurementsReadList needs to be created.
     */
    public boolean isUsed() {
        return daoReader.isUsed();
    }

}
