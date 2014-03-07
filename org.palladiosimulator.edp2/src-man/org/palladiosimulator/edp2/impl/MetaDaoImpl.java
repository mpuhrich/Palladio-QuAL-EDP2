/**
 * 
 */
package org.palladiosimulator.edp2.impl;

import org.palladiosimulator.edp2.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.MetaDao;

/**
 * @author groenda
 *
 */
public abstract class MetaDaoImpl extends Edp2DaoImpl implements MetaDao {

	/* (non-Javadoc)
	 * @see org.palladiosimulator.edp2.IMetaDao#getMeasurementsDaoFactory()
	 */
	@Override
	public MeasurementsDaoFactory getMeasurementsDaoFactory() {
		if (!isOpen() || isDeleted()) {
			throw new IllegalStateException("Requesting the measurements factory only allowed on open and/or undeleted data.");
		}
		return null;
	}
	
}
