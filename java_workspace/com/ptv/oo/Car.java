package com.ptv.oo;

public class Car extends Vehicle {
	
	String brand;
	

	public Car(int maxSpeed, String brand) {
		this.maxSpeed = maxSpeed;
		this.brand = brand;
	}

	void drive() {
		this.start();
		System.out.println("driving car...");
	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

	
}
