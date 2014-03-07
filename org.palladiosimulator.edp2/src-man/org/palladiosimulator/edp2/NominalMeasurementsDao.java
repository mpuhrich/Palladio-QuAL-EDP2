/**
 * 
 */
package org.palladiosimulator.edp2;

import org.palladiosimulator.edp2.impl.EmfResourceDao;
import org.palladiosimulator.edp2.models.ExperimentData.ObservedIdentifierBasedMeasurements;

/**
 * Interface for nominal measurements DAOs
 * 
 * @author groenda
 *
 */
public interface NominalMeasurementsDao extends MeasurementsDao, EmfResourceDao {

	/**
	 * @return EMF-Model containing all observed nominal measurements.
	 */
	public ObservedIdentifierBasedMeasurements getObservedIdentifierBasedMeasurements();
}
