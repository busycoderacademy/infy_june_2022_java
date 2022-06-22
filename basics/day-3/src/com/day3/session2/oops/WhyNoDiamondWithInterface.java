package com.day3.session2.oops;

interface A{
	int i=55;
	public void foo();
}

interface B{
	int i=55;
	public void foo();
}

class C implements A, B{

	public void foo() {
		System.out.println("foo method is overriden: "+ A.i);
	}
	
}
public class WhyNoDiamondWithInterface {
	
	public static void main(String[] args) {
		B a=new C();
		a.foo();
	}

}
