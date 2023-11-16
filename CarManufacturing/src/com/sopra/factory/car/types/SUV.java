package com.sopra.factory.car.types;

import com.sopra.factory.car.features.Car;
import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.Maintenance;

public class SUV extends Car implements Maintenance{
	private boolean offRoadCapable;

    public SUV(String brand, String model, int year ,CarOptions options, Engine engine, boolean offRoadCapable) {
        super(brand, model, year,options, engine);
        this.offRoadCapable = offRoadCapable;
    }

    public void engage4WD() {
        System.out.println("Engaging 4WD in the SUV.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
		System.out.println("========================");
		System.out.println("===ADDITIONAL FEATURES==");
		System.out.println("========================");
        System.out.println("Off-Road Capable: " + offRoadCapable);
    }
    
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the SUV.");
    }

}
