package com.sopra.factory.car.features;

public class CarOptions {
    private String color;
    private EntertainmentSystem entertainmentSystem;

    public CarOptions() {
    	
    }
    
    public CarOptions(String color, EntertainmentSystem entertainmentSystem) {
        this.color = color;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void customize(String color, EntertainmentSystem entertainmentSystem) {
    	setColor(color);
    	setEntertainmentSystem(entertainmentSystem);
    }

    //GETTERS
	public String getColor() {
		return color;
	}
	public EntertainmentSystem getEntertainmentSystem() {
		return entertainmentSystem;
	}

	//SETTERS
	public void setColor(String color) {
		this.color = color;
	}
	public void setEntertainmentSystem(EntertainmentSystem entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}

	@Override
	public String toString() {
		return "CarOptions [color=" + color + ", entertainmentSystem of=" + entertainmentSystem + "]";
	}
    
}