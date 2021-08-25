package com.ptv.colls;

import java.util.Comparator;

import com.ptv.Employee;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return  (int)( o1.salary - o2.salary);
	}

}
