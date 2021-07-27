package com.example.testproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.testproject.databinding.ActivityDesignBinding;

public class Design extends AppCompatActivity {
//ActivityDesignBinding activityDesignBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setTitle("WebView");
        }
     //  https://www.geeksforgeeks.org/
        WebView webView=findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.geeksforgeeks.org/");
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    }


