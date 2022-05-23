package com.te.arrayass4;

import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
			boolean b=(TripletsDriver.CheckTriplets(a));
			if (b) {
				System.out.println("True");
					}
			else
				System.out.println("false");
	}
	}

	

	

