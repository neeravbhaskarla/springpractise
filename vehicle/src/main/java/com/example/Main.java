package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ProjectConfig;
import com.example.beans.Song;
import com.example.component.VehicleServices;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);

        Song song = new Song("Hybe Boy", "New Jeans");

        boolean vehicleStarted = false;
        vehicleStarted = true;

        System.out.println("\n" + vehicleServices.moveVehicle(vehicleStarted) + "\n");
        System.out.println("\n" + vehicleServices.playMusic(vehicleStarted, song) + "\n");
        System.out.println("\n" + vehicleServices.applyBrakes(vehicleStarted) + "\n");

        vehicleStarted = false;
        System.out.println("\n" + vehicleServices.moveVehicle(vehicleStarted) + "\n");
        System.out.println("\n" + vehicleServices.playMusic(vehicleStarted, song) + "\n");
        System.out.println("\n" + vehicleServices.applyBrakes(vehicleStarted) + "\n");

        context.close();
    }
}