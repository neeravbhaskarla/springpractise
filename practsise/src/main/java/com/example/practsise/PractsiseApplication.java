package com.example.practsise;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.practsise.config.ProjectConfig;
import com.example.practsise.beans.Vehicle;
import com.example.practsise.beans.VehicleType;

public class PractsiseApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.setVehicleName("Car");
		Vehicle vehicle2 = context.getBean(Vehicle.class);

		vehicle.print();
		vehicle2.print();

		
		context.registerBean("vehicle4", Vehicle.class, () -> {
			Vehicle vehicle4 = new Vehicle();
			vehicle4.setVehicleName("Bike");
			return vehicle4;
		});
		
		VehicleType vehicleType = context.getBean(VehicleType.class);
		Vehicle vehicle4 = context.getBean("vehicle4", Vehicle.class);
		
		vehicleType.print();
		vehicle4.print();
		
		context.close();
	}

}
