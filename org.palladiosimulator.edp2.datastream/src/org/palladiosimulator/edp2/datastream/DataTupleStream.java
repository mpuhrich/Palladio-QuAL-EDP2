package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.measurementspec.MeasurementTuple;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class DataTupleStream extends DataStream<MeasurementTuple> {

    private final List<BasicDataStream<?,?>> childStreams;

    public DataTupleStream(final List<BasicDataStream<?,?>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childStreams = Collections.unmodifiableList(childLists);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<MeasurementTuple> iterator() {
        final List<Iterator<Measurement>> subIterators = new ArrayList<Iterator<Measurement>>(childStreams.size());
        for (@SuppressWarnings("rawtypes") final BasicDataStream childList : childStreams) {
            subIterators.add(childList.iterator());
        }
        return new Iterator<MeasurementTuple>() {

            @Override
            public boolean hasNext() {
                for (final Iterator<Measurement> subIterator : subIterators) {
                    if (!subIterator.hasNext()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public MeasurementTuple next() {
                final List<Measurement> result = new ArrayList<Measurement>(subIterators.size());
                for (final Iterator<Measurement> subIterator : subIterators) {
                    result.add(subIterator.next());
                }
                return new MeasurementTuple(result,(MetricSetDescription) DataTupleStream.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<Measurement> subIterator : subIterators) {
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
