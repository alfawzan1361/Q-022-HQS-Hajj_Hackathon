package com.example.bg994.hajjsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Thread a = new Thread(){

            @Override
            public void run(){
                try{
                    sleep(5*1000);
                    Intent i = new Intent(getBaseContext(), MapsActivity.class);
                    startActivity(i);
                    finish();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        a.start();
    }
}
