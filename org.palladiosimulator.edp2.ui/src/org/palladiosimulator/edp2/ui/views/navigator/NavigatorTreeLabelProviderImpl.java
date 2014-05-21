package org.palladiosimulator.edp2.ui.views.navigator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.palladiosimulator.edp2.impl.MeasuringPointUtility;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.Repository.util.RepositorySwitch;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

public class NavigatorTreeLabelProviderImpl extends StyledCellLabelProvider {
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    private final IMapChangeListener mapChangeListener = new IMapChangeListener() {
        @Override
        public void handleMapChange(final MapChangeEvent event) {
            final Set<?> affectedElements = event.diff.getChangedKeys();
            if (!affectedElements.isEmpty()) {
                final LabelProviderChangedEvent newEvent = new LabelProviderChangedEvent(
                        NavigatorTreeLabelProviderImpl.this, affectedElements.toArray());
                fireLabelProviderChanged(newEvent);
            }
        }
    };

    public NavigatorTreeLabelProviderImpl(final IObservableMap[] attributeMaps) {
        for (int i = 0; i < attributeMaps.length; i++) {
            attributeMaps[i].addMapChangeListener(mapChangeListener);
        }
    }

    @Override
    public String getToolTipText(final Object element) {
        return "#dummy#";
    }

    @Override
    public void update(final ViewerCell cell) {
        if (cell.getElement() instanceof EObject) {
            final EObject eObject = (EObject) cell.getElement();
            StyledString styledString = null;
            styledString = new ExperimentDataSwitch<StyledString>() {
                @Override
                public StyledString caseExperimentGroup(final ExperimentGroup object) {
                    final StyledString styledString = new StyledString("Experiment Group");
                    final String decoration = " " + object.getPurpose() + " (" +object.getId() + ")";
                    styledString.append(decoration, StyledString.COUNTER_STYLER);
                    return styledString;
                };
                @Override
                public StyledString caseExperimentSetting(final ExperimentSetting object) {
                    final StyledString styledString = new StyledString(object.getDescription() == null ? "" : object.getDescription());
                    return styledString;
                };
                @Override
                public StyledString caseExperimentRun(final ExperimentRun object) {
                    final StyledString styledString = new StyledString("Experiment Run " + dateFormat.format(object.getStartTime()));
                    final String decoration = " (" + object.getId() + ")";
                    styledString.append(decoration, StyledString.COUNTER_STYLER);
                    return styledString;
                };
                @Override
                public StyledString caseMeasurementsRange(final MeasurementsRange object) {
                    final StyledString styledString = new StyledString("Range");
                    if (object.getStartTime() != null && object.getEndTime() != null) {
                        final String decoration = " (" + object.getStartTime() + "-" + object.getEndTime() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                    }
                    return styledString;
                };
                @Override
                public StyledString caseRawMeasurements(final RawMeasurements object) {
                    final StyledString styledString = new StyledString("Raw");
                    final String decoration = " (" + object.getDataSeries().size() + ")";
                    styledString.append(decoration, StyledString.COUNTER_STYLER);
                    return styledString;
                };
                @Override
                public StyledString caseAggregatedMeasurements(final AggregatedMeasurements object) {
                    final StyledString styledString = new StyledString("Aggregated");
                    return styledString;
                };
                @Override
                public StyledString caseMeasure(final org.palladiosimulator.edp2.models.ExperimentData.Measure object) {
                    MeasuringPoint measuringPoint = object.getMeasuringPoint();
                             
                    final StyledString styledString = new StyledString(MeasuringPointUtility.measuringPointToString(measuringPoint));
                    
                    final String decoration = " (" + object.getMetric().getName() + ")";
                    styledString.append(decoration, StyledString.COUNTER_STYLER);
                    return styledString;
                }
                @Override
                public StyledString caseMeasurements(final Measurements object) {
                    final StyledString styledString = new StyledString("AbstractMeasureProvider");
                    return styledString;
                };
            }.doSwitch(eObject);
            if (styledString == null) {
                styledString = new MetricSpecSwitch<StyledString>() {
                    @Override
                    public final StyledString caseBaseMetricDescription(final BaseMetricDescription object) {
                        final StyledString styledString = new StyledString(object.getName()==null? "Base Metric" : object.getName());
                        final String decoration = " (" + object.getScale() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                    @Override
                    public final StyledString caseNumericalBaseMetricDescription(final NumericalBaseMetricDescription object) {
                        final StyledString styledString = new StyledString(object.getName()==null? "Base Metric" : object.getName());
                        final String decoration = " (" + object.getScale() + ", " + object.getDefaultUnit() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                    @Override
                    public final StyledString caseMetricDescription(final MetricDescription object) {
                        final StyledString styledString = new StyledString(object.getName()==null ? "Metric Set" : object.getName());
                        return styledString;
                    };
                }.doSwitch(eObject);
            }
            if (styledString == null) {
                styledString = new RepositorySwitch<StyledString>() {
                    @Override
                    public StyledString caseLocalDirectoryRepository(final org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository object) {
                        final StyledString styledString = new StyledString("Local File");
                        final String decoration = " (" + object.getUri() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                    @Override
                    public StyledString caseLocalMemoryRepository(final org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository object) {
                        final StyledString styledString = new StyledString("Local Memory");
                        final String decoration = " (" + object.getDomain() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                    @Override
                    public StyledString caseRemoteCdoRepository(final org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository object) {
                        final StyledString styledString = new StyledString("Remote");
                        final String decoration = " (" + object.getUrl() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                    @Override
                    public StyledString caseLocalSensorFrameworkRepository(final org.palladiosimulator.edp2.models.Repository.LocalSensorFrameworkRepository object) {
                        final StyledString styledString = new StyledString("Local Sensor Framework V1");
                        final String decoration = " (" + object.getUri() + ")";
                        styledString.append(decoration, StyledString.COUNTER_STYLER);
                        return styledString;
                    };
                }.doSwitch(eObject);
            }
            if (styledString == null) {
                Logger.getLogger(NavigatorTreeLabelProviderImpl.class.getCanonicalName()).log(Level.SEVERE, "Could not create label for " + eObject);
            } else {
                cell.setText(styledString.getString());
                //cell.setImage();
                cell.setStyleRanges(styledString.getStyleRanges());
            }
        }
    }
}
