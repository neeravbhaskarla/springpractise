package com.example.practsise.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
    private String vehicleName;
    private VehicleType vehicleType;

    @PostConstruct
    public void initailize(){
        System.out.println("Vehicle Bean is created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Vehicle Bean is destroyed");
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Autowired
    @Lazy
    public VehicleType setVehicleType(@Qualifier("type2") VehicleType vehicleType) {
        return this.vehicleType = vehicleType;
    }

    public void print() {
        System.out.println("Vehicle Name: " + vehicleName + ", Vehicle Type: " + vehicleType.getVehicleType());
    }
}
