package com.ptv.colls;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add(0,"three");
		list.add(0,"four");
		System.out.println(list.get(1));
		
		for(String o : list) {
			System.out.println(o.charAt(0));
		}
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
//		for(Object o : list) {
//			System.out.println(o);
//			String s = (String)o;
//			System.out.println(s.charAt(0));
//		}
		
		System.out.println(list.contains("five"));
		;
		
		

	}

}
