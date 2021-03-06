package com.flappjaxxx.fjtools;

import java.io.DataOutputStream;
import java.io.IOException;

import com.flappjaxxx.fjtools.R;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AppsActivity extends ScriptedActivity {
	static final String CMD_SU="su";
	static final String CMD_SUC="-c";
	static final String CMD_FJTOOL="fjtool";
	static final String CMD_UPFJ="upfjtools";
	@SuppressWarnings("deprecation")
	public boolean onItemSelected(String itemAction, String itemDescription) {
		ToolsActivity.getInstance().getTabHost().setCurrentTab(ToolsActivity.TAB_CONSOLE);
		return true;
	}
	
	public void onCreate(Bundle savedInstanceState) {		
		this.actions      = getResources().getStringArray(R.array.apps_actions_array);
		this.descriptions = getResources().getStringArray(R.array.apps_descriptions_array);
		super.onCreate(savedInstanceState);	
	}
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        // do something on back.
	    	System.exit(0);
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu4) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.menu4, menu4);
	    return true;
	}
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.changelog:
	    	try {
				Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.fjtools/.ChangelogActivity");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return true;
	    case R.id.update_tools:
	    	Process   p = null;
        	try {
        		p = Runtime.getRuntime().exec(CMD_SU);
        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
        		   os.writeBytes(CMD_FJTOOL + " " + CMD_UPFJ + "\n" + "; exit\n");  
        		   os.flush();  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ProgressDialog.show(AppsActivity.this,
					
	                "Please wait...", "Updating...", true);
	        return true;
	    case R.id.exit_app:
	    	System.exit(0);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
    }
    
}