package com.example.bg994.hajjsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = (Button)findViewById(R.id.Cbutton);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                open1();
            }
        });

        button2 = (Button)findViewById(R.id.Dbutton);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                open();
            }
        });
    }

    public void open(){
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
    public void open1(){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
