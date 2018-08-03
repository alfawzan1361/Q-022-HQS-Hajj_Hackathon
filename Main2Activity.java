package com.example.bg994.hajjsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button)findViewById(R.id.Bbutton);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                open();
            }
        });
    }

    public void open(){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
}
