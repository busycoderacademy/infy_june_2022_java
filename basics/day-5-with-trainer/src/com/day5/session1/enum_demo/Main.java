package com.day5.session1.enum_demo;

public class Main {

	public static void main(String[] args) {
		Shirt shirt=new Shirt(1, "blue", 5600, ShirtShize.M);
		System.out.println(shirt);
		
		//print all the enum values
		for(ShirtShize shirtShize: ShirtShize.values()) {
			System.out.println(shirtShize.ordinal()+": "+ shirtShize.name()+": "+ shirtShize);
		}
	}
}