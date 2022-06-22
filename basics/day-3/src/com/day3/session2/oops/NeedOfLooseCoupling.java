package com.day3.session2.oops;

import java.util.Scanner;

//a passanger named rama is traveing in a car
abstract class Vehical {

	//it can have instance variable, ctr, getter setter ...everyting but u can not create object of it
	abstract  public void move() ;
	
}

class Car extends Vehical {
	public void move() {
		System.out.println("moving in a car...");
	}
}

class Bike extends Vehical {
	public void move() {
		System.out.println("moving on a bike...");
	}
}

class Metro extends Vehical {
	public void move() {
		System.out.println("moving on a Metro...");
	}
}

//here i want to introduce abstraction ...ie i want to say that passanger is loosly coupled from the choice of vehical
//rather then create BIke object i will create a "abstraction"
class Passanger {
	private String name;
	private Vehical vehical;

	public Passanger(String name) {
		this.name = name;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("passanger name: " + name);
		vehical.move();
	}
}

public class NeedOfLooseCoupling {

	public static void main(String[] args) {
		Vehical vehical=null;
		
		vehical.move();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice of vehical 1. for Car 2. for Bike 3. for metro 4. vehical");
		int choice = scanner.nextInt();

		if (choice == 1)
			vehical = new Car();
		else if (choice == 2)
			vehical = new Bike();
		else if (choice == 3)
			vehical = new Metro();

		Passanger p = new Passanger("ravi");
		
		p.setVehical(vehical);
		
		if (vehical != null)
			p.travel();
		else
			System.out.println("pls enter bw 1-3");

	}

}
