package com.nt.p1;

public class FinalizedExample {

	@Override
	protected void finalize()throws Throwable{
		System.out.println("Finalized run for garbage collector");
	}
	
	public static void main(String[] args) {
		FinalizedExample example = new FinalizedExample();
		example=null;
		System.gc();
	}
}
