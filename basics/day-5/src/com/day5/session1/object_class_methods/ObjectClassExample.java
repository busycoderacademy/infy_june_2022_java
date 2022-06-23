package com.day5.session1.object_class_methods;

public class ObjectClassExample {

	public static void main(String[] args) {
		
//		Employee employee1 = new Employee(12, "raj", 45000);
//		
//		Object o=employee1;
//		Employee e2=(Employee) o;
		
		
		Employee employee1 = new Employee(12, "raj", 45000);

		Employee employee2 = new Employee(12, "raj", 49000);

		// System.out.println(employee1.hashCode());

		if (employee1.equals(employee2)) 
			System.out.println("Are same state");
		 else
			System.out.println("dont have same state");

	}

}
