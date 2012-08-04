package com.flappjaxxx.fjtools;

import java.io.IOException;

import com.flappjaxxx.fjtools.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WIPActivity extends Activity {
	private static String logtag = "FJTools";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.wip);
	         
	        Button buttonGB = (Button)findViewById(R.id.buttonGB);        
	     buttonGB.setOnClickListener(gbListener); // Register the onClick listener with the implementation above
	    }
	     
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener gbListener = new OnClickListener() {
	    	public void onClick(View view) {System.exit(0);
	          }
	    };
	    
	    @Override
	 protected void onStart() {//activity is started and visible to the user
	  Log.d(logtag,"onStart() called");
	  super.onStart();  
	 }
	 @Override
	 protected void onResume() {//activity was resumed and is visible again
	  Log.d(logtag,"onResume() called");
	  super.onResume();
	   
	 }
	 @Override
	 protected void onPause() { //device goes to sleep or another activity appears
	  Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
	  super.onPause();
	   
	 }
	 @Override
	 protected void onStop() { //the activity is not visible anymore
	  Log.d(logtag,"onStop() called");
	  super.onStop();
	   
	 }
	 @Override
	 protected void onDestroy() {//android has killed this activity
	   Log.d(logtag,"onDestroy() called");
	   super.onDestroy();
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
		    case R.id.exit_app:
		    	System.exit(0);
		        return true;
		    default:
		        return super.onOptionsItemSelected(item);
		    }
		}

	}
