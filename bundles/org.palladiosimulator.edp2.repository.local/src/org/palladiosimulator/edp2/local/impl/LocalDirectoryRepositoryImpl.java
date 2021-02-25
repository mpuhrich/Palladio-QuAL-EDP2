/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.local.impl;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.repository.local.dao.LocalDirectoryMetaDao;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Local Directory Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImpl#getUri <em>Uri
 * </em>}</li>
 * </ul>
 * </p>
 */
public class LocalDirectoryRepositoryImpl extends LocalDirectoryRepositoryImplGen {


    protected LocalDirectoryRepositoryImpl() {
        final MetaDaoDelegate delegate = new LocalDirectoryMetaDao();
        delegate.setParent(this);
        this.metaDao = delegate;
    }
    
    @Override
    public URI getUri() {
        var uri = getDataFolder().resolve(eResource().getURI());
        while (uri.lastSegment().isBlank() && uri.segmentCount() > 0) {
            uri = uri.trimSegments(1);
        }
        return uri;
    }

}
