package org.palladiosimulator.edp2.repository.parquet.dao;

import java.util.HashMap;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.avro.Schema;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.palladiosimulator.edp2.dao.BinaryMeasurementsDao;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.dao.impl.Edp2DaoImpl;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;

public class ParquetMeasurementsDao<V, Q extends Quantity> extends Edp2DaoImpl implements BinaryMeasurementsDao<V, Q> {

    private ParquetMeasurementsDaoTuple daoTuple;
    private Unit<Q> unit;
    private String fieldName;
    private Schema fieldType;
    private ExperimentContext experimentContext;

    @Override
    public void serialize(ExtendedDataOutputStream output) throws DataNotAccessibleException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deserialize(ExtendedDataInputStream input) throws DataNotAccessibleException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Measure<V, Q>> getMeasurements() {
        return experimentContext.getBackgroundList(this);
    }

    @Override
    public synchronized void open(DiagnosticChain diagnosticChain) {
        super.open(diagnosticChain);
        experimentContext.open();
        setOpen();
    }

    @Override
    public void flush() {
        if (!isTimeDao()) {
            final var metadata = new HashMap<String, String>();
            metadata.put(fieldName + ".size", String.valueOf(getMeasurements().size()));
            metadata.put(fieldName + ".unit", unit.toString());
            experimentContext.getMetaData().putAll(metadata);
        }
    }

    @Override
    public synchronized void close() throws DataNotAccessibleException {
        super.close();
        experimentContext.getBackgroundList(this).close();
        setClosed();
    }

    public ParquetMeasurementsDaoTuple getDaoTuple() {
        return daoTuple;
    }

    public void setDaoTuple(ParquetMeasurementsDaoTuple daoTuple) {
        this.daoTuple = daoTuple;
    }

    @Override
    public Unit<Q> getUnit() {
        return unit;
    }

    @Override
    public void setUnit(Unit<Q> unit) {
        this.unit = unit;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Schema getFieldType() {
        return fieldType;
    }

    public void setFieldType(Schema fieldType) {
        this.fieldType = fieldType;
    }

    public ExperimentContext getExperimentContext() {
        return experimentContext;
    }

    public void setExperimentContext(ExperimentContext experimentContext) {
        this.experimentContext = experimentContext;
    }

    public boolean isTimeDao() {
        return daoTuple.isTimeDao(this);
    }

}
