package com.day7.session1.genrics_ex;
import java.util.*;

import javax.swing.plaf.multi.MultiInternalFrameUI;
public class A_NeedOfGen {

	public static void main(String[] args) {
		//generics : compile time safty net, it is type erased?
		List<Integer> list=new ArrayList<>();
		list.add(44);
		list.add(43);
		
		System.out.println(list);
		//dont mix wine with milk: dont mix generics and non generics code... bugs
		
		myMethod(list);
		
		System.out.println(list);
		//bug
		int total=0;
		for(Integer temp: list) {
			total+=temp;
		}
		
		System.out.println("total: "+ total);
	}

	private static void myMethod(List<Integer> list) {
		list.add(44);
	}
}
