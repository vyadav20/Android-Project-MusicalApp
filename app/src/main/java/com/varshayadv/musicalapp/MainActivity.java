package com.varshayadv.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView payment = (TextView) findViewById(R.id.payment);

        payment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Payment.class);
                startActivity(numberIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);


        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Songs.class);

                startActivity(numberIntent);
            }
        });


        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(numberIntent);
            }
        });

        TextView favourite = (TextView) findViewById(R.id.favourite);

        favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Favourite.class);
                startActivity(numberIntent);
            }
        });

        TextView radio = (TextView) findViewById(R.id.radio);

        radio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Radio.class);
                startActivity(numberIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artists);

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(numberIntent);
            }
        });

        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);

        nowplaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(numberIntent);
            }
        });


    }
}
