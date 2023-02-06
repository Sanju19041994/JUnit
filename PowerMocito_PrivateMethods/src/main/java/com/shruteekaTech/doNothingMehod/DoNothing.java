package com.shruteekaTech.doNothingMehod;

import org.springframework.stereotype.Service;

@Service
public class DoNothing {

	public void doProcess() {
		System.out.println("do process method started");
		doWork("msg");
		System.out.println("do process method end");
	}
	
	public void doWork(String str) {
		System.out.println("This is help method to doProcess");
	}
}
