package com.ptv.oo;

public class Bicycle {
	
	int speed;
	
	public Bicycle() {
		
	}
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}

	protected void speedUp() {
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
