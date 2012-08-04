package com.flappjaxxx.fjtools;

import java.io.DataOutputStream;
import java.io.IOException;

import com.flappjaxxx.fjtools.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class WakeMinActivity extends Activity {
	static final String CMD_SU="su";
	static final String CMD_FJTOOL="fjtool";
	static final String CMD_192="192wakemin";
	static final String CMD_384="384wakemin";
	static final String CMD_486="486wakemin";
	static final String CMD_594="594wakemin";
	static final String CMD_702="702wakemin";
	static final String CMD_864="864wakemin";
	static final String CMD_972="972wakemin";
	static final String CMD_1134="1134wakemin";
	static final String CMD_1350="1350wakemin";
	static final String CMD_1512="1512wakemin";
    
	 private static String logtag = "FJ-Tweak";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.wakemin);
	         
	        Button button192 = (Button)findViewById(R.id.button192);        
	     button192.setOnClickListener(button192Listener); // Register the onClick listener with the implementation above
	       
	     Button button384 = (Button)findViewById(R.id.button384);        
	     button384.setOnClickListener(button384Listener); // Register the onClick listener with the implementation above
	     
	     Button button486 = (Button)findViewById(R.id.button486);        
	     button486.setOnClickListener(button486Listener); // Register the onClick listener with the implementation above
	     
	     Button button594 = (Button)findViewById(R.id.button594);        
	     button594.setOnClickListener(button594Listener); // Register the onClick listener with the implementation above
	    
	     Button button702 = (Button)findViewById(R.id.button702);        
	     button702.setOnClickListener(button702Listener);

	     Button button864 = (Button)findViewById(R.id.button864);        
	     button864.setOnClickListener(button864Listener);
	     
	     Button button972 = (Button)findViewById(R.id.button972);        
	     button972.setOnClickListener(button972Listener); // Register the onClick listener with the implementation above
	    
	     Button button1134 = (Button)findViewById(R.id.button1134);        
	     button1134.setOnClickListener(button1134Listener);

	     Button button1350 = (Button)findViewById(R.id.button1350);        
	     button1350.setOnClickListener(button1350Listener);

	     Button button1512 = (Button)findViewById(R.id.button1512);        
	     button1512.setOnClickListener(button1512Listener);

	     /** Button button1728 = (Button)findViewById(R.id.button1728);        
	     button1728.setOnClickListener(button1728Listener);

	     Button button1782 = (Button)findViewById(R.id.button1782);        
	     button1782.setOnClickListener(button1782Listener);

	     Button button1836 = (Button)findViewById(R.id.button1836);        
	     button1836.setOnClickListener(button1836Listener);

	     Button button1890 = (Button)findViewById(R.id.button1890);        
	     button1890.setOnClickListener(button1890Listener);

	     Button button1944 = (Button)findViewById(R.id.button1944);        
	     button1944.setOnClickListener(button1944Listener); */
	     
	    }
	     
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener button192Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_192 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 192000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener button384Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_384 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 384000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        } 
	    };
	    
	 // Create an anonymous implementation of OnClickListener
	    private OnClickListener button486Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_486 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 486000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        } 
	    };

		 // Create an anonymous implementation of OnClickListener
		    private OnClickListener button594Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	Process   p = null;
		        	try {
		        		p = Runtime.getRuntime().exec(CMD_SU);
		        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
		        		   os.writeBytes(CMD_FJTOOL + " " + CMD_594 + "\n" + "; exit\n");  
		        		   os.flush();  
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 594000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        } 
		    };
		    
	    private OnClickListener button702Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_702 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 702000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button864Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_864 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 864000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

		 // Create an anonymous implementation of OnClickListener
		    private OnClickListener button972Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	Process   p = null;
		        	try {
		        		p = Runtime.getRuntime().exec(CMD_SU);
		        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
		        		   os.writeBytes(CMD_FJTOOL + " " + CMD_972 + "\n" + "; exit\n");  
		        		   os.flush();  
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 972000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        } 
		    };
		    
	    private OnClickListener button1134Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_1134 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1344000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1350Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_1350 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1350000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1512Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	Process   p = null;
	        	try {
	        		p = Runtime.getRuntime().exec(CMD_SU);
	        		DataOutputStream os = new DataOutputStream(p.getOutputStream());  
	        		   os.writeBytes(CMD_FJTOOL + " " + CMD_1512 + "\n" + "; exit\n");  
	        		   os.flush();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1512000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

		    private OnClickListener button1728Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	try {
						Runtime.getRuntime().exec("su -c /system/media/tweak/1728wakemin");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1728000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        }				
		    };
		   
		    private OnClickListener button1782Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	try {
						Runtime.getRuntime().exec("su -c /system/media/tweak/1782wakemin");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1782000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        }				
		    };

		    private OnClickListener button1836Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	try {
						Runtime.getRuntime().exec("su -c /system/media/tweak/1836wakemin");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1836000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        }				
		    };

		    private OnClickListener button1890Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	try {
						Runtime.getRuntime().exec("su -c /system/media/tweak/1890wakemin");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1890000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
		        }				
		    };

		    private OnClickListener button1944Listener = new OnClickListener() {
		        public void onClick(View v) {
		        	try {
						Runtime.getRuntime().exec("su -c /system/media/tweak/1944wakemin");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1944000", Toast.LENGTH_SHORT).show();
					WakeMinActivity.this.finish();
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
	 protected void onPause() { //device goes to Wake or another activity appears
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