package com.te.P3;

import java.util.Scanner;
public class UserCode3 {
	public static String display(String str,int num)
	{
		String s="";
		for (int i = 0; i<num; i++) {
			{
				s=s+str.charAt(i);
			}
			for(int j=str.length()-num;j<str.length();j++)
			{
				s=s+str.charAt(j);
			}

	}
		return s;
	}
}



