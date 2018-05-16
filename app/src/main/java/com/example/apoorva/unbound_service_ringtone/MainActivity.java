package com.example.apoorva.unbound_service_ringtone;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(this,MyService.class);
    }

    public void Start(View v)
    {
        startService(i);
    }
    public void Stop(View v)
    {
        stopService(i);
    }
}

