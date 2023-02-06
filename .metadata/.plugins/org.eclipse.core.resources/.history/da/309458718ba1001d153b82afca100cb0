package com.shruteekaTech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PallindromNumberTest {

	PallindromNumber number = new PallindromNumber();
	/*
	 
	// without parameterized Junit test cases , 
	// need to write separate for each and every string check
	@Test
	public void testIsPallindrom() {
		String str = "radar";
		boolean pallindrom = number.isPallindrom(str);
		assertTrue(pallindrom);
	}
	@Test
	public void testIsPallindromNegative() {
		String str = "sameer";
		boolean pallindrom = number.isPallindrom(str);
		assertFalse(pallindrom);
	}

	*/
	
	// By using @ParameterizedTest : we can check more than one string in a single test method
	
	@ParameterizedTest
	@ValueSource(strings = {"saras","radar","madam"})
	public void isPallindromTest(String str) {
		boolean pallindrom = number.isPallindrom(str);
		assertTrue(pallindrom);
	}
	
	
}
