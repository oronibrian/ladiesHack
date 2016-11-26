package com.example.oroni.ladieshack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by oroni on 11/26/16.
 */

public class AlarmBroadcastReceiver  extends BroadcastReceiver {
    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.panic );
        mp.start();

    }
}
