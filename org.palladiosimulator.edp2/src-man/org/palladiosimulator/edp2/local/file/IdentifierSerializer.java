package org.palladiosimulator.edp2.local.file;

import java.util.List;

import org.palladiosimulator.edp2.models.ExperimentData.Identifier;
import org.palladiosimulator.edp2.models.ExperimentData.TextualBaseMetricDescription;

public class IdentifierSerializer implements Serializer<Identifier> {

    private final LongSerializer internalSerialiser;
    private final List<Identifier> allIdentifier;

    public IdentifierSerializer(final TextualBaseMetricDescription metricDescription) {
        super();
        this.internalSerialiser = new LongSerializer();
        this.allIdentifier = metricDescription.getIdentifiers();
    }

    @Override
    public long getElementLength() {
        return internalSerialiser.getElementLength();
    }

    @Override
    public byte[] serialise(final Object[] objects, final int count) {
        final Long[] internalData = new Long[count];
        for (int i = 0; i<count; i++) {
            internalData[i] = (long) allIdentifier.indexOf(objects[i]);
        }
        return internalSerialiser.serialise(internalData,count);
    }

    @Override
    public Identifier[] deserialise(final byte[] bytes) {
        final Long[] internalData = internalSerialiser.deserialise(bytes);
        final Identifier[] result = new Identifier[internalData.length];
        for (int i = 0; i<internalData.length; i++) {
            final int index = internalData[i].intValue();
            result[i] = allIdentifier.get(index);
        }
        return result;
    }

}
