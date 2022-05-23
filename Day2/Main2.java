package com.te.day2;

import java.util.Scanner;
public class Main2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
      
		System.out.println("Enter Numbers num");
		int num=sc.nextInt();
		int fibosum =UserMainCode2.addFibonacci(num);
		System.out.println("palindrome sum is"+fibosum);

	}

}


