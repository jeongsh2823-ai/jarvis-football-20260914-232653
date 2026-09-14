package ai.jarvis.football;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;
    private static final String URL = "https://jeongsh2823-ai.github.io/jarvis-football-20260914-232653/";
    @Override public void onCreate(Bundle state) { super.onCreate(state); web = new WebView(this); web.setWebViewClient(new WebViewClient(){ @Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest r){ return false; }}); web.setWebChromeClient(new WebChromeClient()); web.getSettings().setJavaScriptEnabled(true); web.getSettings().setDomStorageEnabled(true); web.getSettings().setBuiltInZoomControls(false); web.loadUrl(URL); setContentView(web); }
    @Override public void onBackPressed() { if (web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
