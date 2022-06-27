package com.demo.interface_mcq.q12;

interface Demo{
	void printDemo();
}
public class Tester implements Demo{
	public void printDemo() {
		System.out.println("In tester class");
		   
	 }
	public static void main(String[] args) {
		Demo demo = new Tester();  //Line 1 
		demo.printDemo(); //Line 2
    
}
}

