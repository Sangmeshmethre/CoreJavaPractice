package com.nt.multthreading;

public class MyRunnable3 extends Thread{

	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Run::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MyRunnable3 mr = new MyRunnable3();
		mr.start();
		System.out.println("main method::");
		mr.run();
		
		for(int i=0;i<10; i++) {
			System.out.println("main ::"+i);
		}
	}
}
