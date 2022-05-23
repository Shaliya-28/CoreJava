package com.te.basic;

public class Driver2 {
	static int Display(int n) {
		int square=0;
		while(n>0)
		{
			int res=n%10;
			if(n%2==0)
			{
				square=square+res*res;
			}
			n=n/10;
		}
		return square;
	}

}
