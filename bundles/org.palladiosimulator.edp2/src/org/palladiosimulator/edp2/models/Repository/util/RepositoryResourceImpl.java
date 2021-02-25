/**
 */
package org.palladiosimulator.edp2.models.Repository.util;

import org.eclipse.emf.common.util.URI;

/**
 * The <b>Resource </b> associated with the package.
 */
public class RepositoryResourceImpl extends RepositoryResourceImplGen
{
	/**
	 * Creates an instance of the resource.
	 */
	public RepositoryResourceImpl(URI uri)
	{
		super(uri);
	}
	
	@Override
    protected boolean useUUIDs() {
	    // It was set to false before, but I don't actually see a point in it. In particular when
        // referencing PCM elements of measuring points or metrics, using the UUIDs is much more reliable.
	    return true;
    }
}
