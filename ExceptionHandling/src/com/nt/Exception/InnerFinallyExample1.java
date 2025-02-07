package com.nt.Exception;

public class InnerFinallyExample1 {

	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	static int m1() {
		
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
			}catch(NullPointerException ne) {
				System.out.println("IN inner catch");
			}finally {
				System.out.println("In inner try");
				return 10;
			}
			///System.out.println("Ater inner try/catch/finally");
			
		}catch(NullPointerException ne) {
			System.out.println("In outer catch");
		}finally {
			System.out.println("In Outer finally");
			return 30;
		}
		
	}
}
