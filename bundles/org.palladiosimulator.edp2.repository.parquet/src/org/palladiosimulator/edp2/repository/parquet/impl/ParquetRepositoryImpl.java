package org.palladiosimulator.edp2.repository.parquet.impl;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMetaDao;

public class ParquetRepositoryImpl extends ParquetRepositoryImplGen {

    protected ParquetRepositoryImpl() {
        super();
        final var delegate = new ParquetMetaDao();
        delegate.setParent(this);
        metaDao = delegate;
    }

    @Override
    public URI getDataFolder() {
        return dataFolder.resolve(eResource().getURI());
    }

}
