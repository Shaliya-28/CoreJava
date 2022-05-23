package com.te.arrayass4;

public class Perfect {
	public static boolean checkPer(int num)
	{
		int s=1;
		int sum=0;
		while(s<=num/2)
		{
			if(num%2==0)
			{
				sum=sum+s;
			}
			s++;
			
		}
		if(num==sum)
			return true;
		else
			return false;
	}

}
