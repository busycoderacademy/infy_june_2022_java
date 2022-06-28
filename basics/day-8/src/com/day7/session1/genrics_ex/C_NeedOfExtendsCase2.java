package com.day7.session1.genrics_ex;
import java.util.*;

import javax.swing.plaf.multi.MultiInternalFrameUI;

import com.day7.session1.common.Employee;
public class C_NeedOfExtendsCase2 {
	//<? extends XXX>
	public static void main(String[] args) {
		
		List<Employee> listEmp=new ArrayList<>();
		listEmp.add(new Employee(1, "Raj", 854665656.00));
		listEmp.add(new Employee(2, "Ekta", 854695656.00));
		System.out.println("list of emp");
		printMethod(listEmp);
		
		
		List<Integer> list=new ArrayList<>();
		list.add(44);
		list.add(43);
		System.out.println("list of integers");
		printMethod(list);
		
		List<Double> list2=new ArrayList<>();
		list2.add(44.99);
		list2.add(43.00);
		System.out.println("list of doubles");
		printMethod(list2);
		
		

		List<Float> list3=new ArrayList<>();
		list3.add(44.99f);
		list3.add(43.00f);
		
		System.out.println("list of float");
		printMethod(list3);
		
	}
	
	
	//<? extends XXX> hey u can pass any list whose member have inh from Object
		 static void printMethod(List<?> list) {
			 //list.add(66.7); you are not allowed to add the data
			 
			 //you are only allowed to print the data
				for(Object val:list) {
					System.out.println(val);
				}
		}
		 

//	//<? extends XXX> hey u can pass any list whose member have inh from Object
//	 static void printMethod(List<? extends Object> list) {
//		 //list.add(66.7); you are not allowed to add the data
//		 
//		 //you are only allowed to print the data
//			for(Object val:list) {
//				System.out.println(val);
//			}
//	}
	 
	 
	//DRY: dont reapeat yourself
	
//	 static void printMethodDouble(List<Double> list) {
//			for(Double val:list) {
//				System.out.println(val);
//			}
//		}
//	 
//	 static void printMethodInteger(List<Integer> list) {
	 
//		for(Integer val:list) {
//			System.out.println(val);
//		}
//	}


}
