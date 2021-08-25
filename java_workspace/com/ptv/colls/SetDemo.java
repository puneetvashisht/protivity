package com.ptv.colls;

import java.util.Set;
import java.util.TreeSet;

import com.ptv.Employee;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		fruits.add("apple");
//		fruits.add("mango");
//		fruits.add("pineapple");
//		fruits.add("apple");
//		System.out.println(fruits);
		;
		System.out.println(Employee.getCompanyName());
		
		
		Employee e1 = new Employee(12, "Ravi", 33333.33);
		e1.getCompanyName();
		Employee e5 = new Employee(12, "Ravi", 33333.33);
		Employee e2 = new Employee(23, "Priya", 3333.33);
		Employee e3 = new Employee(2, "Rahul", 14343.34);
		Employee e4 = new Employee(3, "Taniska", 24333.33);
		
		// unordered
//		Set<Employee> employees = new HashSet<>();
		
		// keeps insertion order
//		Set<Employee> employees = new LinkedHashSet<>();
		
		// sorted by natural ordering
		Set<Employee> employees = new TreeSet<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println(employees);
		System.out.println(employees.size());

	}

}
