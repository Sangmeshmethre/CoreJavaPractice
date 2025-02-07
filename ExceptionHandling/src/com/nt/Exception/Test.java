package com.nt.Exception;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			
			System.out.println("get message out put");
			System.out.println(ae.getMessage());
			System.out.println("===================\n");
			
			System.out.println("toString() mehtod out put");
			System.out.println(ae.toString());
			System.out.println("-========================\n");
			
			System.out.println("printStackTrace method output");
			ae.printStackTrace();
			System.out.println("==================\n");
			System.out.println("JVM default output");
			
			throw ae;
		}
	}
}
