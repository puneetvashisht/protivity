package com.ptv.colls;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> weekdays = new PriorityQueue<>();
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		
		for(String weekday: weekdays) {
			System.out.println(weekday);
		}
		
		
		

	}

}
