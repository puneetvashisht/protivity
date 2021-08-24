package com.ptv.oo;

public abstract class Bicycle implements IBicycle{
	
	int speed;
	
	public Bicycle() {
		
	}
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}

	public void speedUp() {
		++this.speed;
	}

	public void brakeDown() {
		--this.speed;
	}
	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}

	
	
	
	
}
