package com.nt.Interview;

class HelloException extends Exception{}

class A extends Thread{
	
	public void run() throws HelloException{
		System.out.println("A");
		throw new HelloException();
	}
}
public class Test5 {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.start();
		System.out.println("B");
		
	}
}
