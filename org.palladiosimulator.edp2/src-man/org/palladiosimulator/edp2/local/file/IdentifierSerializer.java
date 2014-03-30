package org.palladiosimulator.edp2.local.file;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.palladiosimulator.edp2.models.ExperimentData.Identifier;

public class IdentifierSerializer implements Serializer<Identifier> {

    private final LongSerializer internalSerialiser;
    private final Map<Identifier,Long> idToIndexMap = new HashMap<Identifier, Long>();
    private final Map<Long,Identifier> indexToIDMap = new HashMap<Long, Identifier>();

    public IdentifierSerializer() {
        super();
        this.internalSerialiser = new LongSerializer();
    }

    @Override
    public long getElementLength() {
        return internalSerialiser.getElementLength();
    }

    @Override
    public byte[] serialise(final Object[] objects, final int count) {
        checkAllIdentifierKnown(objects, count);
        final Long[] internalData = new Long[count];
        for (int i = 0; i<count; i++) {
            internalData[i] = idToIndexMap.get(objects[i]);
        }
        return internalSerialiser.serialise(internalData,count);
    }

    private void checkAllIdentifierKnown(final Object[] objects, final int count) {
        for (int i = 0; i<count; i++) {
            checkIdentifierKnown((Identifier) objects[i]);
        }
    }

    private void checkIdentifierKnown(final Identifier identifier) {
        if (!idToIndexMap.containsKey(identifier)) {
            final List<Identifier> allIdentifier = identifier.getTextualBaseMetricDescription().getIdentifiers();
            for (long i = 0; i<allIdentifier.size(); i++) {
                idToIndexMap.put(allIdentifier.get((int) i), i);
                indexToIDMap.put(i,allIdentifier.get((int) i));
            }
        }
    }

    @Override
    public Identifier[] deserialise(final byte[] bytes) {
        final Long[] internalData = internalSerialiser.deserialise(bytes);
        final Identifier[] result = new Identifier[internalData.length];
        for (int i = 0; i<internalData.length; i++) {
            result[i] = indexToIDMap.get(internalData[i]);
        }
        return result;
    }

}
