package com.day4.revision_oops;

class A {
	void foo() {
		System.out.println("foo of A");
	}
}

class B extends A {
	void bar() {
		System.out.println("bar of B");
	}
}

class C extends A {
	void koo() {
		System.out.println("koo of C");
	}
}

public class AllAboutCasting {

	public static void main(String[] args) {

		byte a=2;
		
		//byte b=(byte) (a+1);
		byte b=a++;
		
		
		
//		int i=4;
//		long j=i;
		
		
//		A a1 = new B();// nauural upcasting
//
//		B a2 = (B) a1;
//		a2.bar();
//		// safe way to deal with casting- instanceOf operator
//
//		if (a1 instanceof C) {
//			C a3 = (C) a1;
//			a3.koo();
//		} else
//			System.out.println("it is not allowed");
	}

}
