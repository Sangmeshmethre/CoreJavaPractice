package com.nt.interview;

class MyException extends RuntimeException{
	
}
public class Test10 {

	public static void main(String[] args) {
		
		System.out.println("B1");
		throw new MyException();
	}
}
