package com.libmgtapp;

public class Book {
	private int id;
	private String title;
	private double price;
	private int noOfCopies;

	public Book() {
	}

	public Book(int id, String title, double price, int noOfCopies) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", noOfCopies=" + noOfCopies + "]";
	}
	
}
