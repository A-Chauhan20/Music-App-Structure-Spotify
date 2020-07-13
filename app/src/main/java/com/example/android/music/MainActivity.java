package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Song> songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        songList = new ArrayList<Song>();
        songList.add(new Song(R.drawable.badguy,"Bad Guy","Billie Eilish"));
        songList.add(new Song(R.drawable.blindinglights,"Blinding Lights","The Weeknd"));
        songList.add(new Song(R.drawable.butterflyeffect,"ButterFly Effect","Travis Scott"));
        songList.add(new Song(R.drawable.falling,"Falling","Trevor Daniel"));
        songList.add(new Song(R.drawable.goodthings,"Good Things Fall Apart","Jon Bellion, Illenium"));
        songList.add(new Song(R.drawable.noguidance,"No Guidance","Chris Brown, Drake"));
        songList.add(new Song(R.drawable.oldtownroad,"Old Town Road","Lil Nas X"));
        songList.add(new Song(R.drawable.rockstar,"Rockstar","Post Malone"));
        songList.add(new Song(R.drawable.reminder,"Reminder","The Weeknd"));
        songList.add(new Song(R.drawable.senorita,"Señorita","Camila Cabello, Shawn Mendes"));
        songList.add(new Song(R.drawable.starboy,"Starboy","The Weeknd"));
        songList.add(new Song(R.drawable.takeaway,"Takeaway","The Chainsmokers"));
        songList.add(new Song(R.drawable.thebox,"The Box","Roddy Rich"));
        songList.add(new Song(R.drawable.thehills,"The Hills","The Weeknd"));
        songList.add(new Song(R.drawable.whodoyoulove,"Who Do You Love","The Chainsmokers"));

        final SongAdapter songAdapter = new SongAdapter(this, songList);
        final ListView songListView = findViewById(R.id.listView);
        songListView.setAdapter(songAdapter);
        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentSong = (Song) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                Bundle bundle=new Bundle();
                bundle.putInt("song_image", currentSong.getImageId());
                intent.putExtras(bundle);
                intent.putExtra("song_name", currentSong.getSongName());
                intent.putExtra("artist", currentSong.getArtistName());
                startActivity(intent);
            }
        });
    }
}
