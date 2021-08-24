package com.ptv.oo;

public class RoadBicycle extends Bicycle {
	
	
	public RoadBicycle(int speed) {
		super(speed);
	}

	public RoadBicycle() {
		super();
	}
	
	@Override
	public void speedUp() {
//		super.speedUp();
		this.speed+=3;
	}
	@Override
	public void brakeDown() {
		this.speed-=3;
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}

	@Override
	public void changeGear(int gear) {
		System.out.println("Change gear not used in Road Bicycle");
		
	}
	
	
	
	
}
