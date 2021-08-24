package com.ptv.oo;

public class MountainBicycle extends Bicycle {
	
	int gears;
	int currentGear;

	public MountainBicycle(int speed, int gears) {
		super(speed);
		this.gears = gears;
	}

	public MountainBicycle() {
		super();
	}
	
	
	//Overloading
//	public int add(int x, int y) {
//		return x + y;
//	}
//	public int add(int x, int y, int z) {
//		return x + y + z;
//	}
//	public double add(double x, double y) {
//		return x + y;
//	}
	
	public void changeGear(int gearNo) {
		this.currentGear = gearNo;
	}
	
	public void changeGear() {
		++this.currentGear;
	}

	@Override
	public String toString() {
		return "MountainBicycle [gears=" + gears + ", currentGear=" + currentGear + ", speed=" + speed + "]";
	}
	
	
	
	
}
