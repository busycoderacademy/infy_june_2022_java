package com.day6.session1.collection_1;

import java.util.*;// util is most imp package of core java

public class DemoArrayList2 {

	public static void main(String[] args) {
		
		//---how to use Collections class
		
		List<String> list = new LinkedList<>();
		list.add("rajiv");
		list.add("ekta");
		list.add("keshav");
		
		//hey we want to sort it before printing
		//collection api: data str + algo free
		//sort it
		System.out.println(list);
		Collections.sort(list);// nataully it doing sorting as per alphabitc...
		System.out.println(list);
		
		//BS: data should be sorted
		
//		int index = Collections.binarySearch(list, "xoo");
//		System.out.println(index);
		
		//we want to print the names as per there length ekta, rajiv, keshav * Comparator
	
	}

}







