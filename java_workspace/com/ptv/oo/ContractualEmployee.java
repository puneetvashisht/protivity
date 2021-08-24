package com.ptv.oo;

public class ContractualEmployee extends Employee {
	
	double payPerHour;

	public ContractualEmployee(int id, String name, double payPerHour) {
		super(id, name);
		this.payPerHour = payPerHour;
	}

	public ContractualEmployee() {

	}

	@Override
	public String toString() {
		return "ContractualEmployee [payPerHour=" + payPerHour + ", id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void bonus() {
		this.payPerHour += 5000;
	}

	@Override
	public void applyLeaves() {
		System.out.println("1 leave can be applied");
		
	}

	@Override
	public void transport() {
		System.out.println("submit cab bills max to 200");
		
	}

	@Override
	public void mealCoupon() {
		System.out.println("no meal coupons");
		
	}
	
	

}
