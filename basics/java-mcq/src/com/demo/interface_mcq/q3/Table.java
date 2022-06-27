package com.demo.interface_mcq.q3;

interface Furniture {
	default void checkStock() {
		System.out.println("Present in Stock");
	}

	static void pack() {
		System.out.println("Ready");
	}

	void shop();

	static void checkQuality() {
		System.out.println("Checking");
	}

	default void bill() {
		System.out.println("Billing");
	}
}

  public class Table implements Furniture {
	public static void main(String args[]) {
		System.out.println("Success");
	}

	@Override
	public void shop() {
		System.out.println("hello...");
	}
}