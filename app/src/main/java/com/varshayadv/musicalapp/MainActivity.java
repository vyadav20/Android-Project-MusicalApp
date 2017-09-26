package com.varshayadv.musicalapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that shows the number category
        TextView songs = (TextView) findViewById(R.id.songs);

        //set a clickListener on the view
        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link numberActivity}
                Intent numberIntent = new Intent(MainActivity.this, songs.class);
                //start the new Activity
                startActivity(numberIntent);
            }
        });


        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, albums.class);
                startActivity(numberIntent);
            }
        });

        TextView favourite = (TextView) findViewById(R.id.favourite);

        favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, favourite.class);
                startActivity(numberIntent);
            }
        });

        TextView radio = (TextView) findViewById(R.id.radio);

        radio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, radio.class);
                startActivity(numberIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artists);

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, artists.class);
                startActivity(numberIntent);
            }
        });
    }
}
