package com.nt.Interview;

public class Test6 extends Thread {

	public void run() {
		System.out.println("Main");
	}
	
	public static void main(String[] args) {
		
		Test6 t = new Test6();
		t.run();
	}
}
