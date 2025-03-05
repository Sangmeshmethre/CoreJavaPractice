package com.nt.interview;

class Hello1{
	int show() {
		throw new ArithmeticException();
	}
}
public class Test6 {

	public static void main(String[] args) {
		
		Hello1 hello = new Hello1();
		int a = hello.show();
		System.out.println(a);
	}
}
