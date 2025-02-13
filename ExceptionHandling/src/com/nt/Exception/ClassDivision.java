package com.nt.Exception;

public class ClassDivision {

	static int div(String[] args) {
		int res = -1;
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			
			res = 4;
		}catch(ArrayIndexOutOfBoundsException aie) {
			res = 5;
		}catch(NumberFormatException ne) {
			res = 6;
		}catch(ArithmeticException ae) {
			res = 7;
		}
		System.out.println("after try/catch");
		
		return res;
	}
	public static void main(String[] args) {
		
		System.out.println(div(args));
	}
}
