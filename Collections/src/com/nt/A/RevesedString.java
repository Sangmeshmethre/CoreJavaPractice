package com.nt.A;

public class RevesedString {

	public static void main(String[] args) {
		
		String str = "sangmesh";
		
		String rev="";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			rev = ch+rev;
		}
		System.out.println("Revese String::"+rev);
	}
}
