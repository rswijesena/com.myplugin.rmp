package com.myplugin.rmp.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.myplugin.rmp.RmpPlugin;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = RmpPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.FOLDER_NAME,"WorkSpace Property Files");
	}

}
