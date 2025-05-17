package com.nt.A;

import java.util.Scanner;

public class PalindromeMaximumLength {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		palindromeMaximumLength(str);
	}
	public static void palindromeMaximumLength(String str) {
		
		String word = "", pal = "";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				word = str.substring(i,j);
				String rev = "";
				for(int k=0; k<word.length(); k++) {
					char ch = word.charAt(k);
					
					rev = ch+rev;
				}
				
				if(word.equals(rev) && word.length() > pal.length()) {
					pal = word;
				}
			}
		}
		System.out.println("Palindrome::"+pal);
		System.out.println("Palindrome length;:"+pal.length());
	}
}
