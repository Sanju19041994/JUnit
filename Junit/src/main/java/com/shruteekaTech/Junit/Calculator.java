package com.shruteekaTech.Junit;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum of a & b = "+c );
		return c;
	}
	
	public int sub(int a, int b) {
		int c = a-b;
		System.out.println("Substraction of a & b = "+c );
		return c;
	}
	
	public int div(int a, int b) {
		int c = a/b;
		System.out.println("Division of a & b = "+c );
		return c;
	}
	
	public int multi(int a, int b) {
		int c = a*b;
		System.out.println("Multification of a & b = "+c );
		return c;
	}
}
