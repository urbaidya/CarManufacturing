package com.sopra.factory.car.features;

public class Engine {
	private int engineCC;
	private double enginePower;
	private String transmission;
	private double mileage;
	private String fuelType;

	//CONTRUCTORS
	public Engine(int engineCC, double enginePower, String transmission, double mileage, String fuelType) {
		this.engineCC = engineCC;
		this.enginePower = enginePower;
		this.transmission = transmission;
		this.mileage = mileage;
		this.fuelType = fuelType;
	}

	public Engine(double enginePower, String transmission, String fuelType) {
		this.enginePower = enginePower;
		this.transmission = transmission;
		this.fuelType = fuelType;
	}

	//GETTERS
	public int getEngineCC() {
		return engineCC;
	}
	public double getEnginePower() {
		return enginePower;
	}
	public String getTransmission() {
		return transmission;
	}
	public double getMileage() {
		return mileage;
	}
	public String getFuelType() {
		return fuelType;
	}

	//SETTERS
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
