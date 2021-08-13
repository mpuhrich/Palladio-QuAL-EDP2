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
        var uri = dataFolder.resolve(eResource().getURI());
        while (uri.lastSegment().isBlank() && uri.segmentCount() > 0) {
            uri = uri.trimSegments(1);
        }
        return uri;
    }

}
