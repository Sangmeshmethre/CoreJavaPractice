package com.nt.codeDecod;

class Dog1{
	public String  name = "Sangmesh";
}
public class ExampleOftrycatch {

	public static void main(String[] args) {
		
		Dog1 dog = null;
		try {
			System.out.println(dog.name);
		}catch(NullPointerException npe) {
			dog = new Dog1();
			System.out.println(dog.name);
		}
	}
}
