package com.ptv;

public class Employee2 {

	// fields
	int id;
	String name;
	private double salary;
	
	Address address;


	public Employee2() {
		super();
	}
	
	// generated constructor by using eclipse shortcut
		public Employee2(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

	public Employee2(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0)
			this.salary = salary;
	}

	// methods
	public void incrementSalary(double byAmount) {

		if(this.salary >=0 && byAmount >= 0) {
			this.salary += byAmount;
		}
		else {
			System.out.println("Negative increments not allowed");
		}
		
		
		
	}

	

//	 generated toString by using eclipse shortcut

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(2, "Rahul", 34343.34);
		Employee2 e2 = new Employee2(3, "Taniska", 34333.33);
		
		System.out.println(e1);
		e1.incrementSalary(-5000);
		System.out.println(e1);
		
		System.out.println(e2.toString());

	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
