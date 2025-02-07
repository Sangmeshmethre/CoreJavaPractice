package com.nt.Logical;

public class AlphanumericString {

	public static void main(String[] args) {
		
		String alphaNumericString = "a1b2c3d4";
		
		String numericString = alphaNumericString.replaceAll("\\D", "");
		
		int number = Integer.parseInt(numericString);
		
		System.out.println("AlphaNumeric string::"+alphaNumericString);
		System.out.println("Extracted Number::"+number);
		System.out.println();
		
		//Approach --2::
		
		StringBuilder sb = new StringBuilder();
		
		for(char c:alphaNumericString.toCharArray()) {
		
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		
		int number1 = 0;
		
		for(int i=0; i<sb.length(); i++) {
			
			number1 = number1*10+(sb.charAt(i)-'0');
		}
		
		System.out.println("AlphNumeric String::"+alphaNumericString);
		System.out.println("Extracted number::"+number1);
	}
}
