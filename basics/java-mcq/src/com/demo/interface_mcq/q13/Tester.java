package com.demo.interface_mcq.q13;

interface Demo {
	void demoOne();

	void demoTwo();
}

abstract class Child implements Demo {
	public void demoOne() {
		System.out.println("demoOne executed");
	}
}

class SubChild extends Child {
	public void demoTwo() {
		System.out.println("demoTwo executed");
	}
}

public class Tester {
	public static void main(String args[]) {
		Child child = new SubChild();
		child.demoTwo();
	}

}