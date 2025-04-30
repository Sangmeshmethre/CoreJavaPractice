package com.nt.Interview;

public class Test7 extends Thread{

	public void run() {
		System.out.println("Run");
	}
	public static void main(String[] args) {
		
		Test7 t = new Test7();
		t.start();
		
		Thread.sleep(6000);
		System.out.println("end");
	}
}
