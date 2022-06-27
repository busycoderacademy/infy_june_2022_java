package com.day7.session1.ann_inner_class.ex;
interface Cookable{
	void cook();
}
public class DemoComparatorLambda {
	
	public static void main(String[] args) {
		//lambda: Cookable cookable= peice of code assigned to the reference
		Cookable cookable=() -> System.out.println("hotel food");	//method ref
			
	
		
	Cookable cookable2=() ->System.out.println("hotel food");
		
		
	Cookable cookable3=()-> System.out.println("hotel food");
	
		
	Cookable cookable4=()-> System.out.println("hotel food");
	
	}

}
