package com.masai.androidactivity.dynamic_broadcast_receiver.custom_broadcast.ui;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.masai.androidactivity.R;

public class SendMessageActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_massege);
        button=findViewById(R.id.btnSendBroad);

        Intent intent=new Intent(getString(R.string.nalini));
        button.setOnClickListener(view -> sendBroadcast(intent));

    }


}