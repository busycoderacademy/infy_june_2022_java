package com.day7.session2.streams_ex;

import java.util.function.Consumer;

import com.day7.session1.common.Employee;

public class F_Consumer {

	public static void main(String[] args) {
		//Consumer only eat ie used to consume ie print the data
		Consumer<String> consumer=name-> System.out.println(name);
		consumer.accept("rajiv");
		
		Employee employee=new Employee(1, "amit", 400000);
		Consumer<Employee> c=e-> System.out.println(e);
		c.accept(employee);
	}
}
