package com.ptv.oo;

public class TestVehicle {
	public static void main(String[] args) {
		Car car = new Car(300, "Tata");
		car.drive();
		System.out.println(car.toString());
		
		Vehicle vehicle = new Vehicle(339);
		System.out.println(vehicle);
		
		Plane plane = new Plane(1000, 10000);
		System.out.println(plane);
		
		plane.fly();
//		
//		System.out.println(car.maxSpeed);
//		System.out.println(car.brand);
	}
}
