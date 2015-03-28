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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class TextualOrdinalStatisticsItemProvider extends TextualNominalStatisticsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public TextualOrdinalStatisticsItemProvider(final AdapterFactory adapterFactory) {
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

            this.addMinimumPropertyDescriptor(object);
            this.addMaximumPropertyDescriptor(object);
            this.addMedianPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Minimum feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMinimumPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory)
                .getRootAdapterFactory(), this.getResourceLocator(), this
                .getString("_UI_TextualOrdinalStatistics_minimum_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_TextualOrdinalStatistics_minimum_feature",
                        "_UI_TextualOrdinalStatistics_type"),
                        ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, true, false, true, null,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Maximum feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMaximumPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory)
                .getRootAdapterFactory(), this.getResourceLocator(), this
                .getString("_UI_TextualOrdinalStatistics_maximum_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_TextualOrdinalStatistics_maximum_feature",
                        "_UI_TextualOrdinalStatistics_type"),
                        ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, true, false, true, null,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Median feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMedianPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add(this.createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory)
                .getRootAdapterFactory(), this.getResourceLocator(), this
                .getString("_UI_TextualOrdinalStatistics_median_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_TextualOrdinalStatistics_median_feature",
                        "_UI_TextualOrdinalStatistics_type"),
                        ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, true, false, true, null,
                        null, null));
    }

    /**
     * This returns TextualOrdinalStatistics.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/TextualOrdinalStatistics"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final TextualOrdinalStatistics textualOrdinalStatistics = (TextualOrdinalStatistics) object;
        return this.getString("_UI_TextualOrdinalStatistics_type") + " "
        + textualOrdinalStatistics.getNumberMeasurements();
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
    }

}
