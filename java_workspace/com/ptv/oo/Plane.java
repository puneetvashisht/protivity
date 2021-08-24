package com.ptv.oo;

public class Plane extends Vehicle {
	
	int maxAltitude;

	public Plane(int maxSpeed, int maxAltitude) {
		super(maxSpeed);
//		this.maxSpeed = maxSpeed;
		this.maxAltitude = maxAltitude;
	}
	
	public void fly() {
		this.start();
		System.out.println("flying plane...");
	}

	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + "]";
	}


	
	
	
	

}
