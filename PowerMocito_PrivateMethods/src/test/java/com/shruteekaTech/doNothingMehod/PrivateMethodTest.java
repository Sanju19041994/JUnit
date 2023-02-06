package com.shruteekaTech.doNothingMehod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

class PrivateMethodTest {

	@Test
	public void doWorkTest() {
		
		PrivateMethod method = new PrivateMethod();
		
		PrivateMethod spy = PowerMockito.spy(method);
		
		PowerMockito.doReturn("TESTMSG").when(spy);
		
		String actualResult = method.doWork("testMsg");
		
		assertEquals("TESTMSG", actualResult);
	}

}
