package org.palladiosimulator.edp2.repository.parquet.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;

public class ParquetRepositoryItemProvider extends ParquetRepositoryItemProviderGen {

    public ParquetRepositoryItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public String getText(Object object) {
        final var repository = (ParquetRepository) object;
        final var result = String.format("Parquet Repository [ID: %s, Data Folder: %s]",
                repository.getId(),
                repository.getDataFolder().toString());;
        return result;
    }

    @Override
    public Object getStyledText(Object object) {
        final var repository = (ParquetRepository) object;
        final var result = new StyledString("Parquet Repository");
        result.append("ID: " + repository.getId(), Style.COUNTER_STYLER);
        result.append("Data: " + repository.getDataFolder().toString(), Style.COUNTER_STYLER);
        return result;
    }

}
