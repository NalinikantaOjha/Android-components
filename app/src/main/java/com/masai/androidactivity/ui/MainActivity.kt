package com.masai.androidactivity.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masai.androidactivity.R
import com.masai.androidactivity.dynamic_broadcast_receiver.ui.DynamicActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDynamic.setOnClickListener {
            startActivity(Intent(this,
                DynamicActivity::class.java))
        }


    }
}