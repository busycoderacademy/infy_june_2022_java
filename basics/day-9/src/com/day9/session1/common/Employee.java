package com.day9.session1.common;

import java.util.Comparator;



public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public static boolean  isNameContainRaj(String name) {
		return name.contains("raj");
	}
	
	public boolean isNameContainMee() {
		return name.contains("mee");
	}
	
	public boolean isHighlyPaid() {
		return this.salary>=2500000;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
	
}
