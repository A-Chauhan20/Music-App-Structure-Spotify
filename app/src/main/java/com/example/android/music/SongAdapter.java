package com.example.android.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        Song currentSong = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        if (currentSong!=null){
            ImageView songImage = (ImageView) listItemView.findViewById(R.id.list_song_image);
            songImage.setImageResource(currentSong.getImageId());

            TextView songText = (TextView) listItemView.findViewById(R.id.list_song_name);
            songText.setText(currentSong.getSongName());

            TextView songArtist = (TextView) listItemView.findViewById(R.id.list_song_artist);
            songArtist.setText(currentSong.getArtistName());

            return listItemView;
        }
        return listItemView;
    }
}
