package com.myplugin.rmp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import com.myplugin.rmp.RmpPlugin;
import org.eclipse.jface.util.PropertyChangeEvent;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class PropertyManagerPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	private StringFieldEditor fieldEditor;

	public PropertyManagerPreferencePage() {
		super(GRID);
		setPreferenceStore(RmpPlugin.getDefault().getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		fieldEditor = new StringFieldEditor(PreferenceConstants.FOLDER_NAME,
				"Folder Name: ", getFieldEditorParent());
		addField(fieldEditor);
	}

	protected void checkState() {
		super.checkState();
		if (fieldEditor.getStringValue() != null
				&& !fieldEditor.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage("Folder name cannot be blank!");
			setValid(false);
		}
	}
	
	public void propertyChange(PropertyChangeEvent event) {
        super.propertyChange(event);
        if (event.getProperty().equals(FieldEditor.VALUE)) {
                  checkState();
        }        
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}