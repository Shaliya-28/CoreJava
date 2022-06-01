package com.te.day7.p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList();
		System.out.println("Enter no of array elements");
		int a=sc.nextInt();
		for (int i = 0; i <a; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println(UserCodeMain.removeMultiples(a1));
			
	}

}
