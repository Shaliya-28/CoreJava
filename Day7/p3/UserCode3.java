package com.te.day7.p3;

import java.util.ArrayList;
import java.util.Arrays;

public class UserCode3 {
public static ArrayList<String>matchCharacters(ArrayList<String>ref){
	Object [] ob=ref.toArray();
	String [] ref1=Arrays.asList(ob).toArray(new String[0]);
	ArrayList<String> ref2=new ArrayList();
	for (int i = 0; i < ref1.length; i++) {
		String str=ref1[i];
		for (int j = 0; j < ref1.length; j++) {
			if(str.charAt(0)=='a'||str.charAt(0)=='e'||
					str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u') {
				if(str.charAt(str.length()-1)=='a'||str.charAt(str.length()-1)=='e'||
						str.charAt(str.length()-1)=='i'||str.charAt(str.length()-1)=='o'||str.charAt(str.length()-1)=='u')
			
				{
					ref2.add(str);
			}
				
			}
			
		}
	}
	return ref2;
	
}

}
