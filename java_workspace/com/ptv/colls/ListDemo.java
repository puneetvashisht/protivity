package com.ptv.colls;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {

		// Fixed in size
//		int scores[] = {1,2,3};
//		int scores[] = new int[3];
//		scores[5] = 4;
//		System.out.println(scores.length);
//		System.out.println(scores);
		
		ArrayList scores = new ArrayList();
		scores.add(1);scores.add(2);scores.add(3);
		System.out.println(scores.size());
		scores.add(4);scores.add(5);
		System.out.println(scores.size());
		
		

	}

}
