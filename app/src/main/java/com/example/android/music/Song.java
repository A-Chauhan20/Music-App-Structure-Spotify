package com.example.android.music;

public class Song {
    private int mImageId;
    private String mSongName;
    private String mArtistName;

    public Song(int mImageId, String mSongName, String mArtistName) {
        this.mImageId = mImageId;
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
    }

    int getImageId() { return mImageId; }

    String getSongName() { return mSongName; }

    String getArtistName() { return mArtistName; }
}
