package com.clientb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Krunal on 05-06-2017.
 */

public class VpnBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ClientB-VpnBroadcastReceiver", Toast.LENGTH_LONG).show();
    }
}
