package com.nt.A;

import java.util.Scanner;
import java.util.Stack;

public class WellFormedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str = sc.nextLine();
		
		paranthisisString(str);
	}
	
	public static void paranthisisString(String str) {
	
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(st.isEmpty()) {
				st.add(ch);
				
			}else if(ch=='(' || ch=='<' || ch=='[' || ch=='{') {
				
				st.add(ch);
				
			}else if(ch==')' && st.peek()=='(' || ch=='>' && st.peek()=='<' || ch==']' && st.peek()=='[' || ch=='}' && st.peek()=='{') {
				
				st.pop();
			}
		}
		if(st.isEmpty()) {
			System.out.println("Well formed string");
		}else {
			System.out.println("Not well formed String");
		}
	}
}
