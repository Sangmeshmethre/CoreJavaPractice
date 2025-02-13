package com.nt.Exception;

public class ExceptionPropagationException6 {

	public static void main(String[] args) {
		
		System.out.println("In main method start");
		m1();
		System.out.println("In main method end");
	}
	
	public static int m1() {
		try {
			System.out.println("In try");
			return 10;
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		//System.out.println("tyr/catch");
	}
}
