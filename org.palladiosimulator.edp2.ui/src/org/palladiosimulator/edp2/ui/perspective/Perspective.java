package org.palladiosimulator.edp2.ui.perspective;

import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * The EDP2 perspective.
 * 
 * @author Sebastian Lehrig
 */
public class Perspective implements IPerspectiveFactory {

    private final String NAVIGATOR_ID = "org.palladiosimulator.edp2.ui.views.navigator";

    private final float GOLDEN_RATIO = 0.618f;

    @Override
    public void createInitialLayout(IPageLayout layout) {
        // basic layout settings
        final String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(true);
        layout.setFixed(false);
        final IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 1.0f - GOLDEN_RATIO, editorArea);
        final IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, GOLDEN_RATIO, editorArea);

        // EDP2 (tree) navigator view
        topLeft.addView(NAVIGATOR_ID);
        layout.getViewLayout(NAVIGATOR_ID).setCloseable(false);

        // properties view
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setCloseable(false);

        // problems view
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);

        // enable debug/launch buttons in tool bar
        layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
    }

}
