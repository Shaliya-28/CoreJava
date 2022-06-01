package com.te.dayassignment9;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		String []st=new String[size];
		System.out.println("Enter the values");
		for (int i = 0; i < st.length; i++) {
			st[i]=sc.next();
		}
		Map<String,String>map=UserMain5.getStateId(st);
		Iterator<String>itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			String value=map.get(key);
			System.out.println(value+":");
			System.out.println(key);
			
		}
	}

}
