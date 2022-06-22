package com.day4.loose_coupling.prob;

import java.util.Scanner;

class Car {
	public void move() {
		System.out.println("moving in a car...");
	}
}

class Bike {
	public void move() {
		System.out.println("moving on a bike...");
	}
}

class Metro {
	public void move() {
		System.out.println("moving on a Metro...");
	}
}

class Passanger {
	private String name;
	private Metro metro;

	public Passanger(String name) {
		this.name = name;
	}
	
	public void setMetro(Metro metro) {
		this.metro = metro;
	}
	public void travel() {
		System.out.println("passanger name: " + name);
		metro.move();
	}
}

public class NeedOfLooseCoupling {

	public static void main(String[] args) {

		//Car car=new Car();
		Metro metro=new Metro();
		
		Passanger passanger=new Passanger("ravi");
		passanger.setMetro(metro);
		passanger.travel();
	}

}
