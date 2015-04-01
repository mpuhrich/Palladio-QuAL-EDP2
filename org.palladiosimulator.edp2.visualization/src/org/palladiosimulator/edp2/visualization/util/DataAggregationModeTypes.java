package org.palladiosimulator.edp2.visualization.util;

/**
 * Enum specifying all available types of data aggregation. If new types are
 * added, the accompanying implementation has to be added to
 * {@link SLODataAggregationModes}.
 * 
 * @author Andreas Flohre
 *
 */
public enum DataAggregationModeTypes {
	MEAN, MEDIAN, MAX, MIN;
}
