package com.example.apoorva.unbound_service_ringtone;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;

/**
 * Created by pc-10 on 28/3/18.
 */

public class MyService extends Service {
    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //  return super.onStartCommand(intent, flags, startId);
        mp=MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}

