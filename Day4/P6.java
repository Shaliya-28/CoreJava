package com.te.arrayass4;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		boolean b=Perfect.checkPer(num);
		if(b==true)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect");
	}

}
