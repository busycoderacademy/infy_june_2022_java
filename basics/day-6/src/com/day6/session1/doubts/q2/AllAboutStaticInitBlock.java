package com.day6.session1.doubts.q2;
class A{
	static {
		System.out.println("static block of class A");
	}
	public void foo() {
		System.out.println("foo of class A");
	}
	
	public static void fooStatic() {
		System.out.println("foo of class A");
	}
	
}
public class AllAboutStaticInitBlock {
	
	static {
		System.out.println("hello to all");
	}
	//is the starting point of exection prog...
	public static void main(String[] args) {
		A a=new A();
	}

}
