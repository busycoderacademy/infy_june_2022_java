package com.demo.interface_mcq;
public class Movie {
	private int movieId;
	private String movieName;
	private double ticketPrice;

	public Movie() {
		ticketPrice = 100;
	}

	public Movie(int id, String name) {
		movieId = id;
		movieName = name;
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie(1001, "Joker");
		System.out.println(m1.movieId + " " + m1.movieName + " " + m1.ticketPrice);
		System.out.println(m2.movieId + " " + m2.movieName + " " + m2.ticketPrice);
	}
}