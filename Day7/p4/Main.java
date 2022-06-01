package com.te.day7.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=sc.nextInt();
	ArrayList<String> ref=new ArrayList();
	for (int i = 0; i <n; i++) {
		String str=sc.next();
		ref.add(str);
	}
		String []str=(UserCode.arraytoString(ref));
		for (int j = 0; j <str.length; j++) {
			System.out.println(str[j]);
			
		}
		
	}
}

