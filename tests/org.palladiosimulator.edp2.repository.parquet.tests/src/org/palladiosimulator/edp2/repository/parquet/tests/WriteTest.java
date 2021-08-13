package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.avro.SchemaBuilder;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDaoTuple;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextWriteMode;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;

class WriteTest {

    @SuppressWarnings("unchecked")
    @Test
    void testDynamicallyAddNewDaoDuringSimulation() throws IOException, DataNotAccessibleException {
        final var context = new ExperimentContext();
        final var file = Files.createTempDirectory("ParquetWriteTest");
        context.setExperimentId("test");
        context.setBasePath(file.toString());
        final var writeMode = new ExperimentContextWriteMode(context);
        context.setMode(writeMode);

        final var staticDao = createTestTuple("static", context);
        final var timeDao = (ParquetMeasurementsDao<Double, Quantity>) staticDao.getTimeDao();
        final var valueDao = (ParquetMeasurementsDao<Double, Quantity>) staticDao.getValueDao();

        timeDao.open(new BasicDiagnostic());
        valueDao.open(new BasicDiagnostic());

        // write initial data
        final var writeListTime = timeDao.getMeasurements();
        final var writeListValue = valueDao.getMeasurements();
        for (int i = 0; i < 10; ++i) {
            writeListTime.add(Measure.valueOf((double) i, timeDao.getUnit()));
            writeListValue.add(Measure.valueOf((double) i, valueDao.getUnit()));
        }

        // add new daos dynamically
        final var dynamicDao1 = createTestTuple("dynamic1", context);
        final var dynTimeDao1 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao1.getTimeDao();
        final var dynValueDao1 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao1.getValueDao();

        final var dynamicDao2 = createTestTuple("dynamic2", context);
        final var dynTimeDao2 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao2.getTimeDao();
        final var dynValueDao2 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao2.getValueDao();

        dynTimeDao1.open(new BasicDiagnostic());
        dynValueDao1.open(new BasicDiagnostic());
        dynTimeDao2.open(new BasicDiagnostic());
        dynValueDao2.open(new BasicDiagnostic());

        final var writeListDynTime1 = dynTimeDao1.getMeasurements();
        final var writeListDynValue1 = dynValueDao1.getMeasurements();
        final var writeListDynTime2 = dynTimeDao2.getMeasurements();
        final var writeListDynValue2 = dynValueDao2.getMeasurements();
        for (int i = 10; i < 20; ++i) {
            writeListTime.add(Measure.valueOf((double) i, timeDao.getUnit()));
            writeListValue.add(Measure.valueOf((double) i, valueDao.getUnit()));
            writeListDynTime1.add(Measure.valueOf((double) i, dynTimeDao1.getUnit()));
            writeListDynValue1.add(Measure.valueOf((double) i, dynValueDao1.getUnit()));
            writeListDynTime2.add(Measure.valueOf((double) i, dynTimeDao2.getUnit()));
            writeListDynValue2.add(Measure.valueOf((double) i, dynValueDao2.getUnit()));
        }

        // add even more daos dynamically
        final var dynamicDao3 = createTestTuple("dynamic3", context);
        final var dynTimeDao3 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao3.getTimeDao();
        final var dynValueDao3 = (ParquetMeasurementsDao<Double, Quantity>) dynamicDao3.getValueDao();

        dynTimeDao3.open(new BasicDiagnostic());
        dynValueDao3.open(new BasicDiagnostic());

        final var writeListDynTime3 = dynTimeDao3.getMeasurements();
        final var writeListDynValue3 = dynValueDao3.getMeasurements();
        for (int i = 20; i < 30; ++i) {
            writeListTime.add(Measure.valueOf((double) i, timeDao.getUnit()));
            writeListValue.add(Measure.valueOf((double) i, valueDao.getUnit()));
            writeListDynTime1.add(Measure.valueOf((double) i, dynTimeDao1.getUnit()));
            writeListDynValue1.add(Measure.valueOf((double) i, dynValueDao1.getUnit()));
            writeListDynTime2.add(Measure.valueOf((double) i, dynTimeDao2.getUnit()));
            writeListDynValue2.add(Measure.valueOf((double) i, dynValueDao2.getUnit()));
            writeListDynTime3.add(Measure.valueOf((double) i, dynTimeDao3.getUnit()));
            writeListDynValue3.add(Measure.valueOf((double) i, dynValueDao3.getUnit()));
        }

        timeDao.flush();
        valueDao.flush();
        dynTimeDao1.flush();
        dynValueDao1.flush();
        dynTimeDao2.flush();
        dynValueDao2.flush();
        dynTimeDao3.flush();
        dynValueDao3.flush();
        context.flush();

        // dynamically added daos are stored in a separate file
        assertTrue(Files.exists(file.resolve("test_FRAGMENT0.parquet")));
        assertTrue(Files.exists(file.resolve("test_FRAGMENT1.parquet")));
        assertTrue(Files.exists(file.resolve("test_FRAGMENT2.parquet")));

        final var readListTime = timeDao.getMeasurements();
        final var readListValue = valueDao.getMeasurements();
        for (int i = 0; i < 10; ++i) {
            assertEquals(Measure.valueOf((double) i, timeDao.getUnit()), readListTime.get(i));
            assertEquals(Measure.valueOf((double) i, valueDao.getUnit()), readListValue.get(i));
        }

        final var readListDynTime1 = dynTimeDao1.getMeasurements();
        final var readListDynValue1 = dynValueDao1.getMeasurements();
        final var readListDynTime2 = dynTimeDao2.getMeasurements();
        final var readListDynValue2 = dynValueDao2.getMeasurements();
        for (int i = 10; i < 20; ++i) {
            assertEquals(Measure.valueOf((double) i, timeDao.getUnit()), readListTime.get(i));
            assertEquals(Measure.valueOf((double) i, valueDao.getUnit()), readListValue.get(i));
            assertEquals(Measure.valueOf((double) i, dynTimeDao1.getUnit()), readListDynTime1.get(i));
            assertEquals(Measure.valueOf((double) i, dynValueDao1.getUnit()), readListDynValue1.get(i));
            assertEquals(Measure.valueOf((double) i, dynTimeDao2.getUnit()), readListDynTime2.get(i));
            assertEquals(Measure.valueOf((double) i, dynValueDao2.getUnit()), readListDynValue2.get(i));
        }

        final var readListDynTime3 = dynTimeDao3.getMeasurements();
        final var readListDynValue3 = dynValueDao3.getMeasurements();
        for (int i = 20; i < 30; ++i) {
            assertEquals(Measure.valueOf((double) i, timeDao.getUnit()), readListTime.get(i));
            assertEquals(Measure.valueOf((double) i, valueDao.getUnit()), readListValue.get(i));
            assertEquals(Measure.valueOf((double) i, dynTimeDao1.getUnit()), readListDynTime1.get(i));
            assertEquals(Measure.valueOf((double) i, dynValueDao1.getUnit()), readListDynValue1.get(i));
            assertEquals(Measure.valueOf((double) i, dynTimeDao2.getUnit()), readListDynTime2.get(i));
            assertEquals(Measure.valueOf((double) i, dynValueDao2.getUnit()), readListDynValue2.get(i));
            assertEquals(Measure.valueOf((double) i, dynTimeDao3.getUnit()), readListDynTime3.get(i));
            assertEquals(Measure.valueOf((double) i, dynValueDao3.getUnit()), readListDynValue3.get(i));
        }

        timeDao.close();
        valueDao.close();
        dynTimeDao1.close();
        dynValueDao1.close();
        dynTimeDao2.close();
        dynValueDao2.close();
        dynTimeDao3.close();
        dynValueDao3.close();
    }

    @SuppressWarnings("unchecked")
    private ParquetMeasurementsDaoTuple createTestTuple(final String valueFieldName, final ExperimentContext context) {
        final var timeDao = new ParquetMeasurementsDao<Double, Quantity>();
        timeDao.setFieldName(SchemaUtility.getFieldNameForTimeData());
        timeDao.setFieldType(SchemaBuilder.unionOf().nullType().and().doubleType().endUnion());
        timeDao.setExperimentContext(context);
        timeDao.setUnit((Unit<Quantity>) Unit.valueOf("s"));

        final var valueDao = new ParquetMeasurementsDao<Double, Quantity>();
        valueDao.setFieldName(valueFieldName);
        valueDao.setFieldType(SchemaBuilder.unionOf().nullType().and().doubleType().endUnion());
        valueDao.setExperimentContext(context);
        valueDao.setUnit((Unit<Quantity>) Unit.valueOf("s"));

        final var daoTuple = new ParquetMeasurementsDaoTuple();
        daoTuple.setTimeDao(timeDao);
        daoTuple.setValueDao(valueDao);
        timeDao.setDaoTuple(daoTuple);
        valueDao.setDaoTuple(daoTuple);

        return daoTuple;
    }

}
