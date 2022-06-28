package com.day7.session1.genrics_ex;

import com.day7.session1.common.Employee;

public class D_NeedOfTemplateClass {

	public static void main(String[] args) {
		
		Stack<Employee> stack=new Stack<Employee>(Employee.class, 5);
		stack.push(new Employee(2, "Raj", 60000));
		stack.push(new Employee(20, "Raj", 60000));
		stack.push(new Employee(21, "Raj", 60000));
		stack.push(new Employee(902, "Raj", 60000));
		stack.push(new Employee(201, "Raj", 60000));
		
		//stack.push(7);
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
//		Stack<Integer> stack=new Stack<Integer>(Integer.class, 5);
//		stack.push(33);
//		stack.push(3);
//		stack.push(303);
//		stack.push(3399);
//		stack.push(-6);
//		//stack.push(7);
//		
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}
}
