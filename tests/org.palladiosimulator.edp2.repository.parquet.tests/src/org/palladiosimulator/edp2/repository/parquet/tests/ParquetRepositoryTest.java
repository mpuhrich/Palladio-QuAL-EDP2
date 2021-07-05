package org.palladiosimulator.edp2.repository.parquet.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.repository.parquet.ParquetFactory;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;

class ParquetRepositoryTest {

    static ParquetRepository repository;

    @BeforeAll
    static void setUpClass() throws Exception {
        var pathToFolder = Files.createTempDirectory("ParquetRepositoryTest");
        var uriToFolder = URI.createFileURI(pathToFolder.toString());
        var uriToFile =  uriToFolder.appendSegment("ParquetRepository" + EDP2Constants.EDP2_REPOSITORY_EXTENSION);

        ResourceSet resourceSet = new ResourceSetImpl();
        var registry = new ResourceFactoryRegistryImpl();
        registry.getContentTypeToFactoryMap().put("*",  new XMLResourceFactoryImpl());
        resourceSet.setResourceFactoryRegistry(registry);

        var resource = resourceSet.createResource(uriToFile);
        resource.getContents().add(ParquetFactory.eINSTANCE.createParquetRepository());
        resource.save(Collections.EMPTY_MAP);
        repository = (ParquetRepository) resource.getContents().get(0);
    }

    @Test
    void testParquetRepositoryIsAfterSetupNotNull() throws Exception {
        assertNotNull(repository);
    }

}
