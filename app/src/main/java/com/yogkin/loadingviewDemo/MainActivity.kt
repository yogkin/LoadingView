package com.yogkin.loadingviewDemo

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yogkin.loadingview.LoadingView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btn_click).setOnClickListener {
            val loadingView = LoadingView(this)
            loadingView.show("加载中...")
            Handler(mainLooper).postDelayed({ loadingView.dismiss() }, 3000)
        }
    }


}