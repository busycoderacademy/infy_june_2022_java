package com.day7.session2.streams_ex;

import com.day7.session1.common.Employee;

//25L> 
interface EmpProceesor {
	public abstract boolean isEaringMore(Employee employee);
}

public class C_Ex_lambdaEx3 {

	public static void main(String[] args) {
//	
		Employee employee = new Employee(1, "foo", 300000);

//		EmpProceesor empProceesor = new EmpProceesor() {
//
//			@Override
//			public boolean isEaringMore(Employee employee) {
//				return employee.getSalary() >= 2500000;
//			}	
//		};
	
		EmpProceesor empProceesor =  e-> e.getSalary() >= 2500000;
			
		System.out.println(empProceesor.isEaringMore(employee));
	}
}





