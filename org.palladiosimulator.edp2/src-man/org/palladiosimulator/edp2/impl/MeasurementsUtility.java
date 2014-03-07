/**
 * 
 */
package org.palladiosimulator.edp2.impl;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.quantity.Quantity;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.edp2.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.MeasurementsDaoRegistry;
import org.palladiosimulator.edp2.NominalMeasurementsDao;
import org.palladiosimulator.edp2.OrdinalMeasurementsDao;
import org.palladiosimulator.edp2.internal.DAOFromBelowRawMeasurementSwitch;
import org.palladiosimulator.edp2.internal.EmfmodelAddMeasurementToDataSeriesSwitch;
import org.palladiosimulator.edp2.internal.EmfmodelDataSeriesFromReferenceSwitch;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.Repository.Repository;

/**
 * This class provides utility functions to handle measurements.
 * 
 * @author groenda, Sebastian Lehrig
 */
public class MeasurementsUtility {
	
	/** Logger for this class. */
	private static final Logger logger = Logger.getLogger(MeasurementsUtility.class.getCanonicalName());
	
	/** EMF factory used by this instance. */
	private static final ExperimentDataFactory factory = ExperimentDataFactory.eINSTANCE;

	/**
	 * Creates a new MeasurementRange and contained elements if there
	 * are already existing elements in another MeasurementRange.
	 * Does not set the startTime and endTime properties.
	 * 
	 * @param measurements Location where to add the range.
	 * @return The newly created measurement range.
	 */
	public static MeasurementsRange addMeasurementRange(Measurements measurements) {
		// TODO: check if measurements or setting is better.
		MeasurementsDaoFactory daoFactory = measurements.getMeasure().getExperimentGroup().getRepository().getMeasurementsDaoFactory();
		MeasurementsRange mr = factory.createMeasurementsRange(measurements);
		if (measurements.getMeasurementsRanges().size() > 1) { // copy contents from existing templates
			MeasurementsRange template = measurements.getMeasurementsRanges().get(0);
			// copy raw measurements
			if (template.getRawMeasurements() != null) {
				factory.createRawMeasurements(mr);
			}
			// copy aggregated measurements
			Iterator<AggregatedMeasurements> iter = template.getAggregatedMeasurements().iterator();
			while (iter.hasNext()) {
				FixedWidthAggregatedMeasurements fwam = factory.createFixedWidthAggregatedMeasurements();
				FixedWidthAggregatedMeasurements fwtemplate = (FixedWidthAggregatedMeasurements) iter.next();
				fwam.setIntervals(EcoreUtil.copy(fwtemplate.getIntervals()));
				fwam.setAggregationOn(fwtemplate.getAggregationOn());
				Iterator<DataSeries> iter2 = fwtemplate.getDataSeries().iterator();
				while (iter2.hasNext()) {
					fwam.getDataSeries().add(
							new EmfmodelDataSeriesFromReferenceSwitch<Quantity>(daoFactory)
									.doSwitch(iter2.next()));
				}
			}
		}
		return mr;
		// TODO: Add parameter currentTime to allow range(n-1).endtime=currentTime,range(n).starttime=currentTime
		// TODO: Create MeasurementsRange for all Measurements of an ExperimentRun -> Refactor from Measurements to ExperimentRun
	}

	/**
	 * Creates the DAOs for the data series of a raw measurement.
	 * 
	 * @param rm The raw measurements containing the data series.
	 */
	public static void createDAOsForRawMeasurements(RawMeasurements rm) {
		// input validation
		String errorMsg = "Could not create DAOs for raw measurements. A link to the DAO factory was missing: ";
		if (rm.getMeasurementsRange() == null) {
			errorMsg = "RawMeasurements must be assigned to a measurement range.";
		} else if (rm.getMeasurementsRange().getMeasurements() == null) {
			errorMsg = "RawMeasurements must be (indirectly) assigned to a measurement.";
		} else if (rm.getMeasurementsRange().getMeasurements().getMeasure() == null) {
			errorMsg = "RawMeasuremnts must be (indirectly) assigned to a measure (definition).";
		} else if (rm.getMeasurementsRange().getMeasurements().getMeasure().getExperimentGroup() == null) {
			errorMsg = "RawMeasuremnts must be (indirectly) assigned to an experiment group.";
		} else if (rm.getMeasurementsRange().getMeasurements().getMeasure().getExperimentGroup().getRepository() == null) {
			errorMsg = "RawMeasuremnts must be (indirectly) assigned to an experiment group which must be assigned to a repository.";
		} else {
			errorMsg = null;
		}
		if (errorMsg != null) {
			logger.log(Level.SEVERE, errorMsg);
			throw new IllegalArgumentException(errorMsg);
		}
		// creation
		new DAOFromBelowRawMeasurementSwitch().doSwitch(rm);
	}

	/**
	 * Stores a new measurement at the last existing range.
	 * 
	 * @param measurements The measurement of the experiment run for which a new measurement exists.
	 * @param data The measurement (data) itself.
	 */
	public static void storeMeasurement(Measurements measurements, Measurement measurement) {
		MeasurementsDaoRegistry daoRegistry = measurements.getMeasure().getExperimentGroup().getRepository().getMeasurementsDaoFactory().getDaoRegistry();
		int size = measurements.getMeasurementsRanges().size();
		if (size == 0) {
			throw new IllegalArgumentException("Measurements have to include measurements ranges");
		}
		
		MeasurementsRange lastRange = measurements.getMeasurementsRanges().get(size - 1);
		RawMeasurements rm = lastRange.getRawMeasurements();
		if (rm != null) { // Add raw measurements
			if (!measurement.getMetric().equals(measurements.getMeasure().getMetric())) {
				String msg = "Tried to store measurement with a wrong metric. Expected: "
					+ measurements.getMeasure().getMetric()
					+ ", provided: "
					+ measurement.getMetric()
					+ ".";
				logger.log(Level.SEVERE, msg);
				throw new IllegalArgumentException(msg);
			}
			Iterator<DataSeries> iter = rm.getDataSeries().iterator();
			DataSeries ds;
			int index = -1;
			EmfmodelAddMeasurementToDataSeriesSwitch addMmt = new EmfmodelAddMeasurementToDataSeriesSwitch(daoRegistry);
			while (iter.hasNext()) {
				ds = iter.next();
				index++;
				addMmt.setMeasurementToAdd(measurement.getMeasuredValue(index));
				addMmt.doSwitch(ds);
				// invalidate statistics as they do not include the added value
				if (ds.getNumericalStatistics() != null) {
					ds.setNumericalStatistics(null);
				}
				if (ds.getTextualStatistics() != null) {
					ds.setTextualStatistics(null);
				}
			}
		}
		// TODO handle aggregated measurements
	}
	
	/**
	 * Requests a DAO for a nominal measurement.
	 * If the DAO does not exists it is created and opened automatically (if possible).
	 * 
	 * @param ds The data series for which the DAO should be created.
	 * @return DAO for nominal measurements.
	 */
	public static NominalMeasurementsDao getNominalMeasurementsDao(final DataSeries ds) {
		final MeasurementsDaoFactory daoFactory = ds.getRawMeasurements()
				.getMeasurementsRange().getMeasurements().getMeasure()
				.getExperimentGroup().getRepository()
				.getMeasurementsDaoFactory();
		if (daoFactory.getDaoRegistry().isRegistered(ds.getValuesUuid())) {
			return (NominalMeasurementsDao) daoFactory.getDaoRegistry().getMeasurementsDao(ds.getValuesUuid());
		} else {
			NominalMeasurementsDao nmd = new ExperimentDataSwitch<NominalMeasurementsDao>() {
				@Override
				public NominalMeasurementsDao caseIdentifierBasedMeasurements(org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements object) {
					return daoFactory.createNominalMeasurementsDao(ds.getValuesUuid());
				};
				@Override
				public NominalMeasurementsDao caseJSXmlMeasurements(org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements object) {
					String msg = "Tried to request nominal measurements for a data series which should contain ordinal measurements.";
					logger.log(Level.WARNING, msg);
					throw new IllegalArgumentException(msg);
				};
				@Override
				public NominalMeasurementsDao caseDoubleBinaryMeasurements(org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements object) {
					String msg = "Tried to request nominal measurements for a data series which should contain ordinal measurements.";
					logger.log(Level.WARNING, msg);
					throw new IllegalArgumentException(msg);
				};
				@Override
				public NominalMeasurementsDao caseLongBinaryMeasurements(org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements object) {
					String msg = "Tried to request nominal measurements for a data series which should contain ordinal measurements.";
					logger.log(Level.WARNING, msg);
					throw new IllegalArgumentException(msg);
				};
			}.doSwitch(ds);
			if (!nmd.isOpen() && nmd.canOpen()) {
				try {
					nmd.open();
				} catch (DataNotAccessibleException e) {
					// Do nothing. Could simply not open the DAO.
				}
			}
			return nmd;
		}
	}
	
	/**
	 * Requests a DAO for a ordinal measurement.
	 * If the DAO does not exists it is created and opened automatically (if possible).
	 * 
	 * @param ds The data series for which the DAO should be created.
	 * @return DAO for ordinal measurements.
	 */
	@SuppressWarnings("unchecked")
	public static <Q extends Quantity> OrdinalMeasurementsDao<?,Q> getOrdinalMeasurementsDao(final DataSeries ds) {
		final MeasurementsDaoFactory daoFactory = ds.getRawMeasurements()
				.getMeasurementsRange().getMeasurements().getMeasure()
				.getExperimentGroup().getRepository()
				.getMeasurementsDaoFactory();
		if (daoFactory.getDaoRegistry().isRegistered(ds.getValuesUuid())) {
			return (OrdinalMeasurementsDao<?,Q>) daoFactory.getDaoRegistry().getMeasurementsDao(ds.getValuesUuid());
		} else {
			OrdinalMeasurementsDao<?,Q> omd = new ExperimentDataSwitch<OrdinalMeasurementsDao<?,Q>>() {
				@Override
				public OrdinalMeasurementsDao<?,Q> caseIdentifierBasedMeasurements(org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements object) {
					String msg = "Tried to request ordinal measurements for a data series which should contain nominal measurements.";
					logger.log(Level.WARNING, msg);
					throw new IllegalArgumentException(msg);
				};
				@Override
				public OrdinalMeasurementsDao<?,Q> caseJSXmlMeasurements(org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements object) {
					return daoFactory.createJScienceXmlMeasurementsDao(ds.getValuesUuid());
				};
				@Override
				public OrdinalMeasurementsDao<?,Q> caseDoubleBinaryMeasurements(org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements object) {
					BinaryMeasurementsDao<Double,Q> bmd = daoFactory.createDoubleMeasurementsDao(ds.getValuesUuid());
					bmd.setUnit(object.getStorageUnit());
					return bmd;
				};
				@Override
				public OrdinalMeasurementsDao<?,Q> caseLongBinaryMeasurements(org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements object) {
					BinaryMeasurementsDao<Long,Q> bmd = daoFactory.createLongMeasurementsDao(ds.getValuesUuid());
					bmd.setUnit(object.getStorageUnit());
					return bmd;
				};
			}.doSwitch(ds);
			if (!omd.isOpen() && omd.canOpen()) {
				try {
					omd.open();
				} catch (DataNotAccessibleException e) {
					// Do nothing. Could simply not open the DAO.
				}
			}
			return omd;
		}
	}
	
	/**
	 * Opens the data store behind the repository if necessary.
	 * Access is only allowed to opened repositories. Repositories may be
	 * reopened (and the also reclosed).
	 * 
	 * @param repo Repository which should be opened.
	 * @throws DataNotAccessibleException if access to the repository fails. 
	 */
	public static void ensureOpenRepository(Repository repo) throws DataNotAccessibleException {
		/* Attention: Using addRepository() of RepositoryManager already opens
		 * the DAO. open() is only necessary if you don't use the convenience
		 * function or closed the repository and want to reopen it. 
		 */
		if (!repo.isOpen()) {
			repo.open();
		}
		if (!repo.isOpen()) {
			String msg = "Repository could not be opened.";
			logger.severe(msg);
			throw new DataNotAccessibleException(msg, null);
		}
	}

	/**
	 * Closes the data store behind the repository if necessary.
	 * Access is only allowed to opened repositories. Repositories may be
	 * reopened (and the also reclosed).
	 * 
	 * @param repo Repository which should be closed.
	 * @throws DataNotAccessibleException if access to the repository fails. 
	 */
	public static void ensureClosedRepository(Repository repo) throws DataNotAccessibleException {
		if (repo.isOpen()) {
			repo.close();
		}
		if (repo.isOpen()) {
			String msg = "Repository could not be closed.";
			logger.severe(msg);
			throw new DataNotAccessibleException(msg, null);
		}
	}
	
}
