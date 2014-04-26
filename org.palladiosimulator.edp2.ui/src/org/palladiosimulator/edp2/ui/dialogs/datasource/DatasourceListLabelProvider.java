/**
 * 
 */
package org.palladiosimulator.edp2.ui.dialogs.datasource;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.dialogs.DialogsImages;

public class DatasourceListLabelProvider extends LabelProvider {

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(final Object element) {
        if (element instanceof Repository) {
            final Repository repository = (Repository) element;
            return repository.toString() + " [" + repository.getId()+ "]";
        }
        return super.getText(element);
    }

    @Override
    public Image getImage(final Object element) {
        if (element instanceof Repository) {
            return DialogsImages.imageRegistry.get(DialogsImages.TREEROOT);
        }
        return super.getImage(element);
    }

    public static String dataSetRepresentation(final Repository repository){
        return repository.toString() + " [" + repository.getId()+ "]";
    }
}
