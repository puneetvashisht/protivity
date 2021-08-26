package com.ptv.lamdas;

public class TestGreeting {

	public static void main(String[] args) {
		// Explicit class
		Greeter greeter  = new EnglishGreeter();
		System.out.println(greeter.greet());
		
		// Anonymous
		Greeter japaneseGreeter = new Greeter() {
			@Override
			public String greet() {
				return "Ohio gozimasu!!";
			}
		};
		System.out.println(japaneseGreeter.greet());
		
		// Lamda
		Greeter greeterLamda = () -> "Bounjour!!";
		System.out.println(greeterLamda.greet());
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Running under thread: " + Thread.currentThread().getName());
			}
			
		});
		t.start();
		
		Thread t2 = new Thread(()->System.out.println("Running under thread: " + Thread.currentThread().getName()));
		t2.start();

	}

}
