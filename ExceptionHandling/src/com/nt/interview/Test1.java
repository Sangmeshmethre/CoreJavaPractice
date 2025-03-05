package com.nt.interview;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			int res = Integer.parseInt("JLC");
			System.out.println("result::"+res);
		}catch(NumberFormatException ne) {
			int  x = 10/0; //Not called by x that's why Runtime Exception 
			System.out.println("NFEx");
		}catch(ArithmeticException ae) {
			System.out.println("AEx");
		}
	}
}
