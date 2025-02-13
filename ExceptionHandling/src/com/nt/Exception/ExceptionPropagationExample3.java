package com.nt.Exception;

public class ExceptionPropagationExample3 {

	public static void main(String[] args) {
		
		System.out.println("In main method start");
		try {
			m1();
		}catch(ArithmeticException ae) {
			System.out.println("In main catch");
		}
	}
	static void m1() {
		System.out.println("In m1() method start");
		System.out.println(10/0);
		System.out.println("In m1() method end");
	}
}
