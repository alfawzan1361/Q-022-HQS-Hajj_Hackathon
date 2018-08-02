package com.example.af.hqs_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button)findViewById(R.id.Bbutton);
        button.setOnClickListener(new View.OnClickListener(){

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
}
