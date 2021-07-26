package org.palladiosimulator.edp2.repository.parquet.internal.parquet;

import java.io.IOException;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.specific.SpecificData;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroSchemaConverter;
import org.apache.parquet.hadoop.ParquetWriter;

/**
 * Custom parquet writer that uses AvroWriteSupport and gives access to extra metadata.
 */
public class EDP2ParquetWriter<T> extends ParquetWriter<T> {

    private Map<String, String> extraMetaData;

    public EDP2ParquetWriter(Path file, Configuration conf, EDP2AvroWriteSupport<T> writeSupport) throws IOException {
        super(file, conf, writeSupport);
        extraMetaData = writeSupport.getExtraMetaData();
    }

    public Map<String, String> getExtraMetaData() {
        return extraMetaData;
    }

    public static <T> EDP2ParquetWriter.Builder<T> builder(Path path) {
        return new EDP2ParquetWriter.Builder<T>(path);
    }

    private static <T> EDP2AvroWriteSupport<T> writeSupport(Configuration conf, Schema avroSchema, GenericData model) {
        return new EDP2AvroWriteSupport<T>((new AvroSchemaConverter(conf)).convert(avroSchema), avroSchema, model);
    }

    public static class Builder<T> extends ParquetWriter.Builder<T, EDP2ParquetWriter.Builder<T>> {

        private Path path;
        private Configuration conf;
        private Schema schema;
        private GenericData model;

        protected Builder(Path path) {
            super(path);
            this.path = path;
            this.conf = new Configuration();
            this.schema = null;
            this.model = SpecificData.get();
        }

        public EDP2ParquetWriter.Builder<T> withSchema(Schema schema) {
            this.schema = schema;
            return this;
        }

        @Override
        public Builder<T> withConf(Configuration conf) {
            this.conf = conf;
            return self();
        }

        @Override
        protected EDP2AvroWriteSupport<T> getWriteSupport(Configuration conf) {
            return EDP2ParquetWriter.writeSupport(conf, schema, model);
        }

        @Override
        protected Builder<T> self() {
            return this;
        }

        @Override
        public ParquetWriter<T> build() throws IOException {
            return new EDP2ParquetWriter<T>(path, conf, getWriteSupport(conf));
        }

    }

}
