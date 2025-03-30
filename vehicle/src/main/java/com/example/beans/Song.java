package com.example.beans;

public class Song {
    String songName;
    String artistName;

    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    public Song() {
        
    }

    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
