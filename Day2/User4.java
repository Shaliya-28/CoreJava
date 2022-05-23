package com.te.day2;

import java.util.Scanner;
public class User4 {
	
	
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter Numbers num");
			int num=sc.nextInt();
			int digisum =UserCode4.addDigits(num);
			System.out.println("palindrome sum is"+digisum);
			

		}
		

	}


