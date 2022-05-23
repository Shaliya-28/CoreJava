package com.te.arrayass4;

import java.util.Arrays;

public class MedianCalc {
 public static int med(int []a)
 { 
	 int av,sum=0;
	 Arrays.sort(a);
	 if(a.length%2!=0)
	 {
		 return a[a.length/2];
	 }
	 else
	 {
		 sum=a[a.length/2]+a[a.length/2-1];
		 av=sum/2;
		 int s=(int)Math.round(av);
		 return s;
	 }
 }
}
