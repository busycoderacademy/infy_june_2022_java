package com.day6.session1.map_demo;
import java.util.*;
import java.util.Map.Entry;

public class DemoHashMap {
	
	public static void main(String[] args) {
		//Map : HashMap, TreeMap, LinkedHashMap
	//how to make a map to store student name and there marks
		
		Map<String, Integer> map=new TreeMap<>();
		map.put("raj", 99);
		map.put("gunika", 100);
		map.put("ravi", 78);
		map.put("sunita", 99);
		map.put("ravi", 89);
		map.put("null", 10);
		
		System.out.println("-------------");
		
		//why code runs					 vs						 just want to run the code and enjoy tt in office
		
		System.out.println(map);
		
		//how to print map 3 ways: 1. keyset 2. entryset 3. java 8 streams
		
		//1. keyset 2. entryset:   entryset is better in perforamnce how come ..how hashmap work..
		
		//how to use keyset
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.println(key + ": "+ map.get(key));
		}
		
		//entryset > keyset
		System.out.println("------------------");
		 Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +": "+ entry.getValue());
		}
	}
	
	

}





