package com.day6.session1.collection_1;

import java.util.*;// util is most imp package of core java
//comparator is more flexible
class MyNameSorter2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
}
public class DemoArrayList3 {

	public static void main(String[] args) {
	
		List<String> list = new LinkedList<>();
		list.add("rajiv");
		list.add("ekta");
		list.add("keshav");
	
		System.out.println(list);
		Collections.sort(list, new MyNameSorter2());//
		System.out.println(list);
		
	
	}

}







