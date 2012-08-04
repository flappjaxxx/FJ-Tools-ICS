package com.flappjaxxx.fjtools;

import com.flappjaxxx.fjtools.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FJToolsActivity extends Activity {
	private static String logtag = "FJTools";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.launcher);
	         
	        Button buttonChangelog = (Button)findViewById(R.id.buttonChangelog);        
	     buttonChangelog.setOnClickListener(changelogListener); // Register the onClick listener with the implementation above
	       
	     Button buttonTools = (Button)findViewById(R.id.buttonTools);        
	     buttonTools.setOnClickListener(toolsListener); // Register the onClick listener with the implementation above
	     
	     Button buttonTweak = (Button)findViewById(R.id.buttonTweak);        
	     buttonTweak.setOnClickListener(tweakListener); // Register the onClick listener with the implementation above
	     
	     Button buttonOTA = (Button)findViewById(R.id.buttonOTA);        
	     buttonOTA.setOnClickListener(otaListener); // Register the onClick listener with the implementation above
	    }
	     
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener changelogListener = new OnClickListener() {
	    	public void onClick(View view) {
	            Intent intent = new Intent(FJToolsActivity.this, ChangelogActivity.class);
	            startActivity(intent);
	          }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener toolsListener = new OnClickListener() {
	    	public void onClick(View view) {
	            Intent intent = new Intent(FJToolsActivity.this, ToolsActivity.class);
	            startActivity(intent);
	          }
	    };
	    
	 // Create an anonymous implementation of OnClickListener
	    private OnClickListener tweakListener = new OnClickListener() {
	    	public void onClick(View view) {
	            Intent intent = new Intent(FJToolsActivity.this, WIPActivity.class);
	            startActivity(intent);
	          }
	    };
	    
	 // Create an anonymous implementation of OnClickListener
	    private OnClickListener otaListener = new OnClickListener() {
	    	public void onClick(View view) {
	            Intent intent = new Intent(FJToolsActivity.this, OTAActivity.class);
	            startActivity(intent);
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
	}