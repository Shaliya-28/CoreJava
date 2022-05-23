package com.te.basic;

	import java.util.Scanner;

	public class T3 {
		static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.println("Enter a number");
		 int n=s.nextInt();
		 int a=Driver3.Display(n); 
		 System.out.println("Reverse of a "+n+" is :" +a);
		
	}
}
