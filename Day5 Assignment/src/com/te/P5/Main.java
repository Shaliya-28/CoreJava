package com.te.P5;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num ");
		int a=sc.nextInt();
		String[] s=new String[a];
		System.out.println("Enter the strings");
		for (int i = 0; i <a; i++)
		{
			s[i]=sc.next();
		}
		
		Arrays.sort(s);
		for (int i = 0; i <a; i++) {
			
			System.out.println(s[i]);
		}
		
		
		System.out.println("Enter the element to check");
		String s1=sc.next();
		System.out.println(UserMain5.display(s, s1));
	}
	}




