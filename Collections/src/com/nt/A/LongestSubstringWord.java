package com.nt.A;

public class LongestSubstringWord {

	public static void main(String[] args) {
		
		String[] dict = {"CODGE","ODG","LODGES","SODG","dodge","moDJ","LODGESSSS"};
		String tostring = "ODG";
		
		longestWordSubstring(dict, tostring);
	}
	
	public static void longestWordSubstring(String[] dict, String tostring) {
		
		String word = "", lword = "";
		int maxLength = 0;
		for(int i=0; i<dict.length; i++) {
			
			String str = dict[i];
			
			str = str+" ";
			
			for(int j=0; j<str.length(); j++) {
				
				char ch = str.charAt(j);
				
				if(ch !=' ') {
					word = word+ch;
				}else {
					if(word.length() > lword.length()) {
						lword = word;
					}
					word = "";
				}
			}
		}
		for(String word1 :dict) {
			if(word1.contains(tostring)) {
				maxLength = Math.max(maxLength, word1.length());
			}
		}
		System.out.println("Longest substring::"+lword);
		System.out.println("longest substring length::"+maxLength);
	}
}
