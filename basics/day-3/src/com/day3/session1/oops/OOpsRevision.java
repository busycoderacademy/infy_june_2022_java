package com.day3.session1.oops;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	//ctr, chaining
	public Employee() {
		this(111,"foo",67000);//this can be used as a method call to the ctr of same class..this() can only apper inside a ctr
	}

	public Employee(int id, String name, double salary) {
		//super(); what is the use of super()?
		//this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//getter
	//setter
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//toString: is a special method from Object class in java*
	public void printEmployeeDetails() {
		System.out.println("id: "+ id+" name : "+ name+" salary: "+ salary);
	
	}
	
	// logic methods
	public double netPayable() {
		return salary * .8;
	}
}
//my req is i want to create part time and full time emps
class FullTimeEmployee extends Employee{
	
	private String ppfNo;
	
}

class PartTimeEmployee extends Employee{
	
	private int commisionPerDay;
	private int noOfDays;
	
}

public class OOpsRevision {

	public static void main(String[] args) {
		//Employee employee=new Employee(121, "rajat", 45000);
		Employee employee=new Employee();
		employee.printEmployeeDetails();
		System.out.println("net payable: "+employee.netPayable());
	}
}
