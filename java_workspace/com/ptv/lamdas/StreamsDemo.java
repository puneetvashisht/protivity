package com.ptv.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import com.ptv.Employee;

public class StreamsDemo {

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
		
		
		// Faster
		
//		Stream<Employee> stream = employees.stream();
		employees.stream().map((e)-> {
			e.incrementSalary(5000);
			return e;
		})
		.filter((e)->e.name.startsWith("R"))
		.forEach((e)->System.out.println(e));
		
		
		// Minimum salaried employees
		OptionalDouble minimumSalary = employees.stream()
		.mapToDouble((e) -> e.salary)
		.min();
		
		if(minimumSalary.isPresent()) {
			System.out.println(minimumSalary.getAsDouble());
		}
		
		// Max ID
		OptionalInt maxId= employees.parallelStream()
		.mapToInt((e)->e.getId())
		.max();
		
		if(maxId.isPresent()) {
			System.out.println(maxId.getAsInt());
		}
		
		
		Optional<Employee> minimumSalariedEmployee = employees.stream()
		.max((o1,o2)-> (int)(o1.salary - o2.salary));
		
		if(minimumSalariedEmployee.isPresent()) {
			System.out.println(minimumSalariedEmployee.get());
		}
		
		
		// sorted employees by salary
		employees.stream()
		.sorted((o1,o2)-> (int)(o1.getId() - o2.getId()))
		.forEach((e)-> System.out.println(e));
				
				
		employees.parallelStream()
		.filter(e -> e.salary>30000)
		.forEach(e -> System.out.println(e));
		
//		.forEach((e)->System.out.println(e));
		
		
		
		// Imperative
//		for(Employee e : employees) {
////			1. increment salary of employee
//				e.incrementSalary(5000);
////			2. filter employees having first name as R
//				if(e.name.startsWith("R"))
////			3. print out those employees
//				{
//					System.out.println(e);
//				}
//		}

	}

}
