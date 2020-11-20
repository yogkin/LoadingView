package com.yogkin.loadingview

import android.content.Context
import androidx.appcompat.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

class LoadingView(mContext: Context) {

    private val view = LayoutInflater.from(mContext).inflate(R.layout.dialog_loading_base, null)
    private val contextText = view.findViewById<TextView>(R.id.tv_loading)
    private var mDialog = AlertDialog.Builder(mContext, R.style.custom_dialog_dim_disabled)
        .setView(view)
        .setCancelable(false)
        .create()

    fun show() {
        contextText.text = ""
        mDialog.show()
    }

    fun show(content: String) {
        contextText.text = content
        mDialog.show()
    }

    fun show(resId: Int) {
        contextText.setText(resId)
        mDialog.show()
    }

    fun dismiss() {
        if (mDialog.isShowing)
            mDialog.dismiss()
    }

}