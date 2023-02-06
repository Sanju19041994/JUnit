package com.shruteekaTech.doNothingMehod;

public class PrivateMethod {
	
	public String doWork(String str) {
		String formateMsg = formateMsg(str);
		return formateMsg;
	}
	
	private String formateMsg(String str) {
		return str.toUpperCase();
	}

}
