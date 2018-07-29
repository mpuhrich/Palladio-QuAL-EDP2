package org.palladiosimulator.edp2.visualization.jfreechart.editor;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.PlatformUI;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class CustomJFreeChartComposite extends ChartComposite {

    private File selectFileDialog(final String filter) {
        final FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
        dialog.setFilterExtensions(new String[] { filter });
        dialog.setText("Enter the file name");
        final String result = dialog.open();
        if (result != null) {
            final String filename = dialog.getFilterPath() + File.separator + dialog.getFileName();
            return new File(filename);
        } else {
            return null;
        }
    }

    private class SaveImageAsAction extends Action {

        public SaveImageAsAction() {
            super();
            setText("Save Chart as PNG...");
        }

        @Override
        public void run() {
            final File f = selectFileDialog("*.png");
            if (f != null) {
                try {
                    ChartUtilities.saveChartAsPNG(f, getChart(), getBounds().width, getBounds().height);
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private class SaveSVGAsAction extends Action {

        public SaveSVGAsAction() {
            super();
            setText("Save Chart as SVG...");
        }

        @Override
        public void run() {
            final File f = selectFileDialog("*.svg");
            if (f != null) {
                try {
                    final JFreeChart chart = getChart();
                    final DOMImplementation domI = new GenericDOMImplementation();
                    final Document doc = domI.createDocument(null, "svg", null);
                    final SVGGraphics2D svgRenderer = new SVGGraphics2D(doc);
                    final Paint p = chart.getBackgroundPaint();
                    chart.setBackgroundPaint(new Color(0, 0, 0, 0));
                    chart.draw(svgRenderer, new Rectangle(0, 0, 640, 480));
                    chart.setBackgroundPaint(p);
                    final Writer out = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
                    svgRenderer.stream(out, true);
                    out.close();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private class ExportCsvAsAction extends Action {

        private static final String ONE_LINE_FORMAT = "%s,%s";

        public ExportCsvAsAction() {
            super();
            setText("Export Data as CSV...");
        }

        @Override
        public void run() {
            final File f = selectFileDialog("*.csv");
            if (f != null) {
                final XYPlot plot = getChart().getXYPlot();
                final XYDataset dataset = plot.getDataset();
                final StringBuilder content = new StringBuilder(String.format(ONE_LINE_FORMAT, plot.getDomainAxis().getLabel(), plot.getRangeAxis()
                        .getLabel()));
                // assume that we export the last (and only) data series
                final int seriesNumber = dataset.getSeriesCount() - 1;
                for (int i = 0; i < dataset.getItemCount(seriesNumber); ++i) {
                    content.append(System.lineSeparator());
                    final double x = dataset.getXValue(seriesNumber, i);
                    final double y = dataset.getYValue(seriesNumber, i);
                    content.append(String.format(ONE_LINE_FORMAT, x, y));
                }
                try {
                    Files.write(Paths.get(f.getPath()), content.toString().getBytes());
                } catch (final IOException e) {
                    final StringBuilder errorMessage = new StringBuilder("An error occurred during CSV export: "+ System.lineSeparator());
                    errorMessage.append(e.getMessage());
                    MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", errorMessage.toString());
                }
            }
        }
    }

    /*
     * The patching done in forceOverwriteDeclaredPrivateField and the constructor enables buffering which leads
     * to a much faster rendering if multiple data rows are drawn simultaneously.
     * 
     * We overwrite the minimum/maximum draw widths/heights, because otherwise the image is weirdly scaled
     * when using buffering. Currently, this is done via reflection which is not the most elegant solution
     * but does not require us to additionally build and deploy JFreeChart/JFreeChart-SWT ourselves. 
     */
    private static final boolean USE_BUFFERS = true;
	private static void forceOverwriteDeclaredPrivateField(String fieldName, Object object, int newValue) {
		try {
			final Field declaredField = ChartComposite.class.getDeclaredField(fieldName);
			declaredField.setAccessible(true);
			declaredField.setInt(object, newValue);
			declaredField.setAccessible(false);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO: move to logging
			System.err.println("Could not force overwrite " + fieldName + " on " + object + " with " + newValue + ". "
					+ "This is possibly due to a change in the version JFreeChart. If charts are not displayed correctly, "
					+ "try to disable buffering via " + CustomJFreeChartComposite.class.getName() + ".USE_BUFFERS.");
			e.printStackTrace();
		}
	}

	public CustomJFreeChartComposite(final Composite parent, final int style) {
		super(parent, style, null, USE_BUFFERS);
		if (USE_BUFFERS) {
			forceOverwriteDeclaredPrivateField("minimumDrawWidth", this, 0);
			forceOverwriteDeclaredPrivateField("maximumDrawWidth", this, Integer.MAX_VALUE);
			forceOverwriteDeclaredPrivateField("minimumDrawHeight", this, 0);
			forceOverwriteDeclaredPrivateField("maximumDrawHeight", this, Integer.MAX_VALUE);
		}
	}

    @Override
    protected Menu createPopupMenu(final boolean arg0, final boolean arg1, final boolean arg2, final boolean arg3) {
        final Menu parentMenu = super.createPopupMenu(arg0, arg1, arg2, arg3);
        final MenuManager menu_manager = new MenuManager("Additional Functions");
        initializeContextMenu(menu_manager);
        menu_manager.fill(parentMenu, SWT.NONE);
        return parentMenu;
    }

    protected void initializeContextMenu(final MenuManager menu_manager) {
        menu_manager.add(new SaveImageAsAction());
        menu_manager.add(new SaveSVGAsAction());
        menu_manager.add(new ExportCsvAsAction());
    }
}
