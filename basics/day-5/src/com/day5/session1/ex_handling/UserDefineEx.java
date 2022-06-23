package com.day5.session1.ex_handling;

import static java.lang.Math.PI;

//static import java 5
//user defind ex
class InvalidRadiusException extends Exception{
	
}
class Circle {
	private int radius;

	public Circle(int radius) throws InvalidRadiusException {
		if (radius <= 0) {
			throw new InvalidRadiusException();
		} else
			this.radius = radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class UserDefineEx {

	public static void main(String[] args)  {

		Circle circle;
		try {
			circle = new Circle(-3);
			System.out.println(circle.getArea());
			
		} catch (InvalidRadiusException e) {
			//e.printStackTrace();
			System.out.println("invalid radius");
		}
	System.out.println("-----------------");
	}
}
