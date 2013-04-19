package com.quality.swtplugin.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class Sample_SWT implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	private Shell shell;
	/**
	 * The constructor.
	 */
	public Sample_SWT() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(final IAction action) {
		/*shell = new Shell();
		shell.setBackgroundImage(new Image(null, "C:\\Users\\mdw\\Desktop\\workspace\\com.quality.SWT-plugin\\icons\\img4.jpg"));
		Button button = new Button(shell, SWT.PUSH);
		button.setBounds(50, 50, 50, 50);
		button.setText("Yep");
		button.addSelectionListener(new SelectionAdapter(){ 
	
		
		});
		shell.setVisible(true);*/
		
		WizardDialog dial = new WizardDialog(window.getShell(), new ac.soton.fmusim.components.ui.wizardmenu.WizardStart());
		dial.open();
		
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}