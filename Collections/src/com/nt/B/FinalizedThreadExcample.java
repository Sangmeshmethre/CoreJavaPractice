package com.nt.B;

public class FinalizedThreadExcample {

	protected void finalized()throws Throwable{
		System.out.println("Finalized Thread");
	}
	public static void main(String[] args) {
		FinalizedThreadExcample example = new FinalizedThreadExcample();
		
		example = null;
		System.gc();
		System.out.println("making object eligible for garbage collected");
	}
}
