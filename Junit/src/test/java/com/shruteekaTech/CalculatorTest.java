package com.shruteekaTech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.shruteekaTech.Junit.Calculator;

public class CalculatorTest {

	private static Calculator calculator = null;
	
	@BeforeAll
	public static void initiate() {
		calculator = new Calculator();
	}
	
	@AfterAll
	public static void distroy() {
		calculator = null;
	}
	
	@Test
	public void testSum() {
		int actualResult = calculator.sum(10, 10);
		int expectedResult = 20;
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void testSub() {
		int actualResult = calculator.sub(30, 10);
		int expectedResult = 20;
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void testDiv() {
		int actual = calculator.div(100, 5);
		int expected = 20;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMulti() {
		int actual = calculator.multi(4, 5);
		int expected = 20;
		assertEquals(actual, expected);
	}
}
