package com.nt.Exception;

public class AbNormaTermination {

	static void m1() {
		
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(10/0);
			System.out.println("3");
		}catch(ArithmeticException ae) {
			System.out.println("4");
			
			System.out.println(10/0);
			
			System.out.println("5");
		}
		System.out.println("6");
	}
	public static void main(String[] args) {
		
		m1();
	}
}
