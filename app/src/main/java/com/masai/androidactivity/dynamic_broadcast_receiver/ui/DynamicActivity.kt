package com.masai.androidactivity.dynamic_broadcast_receiver.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masai.androidactivity.R
import com.masai.androidactivity.dynamic_broadcast_receiver.custom_broadcast.ui.ReceiveMessageActivity
import com.masai.androidactivity.dynamic_broadcast_receiver.system_events.ui.ReceiveBroadcastActivity
import kotlinx.android.synthetic.main.activity_dynamic.*

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)
        btnSystemBroadcast.setOnClickListener {
            startActivity(Intent(this,ReceiveBroadcastActivity::class.java))
        }
        btnCustom.setOnClickListener {
            startActivity(Intent(this, ReceiveMessageActivity::class.java))
        }
    }
}