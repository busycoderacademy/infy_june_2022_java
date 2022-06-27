package com.day7.session1.ann_inner_class;
interface Cookable{
	void cook();
}
public class DemoComparatoeAnno {
	
	public static void main(String[] args) {
		//ann inner Cookable cookable= an object of ann inner class is assigned
		Cookable cookable=new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		
	Cookable cookable2=new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		
	Cookable cookable3=new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		
	Cookable cookable4=new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
	}

}
