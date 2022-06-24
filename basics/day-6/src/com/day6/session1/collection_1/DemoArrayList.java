package com.day6.session1.collection_1;

import java.util.*;// util is most imp package of core java

public class DemoArrayList {

	public static void main(String[] args) {
		// we should always go with abstraction
//		List list=new LinkedList();
//		list.add("raj");
//		list.add(55);
//		list.add(new Employee(1, "Raj", 46000));
//		
//		//While i am getting it back
//		Employee employee=(Employee) list.get(1);
//		System.out.println(employee);

		List<String> list = new LinkedList<>();
		list.add("raj");
		list.add("ekta");
		list.add("keshav");
	
		//iterator : cursor it is used to travese in ds: Iterator(move, delete), ListIterator(crud) back and forth, Enumeration X Vector
	
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Iterator<String> it=list.iterator();
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();
//		System.out.println(list);
//		
		//how ListIterator can do all crud opeations
		
		ListIterator<String> it2=list.listIterator(list.size());
		
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		
		//System.out.println(list);
		//using enhance for loop 5
//		for(String name: list) {
//			System.out.println(name);
//		}

	}

}







