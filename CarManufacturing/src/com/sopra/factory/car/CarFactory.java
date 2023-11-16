package com.sopra.factory.car;

import com.sopra.factory.car.features.Car;
import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.EntertainmentSystem;
import com.sopra.factory.car.types.ElectricSUV;
import com.sopra.factory.car.types.ElectricSedan;
import com.sopra.factory.car.types.SUV;
import com.sopra.factory.car.types.Sedan;

//CarFactory.java
public class CarFactory {

	CarOptions options;
	Engine engine;
	int trunkSize;
	boolean offRoadCapable;
	int batteryCapacity;
	CarOptions newOptions;
	
	public CarFactory() {
		newOptions = new CarOptions();
	}
	
	public Car produceCar(String type, String brand, String model, int year, CarOptions options, Engine engine, Object... additionalFeatures) {
		switch (type.toLowerCase()) {
		case "sedan":
			trunkSize = (int) additionalFeatures[0];
			return new Sedan(brand, model, year ,options, engine, trunkSize);
		case "suv":
			offRoadCapable = (boolean) additionalFeatures[0];
			return new SUV(brand, model, year, options, engine, offRoadCapable);
		case "electricsuv":
			offRoadCapable = (boolean) additionalFeatures[0];
			batteryCapacity = (int) additionalFeatures[1];
			newOptions.customize("White", new EntertainmentSystem("Harman"));
			return new ElectricSUV(brand, model, year, newOptions, engine, offRoadCapable, batteryCapacity);
		case "electricsedan":
			trunkSize = (int) additionalFeatures[0];
			batteryCapacity = (int) additionalFeatures[1];
			newOptions.customize("Off-White", new EntertainmentSystem("Samsung"));
			return new ElectricSedan(brand, model, year, newOptions, engine, trunkSize, batteryCapacity);
		default:
			throw new IllegalArgumentException("Invalid car type: " + type);
		}
	}
}
