package com.day6.session1.collection_1;

import java.util.*;
//We want to sort user define objects

public class DemoSortingUserDefineObject {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(2901, "ravi", 78000));
		employees.add(new Employee(29, "keshav", 289000));
		employees.add(new Employee(290, "ekta", 289000));
		

		// print them
		printAllEmps(employees);
		// what we want to do it want to sort it before printing it

		Collections.sort(employees);// java says i dont know how to sort it (as it is user define class)
		// for user define class: Comparable or Comparator

		System.out.println("-------Employee sorted as per id-----------");
		printAllEmps(employees);

		System.out.println("---------sort as per salary---------");

		Collections.sort(employees, new MySalarySorter());
		printAllEmps(employees);

		System.out.println("---------sort as per name---------");

		Collections.sort(employees, new MyNameSorter());
		printAllEmps(employees);
		
		System.out.println("------using anny inner class-------");
		
		Comparator<Employee> comparator=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(employees,comparator );
		printAllEmps(employees);
		
	}

	private static void printAllEmps(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
