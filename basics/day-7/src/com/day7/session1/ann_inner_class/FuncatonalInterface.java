package com.day7.session1.ann_inner_class;
@FunctionalInterface
interface Cal{
	int add(int a, int b);
}
public class FuncatonalInterface {
	
	public static void main(String[] args) {
		/*
		 * 1. it is a funcation Inteface --> Y
		 * 2. writing it into lambda expression
		 * 
		 */
		
		Cal cal=new Cal() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		
	}

}
