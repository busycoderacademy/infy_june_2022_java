package com.day6.session1.doubts;

class Printer {
	static {
		System.out.println("Static block in Printer class");
	}

	public static void display(String message) {
		System.out.println(message);
	}
}

public class Tester {
	public static int sampleVariable = 1;

	static {
		System.out.println("Static block in Tester class");
	}

	public static void main(String[] args) {
		sampleVariable++;
		System.out.println("In main");
		Printer p = null;
		Printer.display("The value of sample variable is: " + sampleVariable);
	}
}