package com.nt.interview;

class MyException extends RuntimeException{
	
}
public class Test11 {

	public static void main(String[] args) {
		
		System.out.print("St1 ");
		MyException ex = null;
		throw ex;
	}
}
