package com.te.arrayass4;

public class GetLargestSpan {
public static int LargeSpan(int []a)
{
	int count = 0,last=0;
	for (int  i= 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]==a[j])
			{
				last=j;
			}
		}
		if(last>count)
		{
			count=last-i+1;
		}
	}
	return count;
}
}
