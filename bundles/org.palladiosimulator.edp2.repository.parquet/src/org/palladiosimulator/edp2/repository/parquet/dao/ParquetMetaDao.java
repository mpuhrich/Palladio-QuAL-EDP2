package org.palladiosimulator.edp2.repository.parquet.dao;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.dao.impl.MetaDaoImpl;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContextFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContextRegistry;
import org.palladiosimulator.edp2.repository.parquet.internal.metadata.ParquetRepositoryMetaData;

public class ParquetMetaDao extends MetaDaoImpl implements MetaDaoDelegate {

    private ParquetRepository managedRepository;
    private ParquetMeasurementsDaoFactory mmtDaoFactory;
    private ExperimentContextFactory contextFactory;
    private ExperimentContext activeExperimentContext;
    private ParquetRepositoryMetaData metadata;

    @Override
    public void setParent(MetaDao parent) {
        managedRepository = (ParquetRepository) parent;
    }

    @Override
    public void initializeExperimentRun(Map<String, Object> configuration) {
        final var experimentRun = (String) configuration.get(ParquetRepositoryConstants.CONFIG_MAP_KEY_EXPERIMENT_RUN_ID);
        activeExperimentContext = contextFactory.createAndRegisterExperimentContext(experimentRun);
    }

    @Override
    public MeasurementsDaoFactory getMeasurementsDaoFactory() {
        return mmtDaoFactory;
    }

    @Override
    public synchronized void open(DiagnosticChain diagnosticChain) {
        super.open(diagnosticChain);
        initialize();
        metadata.loadMetaData(diagnosticChain);
        setOpen();
    }

    private void initialize() {
        final var registry = new ExperimentContextRegistry();
        contextFactory = new ExperimentContextFactory();
        contextFactory.setExperimentContextRegistry(registry);
        contextFactory.setBasePath(managedRepository.getDataFolder());
        mmtDaoFactory = new ParquetMeasurementsDaoFactory();
        mmtDaoFactory.setParquetRepository(managedRepository);
        mmtDaoFactory.setExperimentContextRegistry(registry);
        metadata = new ParquetRepositoryMetaData(managedRepository, contextFactory);
    }

    @Override
    public synchronized void close() throws DataNotAccessibleException {
        super.close();
        contextFactory.getExperimentContextRegistry().getData().forEach((k, v) -> v.close());
        mmtDaoFactory.setActive(false);
        mmtDaoFactory = null;
        contextFactory = null;
        setClosed();
    }

    @Override
    public void flush() {
        activeExperimentContext.flush();
        try {
            metadata.persistMetaData(true);
        } catch (DataNotAccessibleException e) {
            e.printStackTrace();
        }
    }

}
