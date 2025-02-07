package com.nt.Exception;

public class FinallyExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("In try");
		}catch(ArithmeticException ae) {
			System.out.println("in Catch");
		}finally {
			System.out.println("In finally");
		}
	}
}
