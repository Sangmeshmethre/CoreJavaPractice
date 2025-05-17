package com.nt.A;

import java.util.Scanner;

public class AtioFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str =sc.nextLine();
		
		System.out.println("convert String to integer::"+myAtoiFunction(str));
	}
	
	public static int myAtoiFunction(String str) {
		
		int result = 0, i = 0, sing = 1;
		
		if(str==null || str.isEmpty()) {
			return -1;
		}
		
		str = str.trim();
		
		if(str.charAt(0)=='-') {
			sing = -1;
			i++;
		}
		if(str.charAt(0)=='+') {
			i++;
		}
		
		while(i<str.length()) {
			char ch = str.charAt(i);
			
			if(ch<'0' || ch >'9') {
				return -1;
			}
			
			result = result*10+(ch-'0');
			i++;
		}
		return sing*result;
	}
}
