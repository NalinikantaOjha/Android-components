package com.masai.androidactivity.services.ForegroundService.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.masai.androidactivity.R;
import com.masai.androidactivity.services.ForegroundService.local.MyService;

public class ForegroundActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreground);
        intent=new Intent(ForegroundActivity.this, MyService.class);
    }
}