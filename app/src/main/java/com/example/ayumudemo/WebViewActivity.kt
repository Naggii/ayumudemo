package com.example.ayumudemo

import android.net.Uri
import android.os.Bundle
import android.webkit.JsPromptResult
import android.webkit.ValueCallback
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "WebView"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val webView = findViewById(R.id.webView) as WebView
        webView.loadUrl("https://www.sonix.asia/")
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}
