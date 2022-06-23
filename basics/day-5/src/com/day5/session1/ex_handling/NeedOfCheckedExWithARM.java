package com.day5.session1.ex_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//read a file and print all words of it
public class NeedOfCheckedExWithARM {

	public static void main(String[] args) {

		// actually we should close the resource as soon as our job is done
		// memory leak==> finally block in proper way
		// ie way java have given ARM (Automcatic res mgt)
		// Java 7: u need to use a special syntext and then it is the resp of java to
		// close the resouce

		try (Scanner scanner = new Scanner(System.in)) {
			int x, y;

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

		}

	}
}
