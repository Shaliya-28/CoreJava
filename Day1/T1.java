package com.te.basic;
import java.util.Scanner;

public class T1 {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	 System.out.println("Enter a number");
	 int n=s.nextInt();
	 int a=Driver1.display(n);
	 if(a==1) {
		 System.out.println("odd");
	 }
	 else {
		 System.out.println("even");
	 }
		 
	 
}
}
