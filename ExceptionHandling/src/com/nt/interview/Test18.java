package com.nt.interview;

class Hello18 implements AutoCloseable{
	public void close() {
		System.out.println("CLOSE");
	}
}
public class Test18 {

	public static void main(String[] args) {
		
		try(Hello18 hello = new Hello18();){
			
		}
	}
}
