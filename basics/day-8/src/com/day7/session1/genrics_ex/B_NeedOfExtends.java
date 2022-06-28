package com.day7.session1.genrics_ex;
import java.util.*;

import javax.swing.plaf.multi.MultiInternalFrameUI;
public class B_NeedOfExtends {
	//<? extends XXX>
	public static void main(String[] args) {
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

	//<? extends XXX>
	 static void printMethod(List<? extends Number> list) {
		 //list.add(66.7); you are not allowed to add the data
		 
		 //you are only allowed to print the data
			for(Number val:list) {
				System.out.println(val);
			}
	}
	 
	 
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
