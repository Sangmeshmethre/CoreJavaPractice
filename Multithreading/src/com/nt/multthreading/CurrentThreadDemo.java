package com.nt.multthreading;

public class CurrentThreadDemo {

	static {
		
		System.out.println("In SB");
		
		Thread th = Thread.currentThread();
		System.out.println("Static Block is exicuting in\""+th.getName()+"\"thread\n");
	}
	
	public static void main(String[] args) {
		
		System.out.println("\nln main method");
		
		Thread th = Thread.currentThread();
		
		System.out.println();
		System.out.println("Original name and priority of main thread");
		System.out.println("current thread name::"+th.getName());
		System.out.println("current thread priority::"+th.getPriority());
		
		th.setName("xxx");
		th.setPriority(7);
		
		System.out.println("original name and priority of main thread");
		System.out.println("current thread name::"+th.getName());
		System.out.println("current thread priority::"+th.getPriority());
	}
}
