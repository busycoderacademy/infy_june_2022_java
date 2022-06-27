package com.demo.interface_mcq.q9;

interface HeadPhones{
	default void displayHP() {
		System.out.println("HeadPhones Display");
	}
}
interface EarPhones{
	default void displayEP() {
		System.out.println("EarPhones Display");
	}

}
interface Electronics extends HeadPhones, EarPhones{
	default void bill() {
		System.out.println("Billing");
	}
}
public class Test implements Electronics {
	public static void main(String[] args) {
		Test obj=new Test();  //line1
		obj.displayEP();
		obj.displayHP();
		obj.bill();
	}
}