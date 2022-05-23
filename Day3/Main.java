package com.te.array1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elememts :");
		int[] a=new int [4];
		for (int i = 0; i <a.length; i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(UserMainCode1.getSumOfPower(a));
	}

	

}
