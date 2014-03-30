package org.palladiosimulator.edp2;

import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;

/**Interface for the access to any measurement data.
 * @author groenda
 */
public interface MeasurementsDao<V,Q extends Quantity> extends Edp2Dao {
    // Life cycle

    /**Serialize the data to an output stream.
     * Used to transfer Measurements to and from remote locations.
     * @param output Output data stream
     * @throws DataNotAccessibleException
     */
    public void serialize(ExtendedDataOutputStream output) throws DataNotAccessibleException;

    /**Deserialize the data from an input stream.
     * Used to transfer Measurements to and from remote locations.
     * @param input Input data stream.
     */
    public void deserialize(ExtendedDataInputStream input) throws DataNotAccessibleException;

    /**
     * @return Observed measurements.
     */
    public List<Measure<V,Q>> getMeasurements();
}
