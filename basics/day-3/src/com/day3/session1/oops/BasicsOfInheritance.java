package com.day3.session1.oops;

//A <--B
class A {
	private int i;

	 A(int i) {
		this.i = i;
		
	}

	public void show() {
		System.out.println("showing the value of i: " + i);
	}
}

class B extends A {
	private int j;

	B(int i, int j) {
		super(i);// super() is used to pass the value of parameters to the base class from drived
					// ctr
		this.j = j;
	}

	public void show() {
		super.show();// hence prove that inherance provide code resuablity
		System.out.println("showing the value of j: " + j);
	}
}

class C extends B {
	private int k;

	C(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	public void show() {
		super.show();
		System.out.println("showing the value of k: " + k);
	}
}

public class BasicsOfInheritance {

	public static void main(String[] args) {
		C c = new C(3, 4,6);
		c.show();
	}
}
