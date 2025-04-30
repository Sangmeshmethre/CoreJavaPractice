package com.nt.multthreading;

public class MyRunnable5 extends Thread{

	public void run() {
		
		for(int i=0; i<30; i++) {
			System.out.println(getName()+"Run::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MyRunnable5 mr1 = new MyRunnable5();
		mr1.start();
		
		System.out.println("main");
		
		MyRunnable5 mr2 = new MyRunnable5();
		mr2.start();
		
		MyRunnable5 mr3 = new MyRunnable5();
		mr3.start();
	}
}
