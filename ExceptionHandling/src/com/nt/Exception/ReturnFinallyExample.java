package com.nt.Exception;

public class ReturnFinallyExample {

	public static void main(String[] args) {
		
		System.out.println(m1());
	}
		
		static int m1(){
			
			try {
				System.out.println("In try");
				return 10;
			}catch(Exception e) {
				System.out.println("In catch");
				return 20;
			}finally {
				System.out.println("In finally");
				return 30;
			}
	}
}
