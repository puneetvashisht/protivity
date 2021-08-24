package com.ptv.oo;

public class TestBicycle {
	
	
	public static void main(String[] args) {
		Bicycle b = new Bicycle(0);
		b.speedUp();
		System.out.println(b);
		b.brakeDown();
		System.out.println(b);
		
		
//		MountainBicycle mb = new MountainBicycle(0, 7);
		// Upcasting 
		Bicycle mb = new MountainBicycle(0, 7);
		mb.speedUp();
		
		//instanceof -- check actual type of instance/object
		if(mb instanceof MountainBicycle) {
			//Downcasting
			MountainBicycle mb1 = (MountainBicycle) mb;
			mb1.changeGear(3);
			System.out.println(mb);
			mb.brakeDown();
			mb1.changeGear(0);
			System.out.println(mb);
		}
		
		
//		RoadBicycle rb = new RoadBicycle(0);
		Bicycle rb = new RoadBicycle(0);
		rb.speedUp();
		System.out.println(rb);
		rb.brakeDown();
		System.out.println(rb);
		
		Bicycle bicycles[] = {b, mb,rb};
		
		for(Bicycle bicycle: bicycles) {
//			System.out.println(bicycle);
			bicycle.speedUp();
			if(bicycle instanceof MountainBicycle) {
				MountainBicycle mountainBicycle = (MountainBicycle) bicycle;
				mountainBicycle.changeGear();
			}
			
			System.out.println(bicycle);
			bicycle.brakeDown();
			System.out.println(bicycle);
		}
		
		
	}
	
	
	

}
