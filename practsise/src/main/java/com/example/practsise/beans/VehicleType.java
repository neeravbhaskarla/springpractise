package com.example.practsise.beans;

public class VehicleType {
    private String vehicleType;
    private Vehicle vehicle;

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        System.out.println("Vehicle Type: " + vehicleType + ", Vehicle Name: " + vehicle.getVehicleName());
    }
}
