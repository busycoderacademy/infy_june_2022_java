package com.day3.session1.oops;

//C dont support funcation overloading
class Cal {
	public int add(int a, int b) {
		System.out.println("public int add(int a, int b)");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("public int add(int a, int b, int c)");
		return a + b + c;
	}

	// java 5: variable argument methods
	public int add(String name, int... a) {
		System.out.println(name);
		System.out.println("public int add(int ...a)");
		int sum = 0;

		for (int val : a) {
			sum += val;
		}
		return sum;
	}
}

public class FunctionOverloading {

	public static void main(String[] args) {
		Cal cal = new Cal();

		int sum = cal.add(2, 1);

		System.out.println(sum);

		int sum2 = cal.add(2, 1, 10);
		System.out.println(sum2);

		int arr[] = { 2, 1, 10, 4 };

	
		int sum3= cal.add("rajaa",3,4,5,3);

	}

}
