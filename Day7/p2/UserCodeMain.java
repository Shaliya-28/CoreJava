package com.te.day7.p2;

import java.util.ArrayList;

public class UserCodeMain {
	public static ArrayList removeMultiples(ArrayList<Integer> ref1) {
	ArrayList <Integer> a1=new ArrayList();
	for (int i = 0; i <ref1.size(); i++) {
		if((i+1)%3!=0) {
			a1.add(ref1.get(i));	
		}	
	}
	return a1;
}
}
