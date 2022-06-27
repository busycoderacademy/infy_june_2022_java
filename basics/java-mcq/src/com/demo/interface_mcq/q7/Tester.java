package com.demo.interface_mcq.q7;

interface Car{
	default void accelerate() {
		System.out.println("Car speeding");
	}
}
interface Bike{
	default void accelerate() {
		System.out.println("Car speeding");
	}
}
public class Tester implements Car, Bike {

	@Override
	public void accelerate() {
		//line1
		Bike.super.accelerate();
		Car.super.accelerate();
	}
	
}