package com.empapp;

public class EmployeeProcessingSystemMain {

	public static void main(String[] args) {
		EmployeeProcessingSystem empProcessSystem=new EmployeeProcessingSystem();
		
		Employee employee=new FullTimeEmployee(111, "rajat", 54000, 34000, 456, "445454534434");
		
		Employee employee2=new PartTimeEmployee(211, "suman", 6000, 120, 900);
		
		empProcessSystem.processSalary(employee2);
	}
}
