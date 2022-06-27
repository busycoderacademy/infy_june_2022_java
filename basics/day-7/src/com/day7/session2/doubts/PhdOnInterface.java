package com.day7.session2.doubts;
/*
 * till java 7:
 * 	an interface can only have public abstact method
 *  it can also have public static and final constant
 *  
 * java 8:
 * an interface can also have default method 
 * an interface can also have static method (non final)
 * 
 * java 9:
 * an interface can also have private method *
 */
interface Foo{
	public static final  int i=20;//public static final
	public abstract void foo();//public and 
	
	 public default String myDefault() {
		return "infy champs";
	}
	
	 public static void fooStatic() {
		System.out.println("foo static method ...");
	}
}

interface X{
	int i=0;

}

//
//interface Y extends X{
//}

//class M{
//	void foo() {
//		System.out.println("foo of M");
//	}
//}
//interface Boo{
//	public static final  int j=20;//public static final
//	public abstract void boo();//public and 
//}
//
//class MyImp extends M  implements  Boo{
//
//	@Override
//	public void boo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void foo() {
//		// TODO Auto-generated method stub
//		
//	}
//}


public class PhdOnInterface {
	
	public static void main(String[] args) {
		
	}

}





