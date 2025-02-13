package com.nt.Exception;

public class ExceptionPropagationExample4 {

	public static void main(String[] args) {
		
		System.out.println("In main method start");
		m1();
		System.out.println("In main method end");
		
	}
	static void m1() {
		int a;
		try {
			a = 10;
			System.out.println(a);
		}catch(ArithmeticException ae) {
		      a = 20;
		}catch(NullPointerException npe) {
			System.out.println(a);
		}
		System.out.println(a);
	}
}
