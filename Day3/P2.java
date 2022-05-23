package com.te.array1;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elememts :");
		int c=sc.nextInt();
		int[] a=new int[c];
		int[] b=new int[c];
		System.out.println("enter the values for first array");
		for (int i = 0; i < b.length; i++) 
			{
				a[i]=sc.nextInt();
			
			}
		System.out.println("Enter the vales for second array");
		for (int i = 0; i < b.length; i++)
			{
				b[i]=sc.nextInt();
	
			}
		int s=Main2.display(a,b);
		System.out.println("sum of common elements :"+s);
		

	}
}
