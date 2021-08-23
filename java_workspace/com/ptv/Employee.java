package com.ptv;

// import whatever is not available in the lang/default package
import java.util.Date;

//class
public class Employee {
	// fields
	int id;
	String name;
	double salary;
	Date dateOfjoining;
	
	//methods
	public void incrementSalary(double byAmount) {
		this.salary += byAmount;
	}
	
	public String toString() {
		return "id: " + this.id + " name: " + this.name + " salary: " + this.salary;
	}
	
	//constructor - initialize fields/state
	Employee(int id, String name, double salary){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		// Create objects of Employee
		Employee e = new Employee(12, "Ravi", 33333.33);
//		e.id = 12;
//		e.name = "Ravi";
//		e.salary = 33333.33;
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.toString());
		
		e.incrementSalary(5000);
		System.out.println(e.salary);
		
		
		// Create objects of Employee
				Employee e2 = new Employee(23, "Priya", 44444.33);
//				e2.id = 13;
//				e2.name = "Priya";
//				e2.salary = 44444.33;
				System.out.println(e2.salary);
	}
}