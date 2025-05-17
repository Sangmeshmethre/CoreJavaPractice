package com.nt.A;

public class MinimumDistanceOfWord {

	public static void main(String[] args) {
		
		String str = "the quick the brown quick brown the frog";
		String word1 = "quick";
		String word2 = "frog";
		
		minimumDistance(str, word1, word2);
	}
	
	public static void minimumDistance(String str, String word1, String word2) {
		
		int min_dist = Integer.MAX_VALUE;
		int lastIndex1 = -1;
		int lastIndex2 = -1;
		
		String[] word = str.split(" ");
		
		for(int i=0; i<word.length; i++) {
			
			if(word[i].equals(word1)) {
				lastIndex1 = i;
				if(lastIndex1 != -1) {
					min_dist = Math.min(min_dist, Math.abs(lastIndex1-lastIndex2));
				}
			}
			if(word[i].equals(word2)) {
				lastIndex2 = i;
				if(lastIndex2 != -1) {
					min_dist = Math.min(min_dist, Math.abs(lastIndex2-lastIndex1));
				}
			}
		}
		System.out.println("minimum Distance of two word::"+min_dist);
	}
}
