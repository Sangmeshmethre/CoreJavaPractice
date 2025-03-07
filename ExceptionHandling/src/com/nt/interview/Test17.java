package com.nt.interview;

public class Test17 {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 13/0;
		}catch(Exception e) {
			System.out.println("Ex");
		}catch(ArithmeticException e) {
			System.out.println("AEx");
		}
	}
}
