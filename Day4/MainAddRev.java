package com.te.arrayass4;

import java.util.Scanner;

public class MainAddRev {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 int []a=new int[6];
		 System.out.println("Enter the num");
		 for (int i= 0; i<a.length; i++) 
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Enter the num");
		 int a1=sc.nextInt();
		 System.out.println(a1);
		 int rev=addRev.Reverse(a,a1);
		 System.out.println("Reverse of number " +rev);
	}
}


