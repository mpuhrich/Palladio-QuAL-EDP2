/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ExperimentGroupItemProvider extends IdentifierItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ExperimentGroupItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addPurposePropertyDescriptor(object);
            this.addRepositoryPropertyDescriptor(object);
            this.addReportsPropertyDescriptor(object);
            this.addMeasuringPointRepositoriesPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Purpose feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPurposePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ExperimentGroup_purpose_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ExperimentGroup_purpose_feature",
                        "_UI_ExperimentGroup_type"), ExperimentDataPackage.Literals.EXPERIMENT_GROUP__PURPOSE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Repository feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRepositoryPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ExperimentGroup_repository_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ExperimentGroup_repository_feature",
                        "_UI_ExperimentGroup_type"), ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPOSITORY, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Reports feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addReportsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ExperimentGroup_reports_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ExperimentGroup_reports_feature",
                        "_UI_ExperimentGroup_type"), ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPORTS, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Measuring Point Repositories feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMeasuringPointRepositoriesPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ExperimentGroup_measuringPointRepositories_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ExperimentGroup_measuringPointRepositories_feature",
                        "_UI_ExperimentGroup_type"),
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES, true, false, true, null,
                null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.PROPERTYABLE__ADDITIONAL_INFORMATION);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_TYPES);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPORTS);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ExperimentGroup.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ExperimentGroup"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ExperimentGroup) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ExperimentGroup_type") : this
                .getString("_UI_ExperimentGroup_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ExperimentGroup.class)) {
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.PROPERTYABLE__ADDITIONAL_INFORMATION,
                ExperimentDataFactory.eINSTANCE.create(ExperimentDataPackage.Literals.ESTRINGTO_EOBJECT_MAP_ENTRY)));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS,
                ExperimentDataFactory.eINSTANCE.createExperimentSetting()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_TYPES,
                ExperimentDataFactory.eINSTANCE.createMeasuringType()));

        newChildDescriptors.add(this.createChildParameter(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPORTS,
                ExperimentDataFactory.eINSTANCE.createExperimentGroupRun()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES,
                MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
    }

}
