package com.te.P5;

import java.util.Arrays;

public class UserMain5 {
	public static int display(String s1[],String s)
	{
	for (int i = 0; i < s1.length; i++) {
		if(s.equals(s1[i]))
			return i+1;
	}
		return 0;
		
		
	}
}
