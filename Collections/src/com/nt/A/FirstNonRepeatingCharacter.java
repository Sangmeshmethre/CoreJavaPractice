package com.nt.A;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		firstNonRepeatingCharacter(str);
	}
	
	public static void firstNonRepeatingCharacter(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entryset:map.entrySet()) {
			
			if(entryset.getValue()==1) {
				System.out.println(entryset.getKey()+"="+entryset.getValue());
				break;
			}
		}
	}
}
