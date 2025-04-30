package com.nt.Interview;

public class Test1 {

	public static void main(String[] args) {
		
		Thread th = new Thread("ok");
		th.start();
		System.out.println("Main");
	}
}
