package com.nt.multthreading;

class AddThread extends Thread{
	
	int sum = 0;
	
	public void run() {
		for(int i=0; i<50; i++) {
			sum = sum+i;
			System.out.println("Summation :"+sum);
		}
	}
}

class SubThread extends Thread{
	
	int sub = 0;
	public void run() {
	for(int i=0; i<50; i++) {
		sub = sub-i;
		System.out.println("Substraction:"+sub);
	}
	}
}
public class MultipleThreadWithDifferentLogic {

	public static void main(String[] args) {
		
		System.out.println("main started::");
		
		AddThread ad = new AddThread();
		ad.start();
		
		System.out.println();
		
		SubThread sd = new SubThread();
		sd.start();
		
		System.out.println("main exicute");
	}
}
