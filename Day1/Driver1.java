package com.te.basic;

public class Driver1 {
	 static int display(int n )
	{
		int sum=0;
		while(n>0)
		{
			int res=n%10;
			if(res%2!=0) {
			sum=sum+res;
		}
		n=n/10;	
		}
	if(sum%2==0) {
		
		return -1;
	}else
		return 1;
}
}