package com.ptv.oo;

public class RegularEmployee extends Employee{
	
	double salary;

	public RegularEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void bonus() {
		this.salary *= 1.15;
	}

	@Override
	public void applyLeaves() {
		System.out.println("2 leaves can be applied");
		
	}

	@Override
	public void transport() {
		System.out.println("cab service available");
		
	}

	@Override
	public void mealCoupon() {
		System.out.println("Rs. 200 coupon for lunch ");
		
	}

}
