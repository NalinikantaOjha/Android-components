package com.masai.androidactivity.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.masai.androidactivity.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG: String = "TAG"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"OnCreate")
        tvStatus.text="onCreate"
    }

    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
        tvStatus.text="onStart"

    }

    @SuppressLint("SetTextI18n")
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
        tvStatus.text="onRestart"


    }

    @SuppressLint("SetTextI18n")
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
        tvStatus.text="onResume"


    }

    @SuppressLint("SetTextI18n")
    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
        tvStatus.text="onPause"

    }

    @SuppressLint("SetTextI18n")
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
        tvStatus.text="onStop"


    }

    @SuppressLint("SetTextI18n")
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
        tvStatus.text="onDestroy"


    }
}