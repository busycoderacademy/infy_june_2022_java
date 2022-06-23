package com.day5.session1.enum_demo;

public class Shirt {
	private int id;
	private String color;
	private double price;
	private ShirtShize size;
	
	public int getId() {
		return id;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ShirtShize getSize() {
		return size;
	}
	public void setSize(ShirtShize size) {
		this.size = size;
	}
	public Shirt(int id, String color, double price, ShirtShize size) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [id=" + id + ", color=" + color + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
}
