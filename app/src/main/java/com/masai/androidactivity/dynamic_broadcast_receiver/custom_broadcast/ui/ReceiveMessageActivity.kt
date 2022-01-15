package com.masai.androidactivity.dynamic_broadcast_receiver.custom_broadcast.ui

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masai.androidactivity.R

import com.masai.androidactivity.dynamic_broadcast_receiver.custom_broadcast.local.MessageReceiver

class ReceiveMessageActivity : AppCompatActivity() {
    /*In this way you can create your broad class in host activity it self no need to create an extra class
    private BroadcastReceiver broadcastReceiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

        }
    };*/

    private val messageReceiver = MessageReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_mesage)
        val intentFilter=IntentFilter("nalini.action.com")
        registerReceiver(messageReceiver,intentFilter)
        startActivity(Intent(this,SendMessageActivity::class.java))
    }
}