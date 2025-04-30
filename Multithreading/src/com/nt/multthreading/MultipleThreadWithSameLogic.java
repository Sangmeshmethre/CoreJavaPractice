package com.nt.multthreading;

class MyRunnable6 extends Thread{
	
	int x;
	public MyRunnable6() {
		x = 5;
	}
	public MyRunnable6(int x) {
		this.x = x;
	}
	
	public void run() {
		
		for(int i=0; i<this.x; i++) {
			
			System.out.println(getName()+"Run:"+i);
		}
	}
}
public class MultipleThreadWithSameLogic {

	public static void main(String[] args) {
		
		MyRunnable6 mr1 = new MyRunnable6();
		mr1.start();
		
		MyRunnable6 mr2 = new MyRunnable6(10);
		mr2.start();
		
		MyRunnable6 mr3 = new MyRunnable6(20);
		mr3.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main::"+i);
		}
	}
}
