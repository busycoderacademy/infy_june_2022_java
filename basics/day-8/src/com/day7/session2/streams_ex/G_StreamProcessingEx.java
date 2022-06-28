package com.day7.session2.streams_ex;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.day7.session1.common.Employee;
public class G_StreamProcessingEx {
	
	public static void main(String[] args) {
		//i do have a list of emp i want to print the name of all emps who is getting salary more then 27L
		
		//Java 8 FI  
		//Predicate, Funcation, Consumer, Supplier
		
		//select * from emp where salary > 20000;
		//Stream: flow of data, processing pipline where we process the data in decleative (just like sql) way
		//easy code, optimize code
		
		
		
		//give me list of emp name who get salary >=25L and there name contain raj
		
		List<Employee> employees=getEmployees();
		
		Predicate<Employee> p1=e-> e.getSalary()>=2500000;
		Function<Employee, String> f1=e-> e.getName();
		
//		
//		List<String>empNameContainRaj=
//				employees.stream()
//				.filter(e-> e.getSalary()>=2500000)
//				.map(e-> e.getName())
//				.filter(name->name.contains("raj"))
//				.collect(Collectors.toList());
//		
//		empNameContainRaj.forEach(System.out::println);
		
		
		//lamabda vs method ref (is syntex suger on lambda)
		List<String>empNameContainRaj=
				employees.stream()
				.filter(Employee::isHighlyPaid)
				.map(Employee::getName)
				.filter(Employee::isNameContainRaj)
				.collect(Collectors.toList());
		
		empNameContainRaj.forEach(System.out::println);
		
				
		
		
		//procedural code 
		
		
		//Java 7
		
//		List<Employee> empSelected= new ArrayList<Employee>();
//		
//		for(Employee e: employees) {
//			//Filter
//			if(e.getSalary()>=2500000) {
//				empSelected.add(e);
//			}
//		}
//		
//		List<String> empNames=new ArrayList<String>();
//		
//		for(Employee e: empSelected) {
//			//map operation emp--> name		manually :(
//			empNames.add(e.getName());
//		}
//		
//		for(String name: empNames) {
//			System.out.println(name);
//		}
		
		
		
		
		
		
		
	}
	
	public static List<Employee> getEmployees(){
		return Arrays.asList(new Employee(1, "rajat", 3000000),
				new Employee(66, "seema", 300000),
				new Employee(105, "raj", 3800000),
				new Employee(155, "kapil", 3900000),
				new Employee(441, "meenu", 700000));
	}

}

