package com.rarnu.tools.root.fragmentactivity;

import android.app.Fragment;

import com.rarnu.tools.root.base.BaseActivity;
import com.rarnu.tools.root.fragment.GlobalFragment;

public class DataBackupActivity extends BaseActivity {

	@Override
	public Fragment replaceFragment() {
		return GlobalFragment.fBackup;
	}

}