package com.ptv.colls;

import java.util.ArrayList;
import java.util.List;

import com.ptv.Employee;

public class ListDemo4 {

	public static void main(String[] args) {

	
		Employee e1 = new Employee(12, "Ravi", 33333.33);
		Employee e2 = new Employee(23, "Priya", 44444.33);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
		
	
		Employee e = new Employee(12, "Ravi", 33333.33);
		
		System.out.println(e1.equals(e));
		
		System.out.println(employees.contains(e));

	}

}
