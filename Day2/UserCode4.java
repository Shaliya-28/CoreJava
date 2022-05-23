package com.te.day2;

public class UserCode4 {
	public static int addDigits(int num) {
		int temp=0,digisum=0;
		while(num>0) {
			temp=num%10;
			digisum+=temp*temp;
			num/=10;
		}
		return digisum;
	}

}


