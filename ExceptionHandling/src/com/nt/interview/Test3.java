package com.nt.interview;

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			String str = null;
			int result = 10/0;
			System.out.println(str);
			System.out.println(result);
			
		}catch(NullPointerException | ArithmeticException ae) {
			System.out.println("B1");
		}catch(Exception e) {
			System.out.println("B2");
		}
	}
}
