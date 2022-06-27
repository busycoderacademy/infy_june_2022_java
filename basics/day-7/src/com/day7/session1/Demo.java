package com.day7.session1;

public class Demo {

	public static void main(String[] args) {
		//input from the user 10 20 30 java
		//sum=60
		Integer sum=0;
		for(String s: args) {
			int val=0;
			try{
				 val= Integer.parseInt(s);
			}catch(NumberFormatException e) {
				
			}
			sum+=val;
			
		}
		System.out.println("sum :"+ sum);
	}
}
