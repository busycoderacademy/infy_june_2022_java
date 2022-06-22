package com.empapp;

abstract public class Employee implements Payable{
	private int id;
	private String name;
	private double baseSalary;

	
	abstract public double getTotalPayable() ;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Employee(int id, String name, double baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public void showEmpDetails() {
		System.out.println("id: " + id + " name: " + name + " baseSalary: " + baseSalary);
	}
}
