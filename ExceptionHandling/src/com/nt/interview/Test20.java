package com.nt.interview;

class Hello20{
	int show() {
		throw new NullPointerException();
	}
}
public class Test20 {

	public static void main(String[] args) {
		
		Hello20 hello = new Hello20();
		hello.show();
		System.out.println("JLC");
	}
}
