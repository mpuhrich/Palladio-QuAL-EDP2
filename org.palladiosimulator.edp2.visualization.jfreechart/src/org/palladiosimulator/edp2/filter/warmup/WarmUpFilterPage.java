package org.palladiosimulator.edp2.filter.warmup;



import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WarmUpFilterPage extends WizardPage {

	private Text time;
	private Composite container;

	
	protected WarmUpFilterPage(String pageName) {
		super(pageName);

	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Put a value here.");

	    time = new Text(container, SWT.BORDER | SWT.SINGLE);
	    time.setText("0.0");
	    
	    time.addVerifyListener(new VerifyListener() {
	        public void verifyText(VerifyEvent e) {
	          if (!Character.isDigit(e.character) && !Character.isISOControl(e.character)) {
	            e.doit = false;
	          }
	        }
	      });
	    
	    time.addKeyListener(new KeyListener() {

	      @Override
	      public void keyPressed(KeyEvent e) {
	      }

	      @Override
	      public void keyReleased(KeyEvent e) {
	        if (!time.getText().isEmpty()) {
	        	
	        	//TODO Check for float
	        	
	          setPageComplete(true);

	        }
	      }

	    });
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    time.setLayoutData(gd);
	    // required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);


	}
	
	public String getTime() {
	    return time.getText();
	  }


}
