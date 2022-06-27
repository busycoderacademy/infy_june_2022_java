package com.day7.session1.ann_inner_class;

//Funcational Interface also called SAM (single abs method )
@FunctionalInterface
interface Foo{
	void foo();
}

public class DemoAnnInncerClass {
	
	public static void main(String[] args) {
		
		//ann inner class is quick and dirty way to impl a interface and get a sigle object out it
//		Runnable runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("job of the thread..");
//			}
//		};
//		
//		Thread thread=new Thread(runnable);
//		thread.start();
		
		//till java 7 vs java 8 : "lambda expression" is better replament of ann inner class
		//lambda expression: used in stream processing* declative data processing
		
		Foo f=new Foo() {
			public void foo() {
				System.out.println("foo is implemeted...");
			}
		};
		f.foo();
		
		//u must know how to convert a annonymous inner class to lambda
		
		Foo f2=new Foo() {
			public void foo() {
				System.out.println("foo is implemeted another time...");
			}
		};
		
		f2.foo();
	}
	
	

}



