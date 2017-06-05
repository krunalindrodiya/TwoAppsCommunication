package com.clienta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Krunal on 05-06-2017.
 */

public class VpnStatusReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ClientA VpnStatusReceiver", Toast.LENGTH_LONG).show();
    }
}
