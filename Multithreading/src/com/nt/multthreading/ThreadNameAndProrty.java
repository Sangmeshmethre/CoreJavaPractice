package com.nt.multthreading;

class MyThread extends Thread{
	
	MyThread(){
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i=0;i<10; i++) {
			System.out.println(getName()+"i:"+i);
		}
	}
}
public class ThreadNameAndProrty {

	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread("Child2");
		
		System.out.println("mt1 initial name and priorty");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 getPriorty::"+mt1.getPriority());
		System.out.println();
		
		System.out.println("mt2 initial name and priorty");
		System.out.println("mt2 name:"+mt2.getName());
		System.out.println("mt2 priority::"+mt2.getPriority());
		
		System.out.println();
		
		mt1.setName("child1");
		mt1.setPriority(6);
		
		mt2.setPriority(9);
		
		System.out.println();
		
		System.out.println("mt1 name::"+mt1.getName());
		System.out.println("mt1 priority::"+mt1.getPriority());
		
		System.out.println("mt2 name"+mt2.getName());
		System.out.println("mt2 name"+mt2.getPriority());
		System.out.println();
		
		mt1.start();
		mt2.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main::"+i);
		}
	}
}
