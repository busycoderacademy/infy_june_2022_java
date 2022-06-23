package com.day5.session1.object_class_methods;


class X {
	public static void foof(){
		System.out.println("public static foof A");
	 }

}

public class XClient {

	public static void main(String[] args) {
		X x=null;
		x.foof();
	}
}
