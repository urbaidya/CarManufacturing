package com.sopra.factory.car;

//CarShowroom.java
import java.util.ArrayList;
import java.util.List;

import com.sopra.factory.car.features.Car;

public class CarShowroom {
 private List<Car> inventory;

 public CarShowroom() {
     this.inventory = new ArrayList<>();
 }

 public void addCar(Car car) {
     inventory.add(car);
 }

 public void displayInventory() {
	 int i = 1;
     for (Car car : inventory) {
    	 System.out.println("\nCar "+i);
         car.displayInfo();
         System.out.println("\n-----------------------------");
         i++;
     }
 }
}
