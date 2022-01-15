package com.masai.androidactivity.dynamic_broadcast_receiver.system_events.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.masai.androidactivity.R;
import com.masai.androidactivity.dynamic_broadcast_receiver.system_events.local.AirplaneReceiver;

public class ReceiveBroadcastActivity extends AppCompatActivity {
    AirplaneReceiver airplaneReceiver=new AirplaneReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broadcast);
        IntentFilter airplaneModeFilter=new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(airplaneReceiver,airplaneModeFilter);

    }
}