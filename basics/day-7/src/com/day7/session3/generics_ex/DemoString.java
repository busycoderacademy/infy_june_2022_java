package com.day7.session3.generics_ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoString {
	
	public static void main(String[] args) {
		
		int i = 10; 
		if(i==0) {
			System.out.println("Hello"); 
		} 
		else { 
			System.out.println("Bye"); 
		}
		
		
		//var is new keyword in java 11
		//java is strongly type language
//		var a="raj";//var can only be used as local variable
//		
//		//type inference
//		var map=new HashMap<String, Integer>();
//		//map=33;
//		
//		var foo=44;
		
		//String a="a"+"b"+"c"+"d";
		//System.out.println(a);
		//String a= new StringBuilder().append("a").append("b").append("c").append("d").toString();
		//System.out.println(a);
		
		//how to rev a string
		String name="rajiv";
		String nameRev=new StringBuilder().append(name).reverse().toString();
		System.out.println(nameRev);
		
	}
}
