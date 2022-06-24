package com.day6.session1.collection_1;
//if u want to define extra sort seq then u should go for comparator

import java.util.Comparator;

class MySalarySorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value = Double.compare(o2.getSalary(), o1.getSalary());
		if (value == 0) {
			value = o1.getName().compareTo(o2.getName());
		}
		return value;
	}
}

class MyNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

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
		// here u write the code to tell java how to sort emps
		return Integer.compare(this.getId(), o.getId());
	}

}
