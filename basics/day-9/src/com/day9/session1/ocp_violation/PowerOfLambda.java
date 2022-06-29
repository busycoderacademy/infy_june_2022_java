package com.day9.session1.ocp_violation;
//open close principle: to improve quality of your code
class Calculator{
	
	public int add(int a, int b) {
		return a+b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
}

public class PowerOfLambda {
	
	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(3, 2));
	}

}
