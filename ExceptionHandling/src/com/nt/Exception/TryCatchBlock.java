package com.nt.Exception;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println("try1");
		}catch(Exception e) {
			System.out.println("catch1");
		}
		
		System.out.println("try/catch1");
		
		try {
			System.out.println("try2");
		}catch(Exception e) {
			System.out.println("catch2");
		}
		
		System.out.println("try/catch2");
	}
}
