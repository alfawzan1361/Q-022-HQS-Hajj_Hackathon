package com.example.af.hqs_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread a = new Thread(){

            @Override
            public void run(){
                try{
                    sleep(5*1000);
                    Intent i = new Intent(getBaseContext(), Main3Activity.class);
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
