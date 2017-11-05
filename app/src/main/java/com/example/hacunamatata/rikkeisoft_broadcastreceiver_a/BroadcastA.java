package com.example.hacunamatata.rikkeisoft_broadcastreceiver_a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastA extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("From Sender to A", intent.getAction());
        Log.d("From Sender to A", intent.getStringExtra("Message"));
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
