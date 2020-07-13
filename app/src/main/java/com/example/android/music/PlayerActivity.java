package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    TextView songTextView;
    TextView artistTextView;
    ImageView songImageView;
    ImageView playImage;
    ImageView prevImage;
    ImageView nextImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        songTextView = (TextView) findViewById(R.id.player_song_name);
        artistTextView = (TextView) findViewById(R.id.player_song_artist);
        songImageView = (ImageView) findViewById(R.id.player_song_image);
        prevImage = (ImageView) findViewById(R.id.previous);
        nextImage = (ImageView) findViewById(R.id.next);
        playImage = (ImageView) findViewById(R.id.play);

        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        int pic = bundle.getInt("song_image");
        songImageView.setImageResource(pic);
        String songName = intent.getExtras().getString("song_name");
        String artist = intent.getExtras().getString("artist");
        songTextView.setText(songName);
        artistTextView.setText(artist);
    }
}
