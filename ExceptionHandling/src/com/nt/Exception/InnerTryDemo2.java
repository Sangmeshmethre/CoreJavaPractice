package com.nt.Exception;

public class InnerTryDemo2 {

	public static void main(String[] args) {
		
		try {
			
			int a = Integer.parseInt(args[0]);
			System.out.println("a::"+a);
			try {
				
				int[] x = new int[a];
				System.out.println("x::"+x.length);
			}catch(NegativeArraySizeException na) {
				int[] y = new int[3];
				System.out.println("y::"+y.length);
			}
			int b = a+20;
			System.out.println("b:"+b);
		}catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("pass one  value");
		}catch(NumberFormatException ne) {
			System.out.println("Pass only int value");
		}
	}
}
