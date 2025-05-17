package com.nt.A;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "sangmeshmethre";
		
		char[] ch = str.toCharArray();
		int count;
		for(int i=0; i<ch.length; i++) {
			count= 0;
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(ch[i]+" ");
			}
		}
	}
}
