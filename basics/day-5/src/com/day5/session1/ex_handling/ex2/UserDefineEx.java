package com.day5.session1.ex_handling.ex2;


class InvalidRadiusException extends Exception {
	public InvalidRadiusException(String message) {
		super(message);
	}
}

class Circle {
	private int radius;

	public Circle(int radius) throws InvalidRadiusException {
		if (radius <= 0) {
			throw new InvalidRadiusException("radius of "+ radius+" is invalid");
		} else
			this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}

public class UserDefineEx {

	public static void main(String[] args) {

		Circle circle;
		try {
			circle = new Circle(-3);
			System.out.println(circle.getArea());

		} catch (InvalidRadiusException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------");
	}
}
