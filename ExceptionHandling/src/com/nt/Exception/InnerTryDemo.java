package com.nt.Exception;

public class InnerTryDemo {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("In outer try");
			
			try {
				System.out.println("In Inner try");
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
				System.out.println("In Inner catch");
			}
		}catch(ArithmeticException ae) {
			System.out.println("In Inner outer Demo");
		}
		System.out.println("After outer try/catch");
	}
}
