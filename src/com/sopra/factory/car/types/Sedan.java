package com.sopra.factory.car.types;

import com.sopra.factory.car.features.Car;
import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.Maintenance;

public class Sedan extends Car implements Maintenance{
	private int trunkSize;
	

    public Sedan(String brand, String model, int year,CarOptions options, Engine engine, int trunkSize) {
        super(brand, model, year,options, engine);
        this.trunkSize = trunkSize;
    }

	public void loadCargo() {
        System.out.println("Loading cargo in the sedan's trunk.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
		System.out.println("========================");
		System.out.println("===ADDITIONAL FEATURES==");
		System.out.println("========================");
        System.out.println("Trunk Size: " + trunkSize + " liters");
    }
    
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the sedan.");
    }
}
