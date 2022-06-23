package com.day5.session1.object_class_methods;

class A {
	static int i = 55;

	public static void foof(){
		System.out.println("public static foof A");
	 }

}

class B extends A {
	static int i = 550;

	public static void foof(){
		System.out.println("public static foof B");
	 }

	public void print() {
		System.out.println(i);
	}
}

public class ShadowingConcept {

	public static void main(String[] args) {
		A a=new B();
		a.foof();
	}
}
