package com.example.beans;

public class BoseSpeakers implements Speakers {

    public String playSong(Song song) {
        return "Bose Speakers Playing " + song.getSongName() + " by " + song.getArtistName();
    }
    
}
