package com.empapp;

public class EmployeeProcessingSystem {
	static public void processSalary(Payable payable) {
		//we can add the salary procssing info to db also.... jdbc
		System.out.println("employee salary is processed...:"+ payable.getTotalPayable());
	}
}
