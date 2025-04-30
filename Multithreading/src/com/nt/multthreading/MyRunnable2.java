package com.nt.multthreading;

public class MyRunnable2 extends Thread{

	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("run::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		mr.run();
		System.out.println("Run method is excuting");
		mr.start();
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Main::"+i);
		}
	}
}
