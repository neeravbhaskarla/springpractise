package com.example.beans;

public class SonySpeakers implements Speakers{

    public String playSong(Song song) {
        return "Sony Speakers Playing " + song.getSongName() + " by " + song.getArtistName();
    }
    
}
