/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <font size="2">Contains the model elements for the meta data of the experiments.</font>
 * </p>
 * <p>
 *     <font size="2">It covers the areas ExperimentsView, MeasureDefinitionView, and DescriptionsView.</font>
 * </p>
 * <!-- end-model-doc -->
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExperimentData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/EDP2/ExperimentData/0.9.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.palladiosimulator.edp2.models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentDataPackage eINSTANCE = org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl <em>Aggregated Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getAggregatedMeasurements()
	 * @generated
	 */
	int AGGREGATED_MEASUREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int AGGREGATED_MEASUREMENTS__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Measurements Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__MEASUREMENTS_RANGE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__VALID = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__FUNCTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregation Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregation On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__AGGREGATION_ON = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS__METRIC = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Aggregated Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENTS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl <em>Data Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getDataSeries()
	 * @generated
	 */
	int DATA_SERIES = 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl <em>Fixed Intervals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getFixedIntervals()
	 * @generated
	 */
	int FIXED_INTERVALS = 9;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.PropertyableImpl <em>Propertyable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.PropertyableImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getPropertyable()
	 * @generated
	 */
	int PROPERTYABLE = 2;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYABLE__ADDITIONAL_INFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Propertyable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl <em>Measurements Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getMeasurementsRange()
	 * @generated
	 */
	int MEASUREMENTS_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__ADDITIONAL_INFORMATION = PROPERTYABLE__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__RAW_MEASUREMENTS = PROPERTYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__MEASUREMENTS = PROPERTYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__END_TIME = PROPERTYABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__START_TIME = PROPERTYABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS = PROPERTYABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Measurements Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_RANGE_FEATURE_COUNT = PROPERTYABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl <em>EStringto EObject Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEStringtoEObjectMapEntry()
	 * @generated
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EStringto EObject Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRINGTO_EOBJECT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl <em>Raw Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getRawMeasurements()
	 * @generated
	 */
	int RAW_MEASUREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RAW_MEASUREMENTS__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Data Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__DATA_SERIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS__MEASUREMENTS_RANGE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raw Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MEASUREMENTS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES__NUMERICAL_STATISTICS = 0;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES__AGGREGATED_MEASUREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES__VALUES_UUID = 2;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES__TEXTUAL_STATISTICS = 3;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES__RAW_MEASUREMENTS = 4;

	/**
	 * The number of structural features of the '<em>Data Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERIES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl <em>Numerical Nominal Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalNominalStatistics()
	 * @generated
	 */
	int NUMERICAL_NOMINAL_STATISTICS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERICAL_NOMINAL_STATISTICS__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numerical Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numerical Nominal Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl <em>Numerical Mass Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalMassDistribution()
	 * @generated
	 */
	int NUMERICAL_MASS_DISTRIBUTION = 7;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_MASS_DISTRIBUTION__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_MASS_DISTRIBUTION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Numerical Nominal Statistics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS = 2;

	/**
	 * The number of structural features of the '<em>Numerical Mass Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_MASS_DISTRIBUTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl <em>Fixed Width Aggregated Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getFixedWidthAggregatedMeasurements()
	 * @generated
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__ID = AGGREGATED_MEASUREMENTS__ID;

    /**
	 * The feature id for the '<em><b>Measurements Range</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__MEASUREMENTS_RANGE = AGGREGATED_MEASUREMENTS__MEASUREMENTS_RANGE;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__VALID = AGGREGATED_MEASUREMENTS__VALID;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__FUNCTION = AGGREGATED_MEASUREMENTS__FUNCTION;

	/**
	 * The feature id for the '<em><b>Aggregation Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS = AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregation On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__AGGREGATION_ON = AGGREGATED_MEASUREMENTS__AGGREGATION_ON;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__METRIC = AGGREGATED_MEASUREMENTS__METRIC;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Width Aggregated Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WIDTH_AGGREGATED_MEASUREMENTS_FEATURE_COUNT = AGGREGATED_MEASUREMENTS_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIXED_INTERVALS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVALS__LOWER_BOUND = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVALS__WIDTH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Intervals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVALS__NUMBER_OF_INTERVALS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVALS__AGGREGATED_MEASUREMENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Intervals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVALS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl <em>Textual Nominal Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualNominalStatistics()
	 * @generated
	 */
	int TEXTUAL_NOMINAL_STATISTICS = 10;

	/**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES = 2;

	/**
	 * The number of structural features of the '<em>Textual Nominal Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOMINAL_STATISTICS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl <em>Textual Mass Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualMassDistribution()
	 * @generated
	 */
	int TEXTUAL_MASS_DISTRIBUTION = 11;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_MASS_DISTRIBUTION__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Textual Nominal Statistics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS = 2;

	/**
	 * The number of structural features of the '<em>Textual Mass Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_MASS_DISTRIBUTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl <em>Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getMeasurements()
	 * @generated
	 */
	int MEASUREMENTS = 15;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl <em>Experiment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentGroup()
	 * @generated
	 */
	int EXPERIMENT_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_GROUP__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl <em>Experiment Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentSetting()
	 * @generated
	 */
	int EXPERIMENT_SETTING = 13;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl <em>Experiment Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentRun()
	 * @generated
	 */
	int EXPERIMENT_RUN = 14;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.Edp2MeasureImpl <em>Edp2 Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.Edp2MeasureImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEdp2Measure()
	 * @generated
	 */
	int EDP2_MEASURE = 16;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl <em>Aggregation Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getAggregationStatistics()
	 * @generated
	 */
	int AGGREGATION_STATISTICS = 17;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__ADDITIONAL_INFORMATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__EXPERIMENT_SETTINGS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__MEASURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__PURPOSE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP__REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Experiment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_GROUP_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_SETTING__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__ADDITIONAL_INFORMATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experiment Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__EXPERIMENT_RUNS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__MEASURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Experiment Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING__EXPERIMENT_GROUP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Experiment Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SETTING_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_RUN__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__ADDITIONAL_INFORMATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__MEASUREMENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__START_TIME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__DURATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Experiment Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN__EXPERIMENT_SETTING = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Experiment Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RUN_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENTS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__ADDITIONAL_INFORMATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__MEASURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurements Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__MEASUREMENTS_RANGES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Experiment Run</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__EXPERIMENT_RUN = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EDP2_MEASURE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Experiment Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDP2_MEASURE__EXPERIMENT_GROUP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDP2_MEASURE__EXPERIMENT_SETTINGS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measured Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDP2_MEASURE__MEASURED_OBJECT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDP2_MEASURE__METRIC = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edp2 Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDP2_MEASURE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.LongBinaryMeasurementsImpl <em>Long Binary Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.LongBinaryMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getLongBinaryMeasurements()
	 * @generated
	 */
	int LONG_BINARY_MEASUREMENTS = 23;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.DoubleBinaryMeasurementsImpl <em>Double Binary Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.DoubleBinaryMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getDoubleBinaryMeasurements()
	 * @generated
	 */
	int DOUBLE_BINARY_MEASUREMENTS = 18;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.JSXmlMeasurementsImpl <em>JS Xml Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.JSXmlMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getJSXmlMeasurements()
	 * @generated
	 */
	int JS_XML_MEASUREMENTS = 22;

	/**
	 * The meta object id for the '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Duration
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getIJSDuration()
	 * @generated
	 */
	int IJS_DURATION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int AGGREGATION_STATISTICS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distinct Values After Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregation Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_STATISTICS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__NUMERICAL_STATISTICS = DATA_SERIES__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS = DATA_SERIES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__VALUES_UUID = DATA_SERIES__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__TEXTUAL_STATISTICS = DATA_SERIES__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__RAW_MEASUREMENTS = DATA_SERIES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Storage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT = DATA_SERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Binary Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BINARY_MEASUREMENTS_FEATURE_COUNT = DATA_SERIES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl <em>Numerical Ordinal Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalOrdinalStatistics()
	 * @generated
	 */
	int NUMERICAL_ORDINAL_STATISTICS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERICAL_ORDINAL_STATISTICS__ID = NUMERICAL_NOMINAL_STATISTICS__ID;

    /**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__NUMBER_MEASUREMENTS = NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Numerical Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION = NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__DATA_SERIES = NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__MINIMUM = NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__MAXIMUM = NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__MEDIAN = NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Percentiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS__PERCENTILES = NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Numerical Ordinal Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT = NUMERICAL_NOMINAL_STATISTICS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl <em>Numerical Interval Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalIntervalStatistics()
	 * @generated
	 */
	int NUMERICAL_INTERVAL_STATISTICS = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERICAL_INTERVAL_STATISTICS__ID = NUMERICAL_ORDINAL_STATISTICS__ID;

    /**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__NUMBER_MEASUREMENTS = NUMERICAL_ORDINAL_STATISTICS__NUMBER_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Numerical Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION = NUMERICAL_ORDINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__DATA_SERIES = NUMERICAL_ORDINAL_STATISTICS__DATA_SERIES;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__MINIMUM = NUMERICAL_ORDINAL_STATISTICS__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__MAXIMUM = NUMERICAL_ORDINAL_STATISTICS__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__MEDIAN = NUMERICAL_ORDINAL_STATISTICS__MEDIAN;

	/**
	 * The feature id for the '<em><b>Percentiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__PERCENTILES = NUMERICAL_ORDINAL_STATISTICS__PERCENTILES;

	/**
	 * The feature id for the '<em><b>Arithmethic Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN = NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__VARIANCE = NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION = NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS__SUM = NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Numerical Interval Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_INTERVAL_STATISTICS_FEATURE_COUNT = NUMERICAL_ORDINAL_STATISTICS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl <em>Numerical Percentile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalPercentile()
	 * @generated
	 */
	int NUMERICAL_PERCENTILE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERICAL_PERCENTILE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Percentile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PERCENTILE__PERCENTILE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PERCENTILE__VALUE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordinal Statistics</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PERCENTILE__ORDINAL_STATISTICS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numerical Percentile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PERCENTILE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__NUMERICAL_STATISTICS = DATA_SERIES__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__AGGREGATED_MEASUREMENTS = DATA_SERIES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__VALUES_UUID = DATA_SERIES__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__TEXTUAL_STATISTICS = DATA_SERIES__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS__RAW_MEASUREMENTS = DATA_SERIES__RAW_MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>JS Xml Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_XML_MEASUREMENTS_FEATURE_COUNT = DATA_SERIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__NUMERICAL_STATISTICS = DATA_SERIES__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS = DATA_SERIES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__VALUES_UUID = DATA_SERIES__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__TEXTUAL_STATISTICS = DATA_SERIES__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__RAW_MEASUREMENTS = DATA_SERIES__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Storage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS__STORAGE_UNIT = DATA_SERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Binary Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BINARY_MEASUREMENTS_FEATURE_COUNT = DATA_SERIES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.IdentifierBasedMeasurementsImpl <em>Identifier Based Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.IdentifierBasedMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getIdentifierBasedMeasurements()
	 * @generated
	 */
	int IDENTIFIER_BASED_MEASUREMENTS = 24;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS__NUMERICAL_STATISTICS = DATA_SERIES__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS__AGGREGATED_MEASUREMENTS = DATA_SERIES__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS__VALUES_UUID = DATA_SERIES__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS__TEXTUAL_STATISTICS = DATA_SERIES__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS__RAW_MEASUREMENTS = DATA_SERIES__RAW_MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>Identifier Based Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_BASED_MEASUREMENTS_FEATURE_COUNT = DATA_SERIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl <em>Numerical Ratio Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalRatioStatistics()
	 * @generated
	 */
	int NUMERICAL_RATIO_STATISTICS = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMERICAL_RATIO_STATISTICS__ID = NUMERICAL_INTERVAL_STATISTICS__ID;

    /**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__NUMBER_MEASUREMENTS = NUMERICAL_INTERVAL_STATISTICS__NUMBER_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Numerical Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__NUMERICAL_MASS_DISTRIBUTION = NUMERICAL_INTERVAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__DATA_SERIES = NUMERICAL_INTERVAL_STATISTICS__DATA_SERIES;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__MINIMUM = NUMERICAL_INTERVAL_STATISTICS__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__MAXIMUM = NUMERICAL_INTERVAL_STATISTICS__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__MEDIAN = NUMERICAL_INTERVAL_STATISTICS__MEDIAN;

	/**
	 * The feature id for the '<em><b>Percentiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__PERCENTILES = NUMERICAL_INTERVAL_STATISTICS__PERCENTILES;

	/**
	 * The feature id for the '<em><b>Arithmethic Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__ARITHMETHIC_MEAN = NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__VARIANCE = NUMERICAL_INTERVAL_STATISTICS__VARIANCE;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__STANDARD_DEVIATION = NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__SUM = NUMERICAL_INTERVAL_STATISTICS__SUM;

	/**
	 * The feature id for the '<em><b>Coefficient Of Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION = NUMERICAL_INTERVAL_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometric Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN = NUMERICAL_INTERVAL_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Harmonic Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN = NUMERICAL_INTERVAL_STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numerical Ratio Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_RATIO_STATISTICS_FEATURE_COUNT = NUMERICAL_INTERVAL_STATISTICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1DoubleBinaryMeasurementsImpl <em>Sensor Framework V1 Double Binary Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1DoubleBinaryMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getSensorFrameworkV1DoubleBinaryMeasurements()
	 * @generated
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS = 26;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__NUMERICAL_STATISTICS = DOUBLE_BINARY_MEASUREMENTS__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS = DOUBLE_BINARY_MEASUREMENTS__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__VALUES_UUID = DOUBLE_BINARY_MEASUREMENTS__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__TEXTUAL_STATISTICS = DOUBLE_BINARY_MEASUREMENTS__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__RAW_MEASUREMENTS = DOUBLE_BINARY_MEASUREMENTS__RAW_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Storage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT = DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT;

	/**
	 * The number of structural features of the '<em>Sensor Framework V1 Double Binary Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS_FEATURE_COUNT = DOUBLE_BINARY_MEASUREMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1IdentifierBasedMeasurementsImpl <em>Sensor Framework V1 Identifier Based Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1IdentifierBasedMeasurementsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getSensorFrameworkV1IdentifierBasedMeasurements()
	 * @generated
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS = 27;

	/**
	 * The feature id for the '<em><b>Numerical Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS__NUMERICAL_STATISTICS = IDENTIFIER_BASED_MEASUREMENTS__NUMERICAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Aggregated Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS__AGGREGATED_MEASUREMENTS = IDENTIFIER_BASED_MEASUREMENTS__AGGREGATED_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Values Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS__VALUES_UUID = IDENTIFIER_BASED_MEASUREMENTS__VALUES_UUID;

	/**
	 * The feature id for the '<em><b>Textual Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS__TEXTUAL_STATISTICS = IDENTIFIER_BASED_MEASUREMENTS__TEXTUAL_STATISTICS;

	/**
	 * The feature id for the '<em><b>Raw Measurements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS__RAW_MEASUREMENTS = IDENTIFIER_BASED_MEASUREMENTS__RAW_MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>Sensor Framework V1 Identifier Based Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS_FEATURE_COUNT = IDENTIFIER_BASED_MEASUREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IJS Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IJS_DURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Comparable <em>EComparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEComparable()
	 * @generated
	 */
	int ECOMPARABLE = 29;

	/**
	 * The number of structural features of the '<em>EComparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl <em>Textual Ordinal Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualOrdinalStatistics()
	 * @generated
	 */
	int TEXTUAL_ORDINAL_STATISTICS = 30;

	/**
	 * The feature id for the '<em><b>Number Measurements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__NUMBER_MEASUREMENTS = TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Mass Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__MASS_DISTRIBUTION = TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Data Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__DATA_SERIES = TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__MINIMUM = TEXTUAL_NOMINAL_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__MAXIMUM = TEXTUAL_NOMINAL_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Median</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS__MEDIAN = TEXTUAL_NOMINAL_STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Textual Ordinal Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ORDINAL_STATISTICS_FEATURE_COUNT = TEXTUAL_NOMINAL_STATISTICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>EJS Measure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measure
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEJSMeasure()
	 * @generated
	 */
	int EJS_MEASURE = 31;

	/**
	 * The meta object id for the '<em>EJS Duration Measure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.Measure
	 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEJSDurationMeasure()
	 * @generated
	 */
	int EJS_DURATION_MEASURE = 32;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements
	 * @generated
	 */
	EClass getAggregatedMeasurements();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMeasurementsRange <em>Measurements Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurements Range</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMeasurementsRange()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_MeasurementsRange();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#isValid()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EAttribute getAggregatedMeasurements_Valid();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getFunction()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_Function();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getAggregationStatistics <em>Aggregation Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregation Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getAggregationStatistics()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_AggregationStatistics();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getAggregationOn <em>Aggregation On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregation On</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getAggregationOn()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_AggregationOn();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMetric()
	 * @see #getAggregatedMeasurements()
	 * @generated
	 */
	EReference getAggregatedMeasurements_Metric();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange <em>Measurements Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurements Range</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange
	 * @generated
	 */
	EClass getMeasurementsRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getRawMeasurements()
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	EReference getMeasurementsRange_RawMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getEndTime()
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	EAttribute getMeasurementsRange_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getStartTime()
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	EAttribute getMeasurementsRange_StartTime();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getMeasurements()
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	EReference getMeasurementsRange_Measurements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getAggregatedMeasurements()
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	EReference getMeasurementsRange_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries <em>Data Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Series</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries
	 * @generated
	 */
	EClass getDataSeries();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getNumericalStatistics <em>Numerical Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerical Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getNumericalStatistics()
	 * @see #getDataSeries()
	 * @generated
	 */
	EReference getDataSeries_NumericalStatistics();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getAggregatedMeasurements()
	 * @see #getDataSeries()
	 * @generated
	 */
	EReference getDataSeries_AggregatedMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getValuesUuid <em>Values Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Uuid</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getValuesUuid()
	 * @see #getDataSeries()
	 * @generated
	 */
	EAttribute getDataSeries_ValuesUuid();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getTextualStatistics <em>Textual Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textual Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getTextualStatistics()
	 * @see #getDataSeries()
	 * @generated
	 */
	EReference getDataSeries_TextualStatistics();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raw Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getRawMeasurements()
	 * @see #getDataSeries()
	 * @generated
	 */
	EReference getDataSeries_RawMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics <em>Numerical Nominal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Nominal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics
	 * @generated
	 */
	EClass getNumericalNominalStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getNumberMeasurements <em>Number Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getNumberMeasurements()
	 * @see #getNumericalNominalStatistics()
	 * @generated
	 */
	EAttribute getNumericalNominalStatistics_NumberMeasurements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getNumericalMassDistribution <em>Numerical Mass Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Numerical Mass Distribution</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getNumericalMassDistribution()
	 * @see #getNumericalNominalStatistics()
	 * @generated
	 */
	EReference getNumericalNominalStatistics_NumericalMassDistribution();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getDataSeries <em>Data Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Series</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics#getDataSeries()
	 * @see #getNumericalNominalStatistics()
	 * @generated
	 */
	EReference getNumericalNominalStatistics_DataSeries();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution <em>Numerical Mass Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Mass Distribution</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution
	 * @generated
	 */
	EClass getNumericalMassDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getFrequency()
	 * @see #getNumericalMassDistribution()
	 * @generated
	 */
	EAttribute getNumericalMassDistribution_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getValue()
	 * @see #getNumericalMassDistribution()
	 * @generated
	 */
	EAttribute getNumericalMassDistribution_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getNumericalNominalStatistics <em>Numerical Nominal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Numerical Nominal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution#getNumericalNominalStatistics()
	 * @see #getNumericalMassDistribution()
	 * @generated
	 */
	EReference getNumericalMassDistribution_NumericalNominalStatistics();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements <em>Fixed Width Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Width Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements
	 * @generated
	 */
	EClass getFixedWidthAggregatedMeasurements();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intervals</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getIntervals()
	 * @see #getFixedWidthAggregatedMeasurements()
	 * @generated
	 */
	EReference getFixedWidthAggregatedMeasurements_Intervals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getDataSeries <em>Data Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Series</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getDataSeries()
	 * @see #getFixedWidthAggregatedMeasurements()
	 * @generated
	 */
	EReference getFixedWidthAggregatedMeasurements_DataSeries();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals <em>Fixed Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Intervals</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals
	 * @generated
	 */
	EClass getFixedIntervals();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getLowerBound()
	 * @see #getFixedIntervals()
	 * @generated
	 */
	EAttribute getFixedIntervals_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getWidth()
	 * @see #getFixedIntervals()
	 * @generated
	 */
	EAttribute getFixedIntervals_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getNumberOfIntervals <em>Number Of Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Intervals</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getNumberOfIntervals()
	 * @see #getFixedIntervals()
	 * @generated
	 */
	EAttribute getFixedIntervals_NumberOfIntervals();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getAggregatedMeasurements()
	 * @see #getFixedIntervals()
	 * @generated
	 */
	EReference getFixedIntervals_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics <em>Textual Nominal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Nominal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics
	 * @generated
	 */
	EClass getTextualNominalStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getNumberMeasurements <em>Number Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getNumberMeasurements()
	 * @see #getTextualNominalStatistics()
	 * @generated
	 */
	EAttribute getTextualNominalStatistics_NumberMeasurements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getMassDistribution <em>Mass Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mass Distribution</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getMassDistribution()
	 * @see #getTextualNominalStatistics()
	 * @generated
	 */
	EReference getTextualNominalStatistics_MassDistribution();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getDataSeries <em>Data Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Series</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics#getDataSeries()
	 * @see #getTextualNominalStatistics()
	 * @generated
	 */
	EReference getTextualNominalStatistics_DataSeries();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution <em>Textual Mass Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Mass Distribution</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution
	 * @generated
	 */
	EClass getTextualMassDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getFrequency()
	 * @see #getTextualMassDistribution()
	 * @generated
	 */
	EAttribute getTextualMassDistribution_Frequency();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getIdentifier()
	 * @see #getTextualMassDistribution()
	 * @generated
	 */
	EReference getTextualMassDistribution_Identifier();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getTextualNominalStatistics <em>Textual Nominal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Textual Nominal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution#getTextualNominalStatistics()
	 * @see #getTextualMassDistribution()
	 * @generated
	 */
	EReference getTextualMassDistribution_TextualNominalStatistics();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.Measurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Measurements
	 * @generated
	 */
	EClass getMeasurements();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.Measurements#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Measurements#getMeasure()
	 * @see #getMeasurements()
	 * @generated
	 */
	EReference getMeasurements_Measure();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.Measurements#getExperimentRun <em>Experiment Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Run</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Measurements#getExperimentRun()
	 * @see #getMeasurements()
	 * @generated
	 */
	EReference getMeasurements_ExperimentRun();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.Measurements#getMeasurementsRanges <em>Measurements Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements Ranges</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Measurements#getMeasurementsRanges()
	 * @see #getMeasurements()
	 * @generated
	 */
	EReference getMeasurements_MeasurementsRanges();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure <em>Edp2 Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edp2 Measure</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure
	 * @generated
	 */
	EClass getEdp2Measure();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getExperimentGroup <em>Experiment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Group</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getExperimentGroup()
	 * @see #getEdp2Measure()
	 * @generated
	 */
	EReference getEdp2Measure_ExperimentGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getExperimentSettings <em>Experiment Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Experiment Settings</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getExperimentSettings()
	 * @see #getEdp2Measure()
	 * @generated
	 */
	EReference getEdp2Measure_ExperimentSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getMeasuredObject <em>Measured Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Object</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getMeasuredObject()
	 * @see #getEdp2Measure()
	 * @generated
	 */
	EAttribute getEdp2Measure_MeasuredObject();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure#getMetric()
	 * @see #getEdp2Measure()
	 * @generated
	 */
	EReference getEdp2Measure_Metric();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.Propertyable <em>Propertyable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propertyable</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Propertyable
	 * @generated
	 */
	EClass getPropertyable();

	/**
	 * Returns the meta object for the map '{@link org.palladiosimulator.edp2.models.ExperimentData.Propertyable#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Additional Information</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.Propertyable#getAdditionalInformation()
	 * @see #getPropertyable()
	 * @generated
	 */
	EReference getPropertyable_AdditionalInformation();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EStringto EObject Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStringto EObject Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getEStringtoEObjectMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringtoEObjectMapEntry()
	 * @generated
	 */
	EAttribute getEStringtoEObjectMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringtoEObjectMapEntry()
	 * @generated
	 */
	EAttribute getEStringtoEObjectMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements
	 * @generated
	 */
	EClass getRawMeasurements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getDataSeries <em>Data Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Series</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getDataSeries()
	 * @see #getRawMeasurements()
	 * @generated
	 */
	EReference getRawMeasurements_DataSeries();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementsRange <em>Measurements Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurements Range</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementsRange()
	 * @see #getRawMeasurements()
	 * @generated
	 */
	EReference getRawMeasurements_MeasurementsRange();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup <em>Experiment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Group</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup
	 * @generated
	 */
	EClass getExperimentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getExperimentSettings <em>Experiment Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment Settings</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getExperimentSettings()
	 * @see #getExperimentGroup()
	 * @generated
	 */
	EReference getExperimentGroup_ExperimentSettings();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getRepository()
	 * @see #getExperimentGroup()
	 * @generated
	 */
	EReference getExperimentGroup_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getPurpose()
	 * @see #getExperimentGroup()
	 * @generated
	 */
	EAttribute getExperimentGroup_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getMeasure()
	 * @see #getExperimentGroup()
	 * @generated
	 */
	EReference getExperimentGroup_Measure();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting <em>Experiment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Setting</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting
	 * @generated
	 */
	EClass getExperimentSetting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getDescription()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EAttribute getExperimentSetting_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentRuns <em>Experiment Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment Runs</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentRuns()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EReference getExperimentSetting_ExperimentRuns();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measure</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getMeasure()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EReference getExperimentSetting_Measure();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentGroup <em>Experiment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Group</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentGroup()
	 * @see #getExperimentSetting()
	 * @generated
	 */
	EReference getExperimentSetting_ExperimentGroup();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun <em>Experiment Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Run</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun
	 * @generated
	 */
	EClass getExperimentRun();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getMeasurements()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EReference getExperimentRun_Measurements();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getStartTime()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EAttribute getExperimentRun_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getDuration()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EAttribute getExperimentRun_Duration();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getExperimentSetting <em>Experiment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Setting</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getExperimentSetting()
	 * @see #getExperimentRun()
	 * @generated
	 */
	EReference getExperimentRun_ExperimentSetting();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics <em>Aggregation Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics
	 * @generated
	 */
	EClass getAggregationStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getDistinctValuesBeforeAggregation <em>Distinct Values Before Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct Values Before Aggregation</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getDistinctValuesBeforeAggregation()
	 * @see #getAggregationStatistics()
	 * @generated
	 */
	EAttribute getAggregationStatistics_DistinctValuesBeforeAggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getDistinctValuesAfterAggregation <em>Distinct Values After Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct Values After Aggregation</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getDistinctValuesAfterAggregation()
	 * @see #getAggregationStatistics()
	 * @generated
	 */
	EAttribute getAggregationStatistics_DistinctValuesAfterAggregation();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getAggregatedMeasurements <em>Aggregated Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregated Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics#getAggregatedMeasurements()
	 * @see #getAggregationStatistics()
	 * @generated
	 */
	EReference getAggregationStatistics_AggregatedMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements <em>Long Binary Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Binary Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements
	 * @generated
	 */
	EClass getLongBinaryMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements#getStorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Unit</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements#getStorageUnit()
	 * @see #getLongBinaryMeasurements()
	 * @generated
	 */
	EAttribute getLongBinaryMeasurements_StorageUnit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements <em>Double Binary Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Binary Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements
	 * @generated
	 */
	EClass getDoubleBinaryMeasurements();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements#getStorageUnit <em>Storage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Unit</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements#getStorageUnit()
	 * @see #getDoubleBinaryMeasurements()
	 * @generated
	 */
	EAttribute getDoubleBinaryMeasurements_StorageUnit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics <em>Numerical Interval Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Interval Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics
	 * @generated
	 */
	EClass getNumericalIntervalStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getArithmethicMean <em>Arithmethic Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arithmethic Mean</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getArithmethicMean()
	 * @see #getNumericalIntervalStatistics()
	 * @generated
	 */
	EAttribute getNumericalIntervalStatistics_ArithmethicMean();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getVariance()
	 * @see #getNumericalIntervalStatistics()
	 * @generated
	 */
	EAttribute getNumericalIntervalStatistics_Variance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getStandardDeviation()
	 * @see #getNumericalIntervalStatistics()
	 * @generated
	 */
	EAttribute getNumericalIntervalStatistics_StandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics#getSum()
	 * @see #getNumericalIntervalStatistics()
	 * @generated
	 */
	EAttribute getNumericalIntervalStatistics_Sum();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics <em>Numerical Ordinal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Ordinal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics
	 * @generated
	 */
	EClass getNumericalOrdinalStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMinimum()
	 * @see #getNumericalOrdinalStatistics()
	 * @generated
	 */
	EAttribute getNumericalOrdinalStatistics_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMaximum()
	 * @see #getNumericalOrdinalStatistics()
	 * @generated
	 */
	EAttribute getNumericalOrdinalStatistics_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getMedian()
	 * @see #getNumericalOrdinalStatistics()
	 * @generated
	 */
	EAttribute getNumericalOrdinalStatistics_Median();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getPercentiles <em>Percentiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentiles</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics#getPercentiles()
	 * @see #getNumericalOrdinalStatistics()
	 * @generated
	 */
	EReference getNumericalOrdinalStatistics_Percentiles();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile <em>Numerical Percentile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Percentile</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile
	 * @generated
	 */
	EClass getNumericalPercentile();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getPercentile <em>Percentile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentile</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getPercentile()
	 * @see #getNumericalPercentile()
	 * @generated
	 */
	EAttribute getNumericalPercentile_Percentile();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getValue()
	 * @see #getNumericalPercentile()
	 * @generated
	 */
	EAttribute getNumericalPercentile_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getOrdinalStatistics <em>Ordinal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ordinal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile#getOrdinalStatistics()
	 * @see #getNumericalPercentile()
	 * @generated
	 */
	EReference getNumericalPercentile_OrdinalStatistics();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements <em>JS Xml Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JS Xml Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements
	 * @generated
	 */
	EClass getJSXmlMeasurements();

	/**
	 * Returns the meta object for class '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IJS Duration</em>'.
	 * @see javax.measure.quantity.Duration
	 * @model instanceClass="javax.measure.quantity.Duration"
	 * @generated
	 */
	EClass getIJSDuration();

	/**
	 * Returns the meta object for class '{@link java.lang.Comparable <em>EComparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable"
	 * @generated
	 */
	EClass getEComparable();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics <em>Textual Ordinal Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Ordinal Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics
	 * @generated
	 */
	EClass getTextualOrdinalStatistics();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMinimum()
	 * @see #getTextualOrdinalStatistics()
	 * @generated
	 */
	EReference getTextualOrdinalStatistics_Minimum();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMaximum()
	 * @see #getTextualOrdinalStatistics()
	 * @generated
	 */
	EReference getTextualOrdinalStatistics_Maximum();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Median</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics#getMedian()
	 * @see #getTextualOrdinalStatistics()
	 * @generated
	 */
	EReference getTextualOrdinalStatistics_Median();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements <em>Identifier Based Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Based Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements
	 * @generated
	 */
	EClass getIdentifierBasedMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics <em>Numerical Ratio Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Ratio Statistics</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics
	 * @generated
	 */
	EClass getNumericalRatioStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getCoefficientOfVariation <em>Coefficient Of Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient Of Variation</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getCoefficientOfVariation()
	 * @see #getNumericalRatioStatistics()
	 * @generated
	 */
	EAttribute getNumericalRatioStatistics_CoefficientOfVariation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getGeometricMean <em>Geometric Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometric Mean</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getGeometricMean()
	 * @see #getNumericalRatioStatistics()
	 * @generated
	 */
	EAttribute getNumericalRatioStatistics_GeometricMean();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getHarmonicMean <em>Harmonic Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Harmonic Mean</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics#getHarmonicMean()
	 * @see #getNumericalRatioStatistics()
	 * @generated
	 */
	EAttribute getNumericalRatioStatistics_HarmonicMean();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements <em>Sensor Framework V1 Double Binary Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Framework V1 Double Binary Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements
	 * @generated
	 */
	EClass getSensorFrameworkV1DoubleBinaryMeasurements();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements <em>Sensor Framework V1 Identifier Based Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Framework V1 Identifier Based Measurements</em>'.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements
	 * @generated
	 */
	EClass getSensorFrameworkV1IdentifierBasedMeasurements();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measure <em>EJS Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJS Measure</em>'.
	 * @see javax.measure.Measure
	 * @model instanceClass="javax.measure.Measure" typeParameters="V Q" QBounds="org.palladiosimulator.metricspec.IJSQuantity"
	 * @generated
	 */
	EDataType getEJSMeasure();

	/**
	 * Returns the meta object for data type '{@link javax.measure.Measure <em>EJS Duration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJS Duration Measure</em>'.
	 * @see javax.measure.Measure
	 * @model instanceClass="javax.measure.Measure"
	 * @generated
	 */
	EDataType getEJSDurationMeasure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentDataFactory getExperimentDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl <em>Aggregated Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getAggregatedMeasurements()
		 * @generated
		 */
		EClass AGGREGATED_MEASUREMENTS = eINSTANCE.getAggregatedMeasurements();

		/**
		 * The meta object literal for the '<em><b>Measurements Range</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__MEASUREMENTS_RANGE = eINSTANCE.getAggregatedMeasurements_MeasurementsRange();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_MEASUREMENTS__VALID = eINSTANCE.getAggregatedMeasurements_Valid();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__FUNCTION = eINSTANCE.getAggregatedMeasurements_Function();

		/**
		 * The meta object literal for the '<em><b>Aggregation Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS = eINSTANCE.getAggregatedMeasurements_AggregationStatistics();

		/**
		 * The meta object literal for the '<em><b>Aggregation On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__AGGREGATION_ON = eINSTANCE.getAggregatedMeasurements_AggregationOn();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENTS__METRIC = eINSTANCE.getAggregatedMeasurements_Metric();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl <em>Measurements Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getMeasurementsRange()
		 * @generated
		 */
		EClass MEASUREMENTS_RANGE = eINSTANCE.getMeasurementsRange();

		/**
		 * The meta object literal for the '<em><b>Raw Measurements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS_RANGE__RAW_MEASUREMENTS = eINSTANCE.getMeasurementsRange_RawMeasurements();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENTS_RANGE__END_TIME = eINSTANCE.getMeasurementsRange_EndTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENTS_RANGE__START_TIME = eINSTANCE.getMeasurementsRange_StartTime();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS_RANGE__MEASUREMENTS = eINSTANCE.getMeasurementsRange_Measurements();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS = eINSTANCE.getMeasurementsRange_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl <em>Data Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getDataSeries()
		 * @generated
		 */
		EClass DATA_SERIES = eINSTANCE.getDataSeries();

		/**
		 * The meta object literal for the '<em><b>Numerical Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERIES__NUMERICAL_STATISTICS = eINSTANCE.getDataSeries_NumericalStatistics();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERIES__AGGREGATED_MEASUREMENTS = eINSTANCE.getDataSeries_AggregatedMeasurements();

		/**
		 * The meta object literal for the '<em><b>Values Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERIES__VALUES_UUID = eINSTANCE.getDataSeries_ValuesUuid();

		/**
		 * The meta object literal for the '<em><b>Textual Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERIES__TEXTUAL_STATISTICS = eINSTANCE.getDataSeries_TextualStatistics();

		/**
		 * The meta object literal for the '<em><b>Raw Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERIES__RAW_MEASUREMENTS = eINSTANCE.getDataSeries_RawMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl <em>Numerical Nominal Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalNominalStatistics()
		 * @generated
		 */
		EClass NUMERICAL_NOMINAL_STATISTICS = eINSTANCE.getNumericalNominalStatistics();

		/**
		 * The meta object literal for the '<em><b>Number Measurements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS = eINSTANCE.getNumericalNominalStatistics_NumberMeasurements();

		/**
		 * The meta object literal for the '<em><b>Numerical Mass Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION = eINSTANCE.getNumericalNominalStatistics_NumericalMassDistribution();

		/**
		 * The meta object literal for the '<em><b>Data Series</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES = eINSTANCE.getNumericalNominalStatistics_DataSeries();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl <em>Numerical Mass Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalMassDistribution()
		 * @generated
		 */
		EClass NUMERICAL_MASS_DISTRIBUTION = eINSTANCE.getNumericalMassDistribution();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_MASS_DISTRIBUTION__FREQUENCY = eINSTANCE.getNumericalMassDistribution_Frequency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_MASS_DISTRIBUTION__VALUE = eINSTANCE.getNumericalMassDistribution_Value();

		/**
		 * The meta object literal for the '<em><b>Numerical Nominal Statistics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS = eINSTANCE.getNumericalMassDistribution_NumericalNominalStatistics();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl <em>Fixed Width Aggregated Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getFixedWidthAggregatedMeasurements()
		 * @generated
		 */
		EClass FIXED_WIDTH_AGGREGATED_MEASUREMENTS = eINSTANCE.getFixedWidthAggregatedMeasurements();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS = eINSTANCE.getFixedWidthAggregatedMeasurements_Intervals();

		/**
		 * The meta object literal for the '<em><b>Data Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES = eINSTANCE.getFixedWidthAggregatedMeasurements_DataSeries();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl <em>Fixed Intervals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getFixedIntervals()
		 * @generated
		 */
		EClass FIXED_INTERVALS = eINSTANCE.getFixedIntervals();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_INTERVALS__LOWER_BOUND = eINSTANCE.getFixedIntervals_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_INTERVALS__WIDTH = eINSTANCE.getFixedIntervals_Width();

		/**
		 * The meta object literal for the '<em><b>Number Of Intervals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_INTERVALS__NUMBER_OF_INTERVALS = eINSTANCE.getFixedIntervals_NumberOfIntervals();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_INTERVALS__AGGREGATED_MEASUREMENTS = eINSTANCE.getFixedIntervals_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl <em>Textual Nominal Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualNominalStatistics()
		 * @generated
		 */
		EClass TEXTUAL_NOMINAL_STATISTICS = eINSTANCE.getTextualNominalStatistics();

		/**
		 * The meta object literal for the '<em><b>Number Measurements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS = eINSTANCE.getTextualNominalStatistics_NumberMeasurements();

		/**
		 * The meta object literal for the '<em><b>Mass Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION = eINSTANCE.getTextualNominalStatistics_MassDistribution();

		/**
		 * The meta object literal for the '<em><b>Data Series</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES = eINSTANCE.getTextualNominalStatistics_DataSeries();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl <em>Textual Mass Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualMassDistribution()
		 * @generated
		 */
		EClass TEXTUAL_MASS_DISTRIBUTION = eINSTANCE.getTextualMassDistribution();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_MASS_DISTRIBUTION__FREQUENCY = eINSTANCE.getTextualMassDistribution_Frequency();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER = eINSTANCE.getTextualMassDistribution_Identifier();

		/**
		 * The meta object literal for the '<em><b>Textual Nominal Statistics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS = eINSTANCE.getTextualMassDistribution_TextualNominalStatistics();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl <em>Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getMeasurements()
		 * @generated
		 */
		EClass MEASUREMENTS = eINSTANCE.getMeasurements();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS__MEASURE = eINSTANCE.getMeasurements_Measure();

		/**
		 * The meta object literal for the '<em><b>Experiment Run</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS__EXPERIMENT_RUN = eINSTANCE.getMeasurements_ExperimentRun();

		/**
		 * The meta object literal for the '<em><b>Measurements Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS__MEASUREMENTS_RANGES = eINSTANCE.getMeasurements_MeasurementsRanges();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.Edp2MeasureImpl <em>Edp2 Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.Edp2MeasureImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEdp2Measure()
		 * @generated
		 */
		EClass EDP2_MEASURE = eINSTANCE.getEdp2Measure();

		/**
		 * The meta object literal for the '<em><b>Experiment Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDP2_MEASURE__EXPERIMENT_GROUP = eINSTANCE.getEdp2Measure_ExperimentGroup();

		/**
		 * The meta object literal for the '<em><b>Experiment Settings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDP2_MEASURE__EXPERIMENT_SETTINGS = eINSTANCE.getEdp2Measure_ExperimentSettings();

		/**
		 * The meta object literal for the '<em><b>Measured Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDP2_MEASURE__MEASURED_OBJECT = eINSTANCE.getEdp2Measure_MeasuredObject();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDP2_MEASURE__METRIC = eINSTANCE.getEdp2Measure_Metric();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.PropertyableImpl <em>Propertyable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.PropertyableImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getPropertyable()
		 * @generated
		 */
		EClass PROPERTYABLE = eINSTANCE.getPropertyable();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTYABLE__ADDITIONAL_INFORMATION = eINSTANCE.getPropertyable_AdditionalInformation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl <em>EStringto EObject Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEStringtoEObjectMapEntry()
		 * @generated
		 */
		EClass ESTRINGTO_EOBJECT_MAP_ENTRY = eINSTANCE.getEStringtoEObjectMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRINGTO_EOBJECT_MAP_ENTRY__KEY = eINSTANCE.getEStringtoEObjectMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE = eINSTANCE.getEStringtoEObjectMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl <em>Raw Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getRawMeasurements()
		 * @generated
		 */
		EClass RAW_MEASUREMENTS = eINSTANCE.getRawMeasurements();

		/**
		 * The meta object literal for the '<em><b>Data Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_MEASUREMENTS__DATA_SERIES = eINSTANCE.getRawMeasurements_DataSeries();

		/**
		 * The meta object literal for the '<em><b>Measurements Range</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_MEASUREMENTS__MEASUREMENTS_RANGE = eINSTANCE.getRawMeasurements_MeasurementsRange();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl <em>Experiment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentGroup()
		 * @generated
		 */
		EClass EXPERIMENT_GROUP = eINSTANCE.getExperimentGroup();

		/**
		 * The meta object literal for the '<em><b>Experiment Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_GROUP__EXPERIMENT_SETTINGS = eINSTANCE.getExperimentGroup_ExperimentSettings();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_GROUP__REPOSITORY = eINSTANCE.getExperimentGroup_Repository();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_GROUP__PURPOSE = eINSTANCE.getExperimentGroup_Purpose();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_GROUP__MEASURE = eINSTANCE.getExperimentGroup_Measure();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl <em>Experiment Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentSetting()
		 * @generated
		 */
		EClass EXPERIMENT_SETTING = eINSTANCE.getExperimentSetting();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_SETTING__DESCRIPTION = eINSTANCE.getExperimentSetting_Description();

		/**
		 * The meta object literal for the '<em><b>Experiment Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SETTING__EXPERIMENT_RUNS = eINSTANCE.getExperimentSetting_ExperimentRuns();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SETTING__MEASURE = eINSTANCE.getExperimentSetting_Measure();

		/**
		 * The meta object literal for the '<em><b>Experiment Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SETTING__EXPERIMENT_GROUP = eINSTANCE.getExperimentSetting_ExperimentGroup();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl <em>Experiment Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getExperimentRun()
		 * @generated
		 */
		EClass EXPERIMENT_RUN = eINSTANCE.getExperimentRun();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RUN__MEASUREMENTS = eINSTANCE.getExperimentRun_Measurements();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RUN__START_TIME = eINSTANCE.getExperimentRun_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RUN__DURATION = eINSTANCE.getExperimentRun_Duration();

		/**
		 * The meta object literal for the '<em><b>Experiment Setting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RUN__EXPERIMENT_SETTING = eINSTANCE.getExperimentRun_ExperimentSetting();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl <em>Aggregation Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getAggregationStatistics()
		 * @generated
		 */
		EClass AGGREGATION_STATISTICS = eINSTANCE.getAggregationStatistics();

		/**
		 * The meta object literal for the '<em><b>Distinct Values Before Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION = eINSTANCE.getAggregationStatistics_DistinctValuesBeforeAggregation();

		/**
		 * The meta object literal for the '<em><b>Distinct Values After Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION = eINSTANCE.getAggregationStatistics_DistinctValuesAfterAggregation();

		/**
		 * The meta object literal for the '<em><b>Aggregated Measurements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS = eINSTANCE.getAggregationStatistics_AggregatedMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.LongBinaryMeasurementsImpl <em>Long Binary Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.LongBinaryMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getLongBinaryMeasurements()
		 * @generated
		 */
		EClass LONG_BINARY_MEASUREMENTS = eINSTANCE.getLongBinaryMeasurements();

		/**
		 * The meta object literal for the '<em><b>Storage Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_BINARY_MEASUREMENTS__STORAGE_UNIT = eINSTANCE.getLongBinaryMeasurements_StorageUnit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.DoubleBinaryMeasurementsImpl <em>Double Binary Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.DoubleBinaryMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getDoubleBinaryMeasurements()
		 * @generated
		 */
		EClass DOUBLE_BINARY_MEASUREMENTS = eINSTANCE.getDoubleBinaryMeasurements();

		/**
		 * The meta object literal for the '<em><b>Storage Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT = eINSTANCE.getDoubleBinaryMeasurements_StorageUnit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl <em>Numerical Interval Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalIntervalStatistics()
		 * @generated
		 */
		EClass NUMERICAL_INTERVAL_STATISTICS = eINSTANCE.getNumericalIntervalStatistics();

		/**
		 * The meta object literal for the '<em><b>Arithmethic Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN = eINSTANCE.getNumericalIntervalStatistics_ArithmethicMean();

		/**
		 * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_INTERVAL_STATISTICS__VARIANCE = eINSTANCE.getNumericalIntervalStatistics_Variance();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION = eINSTANCE.getNumericalIntervalStatistics_StandardDeviation();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_INTERVAL_STATISTICS__SUM = eINSTANCE.getNumericalIntervalStatistics_Sum();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl <em>Numerical Ordinal Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalOrdinalStatistics()
		 * @generated
		 */
		EClass NUMERICAL_ORDINAL_STATISTICS = eINSTANCE.getNumericalOrdinalStatistics();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ORDINAL_STATISTICS__MINIMUM = eINSTANCE.getNumericalOrdinalStatistics_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ORDINAL_STATISTICS__MAXIMUM = eINSTANCE.getNumericalOrdinalStatistics_Maximum();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ORDINAL_STATISTICS__MEDIAN = eINSTANCE.getNumericalOrdinalStatistics_Median();

		/**
		 * The meta object literal for the '<em><b>Percentiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_ORDINAL_STATISTICS__PERCENTILES = eINSTANCE.getNumericalOrdinalStatistics_Percentiles();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl <em>Numerical Percentile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalPercentile()
		 * @generated
		 */
		EClass NUMERICAL_PERCENTILE = eINSTANCE.getNumericalPercentile();

		/**
		 * The meta object literal for the '<em><b>Percentile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PERCENTILE__PERCENTILE = eINSTANCE.getNumericalPercentile_Percentile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PERCENTILE__VALUE = eINSTANCE.getNumericalPercentile_Value();

		/**
		 * The meta object literal for the '<em><b>Ordinal Statistics</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_PERCENTILE__ORDINAL_STATISTICS = eINSTANCE.getNumericalPercentile_OrdinalStatistics();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.JSXmlMeasurementsImpl <em>JS Xml Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.JSXmlMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getJSXmlMeasurements()
		 * @generated
		 */
		EClass JS_XML_MEASUREMENTS = eINSTANCE.getJSXmlMeasurements();

		/**
		 * The meta object literal for the '{@link javax.measure.quantity.Duration <em>IJS Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Duration
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getIJSDuration()
		 * @generated
		 */
		EClass IJS_DURATION = eINSTANCE.getIJSDuration();

		/**
		 * The meta object literal for the '{@link java.lang.Comparable <em>EComparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEComparable()
		 * @generated
		 */
		EClass ECOMPARABLE = eINSTANCE.getEComparable();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl <em>Textual Ordinal Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getTextualOrdinalStatistics()
		 * @generated
		 */
		EClass TEXTUAL_ORDINAL_STATISTICS = eINSTANCE.getTextualOrdinalStatistics();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_ORDINAL_STATISTICS__MINIMUM = eINSTANCE.getTextualOrdinalStatistics_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_ORDINAL_STATISTICS__MAXIMUM = eINSTANCE.getTextualOrdinalStatistics_Maximum();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_ORDINAL_STATISTICS__MEDIAN = eINSTANCE.getTextualOrdinalStatistics_Median();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.IdentifierBasedMeasurementsImpl <em>Identifier Based Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.IdentifierBasedMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getIdentifierBasedMeasurements()
		 * @generated
		 */
		EClass IDENTIFIER_BASED_MEASUREMENTS = eINSTANCE.getIdentifierBasedMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl <em>Numerical Ratio Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getNumericalRatioStatistics()
		 * @generated
		 */
		EClass NUMERICAL_RATIO_STATISTICS = eINSTANCE.getNumericalRatioStatistics();

		/**
		 * The meta object literal for the '<em><b>Coefficient Of Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION = eINSTANCE.getNumericalRatioStatistics_CoefficientOfVariation();

		/**
		 * The meta object literal for the '<em><b>Geometric Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN = eINSTANCE.getNumericalRatioStatistics_GeometricMean();

		/**
		 * The meta object literal for the '<em><b>Harmonic Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN = eINSTANCE.getNumericalRatioStatistics_HarmonicMean();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1DoubleBinaryMeasurementsImpl <em>Sensor Framework V1 Double Binary Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1DoubleBinaryMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getSensorFrameworkV1DoubleBinaryMeasurements()
		 * @generated
		 */
		EClass SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS = eINSTANCE.getSensorFrameworkV1DoubleBinaryMeasurements();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1IdentifierBasedMeasurementsImpl <em>Sensor Framework V1 Identifier Based Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.SensorFrameworkV1IdentifierBasedMeasurementsImpl
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getSensorFrameworkV1IdentifierBasedMeasurements()
		 * @generated
		 */
		EClass SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS = eINSTANCE.getSensorFrameworkV1IdentifierBasedMeasurements();

		/**
		 * The meta object literal for the '<em>EJS Measure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measure
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEJSMeasure()
		 * @generated
		 */
		EDataType EJS_MEASURE = eINSTANCE.getEJSMeasure();

		/**
		 * The meta object literal for the '<em>EJS Duration Measure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.Measure
		 * @see org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl#getEJSDurationMeasure()
		 * @generated
		 */
		EDataType EJS_DURATION_MEASURE = eINSTANCE.getEJSDurationMeasure();

	}

} //EmfmodelPackage
