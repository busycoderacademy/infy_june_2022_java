package com.day4.string_demo;

public class StringSplitMethod {
	
	public static void main(String[] args) {
		String data="i love programming do you love that";
		
		String tokens[]=data.split(" ",2);
		
		for(String token: tokens) {
			System.out.println(token);
		}
		
	}
}
