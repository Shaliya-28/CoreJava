package com.te.day2;

public class UserMainCode3 {
	public static int addNonprime(int num) {
		int npadd=1;
		for(int j=3; j<=num;j++) {
		int i=1,count=0;
		for(; i<=j; i++) {
			
			if(j%i==0) {
				count++;
			}}
			if(count!=2) {
				System.out.println(npadd+=j);
			}
	}
		return npadd;

}
}

