package com.myplugin.rmp;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class ResourceManagerViewActionDelegate implements IViewActionDelegate {
    private IViewPart view;

    public void init(IViewPart view) {
             this.view = view;
    }

    public void run(IAction action) {
             MessageBox box = new MessageBox(view.getSite().getShell(),SWT.ICON_INFORMATION);
             box.setMessage("Hello! You clicked view action!");
             box.open();
    }
    public void selectionChanged(IAction action, ISelection selection) {}
}
