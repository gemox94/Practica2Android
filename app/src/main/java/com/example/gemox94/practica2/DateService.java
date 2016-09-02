package com.example.gemox94.practica2;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gemox94 on 1/09/16.
 */
public class DateService extends IntentService {

    public DateService(){
        super("DateService");
    }

    protected void onHandleIntent(Intent workIntent){
        // Gets data from the incoming Intent
        //String dataString = workIntent.getDataString();
        //Log.v("Starting Service", "Hello Service");
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        final Date date = new Date();
        System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48

        Handler h = new Handler(DateService.this.getMainLooper());

        h.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), dateFormat.format(date),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
