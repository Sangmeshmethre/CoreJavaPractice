package com.nt.A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestNonRepeatingSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		longestNonRepeatingSubstring(str);
	}
	
	public static void longestNonRepeatingSubstring(String str) {
		
		String largeString = null;
		int largeLength = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			
			if(map.size() > largeLength) {
				largeLength = map.size();
				largeString = map.keySet().toString();
			}
		}
		System.out.println("Largest substring::"+largeString);
		System.out.println("Largest substring length::"+largeLength);
	}
}
