package com.demo.interface_mcq;

class Demo {
	int value1, value2;

	Demo() {
		value1 = 10;
		value2 = 20;
	}

	public void display() {
		System.out.println("Value 1:" + value1);
		System.out.println("Value 2:" + value2);
	}
}

public class Tester {
	public static void main(String[] args) {
		  int num1 = 0, num2 = 9; 
	        do { 
	            num1++; 
	            if (num2-- < num1++) { 
	                break; 
	            } 
	        } while (num1 < 5); 
	        System.out.println(num1 + "" + num2); 
	}
}