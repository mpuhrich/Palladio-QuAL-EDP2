/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repositories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl#getAvailableRepositories
 * <em>Available Repositories</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl#getCommonResourceSet
 * <em>Common Resource Set</em>}</li>
 * </ul>
 * </p>
 */
public class RepositoriesImpl extends RepositoriesImplGen {

    protected RepositoriesImpl() {
        this.setCommonResourceSet(Optional.ofNullable(eResource()).map(Resource::getResourceSet).orElseGet(() -> new ResourceSetImpl()));
    }

} // RepositoriesImpl
