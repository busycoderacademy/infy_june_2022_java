package com.day4.string_demo;

public class DemoString {

	public static void main(String[] args) {
		// immutable					mutable
		//String(immutable)    vs StringBuilder (better in performacce) 
		//								vs StringBuffer(syn in java threads)
		
		StringBuilder builder=new StringBuilder().append("hello").append("java");
		builder.append("raja");
		System.out.println(builder);
		
		//can i convert SB to string object : yes
		
		String result= new StringBuilder().append("hello").append("champs").toString();
		System.out.println(result);
		
//		String a1= new String("java");
//		String a2="java";
//		
//		if(a1.equals(a2))// always compare address
//			System.out.println("are same");
//		else
//			System.out.println("not same");
		
	}
}
