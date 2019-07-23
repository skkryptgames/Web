package com.example.web;
import java.lang.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview =(WebView)findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);

        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("file:///android_asset/sample.html");

        /*String data="<html>" +
                    "<body>" +
                    "<header>" +
                        "<H2>" +
                                    "This is the sample web page" +
                        "</H2>" +
                    "</header>" +
                    "</body>" +
                    "</html>" ;

            webview.loadData(data,"text/html","UTF-8");*/



    }
}
