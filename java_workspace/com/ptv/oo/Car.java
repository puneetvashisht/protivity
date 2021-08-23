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

	public static void main(String[] args) {
		Car car = new Car(300, "Tata");
		car.drive();
		System.out.println(car.toString());
		
		Vehicle vehicle = new Vehicle(339);
		System.out.println(vehicle);
//		
//		System.out.println(car.maxSpeed);
//		System.out.println(car.brand);
	}
}
