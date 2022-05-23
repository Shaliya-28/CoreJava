package com.te.array1;

import java.util.Arrays;

public class User4 {

	public static int countsum(int[] a) {
		int large=0,small=0,sum=0;
	
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			
			small=a[0];
			large=a[a.length-1];
			}

		
		sum=large-small;
		
		
			
		return sum;
	}
	
		
		
	}


