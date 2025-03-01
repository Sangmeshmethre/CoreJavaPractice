package com.nt.codeDecod;

public class StackTraceExceple {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
