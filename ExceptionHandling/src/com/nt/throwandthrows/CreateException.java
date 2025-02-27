package com.nt.throwandthrows;

public class CreateException {

	public static void main(String[] args)  {
		System.out.println("throw statement start");
		m1();
		m12();
		System.out.println("throw statment end");
	}
	static void m1() throws ArithmeticException {
		throw new ArithmeticException();
	}
	
	static void m12() throws InterruptedException{
		throw new InterruptedException();
	}
}
