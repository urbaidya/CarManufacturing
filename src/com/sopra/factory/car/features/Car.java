package com.sopra.factory.car.features;

public class Car {
	private String brand;
	private String model;
    private int year;
    private CarOptions options;
    private Engine engine;

    public Car(String brand, String model, int year, CarOptions options, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.options = options;
        this.engine = engine;
    }
    
    public CarOptions getCarOptions() {
    	return this.options;
    }
    
    public String getBrand() {
    	return this.brand;
    }
    
    public void displayInfo() {
        
        displayModelInfo();
        
        displayEngineInfo();
        
    }

	private void displayModelInfo() {
		System.out.println("========================");
		System.out.println("=MODEL'S SPECIFICATIONS=");
		System.out.println("========================");
		System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        displayOptions();
	}

	private void displayOptions() {	
		System.out.println("Car color: "+ options.getColor());
        System.out.println("Entertainment System of "+ options.getEntertainmentSystem());
	}
	
	private void displayEngineInfo() {
		System.out.println("========================");
		System.out.println("==ENGINE SPECIFICATIONS=");
		System.out.println("========================");
		if (engine.getEngineCC()!=0) {
			System.out.println("Engine-CC: "+engine.getEngineCC()+"cc");
		}
		if (engine.getEnginePower()!=0) {
			System.out.println("Engine-Power: "+engine.getEnginePower()+"bhp");
		}
		if (engine.getTransmission()!=null) {
			System.out.println("Transmission-Type: "+engine.getTransmission());
		}
		if (engine.getMileage()!=0) {
			System.out.println("Mileage: "+engine.getMileage()+"kmpl");
		}
		if (engine.getFuelType()!=null) {
			System.out.println("Fuel-Type: "+engine.getFuelType());
		}
	}
}
