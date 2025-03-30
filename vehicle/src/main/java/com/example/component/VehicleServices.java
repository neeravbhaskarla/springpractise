package com.example.component;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.annotations.LogAspect;
import com.example.aspects.LoggerAspect;
import com.example.beans.Song;
import com.example.beans.Speakers;
import com.example.beans.Tyres;

@Component
public class VehicleServices {
    @Autowired
    private Speakers speakers;
    
    @Autowired
    private Tyres tyres;

    Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
        return speakers.playSong(song);
    }   

    @LogAspect
    public String moveVehicle(boolean vehicleStarted) {
        return tyres.rotate();
    }

    @LogAspect
    public String applyBrakes(boolean vehicleStarted) {
        return tyres.applyBrakes();
    }
    
}
