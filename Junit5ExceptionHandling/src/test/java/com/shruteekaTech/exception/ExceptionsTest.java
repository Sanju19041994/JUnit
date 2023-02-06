package com.shruteekaTech.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {

	Exceptions exceptions = new Exceptions();
	
	@Test
	void testDivision() {
		
		assertThrows(ArithmeticException.class, ()->exceptions.division(10, 0));
	}

	@Test
	void testLengthString() {
		String str = null;
		assertThrows(NullPointerException.class, ()->exceptions.lengthString(str));
	}
}
