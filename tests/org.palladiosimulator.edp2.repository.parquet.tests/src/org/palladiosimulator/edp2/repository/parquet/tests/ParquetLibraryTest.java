package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.util.HadoopInputFile;
import org.apache.parquet.hadoop.util.HadoopOutputFile;
import org.apache.parquet.io.InputFile;
import org.apache.parquet.io.OutputFile;
import org.junit.jupiter.api.Test;

import static org.apache.parquet.hadoop.ParquetFileWriter.Mode.OVERWRITE;

class ParquetLibraryTest {

    @Test
    void testParquetLibrary() throws Exception {
        Path path = new Path(File.createTempFile("ParquetLibraryTest", ".parquet").toString());
        Schema schema = SchemaBuilder.record("test").fields().requiredInt("data").endRecord();

        OutputFile outputFile = HadoopOutputFile.fromPath(path, new Configuration());
        ParquetWriter<GenericRecord> writer = AvroParquetWriter.<GenericRecord>builder(outputFile)
                .withSchema(schema)
                .withConf(new Configuration())
                .withWriteMode(OVERWRITE)
                .build();

        for (int i = 0; i < 10; i++) {
            writer.write(new GenericRecordBuilder(schema).set("data", i).build());
        }
        writer.close();

        InputFile inputFile = HadoopInputFile.fromPath(path, new Configuration());
        ParquetReader<GenericRecord> reader = AvroParquetReader.<GenericRecord>builder(inputFile)
                .withConf(new Configuration())
                .build();

        for (int i = 0; i < 10; i++) {
            assertEquals(new GenericRecordBuilder(schema).set("data", i).build(), reader.read());
        }
        reader.close();
    }

}
