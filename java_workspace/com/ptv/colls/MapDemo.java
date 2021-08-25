package com.ptv.colls;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ptv.Employee;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employeeMap= new TreeMap<>();
		
//		insertion order of keys
//		Map<Integer, Employee> employeeMap= new LinkedHashMap<>();
		
		// unordered by keys
//		Map<Integer, Employee> employeeMap= new HashMap<>();
		
		employeeMap.put(987654321, new Employee(12, "Ravi", 33434.34));
		employeeMap.put(987654320, new Employee(2, "Priya", 33434.34));
		employeeMap.put(987654322, new Employee(45, "Rahul", 33434.34));
		employeeMap.put(987654322, new Employee(34, "Rahul", 33434.34));
		
		System.out.println(employeeMap);
		
		Set<Integer> keys = employeeMap.keySet();
		System.out.println(keys);
		
		for(Integer key: keys) {
			System.out.println(employeeMap.get(key));
		}
		
//		for()

	}

}
