package com.shruteekaTech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class OddEvenTest {

	OddEven oe = new OddEven();
	
	@ParameterizedTest
	@CsvFileSource(resources = "/OddEvenData.csv",numLinesToSkip = 1)
	void testOddOrEvenNum(String input, String expected) {
		
		// taking input and expected value from exel sheet (csv file)
		String actual = oe.oddOrEvenNum(Integer.parseInt(input));
		assertEquals(actual, expected);
	}

}
