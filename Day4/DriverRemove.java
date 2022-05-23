package com.te.arrayass4;

public class DriverRemove {
	public static int[] RemoveTens(int a[])
	{
		int a1[]=new int[a.length];
		int temp=0;
		for (int i = 0;i< a.length;i++) 
		{
			if(a[i]%10!=0)
			{
				a1[temp]=a[i];
				temp++;
			}
			
		}
		return a1;
		
	}

}
