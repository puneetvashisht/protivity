package com.ptv;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
//		int scores[] = {23, 34, 45,67,78,98};
		int scores[] = new int[4];
		
		scores[0] = 34;
		scores[1] = 35;
		
		
		Employee2 e1 = new Employee2(2, "Rahul", 34343.34);
		Employee2 e2 = new Employee2(3, "Taniska", 34333.33);
		
		Employee2 employees[] = {e1, e2};
		
		
		for(Employee2 e: employees) {
			System.out.println(e);
			e.incrementSalary(5000);
			System.out.println(e);
		}
		
//		System.out.println(scores[0]);
//		System.out.println(scores[6]);
		
//		for(int i=0; i<=scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		
		
		//enhanced version
		for(int score: scores) {
			System.out.println(score);
		}
	}

}
