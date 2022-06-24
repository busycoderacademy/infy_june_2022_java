package com.day6.session1.ann_inner_class;
//inner class: if a class defined inside another class...
//annonyomos inner class vs lamda exp
interface Foof{
	void foo();
}
public class DemoAnnInner {
	
	public static void main(String[] args) {
		
		Foof f=new Foof() {
			
			@Override
			public void foo() {
				System.out.println("it is an annoymous implemation");
			}
		};
		
//	   Foof f=new Foof() {
//			
//			@Override
//			public void foo() {
//				System.out.println("it is an annoymous implemation");
//			}
//		};
		
		f.foo();
	}

}
