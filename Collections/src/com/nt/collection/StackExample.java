package com.nt.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.addElement(10);
		st.addElement(20);
		st.addElement(30);
		st.addElement(40);
		st.addElement(50);
		
		System.out.println(st);
		
		Enumeration<Integer> em = st.elements();
		
		while(em.hasMoreElements()) {
			Integer x = em.nextElement();
			System.out.println(x);
		}
	}
}
