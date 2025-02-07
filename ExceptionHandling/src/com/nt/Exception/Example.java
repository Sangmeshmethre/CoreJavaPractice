package com.nt.Exception;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		}catch(someexception se) {   //Error
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			System.out.println("9");
		}
	}
}
