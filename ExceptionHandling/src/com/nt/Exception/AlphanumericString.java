package com.nt.Exception;

public class AlphanumericString {

	public static void main(String[] args) {
		
		String str = "1a2b3c4d";
		
		String alphnumeric = str.replaceAll("\\D", "");
		
		int number = Integer.parseInt(alphnumeric);
		
		System.out.println("str::"+str);
		System.out.println("Alphnumeric:::"+alphnumeric);
		System.out.println("Number::"+number);
	}
}
