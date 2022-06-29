package com.calculator.backup;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import com.calculator.Calculator;

class CalculatorTest {

	private Calculator calculator;
	
	//test case independence: one test case must be independent of another test case
	//data must be init before every test case and close after test case
	
	//jdbc :way to connect to db		connectionfactory
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("-----i run only once just before start of any test case---");
	}
	
	
	@BeforeEach
	public void beforeEach() {
		calculator=new Calculator();
		System.out.println("-----i am called before each test case----");
	}
	//1
	@DisplayName(value = "test for addition of 2 numbers")
	@Test
	void addTest() {
		Assertions.assertEquals(4, calculator.add(2, 2));
		System.out.println("-----i am addTest()---");
	}
	
	//2
	//hey this test case should run iff os is linux
	//@EnabledOnOs(OS.WINDOWS)
	@DisplayName(value = "test for mutiplication of 2 numbers")
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void multiplyTest() {
		Assertions.assertEquals(6, calculator.mul(3,2));
		System.out.println("-----i am multiplyTest()---");
	}
	
	
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("-----i am called after each test case----");
		calculator=null;
	}
	
	//jdbc :way to close the connection		connectionfactory
	@AfterAll
	public static void afterAll() {
		System.out.println("----i run at last---");
	}
	
}

