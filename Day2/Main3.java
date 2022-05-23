package com.te.day2;
	import java.util.Scanner;
	public class Main3 {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter Numbers num1");
			int num1=sc.nextInt();
			int npadd =UserMainCode3.addNonprime(num1);
			System.out.println("palindrome sum is"+npadd);

		}

	}


