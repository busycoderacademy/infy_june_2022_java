package com.day4.wrapper_demo;

public class DemoWrapperCls {

	public static void main(String[] args) {
		
		int i=33;
		
		//Integer it=new Integer(33);
		
		Integer it=33;//auto boxing

		
	//	int val= it.intValue(); java 1.4
		
		int val= it;//auto unboxing
		
		val++;
		it=new Integer(val);
		
		
		//Auto -boxing and unboxing: java 5
		
		
	}
}
