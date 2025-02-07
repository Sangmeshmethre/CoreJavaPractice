package com.nt.Exception;

public class ReturnFinallyExample2 {

	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	
	static int m1() {
		
		try {
			System.out.println("IN try");
			System.out.println(10/0);
		}catch(NullPointerException ne) {
			System.out.println("In catch");
		}finally {
			System.out.println("In finally");
			return 30;
		}
	}
}
