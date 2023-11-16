package com.sopra.factory.car.types;

import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.ElectricCar;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.Maintenance;

public class ElectricSUV extends SUV implements ElectricCar,Maintenance {
	private int batteryCapacity;

	public ElectricSUV(String brand, String model, int year, CarOptions options, Engine engine, boolean offRoadCapable, int batteryCapacity) {
		super(brand, model, year, options, engine, offRoadCapable);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void charge() {
		System.out.println("Charging the electric SUV.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
	}
	
	@Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the electric SUV.");
    }
}
