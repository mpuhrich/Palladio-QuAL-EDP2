package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.measure.Measure;

import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;

public class DataList extends DataStream<DataTuple> {

    private final List<BasicDataStream<?,?>> childLists;

    public DataList(final List<BasicDataStream<?,?>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childLists = Collections.unmodifiableList(childLists);
    }

    @Override
    public Iterator<DataTuple> iterator() {
        final List<Iterator<Measure<?,?>>> subIterators = new ArrayList<Iterator<Measure<?,?>>>(childLists.size());
        for (final BasicDataStream childList : childLists) {
            subIterators.add(childList.iterator());
        }
        return new Iterator<DataTuple>() {

            @Override
            public boolean hasNext() {
                for (final Iterator<Measure<?,?>> subIterator : subIterators) {
                    if (!subIterator.hasNext()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public DataTuple next() {
                final List<Measure<?,?>> result = new ArrayList<Measure<?,?>>(subIterators.size());
                for (final Iterator<Measure<?,?>> subIterator : subIterators) {
                    result.add(subIterator.next());
                }
                return new DataTuple(result,(MetricSetDescription) DataList.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<Measure<?,?>> subIterator : subIterators) {
                    subIterator.remove();
                }
            }
        };
    }

}
