package com.te.arrayass4;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int[] a=new int[size];
			System.out.println("Enter the Array elements");
			for (int i = 0; i < a.length; i++) 
			{
				a[i]=sc.nextInt();
			}
			int count=GetLargestSpan.LargeSpan(a);
			System.out.println(count);
		}
	}

}
