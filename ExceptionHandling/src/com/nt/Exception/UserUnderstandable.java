package com.nt.Exception;

public class UserUnderstandable {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int c = a/b;
			
			System.out.println("C values::"+c);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please pass at least two integer");
		}catch(NumberFormatException ne) {
			System.out.println("please pass only integer values");
		}catch(ArithmeticException ae) {
			System.out.println("Don't pass second value as  zero");
		}
	}
}
