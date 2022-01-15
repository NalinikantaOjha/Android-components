package com.masai.androidactivity.static_broadcast_receiver.local

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Receiver: BroadcastReceiver() {
    /* You will get notification your camera button press if
    your devise is less than api level 26or less than oreo operating system
     */
    override fun onReceive(p0: Context?, p1: Intent?) {
    }
}