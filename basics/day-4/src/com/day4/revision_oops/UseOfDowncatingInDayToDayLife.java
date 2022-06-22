package com.day4.revision_oops;
//What is the use of upcasting in Java

class Animal {
	void sound() {
		System.out.println("?");
	}

}

class Dog extends Animal {
	void nightWatchManShip() {
		System.out.println("jagto raho...");
	}

	void sound() {
		System.out.println("bho bho...");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("meou...");
	}
}

public class UseOfDowncatingInDayToDayLife {

	public static void main(String[] args) {

		// animal array
		Animal[] animals = getAnimals();
		for (Animal animal : animals) {
			
			animal.sound();
			
			if (animal instanceof Dog)
				((Dog) animal).nightWatchManShip();
		}

	}

	public static Animal[] getAnimals() {
		return new Animal[] { new Dog(), new Dog(), new Cat(), new Dog() };
	}

}
