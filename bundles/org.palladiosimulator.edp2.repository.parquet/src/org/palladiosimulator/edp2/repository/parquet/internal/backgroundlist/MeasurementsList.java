package org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist;

import java.util.AbstractList;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

public abstract class MeasurementsList<V, Q extends Quantity> extends AbstractList<Measure<V, Q>> {

    public void close() {};

}
