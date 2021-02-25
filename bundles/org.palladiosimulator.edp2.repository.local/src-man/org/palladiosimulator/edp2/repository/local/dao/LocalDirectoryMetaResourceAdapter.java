package org.palladiosimulator.edp2.repository.local.dao;

import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * EMF Adapter class to generate file-based resources within a local directory for a given
 * structural feature containing a list of Identifiable elements.
 *
 * @author groenda
 *
 */
public class LocalDirectoryMetaResourceAdapter extends AdapterImpl {
    
    private static final Logger LOGGER = Logger.getLogger(LocalDirectoryMetaResourceAdapter.class.getName());

    /** Local directory repository which contains the feature. */
    private final LocalDirectoryRepository repo;
    /** Structural feature which is observed. */
    private final EStructuralFeature feature;
    /** File extension to use for generating the resources. */
    private final String fileExtension;

    public LocalDirectoryMetaResourceAdapter(final LocalDirectoryRepository repo,
            final EStructuralFeature feature, final String fileExtension) {
        this.repo = repo;
        this.feature = feature;
        this.fileExtension = fileExtension;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void notifyChanged(final Notification msg) {
        if (msg.getFeature().equals(this.feature)) {
            if (msg.getEventType() == Notification.ADD) {
                final Identifier id = (Identifier) msg.getNewValue();
                assignResource(id);
            }
            if (msg.getEventType() == Notification.ADD_MANY) {
                for (final Identifier id : (Collection<Identifier>) msg.getNewValue()) {
                    assignResource(id);
                }
            }
            if (msg.getEventType() == Notification.REMOVE) {
                final Identifier id = (Identifier) msg.getOldValue();
                removeResource(id);
            }
            if (msg.getEventType() == Notification.REMOVE_MANY) {
                for (final Identifier id : (Collection<Identifier>) msg.getOldValue()) {
                    removeResource(id);
                }
            }
        }
    }

    /**
     * Assigns a resource to the identifiable (if is does not have a resource yet).
     *
     * @param id
     *            Identifiable.
     */
    private void assignResource(final Identifier id) {
        if (id.eResource() == null) {
            final URI uri = this.repo.getUri().appendSegment(id.getId())
                    .appendFileExtension(this.fileExtension);
            final Resource resource = this.repo.getRepositories().getCommonResourceSet().createResource(uri);
            resource.getContents().add(id);
            assert id.eResource() != null;
        }
    }

    /**
     * Removes a resource from an identifiable (if it has a resource).
     *
     * @param id
     *            Identifiable.
     */
    private void removeResource(final Identifier id) {
        if (id.eResource() != null) {
            try {
                id.eResource().delete(null);
            } catch (final IOException e) {
                LOGGER.log(Level.WARNING, "Could not delete file for a removed element. " + e.getMessage());
            }
        }
    }
}