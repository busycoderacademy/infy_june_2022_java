package com.day4.string_demo;
class Tester {

	public static void main(String[] args) {
		
		//creation of string using string literal
		String firstString = "Java";
		
		//creation of string using new keyword
		String secondString = new String("Stream");
		
		/*
		Task 1 :- using concat() display Java Stream
		*/
		System.out.println("------------"+"concat()"+"------------");
		System.out.println("Concatenating using concat() :- "+firstString.concat(secondString));
		System.out.println();
		
		/*
		Task 2 :- string comparison using equals(), == operator, compareTo()
		*/
		System.out.println("------------"+"Comparison(.equals , == , compareTo)"+"------------");
		String thirdString = "Thomas";
		String fourthString = "THOMAS";
		
		System.out.println("Comparison of Thomas with THOMAS using equals :- "+thirdString.equals(fourthString));
		//string1.equalsIgnoreCase(string2) => case insensitive comparison
		System.out.println("Comparison of Thomas with THOMAS using equals ignoring case:- "+thirdString.equalsIgnoreCase(fourthString));
		
		System.out.println();
		//using == operator
		String fifthString = "Thomas";
		String sixthString = new String("Thomas");
		
		System.out.println("Comparison using == operator :- "+(thirdString==fifthString));
		//Line 36 both refer to same instance
	
		System.out.println("Comparison using == operator with new keyword :- "+(sixthString==fifthString));
		//Line 39 sixthString refers to instance created in nonpool
		
		System.out.println();
		//using compareTo()
		
		/*
			if s1 and s2 are two strings which are to be compared 
			if s1 == s2 then output is 0
			if s1 > s2 then output is 1
			if s1 < s2 then output is -1
		*/
		
		System.out.println("Comparison of Thomas and Thomas using comapreTo :- "+(thirdString.compareTo(fifthString)));
		System.out.println("Comparison of Thomas and RudolfShelby using compareTo :- "+(thirdString.compareTo("RudolfShelby")));
	
	}

}
