package com.nt.Exception;

public class InnerFinallyExample3 {

	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	
	static int m1() {
		
		try {
			System.out.println("In outer try");
			
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}catch(NullPointerException ne) {
				System.out.println("In inner catch");
			}finally {
				System.out.println("In inner finally");
				return 20;
			}
		}catch(NullPointerException ne) {
			System.out.println("In out catch");
		}finally {
			System.out.println("In outer finally");
			return 30;
		}
	}
}
