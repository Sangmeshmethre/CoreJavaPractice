package com.nt.A;

import java.util.ArrayList;

public class PrefixeSearch {

	public static void main(String[] args) {
		
		String[] str = {"apple", "applet", "bread", "apear"};
		String tostring = "app";
		
		searchPrefixe(str, tostring);
	}
	
	public static void searchPrefixe(String[] str, String tostring) {
		
		ArrayList list = new ArrayList();
		
		for(String word:str) {
			if(word.startsWith(tostring)) {
				list.add(word);
			}
		}
		System.out.println("list of search prefixe::"+list);
	}
}
