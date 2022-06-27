package com.demo.interface_mcq.q6;

interface Game {
	public default void display() {
		System.out.println("default game");
	}
}

public class VideoGame implements Game {
	

	public static void main(String[] args) {
		VideoGame game = new VideoGame();
		game.display(); // line3
	}
}