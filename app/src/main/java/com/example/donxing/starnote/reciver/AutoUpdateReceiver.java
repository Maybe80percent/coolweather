package com.example.donxing.starnote.reciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.donxing.starnote.service.AutoUpdateService;

/**
 * Created by ASUS on 2019/7/8.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    } }