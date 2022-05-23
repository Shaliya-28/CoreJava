package com.te.day2;

public class UserMainCode2 {
	public static int addFibonacci(int num) {
		
		int fibosum=0;
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		while(num>0) {
			
			fibosum=fibosum+num1;
			num1=num2;
			num2=num3;
			num3=num1+num2;
			--num;
		}
		return fibosum;
		
	}
	}
	


