/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.util;

import java.util.Map;

import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Run;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage
 * @generated
 */
public class ExperimentDataAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ExperimentDataPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExperimentDataAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = ExperimentDataPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected ExperimentDataSwitch<Adapter> modelSwitch = new ExperimentDataSwitch<Adapter>()
            {
        @Override
        public Adapter caseAggregatedMeasurements(final AggregatedMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createAggregatedMeasurementsAdapter();
        }

        @Override
        public Adapter caseMeasurementRange(final MeasurementRange object)
        {
            return ExperimentDataAdapterFactory.this.createMeasurementRangeAdapter();
        }

        @Override
        public Adapter casePropertyable(final Propertyable object)
        {
            return ExperimentDataAdapterFactory.this.createPropertyableAdapter();
        }

        @Override
        public Adapter caseEStringtoEObjectMapEntry(final Map.Entry<String, Object> object)
        {
            return ExperimentDataAdapterFactory.this.createEStringtoEObjectMapEntryAdapter();
        }

        @Override
        public Adapter caseRawMeasurements(final RawMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createRawMeasurementsAdapter();
        }

        @Override
        public Adapter caseDataSeries(final DataSeries object)
        {
            return ExperimentDataAdapterFactory.this.createDataSeriesAdapter();
        }

        @Override
        public Adapter caseNumericalNominalStatistics(final NumericalNominalStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalNominalStatisticsAdapter();
        }

        @Override
        public Adapter caseNumericalMassDistribution(final NumericalMassDistribution object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalMassDistributionAdapter();
        }

        @Override
        public Adapter caseFixedWidthAggregatedMeasurements(final FixedWidthAggregatedMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createFixedWidthAggregatedMeasurementsAdapter();
        }

        @Override
        public Adapter caseFixedIntervals(final FixedIntervals object)
        {
            return ExperimentDataAdapterFactory.this.createFixedIntervalsAdapter();
        }

        @Override
        public Adapter caseTextualNominalStatistics(final TextualNominalStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createTextualNominalStatisticsAdapter();
        }

        @Override
        public Adapter caseTextualMassDistribution(final TextualMassDistribution object)
        {
            return ExperimentDataAdapterFactory.this.createTextualMassDistributionAdapter();
        }

        @Override
        public Adapter caseExperimentGroup(final ExperimentGroup object)
        {
            return ExperimentDataAdapterFactory.this.createExperimentGroupAdapter();
        }

        @Override
        public Adapter caseExperimentSetting(final ExperimentSetting object)
        {
            return ExperimentDataAdapterFactory.this.createExperimentSettingAdapter();
        }

        @Override
        public Adapter caseExperimentRun(final ExperimentRun object)
        {
            return ExperimentDataAdapterFactory.this.createExperimentRunAdapter();
        }

        @Override
        public Adapter caseMeasurement(final Measurement object)
        {
            return ExperimentDataAdapterFactory.this.createMeasurementAdapter();
        }

        @Override
        public Adapter caseMeasuringType(final MeasuringType object)
        {
            return ExperimentDataAdapterFactory.this.createMeasuringTypeAdapter();
        }

        @Override
        public Adapter caseAggregationStatistics(final AggregationStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createAggregationStatisticsAdapter();
        }

        @Override
        public <Q extends Quantity> Adapter caseDoubleBinaryMeasurements(final DoubleBinaryMeasurements<Q> object)
        {
            return ExperimentDataAdapterFactory.this.createDoubleBinaryMeasurementsAdapter();
        }

        @Override
        public Adapter caseNumericalIntervalStatistics(final NumericalIntervalStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalIntervalStatisticsAdapter();
        }

        @Override
        public Adapter caseNumericalOrdinalStatistics(final NumericalOrdinalStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalOrdinalStatisticsAdapter();
        }

        @Override
        public Adapter caseNumericalPercentile(final NumericalPercentile object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalPercentileAdapter();
        }

        @Override
        public Adapter caseJSXmlMeasurements(final JSXmlMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createJSXmlMeasurementsAdapter();
        }

        @Override
        public Adapter caseLongBinaryMeasurements(final LongBinaryMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createLongBinaryMeasurementsAdapter();
        }

        @Override
        public Adapter caseIdentifierBasedMeasurements(final IdentifierBasedMeasurements object)
        {
            return ExperimentDataAdapterFactory.this.createIdentifierBasedMeasurementsAdapter();
        }

        @Override
        public Adapter caseNumericalRatioStatistics(final NumericalRatioStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createNumericalRatioStatisticsAdapter();
        }

        @Override
        public Adapter caseIJSDuration(final Duration object)
        {
            return ExperimentDataAdapterFactory.this.createIJSDurationAdapter();
        }

        @Override
        public Adapter caseEComparable(final Comparable object)
        {
            return ExperimentDataAdapterFactory.this.createEComparableAdapter();
        }

        @Override
        public Adapter caseTextualOrdinalStatistics(final TextualOrdinalStatistics object)
        {
            return ExperimentDataAdapterFactory.this.createTextualOrdinalStatisticsAdapter();
        }

        @Override
        public Adapter caseRun(final Run object)
        {
            return ExperimentDataAdapterFactory.this.createRunAdapter();
        }

        @Override
        public Adapter caseExperimentGroupRun(final ExperimentGroupRun object)
        {
            return ExperimentDataAdapterFactory.this.createExperimentGroupRunAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return ExperimentDataAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return ExperimentDataAdapterFactory.this.createEObjectAdapter();
        }
            };

            /**
             * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
             * @generated
             */
            @Override
            public Adapter createAdapter(final Notifier target) {
                return this.modelSwitch.doSwitch((EObject) target);
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements
     * <em>Aggregated Measurements</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements
             * @generated
             */
            public Adapter createAggregatedMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange
     * <em>Measurement Range</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange
             * @generated
             */
            public Adapter createMeasurementRangeAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Propertyable <em>Propertyable</em>}'.
             * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.Propertyable
             * @generated
             */
            public Adapter createPropertyableAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link java.util.Map.Entry
     * <em>EStringto EObject Map Entry</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see java.util.Map.Entry
             * @generated
             */
            public Adapter createEStringtoEObjectMapEntryAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements
     * <em>Raw Measurements</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements
             * @generated
             */
            public Adapter createRawMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries <em>Data Series</em>}'.
             * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries
             * @generated
             */
            public Adapter createDataSeriesAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics
     * <em>Numerical Nominal Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics
             * @generated
             */
            public Adapter createNumericalNominalStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution
     * <em>Numerical Mass Distribution</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution
             * @generated
             */
            public Adapter createNumericalMassDistributionAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements
     * <em>Fixed Width Aggregated Measurements</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements
             * @generated
             */
            public Adapter createFixedWidthAggregatedMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals
     * <em>Fixed Intervals</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals
             * @generated
             */
            public Adapter createFixedIntervalsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics
     * <em>Textual Nominal Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics
             * @generated
             */
            public Adapter createTextualNominalStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution
     * <em>Textual Mass Distribution</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution
             * @generated
             */
            public Adapter createTextualMassDistributionAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup
     * <em>Experiment Group</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup
             * @generated
             */
            public Adapter createExperimentGroupAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting
     * <em>Experiment Setting</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting
             * @generated
             */
            public Adapter createExperimentSettingAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun
     * <em>Experiment Run</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun
             * @generated
             */
            public Adapter createExperimentRunAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement <em>Measurement</em>}'.
             * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.Measurement
             * @generated
             */
            public Adapter createMeasurementAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasuringType
     * <em>Measuring Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.MeasuringType
             * @generated
             */
            public Adapter createMeasuringTypeAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics
     * <em>Aggregation Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics
             * @generated
             */
            public Adapter createAggregationStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements
     * <em>Double Binary Measurements</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements
             * @generated
             */
            public Adapter createDoubleBinaryMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics
     * <em>Numerical Interval Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics
             * @generated
             */
            public Adapter createNumericalIntervalStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics
     * <em>Numerical Ordinal Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics
             * @generated
             */
            public Adapter createNumericalOrdinalStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile
     * <em>Numerical Percentile</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile
             * @generated
             */
            public Adapter createNumericalPercentileAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements
     * <em>JS Xml Measurements</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements
             * @generated
             */
            public Adapter createJSXmlMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements
     * <em>Long Binary Measurements</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements
             * @generated
             */
            public Adapter createLongBinaryMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements
     * <em>Identifier Based Measurements</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements
             * @generated
             */
            public Adapter createIdentifierBasedMeasurementsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics
     * <em>Numerical Ratio Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics
             * @generated
             */
            public Adapter createNumericalRatioStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link javax.measure.quantity.Duration
     * <em>IJS Duration</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see javax.measure.quantity.Duration
             * @generated
             */
            public Adapter createIJSDurationAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link java.lang.Comparable
     * <em>EComparable</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see java.lang.Comparable
             * @generated
             */
            public Adapter createEComparableAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics
     * <em>Textual Ordinal Statistics</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics
             * @generated
             */
            public Adapter createTextualOrdinalStatisticsAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.edp2.models.ExperimentData.Run <em>Run</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.Run
             * @generated
             */
            public Adapter createRunAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun
     * <em>Experiment Group Run</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun
             * @generated
             */
            public Adapter createExperimentGroupRunAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @see de.uka.ipd.sdq.identifier.Identifier
             * @generated
             */
            public Adapter createIdentifierAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
             * @generated
             */
            public Adapter createEObjectAdapter() {
                return null;
            }

} // ExperimentDataAdapterFactory
