package com.nt.B;

public class FinalyExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("finaly block");
			System.exit(0);
		}finally{
			System.out.println("Final block execute always");
		}
	}
}
