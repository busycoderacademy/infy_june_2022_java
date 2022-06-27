package com.demo.interface_mcq.diamond_pl;
interface A{
	public default void foo() {
		System.out.println("foo method of interface A");
	}
}
interface B extends A{
	public default void foo() {
		System.out.println("foo method of interface B");
	}
}

class M implements A, B{
	
}


public class DemoDPOfInterfaceJava8 {
	
	public static void main(String[] args) {
		M m=new M();
		m.foo();
	}

}
