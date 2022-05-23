package com.te.arrayass4;

public class searchSeq {
	public static boolean checkSeq(int[] a)
	{
		boolean s=false;
		for (int i = 0; i < a.length-2; i++) {
			{
				if(a[i]==1 && a[i+1]==2 &&a[i+2]==3)
				{
					s=true;
					break;
				}
			}
		}
		return s;
	}

}
