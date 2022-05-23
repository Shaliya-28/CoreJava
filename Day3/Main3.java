package com.te.array1;

import java.util.Scanner;

public class Main3 {
	public static void main(String []args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=scn.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=scn.nextInt();
	}
	System.out.println(UserMain3.largest(a));
	
	
}
}



