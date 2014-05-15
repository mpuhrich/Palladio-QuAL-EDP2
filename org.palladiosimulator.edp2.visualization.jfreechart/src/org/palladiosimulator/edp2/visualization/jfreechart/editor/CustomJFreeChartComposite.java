package org.palladiosimulator.edp2.visualization.jfreechart.editor;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.PlatformUI;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class CustomJFreeChartComposite extends ChartComposite {

    private File selectFileDialog(final String filter) {
        final FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
        dialog.setFilterExtensions(new String[] { filter });
        dialog.setText("Enter the image file name");
        final String result = dialog.open();
        if (result != null) {
            final String filename = dialog.getFilterPath() + File.separator + dialog.getFileName();
            return new File(filename);
        } else {
            return null;
        }
    }

    class SaveImageAsAction extends Action {

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

    class SaveSVGAsAction extends Action {

        public SaveSVGAsAction() {
            super();
            setText("Save Chart as SVG...");
        }

        @Override
        public void run() {
            final File f = selectFileDialog("*.png");
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

    public CustomJFreeChartComposite(final Composite parent, final int style) {
        super(parent, style);
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
    }
}
