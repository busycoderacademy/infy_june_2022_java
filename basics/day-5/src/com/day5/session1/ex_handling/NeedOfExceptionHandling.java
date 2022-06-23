package com.day5.session1.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeedOfExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			int x, y;

			scanner = new Scanner(System.in);

			System.out.println("PE first no");
			x = scanner.nextInt();

			System.out.println("PE sec no");
			y = scanner.nextInt();
			int result = x / y;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("dont do divide by zero");

		} catch (InputMismatchException e) {
			System.out.println("enter int only");

		} finally {
			scanner.close();
		}

		System.out.println("------------------");
	}
}
