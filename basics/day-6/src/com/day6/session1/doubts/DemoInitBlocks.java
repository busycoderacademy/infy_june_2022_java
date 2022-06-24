package com.day6.session1.doubts;

class Demo {

	
	// init block
	{
		System.out.println("some common code.2..");
	}

	{
		System.out.println("some common code.1..");
	}

	public Demo() {
		System.out.println("default..");
	}

	public Demo(int i) {
		System.out.println("para...");
	}
	
	static {
		System.out.println("i am static init block ..as soon as class is loaded only one");
	}
}

public class DemoInitBlocks {

	public static void main(String[] args) {
		Demo d1 = new Demo();

		System.out.println("----------");
		Demo d2 = new Demo(55);

	}

}
