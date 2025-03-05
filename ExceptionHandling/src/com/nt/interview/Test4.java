package com.nt.interview;


class Hello{
	int show() {
		throw new  ArithmeticException();
		return 0;
	}
}
 public class Test4 {

	 public static void main(String[] args) {
		
		 Hello hello = new Hello();
		 int a = hello.show();
		 System.out.println("a::"+a);
	}
 }
 
