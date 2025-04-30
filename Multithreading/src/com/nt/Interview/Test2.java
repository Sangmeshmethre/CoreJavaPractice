package com.nt.Interview;

public class Test2 {

	public static void main(String[] args) {
		
		Thread th = new Thread("OK");
		th.run();
		th.start();
		System.out.println("main");
		
	}
}
