/**
 *
 */
package org.palladiosimulator.edp2;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.palladiosimulator.edp2.repository.local.dao.LocalDirectoryMeasurementsDaoFactory;

/**
 * JUnit test for file-backed LongBinaryMeasurementsDao.
 *
 * @author groenda
 */
public class FileLongBinaryMeasurementsDaoTest extends LongBinaryMeasurementsDaoTest {
    @Before
    public void setUpBefore() throws Exception {
        final File tempFile = File.createTempFile("delete", "me");
        tempFile.delete();
        final String uuid = EcoreUtil.generateUUID();
        if (tempFile.mkdir() == true) {
            tempFile.deleteOnExit();
            df = new LocalDirectoryMeasurementsDaoFactory(URI.createURI(tempFile.getAbsoluteFile().toURI().toString()));
            assertNotNull("DaoFactory must not be null.", df);
            dao = bmDao = df.createLongMeasurementsDao(uuid);
            bmDao.setUnit(unit);
            assertNotNull("LongBinaryMeasurementsDao must not be null.", bmDao);
        }
    }
}
