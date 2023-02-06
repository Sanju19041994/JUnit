package com.shruteekaTech.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionsTest {

	Exceptions exceptions = new Exceptions();
	
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		exceptions.division(10, 0);
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testStringLength() {
		String str = null;
		exceptions.stringLength(str);
	}

}
