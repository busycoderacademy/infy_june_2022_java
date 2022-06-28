package com.day7.session2.streams_ex;

@FunctionalInterface // SAM
interface Foo {
	void fooMethod();
}

interface Calculator{
	public int add(int a, int b);
}

public class A_FIExamples {
	public static void main(String[] args) {
				//object of an ann inner class
//		Foo foo=new Foo() {
//			
//			@Override
//			public void fooMethod() {
//				System.out.println("foo code...");
//			}
//		};
		//what is lambada peice of code (internally it impl as method) that can be assigned to a ref of interface
		//it is used in streams processing of data in java aka *funcation programming*
		Foo foo=()->System.out.println("foo code...");
			
		
		
		//how to get lambda --> refactor anno inner class
//		Calculator calculator=(int a, int b) ->{
//				return a+b;
//			
//		};
//		
		
//		Calculator calculator=(int a, int b) -> a+b;
		
//		Calculator calculator=(a,  b)-> a+b;
//		System.out.println(calculator.add(2, 1));
	
		
//		Foo foo=new Foo() {
//			
//			@Override
//			public void fooMethod() {
//				System.out.println("foo ...");
//			}
//		};

//Type inference: compiler is more integlent now a days
//					//lambda is impl as function under the hood
//		Foo foo = () -> System.out.println("foo ...");
//
//		foo.fooMethod();
	}
}
