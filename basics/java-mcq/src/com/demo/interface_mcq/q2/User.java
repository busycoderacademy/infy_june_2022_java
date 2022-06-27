package com.demo.interface_mcq.q2;

interface Stationery {
	int quantity = 1;
}

class Pen implements Stationery {
	String color = "Green";
}

public class User {
	public static void main(String[] args) {
		Pen obj = new Pen();
		System.out.println(obj.color); // line1
	}
}