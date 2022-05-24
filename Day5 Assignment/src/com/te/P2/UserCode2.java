package com.te.P2;

public class UserCode2 {
	public static String display(String str)
	{
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
	}

}
