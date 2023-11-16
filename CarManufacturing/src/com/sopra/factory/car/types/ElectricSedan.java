package com.sopra.factory.car.types;

import com.sopra.factory.car.features.AutonomousDriving;
import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.ElectricCar;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.Maintenance;

public class ElectricSedan extends Sedan implements ElectricCar,AutonomousDriving,Maintenance {
	private int batteryCapacity;
	private boolean autonomousDriving;

	public ElectricSedan(String brand, String model, int year, CarOptions options, Engine engine, int trunkSize, int batteryCapacity) {
		super(brand, model, year, options, engine, trunkSize);
		this.batteryCapacity = batteryCapacity;
		if (this.getBrand() == "Tesla") {
			this.autonomousDriving = true;
		}
		else {
			this.autonomousDriving = false;
		}
	}

	@Override
	public void charge() {
		System.out.println("Charging the electric Sedan.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
		System.out.println("AI Autonomous Driving: " + autonomousDriving);
	}
	
	@Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the electric Sedan.");
    }

	@Override
	public void enableAutopilot() {
		if (this.autonomousDriving) {
			System.out.println("Sit and Relax. The Car is in Autopilot now.");
		}
		else {
			System.out.println("This car does not have Autopilot mode.");
		}
		
	}
}
