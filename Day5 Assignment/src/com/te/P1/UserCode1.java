package com.te.P1;

public class UserCode1 {
	public static String display(String str)
	{
		char c1=str.charAt(str.length()/2-1);
		char c2=str.charAt(str.length()/2);
		String s="";
		s=s+c1+c2;
		return s;

}
}
