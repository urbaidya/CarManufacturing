package com.sopra.factory;

import com.sopra.factory.car.CarFactory;
import com.sopra.factory.car.CarShowroom;
import com.sopra.factory.car.features.Car;
import com.sopra.factory.car.features.CarOptions;
import com.sopra.factory.car.features.Engine;
import com.sopra.factory.car.features.EntertainmentSystem;

public class CarManufacturing {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		CarShowroom showroom = new CarShowroom();

		CarOptions sedanOptions = new CarOptions("Red", new EntertainmentSystem("Sony"));
		CarOptions suvOptions = new CarOptions("Black", new EntertainmentSystem("Bose"));

		Car sedan = carFactory.produceCar(
				"sedan", 
				"Skoda", 
				"Slavia", 
				2023, 
				sedanOptions, 
				new Engine(1498,147.52,"Automatic",19.47,"Petrol"), 
				521
				);
		Car electricSUV = carFactory.produceCar(
				"electricsuv", 
				"Tata", 
				"Nexon EV", 
				2023, 
				suvOptions,
				new Engine(147.52,"Automatic","Electric"), 
				true,
				400
				);
		Car suv = carFactory.produceCar(
				"suv", 
				"Jeep", 
				"Compass", 
				2023, 
				suvOptions, 
				new Engine(1956,167.67,"Manual",17.1,"Diesel"), 
				true
				);
		Car electricSedan1 = carFactory.produceCar(
				"electricsedan", 
				"Tesla", 
				"Model S", 
				2023, 
				sedanOptions, 
				new Engine(2000,200,"Automatic",19,"Electric"), 
				540,
				450
				);
		Car electricSedan2 = carFactory.produceCar(
				"electricsedan", 
				"Honda", 
				"Civic", 
				2023, 
				sedanOptions, 
				new Engine(1800,153,"Automatic/Manual",17,"Electric"), 
				500,
				330
				);

		showroom.addCar(sedan);
		showroom.addCar(electricSUV);
		showroom.addCar(suv);
		showroom.addCar(electricSedan1);
		showroom.addCar(electricSedan2);
		showroom.displayInventory();
	}

}
