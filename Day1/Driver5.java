package com.te.basic;

public class Driver5
{
	static int count=0,res;
	static int Display(int n) {
	while (n>0)
	{
		res=n%10;
		if(res==7)
		 count++;
		n=n/10;
	}
	return count;
	
	

}
}
