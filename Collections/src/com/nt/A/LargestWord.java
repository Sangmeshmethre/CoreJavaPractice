package com.nt.A;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		str =str+" ";
		
		String word = "", lword="";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(word.length() > lword.length()) {
					lword = word;
				}
				
				word = "";
			}
		}
		System.out.println(lword);
	}
}
