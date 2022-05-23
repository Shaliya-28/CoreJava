package com.te.day2;

import java.util.Scanner;
public class Palindrome {
		static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.println("Enter a number");
		 int n=s.nextInt();
		 int n1=s.nextInt();
		int a= Palindrome1.display(n,n1);
		System.out.println("Add of given palindrome " +a);

}
}
