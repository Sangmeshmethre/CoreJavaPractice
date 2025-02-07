package com.nt.Exception;

public class Addition {

	public static void main(String[] args) {
		
		try {
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int c = a/b;
			
			System.out.println("Result::"+(a+b));
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Result::"+(4+5));
		}catch(NumberFormatException ne) {
			System.out.println("Result::"+(6+7));
			
		}catch(ArithmeticException ae) {
			System.out.println("Result::"+(8+9));
		}
	}
}
