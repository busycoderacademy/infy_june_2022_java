package com.day4.revision_oops;

import java.util.Scanner;

class Shape {
	public void printArea() {
		System.out.println("i dnot know ");
	}
}

class Triangle extends Shape {
	
	@Override// annotation help us not to do sill thing while doing overriding
	public void printArea() {
		System.out.println("Triangle: 0.5*b*h ");
	}
}

class Circle extends Shape {
	public void printArea() {
		System.out.println("Circle: PI*r*r ");
	}
}

class Square extends Shape {

	public void printArea() {
		System.out.println("Square: l*l ");
	}
}

public class ExOfOverriding {
	public static void main(String[] args) {
		
		Shape shape=new Triangle();
		shape.printArea();
		
		
		
		
		
		
		
		// type of abstraction= implementation
		
//		Shape shape = null;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("pe 1.circle 2. square 3. Tri...");
//		int choice = scanner.nextInt();
//		if (choice == 1)
//			shape = new Circle();
//		else if (choice == 2)
//			shape = new Square();
//		else if (choice == 3)
//			shape = new Triangle();
//
//		if(shape!=null)
//		   shape.printArea();
//		else
//			System.out.println("PE correct choice");
	}

}
