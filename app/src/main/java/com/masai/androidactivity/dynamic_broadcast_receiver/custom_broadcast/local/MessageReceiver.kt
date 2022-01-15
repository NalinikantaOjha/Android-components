package com.masai.androidactivity.dynamic_broadcast_receiver.custom_broadcast.local

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MessageReceiver:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Toast.makeText(p0,"Received your message ",Toast.LENGTH_LONG).show()
    }
}