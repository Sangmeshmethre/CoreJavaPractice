package com.nt.Exception;

public class ReturnFinallyExample5 {

	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	
	static int m1() {
		
		try {
			System.out.println("In try");
			return 10;
		}catch(ArithmeticException ae) {
			System.out.println("Catch ");
			return 20;
			
		}finally {
			System.out.println("finally");
			return 30;
		}
		//System.out.println("After try/catch/finally::");
	}
}
