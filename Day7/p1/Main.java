package com.te.day7.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ref1=new ArrayList();
		System.out.println("Enter the first array elements");
		for (int i = 0; i <5; i++) 
			{
			ref1.add(sc.nextInt());
			}
		System.out.println("Enter the second array elements");
		ArrayList<Integer> ref2=new ArrayList();
		for (int j = 0; j <5; j++)
		{
				ref2.add(sc.nextInt());
			
		}
		ArrayList result = UserCodeMain.sortMergedArray(ref1,ref2);
			
			System.out.println(result);
	}

	
}

