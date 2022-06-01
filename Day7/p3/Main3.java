package com.te.day7.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		ArrayList<String> ref=new ArrayList();
		for (int i = 0; i <n; i++) {
			String s=sc.next();
			ref.add(s);
		}
			System.out.println(UserCode3.matchCharacters(ref));
		}
	}


