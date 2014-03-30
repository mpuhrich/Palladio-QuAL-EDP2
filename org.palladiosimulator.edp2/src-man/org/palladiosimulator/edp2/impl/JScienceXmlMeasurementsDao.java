/**
 * 
 */
package org.palladiosimulator.edp2.impl;

import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.MeasurementsDao;

/**Access for JScienceXmlMeasurements.
 * @author groenda
 *
 */
public interface JScienceXmlMeasurementsDao<V,Q extends Quantity> extends MeasurementsDao<V,Q> {

    @Override
    public List<Measure<V,Q>> getMeasurements();
}
