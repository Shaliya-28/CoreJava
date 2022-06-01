package com.te.day7.p1;

import java.util.ArrayList;
import java.util.Collections;

public class UserCodeMain {
	public static ArrayList  sortMergedArray(ArrayList<Integer>ref1,ArrayList<Integer>ref2)
	{
		ref1.addAll(ref2);
	ref1.sort(null);
	ArrayList<Integer> result=new ArrayList();
	Integer a1=ref1.get(2);
	Integer b1=ref1.get(6);
	Integer c1=ref1.get(8);
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);
	result.add(a1);
	result.add(b1);
	result.add(c1);
	
	return result;

	
	}
	
}

