package com.te.array1;

public class UserMain3 {
	public static int largest(int[] a) {
		int sum=0,first=0,middle=0,last=0,middle1=a.length/2;
		int n=a.length;
		for (int i = 0; i < n; i++) {
			first=a[0];
			middle=a[middle1];
			last=a[n-1];
			
			
		}
		if((first>middle)&&(first>last)) {
			sum=first;
			
		}else if((middle>first)&&(middle>last)) {
			sum=middle1;
		}
		else if((last>middle)&&(last>first)) {
			sum=last;
		}
		return sum;
		
	}

}

