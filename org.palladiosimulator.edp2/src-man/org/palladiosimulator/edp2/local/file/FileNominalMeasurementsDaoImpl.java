/**
 * 
 */
package org.palladiosimulator.edp2.local.file;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.NominalMeasurementsDao;
import org.palladiosimulator.edp2.models.ExperimentData.ObservedIdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataFactoryImpl;

/**File-backed implementation of {@link NominalMeasurementsDao}.
 * @author groenda
 */
public class FileNominalMeasurementsDaoImpl extends EmfFileAccessDao implements NominalMeasurementsDao {
	/** Logger for this class. */
	private static final Logger logger = Logger.getLogger(FileNominalMeasurementsDaoImpl.class.getCanonicalName());
	
	/* (non-Javadoc)
	 * @see org.palladiosimulator.edp2.NominalMeasurementsDao#getNominalMeasurements()
	 */
	@Override
	public ObservedIdentifierBasedMeasurements getObservedIdentifierBasedMeasurements() {
		if (!isOpen()) {
			String msg = "getIdentifierBasedMeasurements() only allowed on open data.";
			logger.log(Level.SEVERE, msg);
			throw new IllegalStateException(msg);
		}
		return (ObservedIdentifierBasedMeasurements) getEmfRootElement();
	}

	@Override
	protected EObject createEmfRootElement() {
		return ExperimentDataFactoryImpl.eINSTANCE.createObservedIdentifierBasedMeasurements();
	}
}