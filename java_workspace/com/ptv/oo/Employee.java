package com.ptv.oo;

public abstract class Employee implements EmployeePerks{
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public abstract void bonus(); 
//	public void bonus() {
//	
//	}

}
