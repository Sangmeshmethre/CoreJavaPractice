package com.nt.throwandthrows;

class A1{
	void m1() throws InterruptedException{};
}

class B1 extends A1{
	void m1() throws InterruptedException{}
}

class C1 extends A1{
	void m1() {}
}

class D1 extends A1{
	void m1() throws Exception{}
}

class E1 extends A1{
	void m1() {
		super.m1();
	}
}

class F1 {
	static void m2() throws ClassNotFoundException{};
}

class G extends A1{
	/*
	 * void m1() throws ClassNotFoundException { F1.m2(); }
	 */
	/*
	 * void m1() { try { F1.m2(); }catch(ClassNotFoundException e) {} }
	 */
	
	void m1() {
		try {
			F1.m2();
		}catch(ClassNotFoundException e) {
			throw new RuntimeException();
		}
	}
}
public class SuperClassThrows {

}
