package a.b.d;

import a.b.c.A;

public class B extends A {

	public static void main(String[] args) {
		B b=new B();
		b.fooProtected();
		b.fooPublic();
		
	}
}
