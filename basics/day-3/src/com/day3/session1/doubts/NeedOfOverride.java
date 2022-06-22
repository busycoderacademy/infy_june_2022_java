package com.day3.session1.doubts;

class A{
	void foo() {
		System.out.println("foo method of base class");
	}
}
class B extends A{
	//actually i want to overriding by mistake i have don overloading
	//i dont want to do mistake even by mistake
	
	@Override
	void foo() {
		System.out.println("foo method of drived class");
	}
}

public class NeedOfOverride {
	
	public static void main(String[] args) {
		A a=new B();
		a.foo();
	}

}
