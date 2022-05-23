package com.te.arrayass4;

public class addRev {
	public static int Reverse(int[]a,int a1) {
	int sum=0,rev=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]>a1)
		{
			sum=sum+a[i];
		}
	}
	while(sum>0)
	{
		int rem=sum%10;
		rev=rev*10+rem;
		sum=sum/10;
	}
	return rev;

}
}