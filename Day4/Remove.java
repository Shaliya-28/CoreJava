package com.te.arrayass4;

import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Enter ur no");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
			
		}
		int []a1=DriverRemove.RemoveTens(a);
		for (int  i= 0;  i< a1.length; i++) 
		{
			System.out.println(a1[i]);
		}
		
		 
	}

}
