package com.nt.B;

import java.io.FileReader;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		try(FileReader file = new FileReader("file.txt")){
			System.out.println("try-with resource");
		}catch(Exception e) {
			System.out.println("error::"+e.getMessage());
		}
	}
}
