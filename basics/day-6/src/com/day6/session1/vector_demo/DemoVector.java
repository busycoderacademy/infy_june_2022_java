package com.day6.session1.vector_demo;
import java.util.*;
public class DemoVector {
	
	public static void main(String[] args) {
		
		//Q1. how to make a LL syn in case if we require
	
		
		// if all the methods of vectors are syn then this class is threads safty* 
		Vector<String> names= new Vector<String>();
		names.add("foo");
		names.add("bar");
		names.add("jar");
		names.add("car");
		
		
		
		Enumeration<String> it=names.elements();
		while(it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
		
	}

}
