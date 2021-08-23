package com.ptv.oo;

public class Vehicle extends Object {
	
	int maxSpeed;
	public Vehicle() {
		
	}

	public Vehicle(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public void start() {
		System.out.println("starting vehicle");
	}

	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + "]";
	}
	


}
