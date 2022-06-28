package com.day7.session2.streams_ex;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class D_PredicateDemo {

	public static void main(String[] args) {
		//Predicate is used to take T and return True/False
		//predicate act as a filter , it removed data from processing pipeline from data streams
		Predicate<String> namePredicate= name-> name.contains("raj");
		System.out.println(namePredicate.test("foof"));
		
		Predicate<Integer> evenPredicate=no-> no%2==0;
		System.out.println(evenPredicate.test(449));
		
		//n1, n1 if n1>=n2 T else i want to return false
		BiPredicate<Integer, Integer>biPredicate=(n1, n2)-> n1>=n2?true:false;
		
	}
}
