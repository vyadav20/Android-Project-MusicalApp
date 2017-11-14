package com.varshayadv.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Songs extends AppCompatActivity {

    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        txt=(TextView)findViewById(R.id.detail);
        btn=(Button)findViewById(R.id.songsDetails);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt.setText("All The Songs are by ED Sheerean");
            }
        });


    }
    }










