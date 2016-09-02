package com.example.gemox94.practica2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.toast_button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.v("Button test", "Toasting message");
                Intent mServiceIntent = new Intent(MainActivity.this, DateService.class);
                MainActivity.this.startService(mServiceIntent);
            }
        });
    }
}
