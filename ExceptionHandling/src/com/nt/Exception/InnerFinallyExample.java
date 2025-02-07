package com.nt.Exception;

public class InnerFinallyExample {

	public static void main(String[] args) {
		
		m1();
	}
	
	static void m1() {
		
		try {
			System.out.println("In outer try");
			
			try {
				System.out.println("In Inner try");
			}catch(NullPointerException ne) {
				System.out.println("In Inner catch");
			}finally {
				System.out.println("In finally");
			}
		}catch(NullPointerException ne) {
			System.out.println("In outer Catch");
		}finally {
			System.out.println("IN outer finally");
		}
	}
}
