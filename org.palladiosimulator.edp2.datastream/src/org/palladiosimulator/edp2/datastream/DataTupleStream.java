package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.measure.Measure;

import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;

public class DataTupleStream extends DataStream<DataTuple> {

    private final List<BasicDataStream<?,?>> childStreams;

    public DataTupleStream(final List<BasicDataStream<?,?>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childStreams = Collections.unmodifiableList(childLists);
    }

    @Override
    public Iterator<DataTuple> iterator() {
        final List<Iterator<Measure<?,?>>> subIterators = new ArrayList<Iterator<Measure<?,?>>>(childStreams.size());
        for (final BasicDataStream childList : childStreams) {
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
                return new DataTuple(result,(MetricSetDescription) DataTupleStream.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<Measure<?,?>> subIterator : subIterators) {
                    subIterator.remove();
                }
            }
        };
    }

    @Override
    public void close() {
        for (final BasicDataStream<?,?> childStream : childStreams) {
            childStream.close();
        }
    }

}
