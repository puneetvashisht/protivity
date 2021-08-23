package com.ptv.oo;

import com.ptv.Employee2;

public class Employee2Test {


public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(2, "Rahul", 34343.34);
		Employee2 e2 = new Employee2(3, "Taniska", 34333.33);
		
//		System.out.println(e1.salary);
		e1.setSalary(-99999);
		
		System.out.println(e1);
		System.out.println(e1.getSalary());
		System.out.println(e1);
		e1.incrementSalary(-5000);
		System.out.println(e1);
		
		System.out.println(e2.toString());

	}

}
