package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;

public class DataList<V,Q extends Quantity> extends DataStream<DataTuple> {

    private final List<BasicDataStream<V,Q>> childLists;

    public DataList(final List<BasicDataStream<V,Q>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childLists = Collections.unmodifiableList(childLists);
    }

    @Override
    public Iterator<DataTuple> iterator() {
        final List<Iterator<Measure<V,Q>>> subIterators = new ArrayList<Iterator<Measure<V,Q>>>(childLists.size());
        for (final BasicDataStream<V,Q> childList : childLists) {
            subIterators.add(childList.iterator());
        }
        return new Iterator<DataTuple>() {

            @Override
            public boolean hasNext() {
                for (final Iterator<Measure<V,Q>> subIterator : subIterators) {
                    if (!subIterator.hasNext()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public DataTuple next() {
                final List<Measure<?,?>> result = new ArrayList<Measure<?,?>>(subIterators.size());
                for (final Iterator<Measure<V,Q>> subIterator : subIterators) {
                    result.add(subIterator.next());
                }
                return new DataTuple(result,(MetricSetDescription) DataList.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<Measure<V,Q>> subIterator : subIterators) {
                    subIterator.remove();
                }
            }
        };
    }

}
