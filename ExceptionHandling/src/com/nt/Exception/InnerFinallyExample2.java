package com.nt.Exception;

public class InnerFinallyExample2 {

	public static void main(String[] args) {
		
		m1();
	}
	
	static void m1() {
		try {
			System.out.println("In outer try");
			
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}catch(NullPointerException ne) {
				System.out.println("In innter catch");
			}finally {
				System.out.println("In inner finally");
			}
			
		}catch(NullPointerException ne) {
			System.out.println("In Outer catch");
		}finally {
			System.out.println("In outer finally");
		}
	}
}
