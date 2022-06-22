package com.empapp;

public class FullTimeEmployee extends Employee {
	private double hra;
	private double da;
	private String ppfAccountId;
	
	public FullTimeEmployee(int id, String name, double baseSalary, double hra, double da, String ppfAccountId) {
		super(id, name, baseSalary);
		this.hra = hra;
		this.da = da;
		this.ppfAccountId = ppfAccountId;
	}

	@Override
	public double getTotalPayable() {
		return (getBaseSalary()+da+hra)*.8;
	}
	
	
}
