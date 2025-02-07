package com.nt.Exception;

public class FinallyException2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("In try");
			System.out.println(20/0);
		}catch(ArithmeticException ae) {
			System.out.println("Do not pass zero::in catch");
		}finally {
			System.out.println("In finally");
		}
	}
}
