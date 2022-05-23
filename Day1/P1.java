package com.te.basic;

public class P1 {
	public static void main(String[] args) {
		int n=56895,sum=0;
		while(n>0)
		{
			int res=n%10;
			if(res%2!=0) {
			sum=sum+res;
		}
		n=n/10;	
		}
	if(sum%2==0)
	{
		System.out.println("sum of digits is even");
	}
	else {
		System.out.println("sum of digits is odd");
	}
	}
}


