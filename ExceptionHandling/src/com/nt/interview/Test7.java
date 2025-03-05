package com.nt.interview;

class Hello2{
	long getPhone(String sid) {
		if(sid != null) {
			return 8105815599L;
		}else {
			throw new NullPointerException();
		}
	}
}
public class Test7 {

	public static void main(String[] args) {
		
		Hello2 hello = new Hello2();
		long a = hello.getPhone("");
		System.out.println(a);
	}
}
