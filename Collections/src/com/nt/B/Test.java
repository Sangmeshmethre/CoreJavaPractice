package com.nt.B;

class Hello implements AutoCloseable{
	public void close() {
		System.out.println("JBL");
	}
}
public class Test {

	public static void main(String[] args) {
		
		try(Hello h = new Hello();){
			
		}
	}
}
