package com.empapp;

public class PartTimeEmployee extends Employee {

	private int noOfHr;
	private int payPerHour;

	public PartTimeEmployee(int id, String name, double baseSalary, int noOfHr, int payPerHour) {
		super(id, name, baseSalary);
		this.noOfHr = noOfHr;
		this.payPerHour = payPerHour;
	}

	@Override
	public double getTotalPayable() {
		return getBaseSalary() + noOfHr * payPerHour;
	}

}
