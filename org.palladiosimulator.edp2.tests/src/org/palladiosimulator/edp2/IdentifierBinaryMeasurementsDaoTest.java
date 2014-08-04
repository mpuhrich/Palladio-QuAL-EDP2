/**
 * 
 */
package org.palladiosimulator.edp2;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.palladiosimulator.edp2.dao.localfile.LocalDirectoryMeasurementsDaoFactory;

/**
 * JUnit test for file-backed LongBinaryMeasurementsDao.
 * 
 * @author groenda
 */
public class IdentifierBinaryMeasurementsDaoTest extends NominalMeasurementsDaoTest {
    @Before
    public void setUpBefore() throws Exception {
        final File tempFile = File.createTempFile("delete", "me");
        tempFile.delete();
        final String uuid = EcoreUtil.generateUUID();
        if (tempFile.mkdir() == true) {
            tempFile.deleteOnExit();
            df = new LocalDirectoryMeasurementsDaoFactory(tempFile.getAbsoluteFile());
            assertNotNull("DaoFactory must not be null.", df);
            dao = this.onmDao = df.createNominalMeasurementsDao(uuid, metric);
            onmDao.setUnit(Unit.ONE);
            assertNotNull("LongBinaryMeasurementsDao must not be null.", onmDao);
        }
    }
}
