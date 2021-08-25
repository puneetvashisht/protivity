package com.ptv.colls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(0,"four");
		list.add("eight");
		System.out.println(list.get(1));
		
		for(String o : list) {
			System.out.println(o.charAt(0));
		}
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
//		list.remove(0);
//		System.out.println(list);
		
//		for(Object o : list) {
//			System.out.println(o);
//			String s = (String)o;
//			System.out.println(s.charAt(0));
//		}
		
//		System.out.println(list.contains("five"));
		;
		
		

	}

}
