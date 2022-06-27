package com.day7.session1.java8_interface;
@FunctionalInterface
interface Foo{
	void foo();	//100%

	public default void bar() {
		System.out.println("bar default method ...");
	}
	
	 public static void fooStatic() {
		System.out.println("foo static method ...");
	}
}
 class MyFooImpl implements Foo{
	@Override
	public void foo() {
		System.out.println("foo method is overriden by MyFooImp");
	}
}
public class DemoFI {
	
	public static void main(String[] args) {
		Foo f=new MyFooImpl();
		f.foo();
		f.bar();
		Foo.fooStatic();//static method of an interface can only be called by name of Interface
	}

}
