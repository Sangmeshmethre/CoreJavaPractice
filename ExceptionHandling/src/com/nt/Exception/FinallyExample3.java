package com.nt.Exception;

public class FinallyExample3 {

	public static void main(String[] args) {
		
		try {
			System.out.println("In try");
			System.out.println(20/0);
		}catch(NumberFormatException ne) {
			System.out.println("in catch");
		}finally {
			System.out.println("in finally");
		}
	}
}
