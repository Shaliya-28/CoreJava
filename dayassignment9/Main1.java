package com.te.dayassignment9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		System.out.println("Enter limits");
		int limit=scan.nextInt();
		for (int i = 0; i < limit; i++) {
			
			map.put(scan.nextInt(), scan.next());
		}
		
		String s=UserMain1.getMaxKeyValue(map);
		System.out.println(s);
	}

}
