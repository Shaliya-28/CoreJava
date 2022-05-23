package com.te.basic;

public class Driver3 {
	static int Display(int n)
	{
		int rev=0;
		while(n>0)
			
		{
			int res=n%10;
			rev=rev*10+res;
			n=n/10;
		}
		return rev;
	}

}
