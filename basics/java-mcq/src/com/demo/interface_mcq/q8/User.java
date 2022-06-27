package com.demo.interface_mcq.q8;
interface Stationery{
	int quantity=1;
	String color="Red";
}
class Pen implements Stationery{
	String color="Green";
}
public class User {
	public static void main(String[] args) {
		Stationery obj=new Pen();   //line1
		System.out.println(obj.color);   //line2
	}
}