package com.te.day2;

public class Palindrome1 {
	static int display(int n,int n1)
	{
	int i=n;
	int sum=0;
	for(;i<=n1;i++)
	{
		int rev=0;
		int temp=i;
		while(temp>0)
		{
			int c=temp%10;
			rev=rev*10+c;
			temp=temp/10;
		}
		if(i==rev)
		{
			sum=sum+rev;
		}
	}
		return sum;
	}

}