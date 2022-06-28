package com.day7.session1.genrics_ex;

import java.lang.reflect.Array;

public class Stack<T extends Comparable<T>>{

	private int top = -1;
	public T arr[]=null;
	private final int SIZE;
	
	public Stack(Class<T> clazz, int capacity) {
		arr=(T[]) Array.newInstance(clazz, capacity);
		SIZE=capacity;
	}

	public T pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			throw new StackEmptyException();
		} else {
			return arr[top--];
		}
	}

	public void push(T data) {
		if (top == SIZE - 1)
			throw new StackOverflowException();
		else {
			top++;
			arr[top] = data;
		}
	}

}
