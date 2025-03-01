package com.nt.codeDecod;

public class MultipleCatchblock {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[5];
			arr[10] = 30/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception cunght::"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBoundException ::"+ai.getMessage());
		}
	}
}
