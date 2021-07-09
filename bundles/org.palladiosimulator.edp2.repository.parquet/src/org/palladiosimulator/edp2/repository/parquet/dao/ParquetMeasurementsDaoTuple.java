package org.palladiosimulator.edp2.repository.parquet.dao;

public class ParquetMeasurementsDaoTuple {

    private ParquetMeasurementsDao<?, ?> timeDao;
    private ParquetMeasurementsDao<?, ?> valueDao;

    public ParquetMeasurementsDao<?, ?> getTimeDao() {
        return timeDao;
    }

    public void setTimeDao(ParquetMeasurementsDao<?, ?> timeDao) {
        this.timeDao = timeDao;
    }

    public ParquetMeasurementsDao<?, ?> getValueDao() {
        return valueDao;
    }

    public void setValueDao(ParquetMeasurementsDao<?, ?> valueDao) {
        this.valueDao = valueDao;
    }

    public boolean isTimeDao(final ParquetMeasurementsDao<?, ?> otherDao) {
        return timeDao == otherDao;
    }

}
