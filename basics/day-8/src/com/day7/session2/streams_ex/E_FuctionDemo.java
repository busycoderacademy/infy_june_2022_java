package com.day7.session2.streams_ex;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.day7.session1.common.Employee;
import com.day7.session1.common.EmployeeDTO;

public class E_FuctionDemo {

	public static void main(String[] args) {
		
		//Employee ---> employee salary  (Function)
		Employee employee=new Employee(121, "rajiv", 3000000);
		
		Function<Employee, Double> function=emp-> emp.getSalary();
		
		System.out.println(function.apply(employee));
		
		//let say we have give Employee object that i need to convert into EmployeeDTO
		
		Employee e1=new Employee(121, "rajiv", 3000000);
		//i want to convert e1 ie the object of Employee to EmployeeDTO
		
		Function<Employee, EmployeeDTO> function2=
				
				e ->new EmployeeDTO(e.getId(), e.getName(), e.getSalary());
					
				
				
		
		
		//// Function: it convert something into something else

		// patato--> chips
		
		Function<String, Integer>myFunction= name->  name.length();
		
		String name="rajesh kumar";
		int len= myFunction.apply(name);
		System.out.println(len);
		
	

	}
}
