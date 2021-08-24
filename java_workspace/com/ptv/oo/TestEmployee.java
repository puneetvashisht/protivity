package com.ptv.oo;

public class TestEmployee {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee(12, "Ravi");

		RegularEmployee re = new RegularEmployee(12, "Ravi", 30000);
		ContractualEmployee ce = new ContractualEmployee(34, "Priya", 2800);
		
		RegularEmployee re1 = new RegularEmployee(1, "Amit", 40000);
		ContractualEmployee ce1 = new ContractualEmployee(4, "Rakshita", 1800);
		
		Employee employees[] = {re, ce, re1, ce1};
		
		for(Employee e : employees) {
			System.out.println(e);
			e.bonus();
			e.applyLeaves();
			e.transport();
			e.mealCoupon();
			System.out.println(e);
		}

	}

}
