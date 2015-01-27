package com.myplugin.rmp.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

import com.myplugin.rmp.wizards.CaptureEmployeeInfomrationWizard;

public class OpenResourceManagerViewActionDelegate implements IWorkbenchWindowActionDelegate {

    private IWorkbenchWindow window;
    public static final String ID = "com.myplugin.rmp.views.ResourceManagerView";


    public void init(IWorkbenchWindow window) {
       this.window = window; // cache the window object in which action delegate is operating
    }
    public void dispose() {}

    public void run(IAction action) {
        CaptureEmployeeInfomrationWizard wizard = new CaptureEmployeeInfomrationWizard();
        WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
        dialog.create();
        dialog.open();
    }
    public void selectionChanged(IAction action, ISelection selection) {}
}
