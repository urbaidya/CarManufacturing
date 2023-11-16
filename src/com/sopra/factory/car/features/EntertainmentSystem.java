package com.sopra.factory.car.features;

public class EntertainmentSystem {
	private String brand;
	
	public EntertainmentSystem(String brand) {
		this.brand = brand;
	}

	public void playMusic() {
		System.out.println("Playing music on the " + brand + " entertainment system.");
	}

	public String toString() {
		return this.brand;
	}

}
