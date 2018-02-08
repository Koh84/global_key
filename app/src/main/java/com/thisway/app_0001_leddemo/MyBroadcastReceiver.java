package com.thisway.app_0001_leddemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kelvin on 08/02/2018.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Get BroadcastReceiver", Toast.LENGTH_SHORT).show();
        Intent intentNewTask=new Intent(context,MainActivity.class);
        intentNewTask.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentNewTask);
    }
}
