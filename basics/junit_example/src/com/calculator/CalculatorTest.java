package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void beforeEach() {
		calculator=new Calculator();
	}
	
	@DisplayName(value = "test for addition of 2 numbers")
	@Test
	void addTest() {
		Assertions.assertEquals(4, calculator.add(2, 2));
	}
	
	//2
	//hey this test case should run iff os is linux
	//@EnabledOnOs(OS.WINDOWS)
	@DisplayName(value = "test for mutiplication of 2 numbers")
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void multiplyTest() {
		Assertions.assertEquals(6, calculator.mul(3,2));
	}
	
	@DisplayName(value = "test for division of 2 numbers")
	@Test
	void divideTest() {
		Assertions.assertEquals(15, calculator.divide(30,2));
	}
	
	//assertAll: used to test same method mutiple time.... add : 3 time: boundray condition testing
	
	@DisplayName(value = "test for addition of 2 numbers called mutiple time for diff data")
	@Test
	void addTestMutipleTime() {
		Assertions.assertAll(
				()-> assertEquals(4, calculator.add(2, 2)),
				()-> assertEquals(40, calculator.add(20, 20)),
				()-> assertEquals(10, calculator.add(8, 2))
		);
	}
	
	
	
	@DisplayName(value = "test for division of 2 numbers expected ArithmaticException")
	@Test
	void divideWithExceptionTest() {
		Assertions.assertThrows(ArithmeticException.class, 
				()-> calculator.divide(20, 0), "divide by zero happens");
	}
	

	@AfterEach
	public void afterEach() {
		calculator=null;
	}
	
}

