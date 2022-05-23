package com.te.array1;

public class UserMainCode1 {


	public static int getSumOfPower(int[] a) {
		int sum=0;
		for (int i = 0; i <a.length; i++) 
		{
			int power=(int)Math.pow(a[i],i);
			sum+=power;
		}
		return sum;
	}

}
