package com.nt.codeDecod;

public class UnreachbleException {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch(Exception e) {                                 //Generic exception we can call
			System.out.println("super calss exception");
		}catch(ArithmeticException ae) {
			System.out.println("Do not enter second value as zero");
		}
	}
}
