package com.ptv.oo;

import java.util.Scanner;

class MyNumber{
	int x;

	public MyNumber(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "MyNumber [x=" + x + "]";
	}
	
}

public class CallByReferenceDemo {
	
	
	// Pass by Value
//	public static void changeNumber(int x) {
//		x += 2;
//		System.out.println("In change Number " + x);
//	}
	
	// Pass by Reference
	public static void changeNumber(MyNumber myNumber) {
		myNumber.x += 2;
		System.out.println("In change Number " + myNumber.x);
	}

	public static void main(String[] args) {
//		int count = 45;
//		changeNumber(count);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		
		MyNumber myNum = new MyNumber(value);
		changeNumber(myNum);
		System.out.println(myNum);

	}

}
