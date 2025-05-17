package com.nt.A;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 121;
		
		int temp = number;
		
		int rev = 0;
		
		while(number > 0) {
			
			int digit = number % 10;
			rev = rev*10+digit;
			number = number/10;
		}
		
		if(temp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
