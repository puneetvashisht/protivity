package com.ptv;

public class Employee2 {

	// fields
	int id;
	String name;
	double salary;

	// methods
	public void incrementSalary(double byAmount) {

		if(this.salary >=0 && byAmount >= 0) {
			this.salary += byAmount;
		}
		else {
			System.out.println("Negative increments not allowed");
		}
		
		
		
	}

	// generated constructor by using eclipse shortcut
	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	 generated toString by using eclipse shortcut
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(2, "Rahul", 34343.34);
		Employee2 e2 = new Employee2(3, "Taniska", 34333.33);
		
		System.out.println(e1);
		e1.incrementSalary(-5000);
		System.out.println(e1);
		
		System.out.println(e2.toString());

	}

}
