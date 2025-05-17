package com.nt.A;

import java.util.Scanner;

public class PrintThreeWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		str = str+" ";
		String word ="";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(word.length()==3) {
					System.out.println(word);
				}
				word="";
			}
		}
	}
}
