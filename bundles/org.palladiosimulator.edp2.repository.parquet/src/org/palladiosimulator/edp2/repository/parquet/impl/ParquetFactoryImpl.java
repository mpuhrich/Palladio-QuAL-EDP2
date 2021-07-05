package org.palladiosimulator.edp2.repository.parquet.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;

public class ParquetFactoryImpl extends ParquetFactoryImplGen {

    @Override
    public URI createURIFromString(EDataType eDataType, String initialValue) {
        return URI.createURI(initialValue);
    }

    @Override
    public String convertURIToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue instanceof URI) {
            return ((URI) instanceValue).toString();
        }
        return super.convertURIToString(eDataType, instanceValue);
    }

}
