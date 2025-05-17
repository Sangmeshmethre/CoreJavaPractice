package com.nt.A;

import java.util.Scanner;

public class ExpandingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str = sc.nextLine();
		
		expandingCharacter(str);
	}
	
	public static void expandingCharacter(String str) {
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}else {
				int x = Character.getNumericValue(str.charAt(i));
				
				for(int j=1; j<x; j++) {
					System.out.println(str.charAt(i-1));
				}
			}
		}
	}
}
