package com.nt.throwandthrows;

public class ThrowsExample {

	static void m1() throws ArithmeticException {
		throw new ArithmeticException();
	}
	
	static void m11() {
		try {
		throw new InterruptedException();
		}catch(InterruptedException ie) {
			System.out.println("Thread is sleep that time you will get this exception");
		}
		
		static void m12() throws Excepion{
			throw new Exception();
		}
	}
	public static void main(String[] args) {
		System.out.println("throws start");
		m1();
		m11();
		m12();
		System.out.println("throws end");
	}
}
