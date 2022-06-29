package com.day9.session1.ocp_sol;

//open close principle: to improve quality of your code
@FunctionalInterface
interface Operation {
	public int apply(int a, int b);
}
//it don't violate OCP

class Calculator {
				//behavioural parameterization
	
	public static int applyOperation(int a, int b, Operation operation) {
		return operation.apply(a, b);
	}
}

public class PowerOfLambda {

	public static void main(String[] args) {
		Operation addOperation = (x, y) -> x + y;

		int sum = Calculator.applyOperation(2, 1, addOperation);
		System.out.println(sum);

		Operation mulitpicationOperation = (x, y) -> x * y;

		int multipication = Calculator.applyOperation(2, 4, mulitpicationOperation);
		System.out.println(multipication);

		Operation divideOperation = (x, y) -> x / y;

		int division = Calculator.applyOperation(12, 4, divideOperation);
		System.out.println(division);

	}

}
