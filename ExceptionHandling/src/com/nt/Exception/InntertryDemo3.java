package com.nt.Exception;

public class InntertryDemo3 {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a :"+a);
			
			try {
				int[] x = new int[a];
				System.out.println("x:"+x.length);
			}catch(NullPointerException np) {
				System.out.println("NPE raise");
			}
			
			int b = a+20;
			System.out.println("b:"+b);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Pass one value");
		}catch(NumberFormatException nf) {
			System.out.println("Pass one int value");
		}
		/*catch(NegativeArraySizeException ns) {
			int[] y = new int[3];
			System.out.println("In outer try array size:"+y.length);
		}*/
		System.out.println("After outer try/catch");
	}
}
