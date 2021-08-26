package com.ptv.colls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ptv.Employee;


public class ListDemo4 {

	public static void main(String[] args) {

	
		Employee e1 = new Employee(12, "Ravi", 33333.33);
		Employee e2 = new Employee(23, "Priya", 3333.33);
		Employee e3 = new Employee(2, "Rahul", 14343.34);
		Employee e4 = new Employee(3, "Taniska", 24333.33);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees);
		
		// natural criteria
		Collections.sort(employees);
		
		System.out.println("--- employees sorted natural ordering ----");
		System.out.println(employees);
		
		Collections.sort(employees, new SalaryComparator());
		System.out.println("--- employees sorted any other field ----");
		System.out.println(employees);
		
		
		// Anonymous class
//		Collections.sort(employees,new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
//		
//		System.out.println("--- employees sorted by name using anonymous class ----");
//		System.out.println(employees);
		
		
		// Using lamda
		
		Collections.sort(employees, (o1,o2)-> o1.name.compareTo(o2.name));
		
		System.out.println("--- employees sorted by name using lamdas ----");
		System.out.println(employees);
		
//		Employee e = new Employee(12, "Ravi", 33333.33);
//		
//		System.out.println(e1.equals(e));
//		
//		System.out.println(employees.contains(e));

	}

}
