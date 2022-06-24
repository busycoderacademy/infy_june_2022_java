package com.day6.session1.doubts.q2;

class Demo {
	int i = 5;
	static double pi = 0;

	{
		i = 7;
	}

	{
		i = 1;
	}

	public Demo() {
		System.out.println(i);
	}

	public Demo(int i) {
		System.out.println(this.i);
	}

	static {
		// so that i can do some sort of cal before assigning the value of pi
		pi = Math.PI;
	}
}

public class DemoInitBlocks {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1.i);
		System.out.println("----------");
		Demo d2 = new Demo(55);
		System.out.println(d1.i);

	}

}
