package com.ptv.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ptv.Employee;

//@FunctionalInterface
//interface Condition{
//	boolean test(Employee e);
//}

public class TestImperative {
	
	public static void printEmployees(List<Employee> employees , Predicate<Employee> p, Consumer<Employee> c) {
		for(Employee e : employees) {
			if(p.test(e)) {
				c.accept(e);
			}
		}
	}

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
		
		
		// prints all the Employees start with 'R' as thr first name
		System.out.println("-- Printing all employees starting with R as first name -- ");
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.name.startsWith("R");
//			}
//		});
		printEmployees(employees, (e)-> e.name.startsWith("R"), (e)->System.out.println(e));
		
		
		// print all Employees having salary more then 30000
		
		System.out.println("-- Printing all employees having salary more then 30000 -- ");
		printEmployees(employees, (e)-> e.salary > 30000, (e)->System.out.println(e));
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.salary > 30000;
//			}
//		});
//		for(Employee e : employees) {
//			if(e.salary > 30000) {
//				System.out.println(e);
//			}
//		}
		
		
		// print all Employees
		
		System.out.println("-- Printing all employees  -- ");
		printEmployees(employees, (e)-> true, (e)->System.out.println(e));
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return true;
//			}
//		});
		
		
		Function<String,Integer> findStringLength = (s) -> s.length(); 
		
		System.out.println(findStringLength.apply("abcd"));
	}

}
