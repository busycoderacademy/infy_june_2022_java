package com.day3.session2.oops;

abstract class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	 public void getArea() {
		 System.out.println("base class getArea method");
	 }

	public void printColor() {
		System.out.println("color: "+ color);
	}
}

class Rectangle extends Shape{

	public Rectangle(String color) {
		super(color);
	}

	public void getArea() {
		System.out.println("area is Rectangle: l*b");
	}
	
}

class Triangle extends Shape{

	public Triangle(String color) {
		super(color);
	}

	public void getArea() {
		System.out.println("area is Triangle: 0.5*b*h");
	}
	
}

class Circle extends Shape{

	public Circle(String color) {
		super(color);
	}

	public void getArea() {
		System.out.println("area is circle: PI*r*r");
	}
	
}

public class AnotherExOfPolymorphism {

	public static void main(String[] args) {
		//in run time poly... it is decided at run time which method need to be called
		//
		
		Shape shape=new Circle("black");
		
		shape.getArea();
	}

}
