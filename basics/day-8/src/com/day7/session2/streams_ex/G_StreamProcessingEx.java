package com.day7.session2.streams_ex;
import java.util.*;
import java.util.stream.Collectors;

import com.day7.session1.common.Employee;
public class G_StreamProcessingEx {
	
	public static void main(String[] args) {
		//i do have a list of emp i want to print the name of all emps who is getting salary more then 27L
		
		List<String> names=getEmployees()
				.stream()
				.filter(e-> e.getSalary()>2700000)
				.map(e-> e.getName())
				.collect(Collectors.toList());
		names.forEach(name-> System.out.println(name));
		
	}
	
	public static List<Employee> getEmployees(){
		return Arrays.asList(new Employee(1, "rajat", 3000000),
				new Employee(66, "seema", 3000000),
				new Employee(105, "raj", 3800000),
				new Employee(441, "meenu", 700000));
	}

}

