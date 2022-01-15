package com.masai.androidactivity.dynamic_broadcast_receiver.system_events.local

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context,"Airplane",Toast.LENGTH_LONG).show()

    }
}