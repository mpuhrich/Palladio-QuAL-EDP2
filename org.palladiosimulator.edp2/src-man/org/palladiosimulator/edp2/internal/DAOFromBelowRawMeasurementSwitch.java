package org.palladiosimulator.edp2.internal;

import org.palladiosimulator.edp2.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;

/**
 * EMF switch to create DAOs based on a raw measurement or a lower element (e.g. data series).
 * @author groenda
 */
public class DAOFromBelowRawMeasurementSwitch 
    extends ExperimentDataSwitch<Boolean> 
{
	@Override
	public Boolean caseRawMeasurements(RawMeasurements object) {
		boolean success = true;
		for(DataSeries dataSeries : object.getDataSeries()) {
			success &= doSwitch(dataSeries);
		}
		return success;
	}

	@Override
	public Boolean caseIdentifierBasedMeasurements(IdentifierBasedMeasurements object) {
		MeasurementsDaoFactory daoFactory = getMeasurementsDaoFactoryFromMeasurements(object);
		return null != daoFactory.createNominalMeasurementsDao(object.getValuesUuid());
	}

    @SuppressWarnings("unchecked")
    @Override
	public Boolean caseLongBinaryMeasurements(LongBinaryMeasurements object) {
		MeasurementsDaoFactory daoFactory = getMeasurementsDaoFactoryFromMeasurements(object);
		return null != daoFactory.createLongMeasurementsDao(object
				.getValuesUuid(), object.getStorageUnit());
	}
	
	@SuppressWarnings("unchecked")
    @Override
	public Boolean caseDoubleBinaryMeasurements(DoubleBinaryMeasurements object) {
		MeasurementsDaoFactory daoFactory = getMeasurementsDaoFactoryFromMeasurements(object);
		return null != daoFactory.createDoubleMeasurementsDao(object
				.getValuesUuid(), object.getStorageUnit());
	}
	
	@Override
	public Boolean caseJSXmlMeasurements(JSXmlMeasurements object) {
		MeasurementsDaoFactory daoFactory = getMeasurementsDaoFactoryFromMeasurements(object);
		return null != daoFactory.createJScienceXmlMeasurementsDao(object
				.getValuesUuid());
	}

    /**
     * @param dataSeries
     * @return
     */
    protected MeasurementsDaoFactory getMeasurementsDaoFactoryFromMeasurements(DataSeries dataSeries) {
        return dataSeries.getRawMeasurements().getMeasurementsRange()
    			.getMeasurements().getMeasure().getExperimentGroup()
    			.getRepository().getMeasurementsDaoFactory();
    }
}
