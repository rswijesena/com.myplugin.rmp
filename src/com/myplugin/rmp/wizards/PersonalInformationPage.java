package com.myplugin.rmp.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PersonalInformationPage extends WizardPage {

	Text firstNameText;
    Text secondNameText;
    protected PersonalInformationPage(String pageName) {
             super(pageName);
             setTitle("Personal Information");
             setDescription("Please enter your personal information");
    }
    public void createControl(Composite parent) {
             Composite composite = new Composite(parent, SWT.NONE);
             GridLayout layout = new GridLayout();
              layout.numColumns = 2;
              composite.setLayout(layout);
              setControl(composite);
              new Label(composite,SWT.NONE).setText("First Name");
              firstNameText = new Text(composite,SWT.NONE);
              new Label(composite,SWT.NONE).setText("Last Name");
              secondNameText = new Text(composite,SWT.NONE);
    }

}
