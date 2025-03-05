package com.nt.interview;

public class Test2 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			int result = 10/0;
			System.out.println(str);
			System.out.println(result);
		}catch(NullPointerException  | ArithmeticException  | Exception e) { //compile time error
			System.out.println("Ex");
		}
	}
}
