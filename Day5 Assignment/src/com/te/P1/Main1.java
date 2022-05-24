package com.te.P1;

import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements with even length");
	String str=sc.nextLine();
	String s1=UserCode1.display(str);
	System.out.println(s1);
}
}
