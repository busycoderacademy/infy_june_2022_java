package com.day3.session2.stack;

public class RajMain {

	public static void main(String[] args) {
		Stack stack = new StackAnu();
		stack.push(33);
		stack.push(3);
		stack.push(303);
		stack.push(39);
		stack.push(1);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
