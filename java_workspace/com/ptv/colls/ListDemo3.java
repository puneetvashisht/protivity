package com.ptv.colls;

import java.util.ArrayList;
import java.util.List;

class Fruit{
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	 public boolean equals(Object obj) {
		 Fruit f = (Fruit) obj;
	        return (this.name.equals(f.name));
	 }
	
}

public class ListDemo3 {
	
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("mango"));
		fruits.add(new Fruit("pineapple"));
		
		System.out.println(fruits);
		
		Fruit f1 = new Fruit("apple");
		Fruit f2 = new Fruit("apple");
		System.out.println(f1.equals(f1));
		
		System.out.println(fruits.contains(new Fruit("apple")));
		
		
//		List<String> fruits = new ArrayList<>();
//		fruits.add("apple");
//		fruits.add("mango");
//		fruits.add("pineapple");
//		
//		System.out.println(fruits.contains("apple"));
	}

}
