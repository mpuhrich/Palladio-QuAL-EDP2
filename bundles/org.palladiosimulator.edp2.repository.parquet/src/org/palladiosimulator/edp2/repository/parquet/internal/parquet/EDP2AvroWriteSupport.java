package org.palladiosimulator.edp2.repository.parquet.internal.parquet;

import java.util.HashMap;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.parquet.avro.AvroWriteSupport;
import org.apache.parquet.schema.MessageType;

/**
 * Custom write support to access extra metadata
 */
public class EDP2AvroWriteSupport<T> extends AvroWriteSupport<T> {

    private Map<String, String> extraMetaData;

    public EDP2AvroWriteSupport(MessageType schema, Schema avroSchema, GenericData model) {
        super(schema, avroSchema, model);
        this.extraMetaData = new HashMap<String, String>();
    }

    @Override
    public FinalizedWriteContext finalizeWrite() {
        return new FinalizedWriteContext(extraMetaData);
    }

    public Map<String, String> getExtraMetaData() {
        return extraMetaData;
    }

}
