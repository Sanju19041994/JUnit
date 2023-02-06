package com.shruteekaTech;

public class PallindromNumber {

	public boolean isPallindrom(String str) {
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			return true;
		}
		return false;
	}
	
	

}
