package com.nt.A;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String temp = str;
		
		String rev = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			rev = rev+ch;
		}
		if(temp.equals(rev)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("not palindrome");
		}
	}
}
