/**
 * 
 */
package org.palladiosimulator.edp2.dao.impl;

import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;

/**
 * @author groenda
 *
 */
public abstract class MetaDaoImpl extends Edp2DaoImpl implements MetaDao {

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.IMetaDao#getMeasurementsDaoFactory()
     */
    @Override
    public MeasurementsDaoFactory getMeasurementsDaoFactory() {
        if (!isOpen() || isDeleted()) {
            throw new IllegalStateException(
                    "Requesting the measurements factory only allowed on open and/or undeleted data.");
        }
        return null;
    }

}
