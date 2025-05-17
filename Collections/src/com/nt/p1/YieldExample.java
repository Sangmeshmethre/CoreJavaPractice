package com.nt.p1;

public class YieldExample extends Thread{

	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+".....");
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		
		YieldExample th = new YieldExample();
		YieldExample th1 = new YieldExample();
		th.start();
		th1.start();
	}
}
