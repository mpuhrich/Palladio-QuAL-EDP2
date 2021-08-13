package org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist;

import java.util.Objects;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.internal.write.DaoWriter;

public class MeasurementsWriteList<V, Q extends Quantity> extends MeasurementsList<V, Q> {

    private DaoWriter<V, Q> daoWriter;

    public MeasurementsWriteList(final DaoWriter<V, Q> daoWriter) {
        this.daoWriter = Objects.requireNonNull(daoWriter);
    }

    @Override
    public void add(int index, Measure<V, Q> element) {
        daoWriter.write(element);
    }

    @Override
    public Measure<V, Q> get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return daoWriter.size();
    }

}
