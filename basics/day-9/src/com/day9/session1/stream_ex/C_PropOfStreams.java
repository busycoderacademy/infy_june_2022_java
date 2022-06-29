package com.day9.session1.stream_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.day9.session1.common.Employee;

public class C_PropOfStreams {
	
	public static void main(String[] args) {
		
		
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Add forEach(num -> System.out.println(num)) after the map() and
		//observe the change!
		intStream
		.filter(num ->  num%2!=0)
		.map(num -> num*3)
		.peek(num-> System.out.println("peek:"+num))
		.forEach(num-> System.out.println(num));
		
		
		
		System.out.println("----------");
		
		
		//List<String> names=List.of("raj","ekta","sumit","rajesh","foo","keshav","rajat");
		
		//1. once you consume stream u can not re-consume it
//		Stream<String> namesStreams=names.stream();
//		
//		namesStreams.forEach(n-> System.out.println(n));
//		System.out.println("want to re-consume");
//		namesStreams.forEach(n-> System.out.println(n));//IllegalStateEx
		
		//2. strems are evaluated lazyly.. ie until you dont have terminal operation strem dont do anything
		
		//i want to get name that contain raj
//		names.stream()
//		.filter(name-> {
//			System.out.println("name: "+name);
//			return name.contains("raj");
//		}).forEach(name-> System.out.println(name));
//		
//		System.out.println("-----------");
		
		//peek() is used for debugging
//		names.stream()
//		.filter(name->  name.contains("raj"))
//		.peek(name-> System.out.println("name:"+name))
//		.forEach(name-> System.out.println(name));
//		
//		System.out.println("-----------");
		
		//4. short circuit, loop fusion optimation behaviour of stream
		
		
		
	}

	
	public static List<Employee> getEmployees(){
		return Arrays.asList(new Employee(1, "rajat", 3000000),
				new Employee(199, "rajat", 3600000),
				new Employee(66, "seema", 300000),
				new Employee(105, "raj", 3800000),
				new Employee(155, "kapil", 3900000),
				new Employee(441, "meenu", 700000));
	}
}
