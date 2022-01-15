package com.masai.androidactivity.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masai.androidactivity.BoundService.ui.BoundServiceActivity
import com.masai.androidactivity.IntentService.IntentServiceActivity
import com.masai.androidactivity.R
import com.masai.androidactivity.services.ServiceActivity
import kotlinx.android.synthetic.main.activity_service.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnService.setOnClickListener {
            startActivity(Intent(this,ServiceActivity::class.java))
        }
        btnIntentService.setOnClickListener {
            startActivity(Intent(this,IntentServiceActivity::class.java))
        }
        btnBoundService.setOnClickListener {
            startActivity(Intent(this,BoundServiceActivity::class.java))
        }



    }
}