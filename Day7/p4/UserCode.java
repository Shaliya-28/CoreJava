package com.te.day7.p4;

import java.util.ArrayList;
import java.util.Arrays;

public class UserCode {
	public static String[] arraytoString(ArrayList<String>ref) {
		Object ob[]=ref.toArray();
		String [] ref1=Arrays.asList(ob).toArray(new String[0]);
		Arrays.sort(ref1); 
		return ref1;
	}

}
