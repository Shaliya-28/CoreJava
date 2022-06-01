package com.te.day7.p5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the array values");
		int n1=sc.nextInt();
		ArrayList<Integer> ref=new ArrayList();
		ArrayList<Integer> ref1=new ArrayList();
		for (int i = 0; i <n; i++) {
			ref.add(sc.nextInt());
			
		}
		for (int i = 0; i <n1; i++) {
			ref1.add(sc.nextInt());
			
		}
		System.out.println(UserCode5.arrayListSubtractor(ref,ref1));
	}
	

}
