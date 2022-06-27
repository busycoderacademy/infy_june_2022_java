package com.day7.session3.generics_ex;

public class Stack{

	private int top = -1;
	public int arr[] = new int[5];
	private final int SIZE = 5;

	public int pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -999;
		} else {
			return arr[top--];
		}
	}

	public void push(int data) {
		if (top == SIZE - 1)
			System.out.println("stack is fulll");
		else {
			top++;
			arr[top] = data;
		}
	}

}
