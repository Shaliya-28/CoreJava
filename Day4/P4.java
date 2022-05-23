package com.te.arrayass4;

import java.util.Scanner;
public class P4 {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the numbers");
				int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("enter array elements");
				for (int i = 0; i < a.length; i++) {
					a[i]=sc.nextInt();
				}
				int med=MedianCalc.med(a);
				System.out.println(med);
		
			}
}
