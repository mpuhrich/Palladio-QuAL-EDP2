package org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.configurable.reflective.ConfigurationProperty;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationConfiguration;

public class SLOQuantitativePlotInputConfiguration extends
		JFreeChartVisualizationConfiguration {
	public static final String DOMAIN_AXIS_LABEL_KEY = "domainAxisLabel";
	public static final String RANGE_AXIS_LABEL_KEY = "rangeAxisLabel";
	public static final String SHOW_RANGE_AXIS_LABEL_KEY = "showRangeAxisLabel";
	public static final String SHOW_DOMAIN_AXIS_LABEL_KEY = "showDomainAxisLabel";
	public static final String SHOW_SERIES_LINE_LABEL_KEY = "showSeriesLine";
	public static final String SHOW_SERIES_SHAPES_LABEL_KEY = "showSeriesShapes";

	/**
	 * Label for the number axis (= horizontal axis)
	 */
	@ConfigurationProperty(description = "Domain Axis Label")
	private String domainAxisLabel;

	/**
	 * Label for the range axis (= vertical axis)
	 */
	@ConfigurationProperty(description = "Range Axis Label")
	private String rangeAxisLabel;

	/**
	 * Show different labels?
	 */
	@ConfigurationProperty(description = "Show Range Axis Label")
	private boolean showRangeAxisLabel;

	@ConfigurationProperty(description = "Show Domain Axis Label")
	private boolean showDomainAxisLabel;

	@ConfigurationProperty(description = "Show a line that connects all data points (series shapes).")
	private boolean showSeriesLine;

	@ConfigurationProperty(description = "Show all the data points (series shapes).")
	private boolean showSeriesShapes;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.palladiosimulator.edp2.visualization.editors.
	 * JFreeChartVisualisationConfiguration# getDefaultConfiguration()
	 */
	@Override
	public Map<String, Object> getDefaultConfiguration() {
		final Map<String, Object> result = new HashMap<String, Object>(
				super.getDefaultConfiguration());
		result.put(SHOW_DOMAIN_AXIS_LABEL_KEY, true);
		result.put(SHOW_RANGE_AXIS_LABEL_KEY, true);
		result.put(RANGE_AXIS_LABEL_KEY, "Y");
		result.put(DOMAIN_AXIS_LABEL_KEY, "X");
		result.put(SHOW_SERIES_LINE_LABEL_KEY, false);
		result.put(SHOW_SERIES_SHAPES_LABEL_KEY, true);
		return result;
	}

	public String getDomainAxisLabel() {
		return domainAxisLabel;
	}

	public String getRangeAxisLabel() {
		return rangeAxisLabel;
	}

	public boolean isShowRangeAxisLabel() {
		return showRangeAxisLabel;
	}

	public boolean isShowDomainAxisLabel() {
		return showDomainAxisLabel;
	}

	public boolean isShowSeriesLine() {
		return this.showSeriesLine;
	}

	public boolean isShowSeriesShapes() {
		return this.showSeriesShapes;
	}
}
