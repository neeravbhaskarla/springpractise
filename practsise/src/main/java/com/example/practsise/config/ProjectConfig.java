package com.example.practsise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Bean;

import com.example.practsise.beans.VehicleType;
import com.example.practsise.beans.Vehicle;

@ComponentScan(basePackages = "com.example.practsise.beans")
@Configuration
public class ProjectConfig {

    @Bean(value = "type1")
    @Primary
    public VehicleType vehicleType1(@Lazy Vehicle vehicle) {
        VehicleType vehicleType = new VehicleType();
        vehicleType.setVehicleType("Truck");
        vehicleType.setVehicle(vehicle);
        return vehicleType;
    }

    @Bean(value = "type2")
    public VehicleType vehicleType2(@Lazy Vehicle vehicle) {
        VehicleType vehicleType = new VehicleType();
        vehicleType.setVehicleType("Van");
        vehicleType.setVehicle(vehicle);
        return vehicleType;
    }

}
