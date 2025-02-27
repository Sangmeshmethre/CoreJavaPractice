package com.nt.throwandthrows;

class A{
	void m1() {}
}
class B extends A{
	void m1() {}
}
class C extends A{
	void m1() throws RuntimeException{
		
	}
}
class D extends A{
	void m1() throws Exception{};
}
public class OverridingDemo {

}
