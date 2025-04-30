package com.nt.multthreading;

class PrintNumber{
	
	void print1To50() {
		
		for(int i=0; i<50; i++) {
			
			System.out.println(i+"\t");
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	void print50To1() {
		
		for(int i=50; i>1; i--) {
			
			System.out.println(i+"\t");
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
public class SingleThreadModuleApplication {

	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		
		long time1 = System.currentTimeMillis();
		
		pn.print1To50();
		
		System.out.println();
		
		pn.print50To1();
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("Time taken to complite bouth task::"+((time2-time1)/1000)+"sec");
	}
}
