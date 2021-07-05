package org.palladiosimulator.edp2.repository.parquet.dao;

import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.dao.impl.MetaDaoImpl;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;

public class ParquetMetaDao extends MetaDaoImpl implements MetaDaoDelegate {

    private ParquetRepository managedRepository;

    @Override
    public void setParent(MetaDao parent) {
        managedRepository = (ParquetRepository) parent;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

}
