package com.flappjaxxx.fjtools;

import java.io.DataOutputStream;
import java.io.IOException;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.flappjaxxx.fjtools.R;

public class OTAActivity extends Activity {
	static final String CMD_SU="su";
	static final String CMD_SUC="-c";
	static final String CMD_FJTOOL="fjtool";
	static final String CMD_UPFJ="upfjtools";
	
	WebView mWebView;
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.webview);

	    final ProgressDialog progressDialog = new ProgressDialog(OTAActivity.this);
	    progressDialog.setMessage("Loading ...");
	    progressDialog.setCancelable(false);
	    progressDialog.show();
	    
	    mWebView = (WebView) findViewById(R.id.webview);
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    mWebView.loadUrl("file:///android_asset/www/index.htm");
	    mWebView.setWebViewClient(new OTAWebViewClient() {
	    	@Override
		    public void onPageFinished(WebView view, String url) {
		    super.onPageFinished(view, url);
		    progressDialog.hide();
		    }
		    });
	    mWebView.setDownloadListener(new DownloadListener() {
	        public void onDownloadStart(String url, String userAgent,
	                String contentDisposition, String mimetype,
	                long contentLength) {
	            Intent intent = new Intent(Intent.ACTION_VIEW);
	            intent.setData(Uri.parse(url));
	            startActivity(intent);

	        }
	    });
	    
	}
	
	private class OTAWebViewClient extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }
	    
	}

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()){
            mWebView.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
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
			ProgressDialog.show(OTAActivity.this,
					
	                "Please wait...", "Updating...", true);
	        return true;
	    case R.id.exit_app:
	    	finish();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
    }
    
}